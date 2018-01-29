package com.yangqisi.manager.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yangqisi.manager.service.NewsDataService;
import com.yangqisi.pojo.NewsdataWithBLOBs;
import com.yangqisi.util.EUIDataGridResult;
import com.yangqisi.util.ResultData;
import com.yangqisi.util.ResultDataForUploadImg;

/**
 * 文章中心相关controller
 * Title:NewsDataController
 * @author melody
 * 2017年8月21日
 * Add by daihj
 *
 */
@Controller
@RequestMapping("/admin")
public class NewsDataController {
	
	@Resource
	private NewsDataService newsDataService;

	/**
	 * 打开添加文章页面
	 * Title:goNewsAddPage
	 * @author melody
	 * 2017年8月22日
	 * Add by daihj
	 * Return:String
	 *
	 * @return
	 */
	@RequestMapping("/showNewsAddPage.action")
	public String showNewsAddPage() {
		return "/admin/news_add.jsp";
	}
	
	/**
	 * 添加文章
	 * Title:nnewsAdd
	 * @author melody
	 * 2017年8月22日
	 * Add by daihj
	 * Return:String
	 *
	 * @return
	 */
	@RequestMapping("/newsDataAdd.action")
	@ResponseBody
	public ResultData newsDataAdd(NewsdataWithBLOBs newsData) {
		return newsDataService.addNewsData(newsData);
	}
	
	/**
	 * 打开修改文章页面,回显数据
	 * Title:showNewsEditPage
	 * 2017年8月22日
	 * Add by daihj
	 * Return:String
	 *
	 * @return
	 */
	@RequestMapping("/showNewsEditPage.action")
	public String showNewsEditPage(@RequestParam int dId, Model model) {
		//Newsdata newsdateById = newsDataService.getNewsdateById(dId);
		NewsdataWithBLOBs newsdataBlobById = newsDataService.getNewsdataBlobById(dId);
		model.addAttribute("newsDataBlob", newsdataBlobById);
		//model.addAttribute("newsData", newsdateById);
		return "/admin/news_edit.jsp";
	}
	
	/**
	 * 修改文章
	 * Title:newsUpdate
	 * @author melody
	 * 2017年8月22日
	 * Add by daihj
	 * Return:ResultData
	 *
	 * @return
	 */
	@RequestMapping("/newsUpdate.action")
	@ResponseBody
	public ResultData newsUpdate(NewsdataWithBLOBs newsData) {
		return newsDataService.updateNewsData(newsData);
	}
	
	/**
	 * 文章删除（非物理删除）
	 * Title:news_delete
	 * @author melody
	 * 2017年8月22日
	 * Add by daihj
	 * Return:ResultData
	 *
	 * @return
	 */
	@RequestMapping("/newsDeleteToRecycleByID.action")
	@ResponseBody
	public ResultData newsDeleteToRecycleByID(int[] ids) {
		return newsDataService.delNewsDataToRecycleByID(ids);
	}
	
	/**
	 * 打开文章列表页面
	 * Title:showNewsListPage
	 * @author melody
	 * 2017年8月22日
	 * Add by daihj
	 * Return:String
	 *
	 * @return
	 */
	@RequestMapping("/showNewsListPage.action")
	public String showNewsListPage() {
		return "/admin/news_list.jsp";
	}
	
	/**
	 * 检索文章列表
	 * Title:getNewsList
	 * @author melody
	 * 2017年8月22日
	 * Add by daihj
	 * Return:EUIDataGridResult
	 *
	 * @return
	 */
	@RequestMapping("/getNewsList.action")
	@ResponseBody
	public EUIDataGridResult getNewsList(@RequestParam int rows, @RequestParam int page, String start_date, String end_date, String classID, String d_title) {
		Map<String,String> param = new HashMap<String,String>();
		if(start_date != null && !start_date.equals("")) {
			param.put("start_date", start_date);
		}
		if(end_date != null && !end_date.equals("")) {
			param.put("end_date", end_date);
		}
		if(classID != null && !classID.equals("")) {
			param.put("classID", classID);
		}
		if(d_title != null && !d_title.equals("")) {
			param.put("d_title", d_title);
		}
		System.out.println("rows:"+rows+"page:"+page+"start_date:"+start_date+"end_date:"+end_date+"classID:"+classID+"d_title:"+d_title);
		return newsDataService.getNewsList(rows, page, param);
	}
	
	/**
	 * 打开文章回收站列表页面
	 * Title:showNewsRecycleListPage
	 * @author melody
	 * 2017年8月22日
	 * Add by daihj
	 * Return:String
	 *
	 * @return
	 */
	@RequestMapping("/showNewsRecycleListPage.action")
	public String showNewsRecycleListPage() {
		return "/admin/news_recycle_list.jsp";
	}
	
	/**
	 * 获取文章回收站中的文章列表
	 * @addDate： 2017年11月10日
	 * @autho： add by daihj
	 * @version： 1.0
	 * @return
	 */
	@RequestMapping("/getRecycleNewsDataList.action")
	@ResponseBody
	public EUIDataGridResult getRecycleNewsDataList(@RequestParam int rows, @RequestParam int page) {
		return newsDataService.getRecycleNewsDataList(rows, page);
	}
	
	/**
	 * 查询指定classid下的文章数量
	 * @addDate： 2017年10月12日
	 * @autho： add by daihj
	 * @version： 1.0
	 * @param classID
	 * @return
	 */
	@RequestMapping("/getNewsDataCountByClassID.action")
	@ResponseBody
	public String getNewsDataCountByClassID(int classID) {
		long count = newsDataService.getNewsDataCountByClassID(classID);
		String result = "{\"count\":" + count + "}"; 
		return result;
	}
	
	/**
	 * 把指定classID下的新闻放入回收站
	 * @addDate： 2017年10月15日
	 * @autho： add by daihj
	 * @version： 1.0
	 * @param classID
	 * @return ResultData
	 */
	@RequestMapping("/delNewsDataByClassID.action")
	@ResponseBody
	public ResultData delNewsDataByClassID(int classID) {
		return newsDataService.delNewsDataToRecycleByClassID(classID);
	}
	
	/**
	 * 打开上传文件窗口
	 * @addDate： 2017年10月20日
	 * @autho： add by daihj
	 * @version： 1.0
	 * @return
	 */
	@RequestMapping("/showUploadFilePage.action")
	public String showUploadFilePage() {
		return "/admin/news_uploadFile.jsp";
	}
	
	/**
	 * 上伟文件
	 * @addDate： 2017年10月20日
	 * @autho： add by daihj
	 * @version： 1.0
	 * @return
	 */
	@RequestMapping("/uploadFile.action")
	@ResponseBody
	public ResultData uploadFile(HttpServletRequest request, HttpServletResponse response) {
		List<?> uploadFile = newsDataService.uploadFile(request, response, "soft");
		if(uploadFile != null && uploadFile.size() > 0) {
			return (ResultData)uploadFile.get(0);
		} else {
			return new ResultData();
		}
	}
	
	/**
	 * 上传图片
	 * @addDate： 2017年11月2日
	 * @autho： add by daihj
	 * @version： 1.0
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("/uploadImg.action")
	@ResponseBody
	public ResultDataForUploadImg uploadImg(HttpServletRequest request, HttpServletResponse response) {
		List<?> uploadFile = newsDataService.uploadFile(request, response, "news");
		if(uploadFile != null && uploadFile.size() > 0) {
			return (ResultDataForUploadImg)uploadFile.get(0);
		} else {
			return new ResultDataForUploadImg();
		}
	}
	
	/**
	 * 从回收站批量删除新闻
	 * @addDate： 2017年11月13日
	 * @autho： add by daihj
	 * @version： 1.0
	 * @param ids
	 * @return
	 */
	@RequestMapping("/newsDataDeleteByIds.action")
	@ResponseBody
	public ResultData newsDataDeleteByIds(int[] ids) {
		return newsDataService.deleteNewsDataByIds(ids);
	}
	
	/**
	 * 从回收站中删除新闻
	 * @addDate： 2017年11月13日
	 * @autho： add by daihj
	 * @version： 1.0
	 * @param ids
	 * @return
	 */
	@RequestMapping("/newsDataDeleteById.action")
	@ResponseBody
	public ResultData newsDataDeleteById(Integer id) {
		return newsDataService.deleteNewsDataById(id);
	}
	
	/**
	 * 从回收站中批量还原新闻
	 * @addDate： 2017年11月13日
	 * @autho： add by daihj
	 * @version： 1.0
	 * @param ids
	 * @return
	 */
	@RequestMapping("/newsDataRollBackByIds.action")
	@ResponseBody
	public ResultData newsDataRollBackByIds(int[] ids) {
		return newsDataService.rollBackNewsDataByIds(ids);
	}
	
	/**
	 * 从回收站中还原新闻
	 * @addDate： 2017年11月13日
	 * @autho： add by daihj
	 * @version： 1.0
	 * @param ids
	 * @return
	 */
	@RequestMapping("/newsDataRollBackById.action")
	@ResponseBody
	public ResultData newsDataRollBackById(Integer id) {
		return newsDataService.rollBackNewsDataById(id);
	}
	
}
