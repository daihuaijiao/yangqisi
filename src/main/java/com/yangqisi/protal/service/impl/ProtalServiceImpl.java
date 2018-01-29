package com.yangqisi.protal.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yangqisi.mapper.FriendlinkMapper;
import com.yangqisi.mapper.LiuyanMapper;
import com.yangqisi.mapper.NewsclassMapper;
import com.yangqisi.mapper.NewsdataMapper;
import com.yangqisi.pojo.Friendlink;
import com.yangqisi.pojo.FriendlinkExample;
import com.yangqisi.pojo.Liuyan;
import com.yangqisi.pojo.LiuyanExample;
import com.yangqisi.pojo.Newsclass;
import com.yangqisi.pojo.NewsclassExample;
import com.yangqisi.pojo.Newsdata;
import com.yangqisi.pojo.NewsdataExample;
import com.yangqisi.pojo.NewsdataExample.Criteria;
import com.yangqisi.pojo.NewsdataWithBLOBs;
import com.yangqisi.pojo.ProtalClassNewsList;
import com.yangqisi.pojo.ShowNewsData;
import com.yangqisi.pojo.ShowNewsPage_NewsList;
import com.yangqisi.protal.service.ProtalService;
import com.yangqisi.util.DelHtmlTagUtil;
import com.yangqisi.util.ResultData;


/**
 * 门户首页service
 * @addDate： 2017年12月4日
 * @autho： add by daihj
 * @version： 1.0
 */
@Service
public class ProtalServiceImpl implements ProtalService {

	@Resource
	private NewsdataMapper newsDataMapper;
	@Resource
	private NewsclassMapper newsclassMapper;
	@Resource
	private FriendlinkMapper friendLinkMapper;
	@Resource
	private LiuyanMapper liuYanMapper;
	
	
	private String index_start = "<li><a href=\"javascript:void(0)\" onclick=\"showProtalNewsPage(";
	private String content_start = "<li><a href=\"javascript:void(0)\" onclick=\"getNewsList(";
	//	新闻列表错误时显示的内容
	private String err_list = "<ul><li><a>暂无内容！</a></li></ul>";
	private NewsdataExample newsExample;
	private NewsclassExample classExample;
	
	/**
	 * 首页展示的文章列表
	 * 按栏目区分
	 */
	@Override
	public ProtalClassNewsList getProtalClassNewsList() {
		ProtalClassNewsList result = new ProtalClassNewsList();
		result.setZhongda(getZhongDa());
		result.setDade(getDaDe());
		result.setZhishi(getZhiShi());
		result.setGongan(getGongAn());
		result.setGongde(getGongDe());
		result.setLianjie(getLianJie());
		result.setNews(getNews());
		result.setWuzhi(getWuZhi());
		result.setXunli(getXunLi());
		result.setYiwei(getYiWei());
		result.setYuandi1(getYuanDi1());
		result.setYuandi2(getYuanDi2());
		result.setYxl(getYXL());
		return result;
	}

	/**
	 * 重大事件
	 * @addDate： 2017年12月4日
	 * @autho： add by daihj
	 * @version： 1.0
	 * @return
	 */
	private String getZhongDa() {
		newsExample = new NewsdataExample();
		Criteria createCriteria = newsExample.createCriteria();
		createCriteria.andDClassidEqualTo(39);
		createCriteria.andDRecycleEqualTo((byte)0);
		newsExample.setOrderByClause("D_ID DESC");
		List<Newsdata> selectByExample = newsDataMapper.selectByExample(newsExample);
		return madeString(selectByExample,5,14);
	}
	
	/**
	 * 高僧大德
	 * @addDate： 2017年12月4日
	 * @autho： add by daihj
	 * @version： 1.0
	 * @return
	 */
	private String getDaDe() {
		classExample = new NewsclassExample();
		com.yangqisi.pojo.NewsclassExample.Criteria classCreateCriteria = classExample.createCriteria();
		classCreateCriteria.andParentidEqualTo(15);
		List<Newsclass> classList = newsclassMapper.selectByExample(classExample);
		List<Integer> classIDS = new ArrayList<Integer>();
		for (Newsclass newsclass : classList) {
			classIDS.add(newsclass.getClassid());
		}
		
		newsExample = new NewsdataExample();
		Criteria newsCreateCriteria = newsExample.createCriteria();
		newsCreateCriteria.andDClassidIn(classIDS);
		newsCreateCriteria.andDRecycleEqualTo((byte)0);
		newsExample.setOrderByClause("D_ID DESC");
		List<Newsdata> selectByExample = newsDataMapper.selectByExample(newsExample);
		
		return madeString(selectByExample,5,14);
	}
	
	/**
	 * 佛教知识
	 * @addDate： 2017年12月4日
	 * @autho： add by daihj
	 * @version： 1.0
	 * @return
	 */
	private String getZhiShi() {
		newsExample = new NewsdataExample();
		Criteria createCriteria = newsExample.createCriteria();
		createCriteria.andDClassidEqualTo(60);
		createCriteria.andDRecycleEqualTo((byte)0);
		newsExample.setOrderByClause("D_ID DESC");
		List<Newsdata> selectByExample = newsDataMapper.selectByExample(newsExample);
		return madeString(selectByExample,4,14);
	}
	
	/**
	 * 禅门公案
	 * @addDate： 2017年12月4日
	 * @autho： add by daihj
	 * @version： 1.0
	 * @return
	 */
	private String getGongAn() {
		newsExample = new NewsdataExample();
		Criteria createCriteria = newsExample.createCriteria();
		createCriteria.andDClassidEqualTo(56);
		createCriteria.andDRecycleEqualTo((byte)0);
		newsExample.setOrderByClause("D_ID DESC");
		List<Newsdata> selectByExample = newsDataMapper.selectByExample(newsExample);
		return madeString(selectByExample,4,14);
	}
	
	/**
	 * 新闻-寺内动态
	 * @addDate： 2017年12月4日
	 * @autho： add by daihj
	 * @version： 1.0
	 * @return
	 */
	private String getNews() {
		newsExample = new NewsdataExample();
		Criteria createCriteria = newsExample.createCriteria();
		createCriteria.andDClassidEqualTo(38);
		createCriteria.andDRecycleEqualTo((byte)0);
		newsExample.setOrderByClause("D_ID DESC");
		List<Newsdata> selectByExample = newsDataMapper.selectByExample(newsExample);
		if(selectByExample.size() < 1) {
			return  "<li><a>暂无信息！</a></li>";
		}
		StringBuffer sb = new StringBuffer();
		String end = "";
		int i = 0;
		for(Newsdata newsData : selectByExample) {
			// <li><a href=\"/maz/show.asp?artid=591\">虚云老和1</a></li>
			// <li><a href=\"javascript:void(0)\" onclick=\"showProtalNewsPage(591,"isIndex")\">虚云老和1</a></li>
			if(i == 11) break;
			if(i > 0) {
				String title = newsData.getdTitle();
				if(null != title && title.length() > 16) {
					title = title.substring(0, 16);
					title = title + "……";
				}
				end = ",0)\">" + title + "</a></li>";
				sb.append(index_start);
				sb.append(newsData.getdId());
				sb.append(",");
				sb.append(newsData.getdClassid());
				sb.append(end);
			}
			i++;
		}
		String topNews = getTopNews();
		topNews = topNews.replace("(li)", sb.toString());
		return topNews;
	}
	
	/**
	 * 图片新闻
	 * @addDate： 2017年12月5日
	 * @autho： add by daihj
	 * @version： 1.0
	 * @param obj
	 */
	private String getTopNews() {
		//70字
		newsExample = new NewsdataExample();
		Criteria createCriteria = newsExample.createCriteria();
		createCriteria.andDRecycleEqualTo((byte)0);
		newsExample.setOrderByClause("D_ID DESC");
		List<NewsdataWithBLOBs> selectByExample = newsDataMapper.selectByExampleWithBLOBs(newsExample);
		String title = "";
		String content = "";
		String picture = "";
		Integer classID = 0;
		Integer dId = 0;
		for (NewsdataWithBLOBs newsdata : selectByExample) {
			title = newsdata.getdTitle();
			content = newsdata.getdContent();
			picture = newsdata.getdPicture();
			dId = newsdata.getdId();
			classID = newsdata.getdClassid();
			break;
		}
		if(null != picture && picture.length() > 1) {
			//	<img id="top-img" alt="新闻图片" style="width:230px;height:140px;" src="./images/255x200.jpg" />
			picture = "<img id=\"top-img\" alt=\"新闻图片\" style=\"width:230px;height:140px;\" src=\".." + picture + "\" />";
		}
		if(title.length() > 16) {
			//	<h2><a>2017年度杨岐心灯帮扶计划...</a></h2>
			title = title.substring(0, 16);
		}
		title = "<h2><a href=\"javascript:void(0)\" onclick=\"showProtalNewsPage(" + dId + "," + classID + "," + 0 +  ")\">" + title + "……</a></h2>";
		content = DelHtmlTagUtil.delTag(content);
		content = content.replace("'", "\'");
		if(content.length() > 70) {
			content = content.substring(0, 70);
		}
		//	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="/news/show.asp?artid=901">“心灯帮扶计划”是杨岐普通寺在萍乡市民宗局、上栗县民宗局的指导下，香港中华总商会会长、旭日集团董事香港中华总商团......</a>
		//	<ul id="news" class="double_list protal_list">
		//	 	<li><a>暂无信息！</a></li>
		//	</ul>
		String start = "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;";
		String url = "<a href=\"javascript:void(0)\" onclick=\"showProtalNewsPage(" + dId + "," + classID + "," + 0 +  ")\">";
		String end = "</a><ul id=\"news\" class=\"double_list protal_list\">";
		content = picture + title + start + url + content + "……" + end + "(li)" + "</ul>";
		return content;
	}
	
	/**
	 * 老和尚言行录
	 * @addDate： 2017年12月4日
	 * @autho： add by daihj
	 * @version： 1.0
	 * @return
	 */
	private String getYXL() {
		newsExample = new NewsdataExample();
		Criteria createCriteria = newsExample.createCriteria();
		List<Integer> classIDS = new ArrayList<Integer>();
		classIDS.add(68);
		classIDS.add(69);
		classIDS.add(70);
		classIDS.add(71);
		createCriteria.andDClassidIn(classIDS);//68,69,70,71
		createCriteria.andDRecycleEqualTo((byte)0);
		newsExample.setOrderByClause("D_ID DESC");
		List<Newsdata> selectByExample = newsDataMapper.selectByExample(newsExample);
		return madeString(selectByExample,6,16);
	}
	
	/**
	 * 拈花悟旨
	 * @addDate： 2017年12月4日
	 * @autho： add by daihj
	 * @version： 1.0
	 * @return
	 */
	private String getWuZhi() {
		newsExample = new NewsdataExample();
		Criteria createCriteria = newsExample.createCriteria();
		createCriteria.andDClassidEqualTo(49);
		createCriteria.andDRecycleEqualTo((byte)0);
		newsExample.setOrderByClause("D_ID DESC");
		List<Newsdata> selectByExample = newsDataMapper.selectByExample(newsExample);
		return madeString(selectByExample,8,16);
	}
	
	/**
	 * 修学园地-忆伄悟心
	 * @addDate： 2017年12月4日
	 * @autho： add by daihj
	 * @version： 1.0
	 * @return
	 */
	private String getYuanDi1() {
		newsExample = new NewsdataExample();
		Criteria createCriteria = newsExample.createCriteria();
		createCriteria.andDClassidEqualTo(16);//16,17,18,19
		createCriteria.andDRecycleEqualTo((byte)0);
		newsExample.setOrderByClause("D_CLASSID ASC, D_ID DESC");
		List<Newsdata> selectByExample = newsDataMapper.selectByExample(newsExample);
		return madeString(selectByExample,10,14);
	}
	
	/**
	 * 修学园地-心和则谐
	 * @addDate： 2017年12月4日
	 * @autho： add by daihj
	 * @version： 1.0
	 * @return
	 */
	private String getYuanDi2() {
		newsExample = new NewsdataExample();
		Criteria createCriteria = newsExample.createCriteria();
		createCriteria.andDClassidEqualTo(17);//16,17,18,19
		createCriteria.andDRecycleEqualTo((byte)0);
		newsExample.setOrderByClause("D_CLASSID ASC, D_ID DESC");
		List<Newsdata> selectByExample = newsDataMapper.selectByExample(newsExample);
		return madeString(selectByExample,10,14);
	}
	
	/**
	 * 禅茶一味
	 * @addDate： 2017年12月4日
	 * @autho： add by daihj
	 * @version： 1.0
	 * @return
	 */
	private String getYiWei() {
		newsExample = new NewsdataExample();
		Criteria createCriteria = newsExample.createCriteria();
		createCriteria.andDClassidEqualTo(44);
		createCriteria.andDRecycleEqualTo((byte)0);
		newsExample.setOrderByClause("D_ID DESC");
		List<Newsdata> selectByExample = newsDataMapper.selectByExample(newsExample);
		return madeString(selectByExample,4,14);
	}
	
	/**
	 * 寺院巡礼
	 * @addDate： 2017年12月4日
	 * @autho： add by daihj
	 * @version： 1.0
	 * @return
	 */
	private String getXunLi() {
		newsExample = new NewsdataExample();
		Criteria createCriteria = newsExample.createCriteria();
		createCriteria.andDClassidEqualTo(24);
		createCriteria.andDRecycleEqualTo((byte)0);
		newsExample.setOrderByClause("D_ID DESC");
		List<Newsdata> selectByExample = newsDataMapper.selectByExample(newsExample);
		return madeString(selectByExample,4,14);
	}
	
	/**
	 * 随喜功德
	 * @addDate： 2017年12月4日
	 * @autho： add by daihj
	 * @version： 1.0
	 * @return
	 */
	private String getGongDe() {
		newsExample = new NewsdataExample();
		Criteria createCriteria = newsExample.createCriteria();
		createCriteria.andDClassidEqualTo(32);
		createCriteria.andDRecycleEqualTo((byte)0);
		newsExample.setOrderByClause("D_ID DESC");
		List<Newsdata> selectByExample = newsDataMapper.selectByExample(newsExample);
		return madeString(selectByExample,2,14);
	}
	
	/**
	 * 友情链接
	 * @addDate： 2017年12月4日
	 * @autho： add by daihj
	 * @version： 1.0
	 * @return
	 */
	private String getLianJie() {
		return "";
	}
	
	/**
	 * 用li标签拼接好字符串
	 * @addDate： 2017年12月4日
	 * @autho： add by daihj
	 * @version： 1.0
	 * @param selectByExample 新闻对象列表
	 * @param count 显示数量
	 * @return 用li标签拼接好的字符串
	 */
	private String madeString(List<Newsdata> selectByExample, int count, int subSize) {
		if(selectByExample.size() < 1) {
			return  "<li><a>暂无信息！</a></li>";
		}
		StringBuffer sb = new StringBuffer();
		String end = "";
		int i = 0;
		for(Newsdata newsData : selectByExample) {
			// <li><a href=\"/maz/show.asp?artid=591\">虚云老和1</a></li>
			// <li><a href=\"javascript:void(0)\" onclick=\"showProtalNewsPage(591,51,0)\">虚云老和1</a></li>
			if(i == count) break;
			String title = newsData.getdTitle();
			if(null != title && title.length() > subSize) {
				title = title.substring(0, subSize);
				title = title + "……";
			}
			end = ",0)\">" + title + "</a></li>";
			sb.append(index_start);
			sb.append(newsData.getdId());
			sb.append(",");
			sb.append(newsData.getdClassid());
			sb.append(end);
			i++;
		}
		return sb.toString();
	}

	/**
	 * 文章详细内容页面的内容
	 * 上一篇下一篇时使用
	 */
	@Override
	public ResultData getNewsPageContent(Integer id, Integer classID, Integer flg) {
		ShowNewsData newsContentData = getNewsContentData(id, classID, flg);
		ResultData result = new ResultData(200,"成功！",newsContentData);
		return result;
	}
	
	/**
	 * 文章详细内容页面的内容
	 * 从首页进入时使用
	 */
	@Override
	public ShowNewsData getNewsContentData(Integer id, Integer classID, Integer flg) {
		if(flg == 1) {
			ShowNewsData result = new ShowNewsData();
			result.setClassList(getClassList(classID));
			return result;
		}
		NewsdataWithBLOBs newsDataById = getNewsDataById(id);
		Integer parentID = getNeswClassParentIdByKey(classID);
		ShowNewsData result = new ShowNewsData();
		result.setBanner(getBanner(getNewsClassNameByKey(parentID),newsDataById.getdClassname(),newsDataById.getdClassid()));
		String content = newsDataById.getdContent();
		content = content.replace("'", "\\'");
		result.setContent(content);
		result.setNext(getNext(id,classID));
		result.setPrev(getPrev(id,classID));
		result.setTime(getTime(newsDataById));
		result.setTitle(newsDataById.getdTitle());
		result.setClassList(getClassList(parentID));
		
		return result;
	}
	
	/**
	 * 内容页面的“当前位置”
	 * @addDate： 2017年12月10日
	 * @autho： add by daihj
	 * @version： 1.0
	 * @return
	 */
	private String getBanner(String parentClassName, String className, Integer classID) {
		//	<p>当前位置：<a href="showProtalPage.action">首页</a> > <a href=\"javascript:void(0)\" onclick=\"getNewsList(12)\">禅茶一味</a></p>
		StringBuffer sb = new StringBuffer();
		sb.append("<p>当前位置：<a href=\"showProtalPage.action\">首页</a>&nbsp;&nbsp;>&nbsp;&nbsp;");
		sb.append("<a href=\"javascript:void(0)\" onclick=\"getNewsList(");
		sb.append(classID);
		sb.append(")\">");
		sb.append(parentClassName);
		sb.append("</a>&nbsp;&nbsp;>&nbsp;&nbsp;");
		sb.append(className);
		
		return sb.toString();
	}
	
	/**
	 * 内容页面的“下一篇”
	 * @addDate： 2017年12月10日
	 * @autho： add by daihj
	 * @version： 1.0
	 * @return
	 */
	private String getNext(Integer id, Integer classID) {
		//	<p>上一篇：没有了<p>
		//	<p>下一篇： <a href='Show.asp?ArtID=900'>2016年度心灯帮扶计划申请通告（附申请表）</a><p>
		if(null != id) {
			newsExample = new NewsdataExample();
			Criteria createCriteria = newsExample.createCriteria();
			createCriteria.andDIdLessThan(id);
			createCriteria.andDClassidEqualTo(classID);
			createCriteria.andDRecycleEqualTo((byte)0);
			newsExample.setOrderByClause("D_ID DESC LIMIT 2");
			List<Newsdata> selectByExample = newsDataMapper.selectByExample(newsExample);
			if(selectByExample.size() < 1) {
				return "<p>下一篇：没有了<p>";
			}
			StringBuffer sb = new StringBuffer();
			sb.append("<p>下一篇：<a href=\"javascript:void(0)\" onclick=\"showProtalNewsPage(");
			for (Newsdata newsdata : selectByExample) {
				//	<a href=\"javascript:void(0)\" onclick=\"showProtalNewsPage(id,classID,flg
				sb.append(newsdata.getdId());
				sb.append(",");
				sb.append(newsdata.getdClassid());
				sb.append(",");
				sb.append(0);
				sb.append(")\">");
				sb.append(newsdata.getdTitle());
				sb.append("</a><p>");
				break;
			}
			return sb.toString();
		}
		return "<p>下一篇：没有了<p>";
	}
	
	/**
	 * 内容页面的“上一篇“
	 * @addDate： 2017年12月10日
	 * @autho： add by daihj
	 * @version： 1.0
	 * @return
	 */
	private String getPrev(Integer id, Integer classID) {
		//	<p>上一篇：没有了<p>
		//	<p>下一篇： <a href='Show.asp?ArtID=900'>2016年度心灯帮扶计划申请通告（附申请表）</a><p>
		if(null != id) {
			newsExample = new NewsdataExample();
			Criteria createCriteria = newsExample.createCriteria();
			createCriteria.andDIdGreaterThan(id);
			createCriteria.andDClassidEqualTo(classID);
			createCriteria.andDRecycleEqualTo((byte)0);
			newsExample.setOrderByClause("D_ID ASC LIMIT 2");
			List<Newsdata> selectByExample = newsDataMapper.selectByExample(newsExample);
			if(selectByExample.size() < 1) {
				return "<p>上一篇：没有了<p>";
			}
			StringBuffer sb = new StringBuffer();
			sb.append("<p>上一篇：<a href=\"javascript:void(0)\" onclick=\"showProtalNewsPage(");
			for (Newsdata newsdata : selectByExample) {
				//	<a href=\"javascript:void(0)\" onclick=\"showProtalNewsPage(id,classID,flg
				sb.append(newsdata.getdId());
				sb.append(",");
				sb.append(newsdata.getdClassid());
				sb.append(",");
				sb.append(0);
				sb.append(")\">");
				sb.append(newsdata.getdTitle());
				sb.append("</a><p>");
				break;
			}
			return sb.toString();
		}
		return "<p>上一篇：没有了<p>";
	}
	
	/**
	 * 内容页面的“文章发布时间，发布人，文档下载”
	 * @addDate： 2017年12月10日
	 * @autho： add by daihj
	 * @version： 1.0
	 * @return
	 */
	private String getTime(NewsdataWithBLOBs data) {
		//	<p>添加时间：2011-7-19 8:52:01  添加人：杨岐普通禅寺&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a>文档下载</a></p>
		if(null != data) {
			StringBuffer sb = new StringBuffer();
			sb.append("<p>添加时间：");
			Date getdTime = data.getdTime();
			SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
			sb.append(sd.format(getdTime));
			sb.append("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;添加人：");
			sb.append(data.getdAuthor());
			String document = data.getsSoftdown1();
			if(null != document && !"".equals(document)) {
				sb.append("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href=\"..");
				sb.append(document);
				sb.append("\">文档下载</a>");
			}
			sb.append("</p>");
			return sb.toString();
		}
		return "";
	}
	
	/**
	 * 取父栏目下的所有子栏目
	 * @addDate： 2017年12月10日
	 * @autho： add by daihj
	 * @version： 1.0
	 * @param classID
	 * @return
	 */
	private String getClassList(Integer parentID) {
		classExample = new NewsclassExample();
		com.yangqisi.pojo.NewsclassExample.Criteria createCriteria = classExample.createCriteria();
		createCriteria.andParentidEqualTo(parentID);
		classExample.setOrderByClause("orderID ");
		List<Newsclass> selectByExample = newsclassMapper.selectByExample(classExample);
		//  <li><a href="javascript:void(0)" onclick="getNewsList(535)">杨岐导师—</a></li>
		if(selectByExample.size() < 1) {
			return  "<li><a>暂无信息！</a></li>";
		}
		StringBuffer sb = new StringBuffer();
		String end = "</a></li>";
		for (Newsclass newsclass : selectByExample) {
			sb.append(content_start);
			sb.append(newsclass.getClassid());
			sb.append(")\">");
			sb.append(newsclass.getClassname());
			sb.append(end);
		}
		return sb.toString();
	}
	
	/**
	 * 取一条新闻
	 * @addDate： 2017年12月10日
	 * @autho： add by daihj
	 * @version： 1.0
	 * @param id
	 * @return
	 */
	private NewsdataWithBLOBs getNewsDataById(Integer id) {
		return newsDataMapper.selectByPrimaryKey(id);
	}
	
	/**
	 * 取新闻所在栏目父栏目ID
	 * @addDate： 2017年12月10日
	 * @autho： add by daihj
	 * @version： 1.0
	 * @param classID
	 * @return
	 */
	private Integer getNeswClassParentIdByKey(Integer classID) {
		Newsclass selectByPrimaryKey = newsclassMapper.selectByPrimaryKey(classID);
		return selectByPrimaryKey.getParentid();
	}
	
	/**
	 * 取栏目名称
	 * @addDate： 2017年12月10日
	 * @autho： add by daihj
	 * @version： 1.0
	 * @param classID
	 * @return
	 */
	private String getNewsClassNameByKey(Integer classID) {
		Newsclass selectByPrimaryKey = newsclassMapper.selectByPrimaryKey(classID);
		return selectByPrimaryKey.getClassname();
	}

	/**
	 * 取指定栏目的新闻列表
	 */
	@Override
	public ResultData getNewsList(Integer classID,Integer page) {
		classExample = new NewsclassExample();
		com.yangqisi.pojo.NewsclassExample.Criteria classCriteria = classExample.createCriteria();
		classCriteria.andParentidEqualTo(classID);
		List<Newsclass> childs = newsclassMapper.selectByExample(classExample);
		int parentID = 0;
		ShowNewsPage_NewsList obj = new ShowNewsPage_NewsList();
		//	如果用户点击顶部导航，侧传入的是parentID
		if(null != childs && childs.size() > 0) {
			Newsclass newsclass = childs.get(0);
			parentID = classID;
			classID = newsclass.getClassid();
			obj.setLeftList(getClassList(parentID));
		} else {
			//	如果用户点击左侧导航，侧传入的时classID
			parentID = getNeswClassParentIdByKey(classID);
		}
		obj.setBanner(getBanner(getNewsClassNameByKey(parentID),getNewsClassNameByKey(classID),classID));
		
		if(null != classID && (null != page && page > 0)) {
			int newsListCount = getNewsListCount(classID);
			if(newsListCount <= 0) {
				obj.setContent(err_list);
				return new ResultData(300, "未找到记录！", obj);
			}
			newsExample = new NewsdataExample();
			Criteria createCriteria = newsExample.createCriteria();
			createCriteria.andDClassidEqualTo(classID);
			createCriteria.andDRecycleEqualTo((byte)0);
			int limit = (page * 10) - 10;
			newsExample.setOrderByClause("D_ID DESC LIMIT " + limit + ",10");
			List<Newsdata> selectByExample = newsDataMapper.selectByExample(newsExample);
			if(null == selectByExample || selectByExample.size() <= 0) {
				obj.setContent(err_list);
				return new ResultData(300, "未找到记录！", obj);
			}
			
			String result = madeNewsListString(selectByExample, newsListCount, classID, page);
			if(null != result && !"".equals(result)) {
				obj.setContent(result);
				return new ResultData(200, "成功！", obj);
			}
		}
		obj.setContent(err_list);
		return new ResultData(300, "classID或者page不正确！", err_list);
	}
	
	/**
	 * 指定栏目新闻总条数
	 * @addDate： 2017年12月12日
	 * @autho： add by daihj
	 * @version： 1.0
	 * @param classID
	 * @return
	 */
	private int getNewsListCount(Integer classID) {
		newsExample = new NewsdataExample();
		Criteria createCriteria = newsExample.createCriteria();
		createCriteria.andDClassidEqualTo(classID);
		createCriteria.andDRecycleEqualTo((byte)0);
		List<Newsdata> list = newsDataMapper.selectByExample(newsExample);
		if(null != list && list.size() > 0) {
			return list.size();
		} else {
			return 0;
		}
	}
	
	/**
	 * 新闻列表html串拼接
	 * @addDate： 2017年12月12日
	 * @autho： add by daihj
	 * @version： 1.0
	 * @param list
	 * @param count
	 * @param classID
	 * @param page
	 * @return
	 */
	private String madeNewsListString(List<Newsdata> list, int count, int classID, int page) {
//	
		StringBuffer sb = new StringBuffer();
		sb.append("<ul>");
		SimpleDateFormat sd = new SimpleDateFormat("yyy-MM-dd");
		Date date = null;
		for (Newsdata newsdata : list) {
			sb.append("");
			sb.append("<li><a href=\"javascript:void(0)\" onclick=\"showProtalNewsPage(");
			sb.append(newsdata.getdId());
			sb.append(",");
			sb.append(newsdata.getdClassid());
			sb.append(",");
			sb.append(0);
			sb.append(")\" title=\"文章标题：");
			sb.append(newsdata.getdTitle());
			sb.append("&#10;点击次数：");
			sb.append(newsdata.getdCount());
			sb.append("\">");
			sb.append(newsdata.getdTitle());
			sb.append("</a><span>[");
			date = newsdata.getdTime();
			String format = sd.format(date);
			sb.append(format);
			sb.append("]</span></li>");
		}
		sb.append("<li class=\"special\">共<font color=\'#FF0000\'>");
		sb.append(count);
		sb.append("</font>篇文章  [<a href=\"javascript:void(0)\" onclick=\"changePage(");
		sb.append(classID);
		sb.append(",1)\">首页</a>]&nbsp;&nbsp;");
		if(page > 1) {
			sb.append("[<a href=\"javascript:void(0)\" onclick=\"changePage(");
			sb.append(classID);
			sb.append(",");
			sb.append(page - 1);
			sb.append(")\">上一页</a>]&nbsp;&nbsp;");
		} else {
			sb.append("[<a>上一页</a>]&nbsp;&nbsp;");
		}
		int totalPage = count/10;
		if(count%10 != 0) {
			totalPage += 1;
		}
		if(page == totalPage) {
			sb.append("[<a>下一页</a>]&nbsp;&nbsp;");
		} else {
			sb.append("[<a href=\"javascript:void(0)\" onclick=\"changePage(");
			sb.append(classID);
			sb.append(",");
			sb.append(page + 1);
			sb.append(")\">下一页</a>]&nbsp;&nbsp;");
		}
		sb.append("[<a href=\"javascript:void(0)\" onclick=\"changePage(");
		sb.append(classID);
		sb.append(",");
		sb.append(totalPage);
		sb.append(")\">尾页</a>]&nbsp;&nbsp;");
		sb.append("页次：<font color=\'#ff0000\'>");
		sb.append(page);
		sb.append("</font>/");
		sb.append(totalPage);
		sb.append("页&nbsp;&nbsp;10篇文章/页&nbsp;&nbsp;转到：");
		sb.append("<select name=\"select\" onChange=\"changePage(");
		sb.append(classID);
		//	myselect.options[index].value
		sb.append(",this.options[this.selectedIndex].value)\">");
		sb.append("<option>跳转</option>");
		for(int i=1; i<=totalPage; i++) {
			sb.append("<option value=\"");
			sb.append(i);
			sb.append("\">第");
			sb.append(i);
			sb.append("页</option>");
		}
		sb.append(" </select></li></ul>");
		return sb.toString();
	}

	/**
	 * 顶部公告
	 * 2017-12-14
	 */
	@Override
	public ResultData getGongGao(int classID) {
		if(classID < 1) {
			return new ResultData(300,"失败！",null);
		}
		newsExample = new NewsdataExample();
		Criteria createCriteria = newsExample.createCriteria();
		createCriteria.andDClassidEqualTo(classID);
		newsExample.setOrderByClause("D_ID DESC LIMIT 1");
		List<Newsdata> selectByExample = newsDataMapper.selectByExample(newsExample);
		if(null != selectByExample && selectByExample.size() > 0) {
			return new ResultData(200,"成功！",selectByExample.get(0));
		}
		return new ResultData(300,"失败！",null);
	}

	/**
	 * 获取友情链接
	 * @addDate： 2017年12月16日
	 * @autho： add by daihj
	 * @version： 1.0
	 * @return
	 */
	@Override
	public ResultData getFriendLink() {
		FriendlinkExample example = new FriendlinkExample();
		com.yangqisi.pojo.FriendlinkExample.Criteria createCriteria = example.createCriteria();
		createCriteria.andFRecycleEqualTo((byte)0);
		List<Friendlink> selectByExample = friendLinkMapper.selectByExample(example);
		if(null != selectByExample && selectByExample.size() > 0) {
			StringBuffer sb = new StringBuffer();
			for (Friendlink friendlink : selectByExample) {
				//	<img onclick="openFriendLink('http://www.zgfj.cn/')" alt="中国佛教导航网" src="../images/2008111711360130.jpg"/><br/><br/>
				sb.append("<img onclick=\"openFriendLink('");
				sb.append(friendlink.getfSiteadd());
				sb.append("')\" alt=\"");
				sb.append(friendlink.getfSitename());
				sb.append("\" src=\"..");
				sb.append(friendlink.getfSitelogo());
				sb.append("\"/><br/><br/>");
			}
			return new ResultData(200, "成功！", sb.toString());
		}
		StringBuffer sb = new StringBuffer();
		sb.append("<DIV><FONT size=4>暂无内容！</FONT></DIV>");
		return new ResultData(300, "失败！", sb.toString());
	}

	/**
	 * 添加留言
	 */
	@Override
	public ResultData addLiuYan(Liuyan liuYan) {
		ResultData result = null;
		if(liuYan != null) {
			liuYan.setTime(new Date());
			liuYanMapper.insert(liuYan);
			result = new ResultData(200, "添加成功！", liuYan);
		} else {
			result = new ResultData(300, "添加失败！", null);
		}
		return result;
	}

	/**
	 * 查看留言
	 */
	@Override
	public ResultData getLiuYanList(int page) {
		LiuyanExample example = new LiuyanExample();
		int limit = (page * 10) - 10;
		example.setOrderByClause("time DESC LIMIT " + limit + ",10");
		List<Liuyan> resultList = liuYanMapper.selectByExample(example);
		if(resultList != null && resultList.size() > 0) {
			return new ResultData(200, "成功！", resultList);
		}
		return new ResultData(300, "失败！", page);
	}
	
	/**
	 * 留言总数量
	 */
	@Override
	public ResultData getLiuYanCount() {
		LiuyanExample example = new LiuyanExample();
		List<Liuyan> resultList = liuYanMapper.selectByExample(example);
		if(resultList != null && resultList.size() > 0) {
			return new ResultData(200, "成功！", resultList.size());
		}
		return new ResultData(300, "暂时没有留言信息！", 0);
	}
}

