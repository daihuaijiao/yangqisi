package com.yangqisi.manager.service.impl;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.crypto.Data;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yangqisi.manager.service.NewsDataService;
import com.yangqisi.mapper.NewsdataMapper;
import com.yangqisi.pojo.Newsdata;
import com.yangqisi.pojo.NewsdataExample;
import com.yangqisi.pojo.NewsdataExample.Criteria;
import com.yangqisi.pojo.NewsdataWithBLOBs;
import com.yangqisi.util.EUIDataGridResult;
import com.yangqisi.util.ResultData;
import com.yangqisi.util.ResultDataForUploadImg;
import com.yangqisi.util.UploadFileUtil;


/**
 * 
 * @addDate： 2017年9月17日
 * @autho： add by daihj
 * @version： 1.0
 */
@Service
public class NewsDataServiceImpl implements NewsDataService {
	
	private static String oldFileName = null;

	@Resource
	private NewsdataMapper newsdataMapper;
	
	@Resource
	private JdbcTemplate jdbcTemplate;
	
	/**
	 * 根据搜索条件取所有文章
	 * add by daihj 
	 * 20170923
	 */
	@Override
	public EUIDataGridResult getNewsList(int rows, int page, Map<String, String> param) {
		NewsdataExample example = new NewsdataExample();
		example.setOrderByClause("D_ID DESC");
		Criteria createCriteria = example.createCriteria();
		if(param != null && !param.isEmpty()) {
			String start_date = param.get("start_date");
			String end_date = param.get("end_date");
			String classID = param.get("classID");
			String d_title = param.get("d_title");
			if(start_date != null) {
				SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				start_date = start_date + " 00:00:00";
				Date start_date1 = new Date();
				try {
					start_date1 = sd.parse(start_date);
				} catch (ParseException e) {
					e.printStackTrace();
				}
				createCriteria.andDTimeGreaterThanOrEqualTo(start_date1);
			}
			if(end_date != null) {
				SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				end_date = end_date + " 00:00:00";
				Date end_date1 = new Date();
				try {
					end_date1 = sd.parse(end_date);
				} catch (ParseException e) {
					e.printStackTrace();
				}
				createCriteria.andDTimeLessThanOrEqualTo(end_date1);
			}
			if(classID != null) {
				createCriteria.andDClassidEqualTo(Integer.parseInt(classID));
			}
			if(d_title != null) {
				createCriteria.andDTitleLike("%" + d_title + "%");
			}
		} 
		createCriteria.andDRecycleNotEqualTo((byte)1);
		PageHelper.startPage(page,rows);
		List<Newsdata> list = newsdataMapper.selectByExample(example);
		EUIDataGridResult result = new EUIDataGridResult();
		//取分页信息
		PageInfo<Newsdata> pageInfo = new PageInfo<>(list);
		long total = pageInfo.getTotal();
		result.setRows(list);
		result.setTotal(total);
		return result;
	}

	/**
	 * 根据id取单条文章的普通字段
	 * add by daihj
	 * 20170923
	 */
	@Override
	public Newsdata getNewsdateById(int dId) {
		NewsdataExample example = new NewsdataExample();
		Criteria create = example.createCriteria();
		create.andDIdEqualTo(dId);
		List<Newsdata> list = newsdataMapper.selectByExample(example);
		if(list != null && list.size() > 0) {
			Newsdata newsdata = list.get(0);
			return newsdata;
		}
		return null;
	}

	/**
	 * 根据id取单条文章的blob字段
	 * add by daihj
	 * 20170923
	 */
	@Override
	public NewsdataWithBLOBs getNewsdataBlobById(int dId) {
		NewsdataWithBLOBs newsdata = newsdataMapper.selectByPrimaryKey(dId);
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:ss:mm");
		String format = simpleDateFormat.format(newsdata.getdTime());
		try {
			Date parse = simpleDateFormat.parse(format);
			System.out.println(parse);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return newsdata;
	}

	/**
	 * 查询指定classid下的文章数量
	 * add by daihj
	 * 20170923 
	 */
	@Override
	public long getNewsDataCountByClassID(int classID) {
		String sql = "SELECT COUNT(*) AS COUNT FROM NEWSDATA T WHERE T.D_CLASSID = ? ";
		List<Map<String, Object>> list = jdbcTemplate.queryForList(sql, new Object[]{classID});
		if(null != list && list.size() > 0) {
			long count = (long) list.get(0).get("COUNT");
			return count;
		} 
		return 0;
	}

	/**
	 * 把指定classid下的文章放入回收站
	 * add by daihj
	 * 20171013 
	 */
	@Override
	public ResultData delNewsDataToRecycleByClassID(int classID) {
		NewsdataExample example = new NewsdataExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andDClassidEqualTo(classID);
		Newsdata newsData = new Newsdata();
		byte b = 1;
		newsData.setdRecycle(b);
		newsData.setdRecycletime(new Date());
		int rcount = newsdataMapper.updateByExampleSelective(newsData, example);
		if(rcount > 0) {
			return new ResultData(200, rcount +"篇文章已经放入回收站中！", null);
		} else if(rcount == 0) {
			return new ResultData(300, "该栏目下没有新闻！", null);
		} else {
			return null;
		}
	}

	/**
	 * 上伟文件
	 * @addDate： 2017年10月20日
	 * @autho： add by daihj
	 * @version： 1.0
	 * @return
	 */
	@Override
	public List<?> uploadFile(HttpServletRequest request, HttpServletResponse response, String savePath) {
		ResultData result = null;
		ResultDataForUploadImg result_img = null;
		UploadFileUtil uploadFileUtil = new UploadFileUtil();
		// flg=0表示上传文件
		// flg=1表示上传图片
		int flg = 0;
		try {
			Map<String, String> uploadFile = uploadFileUtil.uploadFile(request, response, savePath, oldFileName);
			if(uploadFile != null) {
				//取出文件名和路径
				NewsdataWithBLOBs news = new NewsdataWithBLOBs();
				oldFileName = uploadFile.get("oldFileName");
				if(savePath != null && savePath.equalsIgnoreCase("soft")) {
					result = new ResultData();
					if(uploadFile.get("s_softDown1") != null) {
						news.setsSoftdown1((uploadFile.get("s_softDown1")).replace("\\", "/"));
						//写入数据库或者返回前台
						result.setMsg(oldFileName);
						result.setStatus(200);
						result.setData(news);
					} else {
						result.setMsg(uploadFile.get("msg"));
						result.setStatus(300);
						result.setData(null);
					}
					
				} else {
					result_img = new ResultDataForUploadImg();
					if(uploadFile.get("originalfilename") != null) {
						news.setdOriginalfilename((uploadFile.get("originalfilename")).replace("\\", "/"));
					}
					if(uploadFile.get("saveFileName") != null) {
						news.setdSavefilename((uploadFile.get("saveFileName")).replace("\\", "/"));
					}
					if(uploadFile.get("savePathFileName") != null) {
						news.setdSavepathfilename((uploadFile.get("savePathFileName")).replace("\\", "/"));
						flg = 1;
						result_img.setData(news);
						result_img.setError(0);
						result_img.setMessage("上传成功！");
//						result_img.setUrl("http://www.yangqiputongsi.com" + news.getdSavepathfilename());
						result_img.setUrl(".." + news.getdSavepathfilename());
						result_img.setTitle(oldFileName);
					} else {
						result_img.setData(null);
						result_img.setError(1);
						result_img.setMessage(uploadFile.get("msg") == null ? "" : uploadFile.get("msg"));
						result_img.setUrl("");
						result_img.setTitle("");
					}
				}
			}
		} catch (IllegalStateException e) {
			if(result != null) {
				result.setMsg(oldFileName);
				result.setStatus(300);
			}
			e.printStackTrace();
		} catch (IOException e) {
//			if(result != null) {
//				result.setMsg(oldFileName);
//				result.setStatus(300);
//			}
			e.printStackTrace();
		} finally {
			if(flg == 0) {
				List<ResultData> list = new ArrayList<ResultData>();
				if(result != null) {
					list.add(result);
				}
				return list;
			} else {
				List<ResultDataForUploadImg> list = new ArrayList<ResultDataForUploadImg>();
				if(result_img != null) {
					list.add(result_img);
				}
				return list;
			}
		}
	}

	/**
	 * 添加新闻
	 * @addDate： 2017年11月1日
	 * @autho： add by daihj
	 * @version： 1.0
	 * @return
	 */
	@Override
	public ResultData addNewsData(NewsdataWithBLOBs newsData) {
		ResultData resultData = new ResultData();
		int rcount = newsdataMapper.insert(newsData);
		if(rcount > 0) {
			resultData.setStatus(200);
		} else {
			resultData.setStatus(300);
		}
		return resultData;
	}

	/**
	 * 删除新闻
	 * @addDate： 2017年11月9日
	 * @autho： add by daihj
	 * @version： 1.0
	 * @return
	 */
	@Override
	public ResultData delNewsDataToRecycleByID(int[] ids) {
		List<Integer> idList = new ArrayList<Integer>();
		for (Integer id : ids) {
			idList.add(id);
		}
		Newsdata newsData = new Newsdata();
		byte b = 1;
		newsData.setdRecycle(b);
		newsData.setdRecycletime(new Date());
		NewsdataExample example = new NewsdataExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andDIdIn(idList);
		int rcount = newsdataMapper.updateByExampleSelective(newsData, example);
		if(rcount > 0) {
			return new ResultData(200, rcount +"篇文章已经放入回收站中！", null);
		} else {
			return new ResultData(300, "新闻删除失败！", null);
		}
	}

	/**
	 * 修改新闻
	 * @addDate： 2017年11月10日
	 * @autho： add by daihj
	 * @version： 1.0
	 * @return
	 */
	@Override
	public ResultData updateNewsData(NewsdataWithBLOBs newsData) {
		int rcount = newsdataMapper.updateByPrimaryKeySelective(newsData);
		if(rcount > 0) {
			return new ResultData(200,"新闻修改成功！", null);
		} else {
			return new ResultData(300, "新闻修改失败！", null);
		}
	}

	/**
	 * 获取文章回收站中的文章列表
	 * @addDate： 2017年11月10日
	 * @autho： add by daihj
	 * @version： 1.0
	 * @return
	 */
	@Override
	public EUIDataGridResult getRecycleNewsDataList(int rows, int page) {
		NewsdataExample example = new NewsdataExample();
		example.setOrderByClause("D_ID DESC");
		Criteria createCriteria = example.createCriteria();
		createCriteria.andDRecycleEqualTo((byte)1);
		PageHelper.startPage(page,rows);
		List<Newsdata> list = newsdataMapper.selectByExample(example);
		EUIDataGridResult result = new EUIDataGridResult();
		//取分页信息
		PageInfo<Newsdata> pageInfo = new PageInfo<>(list);
		long total = pageInfo.getTotal();
		result.setRows(list);
		result.setTotal(total);
		return result;
	}

	/**
	 * 从回收站中批量删除新闻
	 * @addDate： 2017年11月13日
	 * @autho： add by daihj
	 * @version： 1.0
	 * @return
	 */
	@Override
	public ResultData deleteNewsDataByIds(int[] ids) {
		if(ids.length > 0) {
			List<Integer> idsList = new ArrayList<Integer>();
			for (int i : ids) {
				idsList.add(i);
			}
			NewsdataExample example = new NewsdataExample();
			Criteria createCriteria = example.createCriteria();
			createCriteria.andDIdIn(idsList);
			int rcount = newsdataMapper.deleteByExample(example);
			if(rcount > 0) {
				return new ResultData(200, "删除成功！", null);
			} else {
				return new ResultData(300, "删除失败！", null);
			}
		}
		return new ResultData(300, "删除失败！", null);
	}

	/**
	 * 从回收站中删除新闻
	 * @addDate： 2017年11月13日
	 * @autho： add by daihj
	 * @version： 1.0
	 * @return
	 */
	@Override
	public ResultData deleteNewsDataById(Integer id) {
		int rcount = newsdataMapper.deleteByPrimaryKey(id);
		if(rcount > 0) {
			return new ResultData(200,"删除成功！",null);
		} else {
			return new ResultData(300,"删除失败！",null);
		}
	}

	/**
	 * 从回收站中批量还原新闻
	 * @addDate： 2017年11月13日
	 * @autho： add by daihj
	 * @version： 1.0
	 * @return
	 */
	@Override
	public ResultData rollBackNewsDataByIds(int[] ids) {
		List<Integer> idsList = new ArrayList<Integer>();
		for (int integer : ids) {
			idsList.add(integer);
		}
		NewsdataWithBLOBs news = new NewsdataWithBLOBs();
		news.setdRecycle((byte)0);
		NewsdataExample example = new NewsdataExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andDIdIn(idsList);
		int rcount = newsdataMapper.updateByExampleSelective(news, example);
		if(rcount > 0) {
			return new ResultData(200, "还原成功！", null);
		} else {
			return new ResultData(300, "还原失败！", null);
		}
	}

	/**
	 * 从回收站中还原新闻
	 * @addDate： 2017年11月13日
	 * @autho： add by daihj
	 * @version： 1.0
	 * @return
	 */
	@Override
	public ResultData rollBackNewsDataById(Integer id) {
		NewsdataWithBLOBs news = new NewsdataWithBLOBs();
		news.setdRecycle((byte)0);
		news.setdId(id);
		int rcount = newsdataMapper.updateByPrimaryKeySelective(news);
		if(rcount > 0) {
			return new ResultData(200, "还原成功！", null);
		} else {
			return new ResultData(300, "还原失败！", null);
		}
	}

	
}
