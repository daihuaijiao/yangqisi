package com.yangqisi.manager.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.yangqisi.manager.service.NewsClassService;
import com.yangqisi.manager.service.NewsDataService;
import com.yangqisi.mapper.NewsclassMapper;
import com.yangqisi.pojo.Newsclass;
import com.yangqisi.pojo.NewsclassExample;
import com.yangqisi.pojo.NewsclassExample.Criteria;
import com.yangqisi.util.AddTree;
import com.yangqisi.util.EUITreeResult;
import com.yangqisi.util.ResultData;

/**
 * 新闻分类Service 实现层
 * @addDate： 2017年9月24日
 * @autho： add by daihj
 * @version： 1.0
 */
@Service
public class NewsClassServiceImpl implements NewsClassService {

	@Resource
	private NewsclassMapper newsClassMapper;
	@Resource
	private NewsDataService newsDataService;
	
	@Resource
	private JdbcTemplate jdbcTemplate;
	
	private AddTree addTree;
	
	/**
	 * 取所有栏目分类
	 * add by daihj
	 * 20170924
	 */
	@Override
	public List<EUITreeResult> getNewsClassByAll() {
//		addTree = addTree.getInstance();
//		addTree.getResult().clear();
		addTree = new AddTree();
		getNewsClassByParentID(0);
		List<EUITreeResult> list = addTree.getResult();
		return list;
	}

	/**
	 * 取指定classID栏目分类
	 * add by daihj
	 * 20170924
	 */
	@Override
	public Newsclass getNewsClassById(int classID) {
		Newsclass newsclass = newsClassMapper.selectByPrimaryKey(classID);
		return newsclass;
	}

	/**
	 * 取指定父栏目分类
	 * add by daihj
	 * 20170924
	 */
	private List<EUITreeResult> getNewsClassByParentID(int parentID) {
		List<EUITreeResult> result = new ArrayList<EUITreeResult>();
		NewsclassExample example = new NewsclassExample();
		Criteria create = example.createCriteria();
		create.andParentidEqualTo(parentID);
		List<Newsclass> newsclassList = newsClassMapper.selectByExample(example);
		for (Newsclass newsclass : newsclassList) {
			if(newsclass.getClassname().equals("aa")) {
				System.out.println("aa");
			}
			int child = newsclass.getChild();
			EUITreeResult tree = null;
			//如果子栏目数量大于0，递归取出所有子栏目
			if(child > 0) {
				tree = new EUITreeResult();
				tree.setId(newsclass.getClassid());
				tree.setClassName(newsclass.getClassname());
				//取出父栏目id为newsclass.getClassid()的所有子栏目
				List<EUITreeResult> list = getNewsClassByParentID(newsclass.getClassid());
				for (EUITreeResult euiTreeResult : list) {
					tree.getChildren().add(euiTreeResult);
				}
				//只有返回到根目录时才添加tree
				if(parentID == 0) {
					addTree.getResult().add(tree);
				} else {
					result.add(tree);
				}
			} else {
				tree = new EUITreeResult();
				tree.setId(newsclass.getClassid());
				tree.setClassName(newsclass.getClassname());
				//只有返回到根目录时才添加tree
				if(parentID == 0) {
					addTree.getResult().add(tree);
				} else {
					result.add(tree);
				}
			}
		}
		return result;
	}

	/**
	 * 添加子栏目分类
	 * add by daihj
	 * 20171005
	 */
	@Override
	public ResultData addChildNewsClass(Newsclass newsClass) {
		if(!checkClassName(newsClass.getClassname())) {
			return new ResultData(300, "新加栏目名称重复，请重新输入！", newsClass);
		}
		int parentID = newsClass.getParentid();
		long childL = getChildCount(parentID);
		int child = Integer.parseInt(String.valueOf(childL));
		int prevID = 0;
		//所属栏目下面是空的
		if(child == 0) {
			newsClass.setOrderid(0);
			newsClass.setPrevid(0);
		} else {
			newsClass.setOrderid(getOrderID(parentID) + 1);
			prevID = getPrevID(parentID);
			newsClass.setPrevid(prevID);
		}
		int classID = getMaxClassID() + 1;
		int rootID = getRootID(parentID);
		newsClass.setClassid(classID);
		newsClass.setRootid(rootID);
		newsClass.setChild(0);
		newsClass.setNextid(0);
		newsClass.setSetting(0);
		newsClass.setDepth(getNewsClassById(parentID).getDepth() + 1);
		newsClass.setParentpath("0," + parentID);
		if(null == newsClass.getcShow()) {
			newsClass.setcShow((byte)0);
		}
		
		int count = newsClassMapper.insert(newsClass);
		//需要修改 所属栏目 的child数量
		updateChild(parentID,child + 1);
		if(child > 0) {
			//需要修改同级上一栏目的NEXTID
			updateNextID(classID, prevID);
		}
		return new ResultData(200, "子栏目添加成功！", newsClass);
	}

	/**
	 * 修改 所属栏目 的child数量
	 * @addDate： 2017年10月11日
	 * @autho： add by daihj
	 * @version： 1.0
	 * @param parentID
	 */
	private int updateChild(int parentID, int child) {
		Newsclass newsClass = new Newsclass();
		newsClass.setClassid(parentID);
		newsClass.setChild(child);
		int rcount = newsClassMapper.updateByPrimaryKeySelective(newsClass);
		return rcount;
	}
	
	/**
	 * 修改同级上一栏目的nextID
	 * @addDate： 2017年10月12日
	 * @autho： add by daihj
	 * @version： 1.0
	 * @param nextID
	 * @param classID
	 */
	private int updateNextID(int nextID,int classID) {
		Newsclass newsClass = new Newsclass();
		newsClass.setNextid(nextID);
		newsClass.setClassid(classID);
		int rcount = newsClassMapper.updateByPrimaryKeySelective(newsClass);
		return rcount;
	}
	
	/**
	 * 修改同级下一栏目的prevID
	 * @addDate： 2017年10月12日
	 * @autho： add by daihj
	 * @version： 1.0
	 * @param prevID
	 * @param classID
	 */
	private int updatePrevID(int prevID,int classID) {
		Newsclass newsClass = new Newsclass();
		newsClass.setPrevid(prevID);
		newsClass.setClassid(classID);
		int rcount = newsClassMapper.updateByPrimaryKeySelective(newsClass);
		return rcount;
	}
	
	/**
	 * 取同级的上一栏目
	 * @addDate： 2017年10月11日
	 * @autho： add by daihj
	 * @version： 1.0
	 * @param parentID
	 * @return
	 */
	private int getPrevID(int parentID) {
		String sql = "SELECT MAX(T.CLASSID) AS CLASSID FROM NEWSCLASS T WHERE PARENTID = ?";
		List<Map<String, Object>> list = jdbcTemplate.queryForList(sql, new Object[]{parentID});
		if(null != list && list.size() > 0) {
			Integer prevID = (Integer) list.get(0).get("CLASSID");
			return prevID;
		} else {
			return 0;
		}
	}

	/**
	 * 取最大的classid
	 * @addDate： 2017年10月11日
	 * @autho： add by daihj
	 * @version： 1.0
	 * @return
	 */
	private Integer getMaxClassID() {
		String sql = "SELECT MAX(T.CLASSID) AS CLASSID FROM NEWSCLASS T";
		List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
		if(null != list && list.size() > 0) {
			Integer classID = (Integer) list.get(0).get("CLASSID");
			return classID;
		} else {
			return 0;
		}
	}

	/**
	 * 取子栏目数
	 * @addDate： 2017年10月11日
	 * @autho： add by daihj
	 * @version： 1.0
	 * @param parentID
	 * @return
	 */
	@Override
	public long getChildCount(int parentID) {
		String sql = "SELECT COUNT(*) AS CHILD FROM NEWSCLASS T WHERE PARENTID = ?";
		List<Map<String, Object>> list = jdbcTemplate.queryForList(sql, new Object[]{parentID});
		if(null != list && list.size() > 0) {
			long child = (long) list.get(0).get("CHILD");
			return child;
		} else {
			return 0;
		}
	}
	
	/**
	 * 取同级rootID
	 * @addDate： 2017年10月11日
	 * @autho： add by daihj
	 * @version： 1.0
	 * @param classID
	 * @return
	 */
	private int getRootID(int classID) {
		String sql = "SELECT T.ROOTID FROM NEWSCLASS T WHERE CLASSID = ? GROUP BY T.ROOTID";
		List<Map<String, Object>> list = jdbcTemplate.queryForList(sql, new Object[]{classID});
		if(null != list && list.size() > 0) {
			Integer rootID = (Integer) list.get(0).get("ROOTID");
			return rootID;
		} else {
			return 0;
		}
	}
	
	/**
	 * 取同级最大的orderID
	 * @addDate： 2017年10月12日
	 * @autho： add by daihj
	 * @version： 1.0
	 * @param parentID
	 * @return
	 */
	private int getOrderID(int parentID) {
		String sql = "SELECT MAX(T.ORDERID) AS ORDERID FROM NEWSCLASS T WHERE PARENTID = ? ";
		List<Map<String, Object>> list = jdbcTemplate.queryForList(sql, new Object[]{parentID});
		if(null != list && list.size() > 0) {
			Integer orderID = (Integer) list.get(0).get("ORDERID");
			return orderID;
		} else {
			return 0;
		}
	}
	
	/**
	 * 检查classname是否重复
	 * @addDate： 2017年10月12日
	 * @autho： add by daihj
	 * @version： 1.0
	 * @param className
	 * @return
	 */
	private boolean checkClassName(String className) {
		NewsclassExample example = new NewsclassExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andClassnameEqualTo(className);
		List<Newsclass> list = newsClassMapper.selectByExample(example);
		if(null != list && list.size() > 0) {
			return false;
		} else {
			return true;
		}
	}

	/**
	 * 把指定classID下的新闻放入回收站
	 * @addDate： 2017年10月13日
	 * @autho： add by daihj
	 * @version： 1.0
	 * @param classID
	 * @return ResultData
	 */
	@Override
	public ResultData delNewsClass(int classID) {
		Newsclass newsclass = newsClassMapper.selectByPrimaryKey(classID);
		int prevID = newsclass.getPrevid();
		int nextID = newsclass.getNextid();
		newsClassMapper.deleteByPrimaryKey(classID);
		if(prevID == 0 && nextID == 0) {
			//删除唯一一条
		} else if(prevID != 0 && nextID != 0) {
			//删除中间一条
			updatePrevID(prevID, nextID);
			updateNextID(nextID, prevID);
		} else if(prevID == 0) {
			//删除第一条
			updatePrevID(prevID, nextID);
		} else if(nextID == 0) {
			//删除最后一条
			updateNextID(nextID, prevID);
		}
		Newsclass parentNewsClass = getNewsClassById(newsclass.getParentid());
		if(newsclass.getParentid() != 0) {
			updateChild(newsclass.getParentid(), parentNewsClass.getChild() - 1);
		}
		
		//把classID对应的文章放入回收站
		ResultData delNewsDataToRecycle = newsDataService.delNewsDataToRecycleByClassID(classID);
		if(null != delNewsDataToRecycle) {
			if(delNewsDataToRecycle.getStatus() == 200) {
				return new ResultData(200, "栏目删除成功！" + delNewsDataToRecycle.getMsg(), null);
			} else {
				return new ResultData(200, "栏目删除成功！", null);
			}
		} else {
			return new ResultData(200, "栏目删除成功！", null);
		}
	}

	/**
	 * 修改栏目
	 * @addDate： 2017年10月13日
	 * @autho： add by daihj
	 * @version： 1.0
	 * @param classID
	 * @return ResultData 
	 */
	@Override
	public ResultData updateNewsClass(Newsclass newsClass) {
		//是否有修改所属栏目
		//1.取修改前的parentID
		Newsclass oldNewsClass = getNewsClassById(newsClass.getClassid());
		int oldParentID = oldNewsClass.getParentid();
		int newParentID = newsClass.getParentid();
		//2.比较修改前parentID和传入的parentID是否相同
		if(oldParentID != newParentID) {
			//1.新parentID对应行的child +1
			long childCount = getChildCount(newParentID);
			updateChild(newParentID, (int)(childCount + 1));
			//如果新的所属目录不为空
			int prevID  = 0;
			int orderID = 0;
			if(childCount > 0) {
				//2.修改新parentID对应的最后一行的nextID
				prevID = getPrevID(newParentID);
				updateNextID(newsClass.getClassid(), prevID);
				orderID = getOrderID(newParentID) + 1;
			}
			//3.旧parentID对应行的child -1
			long oldChild = getChildCount(oldParentID);
			updateChild(oldParentID, (int)(oldChild - 1));
			//4.修改旧parentID对应的prevID和nextID
				//4.1如果修改的是第一条，修改下一条的prevID
			if(oldNewsClass.getPrevid() == 0) {
				updatePrevID(0, oldNewsClass.getNextid());
			}
				//4.2如果修改的是最后一条，修改上一条的nextID
			else if(oldNewsClass.getNextid() == 0) {
				updateNextID(0, oldNewsClass.getPrevid());
				//4.3如果修改的是中间某条，修改上一条的nextID和下一条的prevID
			} else {
				updatePrevID(oldNewsClass.getPrevid(), newsClass.getNextid());
				updateNextID(oldNewsClass.getNextid(), newsClass.getPrevid());
			}
			//5.修改该条数据的rootID,prevID,nextID,orderID,parentPath
			newsClass.setRootid(getRootID(newParentID));
			newsClass.setPrevid(prevID);
			newsClass.setNextid(0);
			newsClass.setOrderid(orderID);
			newsClass.setParentpath("0," + newParentID);
			//if(getNewsClassById(newParentID).getDepth() > 0) {
				newsClass.setDepth(getNewsClassById(newParentID).getDepth() + 1);
			//} else {
			//	newsClass.setDepth(getNewsClassById(newParentID).getDepth());
			//}
		}
		
		if(null == newsClass.getcShow()) {
			newsClass.setcShow((byte)0);
		}
		int rcount = newsClassMapper.updateByPrimaryKeySelective(newsClass);
		if(rcount > 0) {
			return new ResultData(200, "栏目修改成功！", newsClass);
		}
		return new ResultData(300, "栏目修改失败！", newsClass);
	}

	/**
	 * 添加一级主栏目
	 * @addDate： 2017年10月15日
	 * @autho： add by daihj
	 * @version： 1.0
	 * @param newsClass
	 * @return ResultData  
	 */
	@Override
	public ResultData addParentNewsClass(Newsclass newsClass) {
		if(!checkClassName(newsClass.getClassname())) {
			return new ResultData(300, "新加栏目名称重复，请重新输入！", newsClass);
		}
		int parentID = newsClass.getParentid();
		newsClass.setOrderid(0);
		int prevID = getPrevID(parentID);
		newsClass.setPrevid(prevID);
		int classID = getMaxClassID() + 1;
		newsClass.setClassid(classID);
		newsClass.setRootid(getRootID(prevID) + 1);
		newsClass.setChild(0);
		newsClass.setNextid(0);
		newsClass.setSetting(0);
		newsClass.setDepth(0);
		newsClass.setParentpath("0");
		if(null == newsClass.getcShow()) {
			newsClass.setcShow((byte)0);
		}
		int count = newsClassMapper.insert(newsClass);
		//需要修改同级上一栏目的NEXTID
		updateNextID(classID, prevID);
		return new ResultData(200, "一级主栏目添加成功！", newsClass);
	}
}
