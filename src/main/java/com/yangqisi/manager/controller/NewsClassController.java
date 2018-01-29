package com.yangqisi.manager.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yangqisi.manager.service.NewsClassService;
import com.yangqisi.pojo.Newsclass;
import com.yangqisi.util.EUITreeResult;
import com.yangqisi.util.JsonUtils;
import com.yangqisi.util.ResultData;

/**
 * 新闻分类controller
 * @addDate： 2017年9月23日
 * @autho： add by daihj
 * @version： 1.0
 */
@RequestMapping("/admin")
@Controller
public class NewsClassController {

	@Resource
	NewsClassService newsClassService;
	
	@RequestMapping("/getNewsClassById.action")
	@ResponseBody
	public Newsclass getNewsClassById(int classID) {
		return newsClassService.getNewsClassById(classID);
	}
	
	/**
	 * 打开栏目管理页面
	 * Title:newsClassList
	 * 2017年8月22日
	 * Add by daihj
	 * Return:String
	 *
	 * @return
	 */
	@RequestMapping("/showNewsClassManagerPage.action")
	public String newsClassList() {
		return "/admin/news_class.jsp";
	}
	
	
	/**
	 * 获取所有分类
	 * @addDate： 2017年10月5日
	 * @autho： add by daihj
	 * @version： 1.0
	 * @return json
	 */
	@RequestMapping(value="/getNewsClassByAll.action",produces = "application/json; charset=utf-8")
	@ResponseBody
	public String getNewsClassByAll() {
		List<EUITreeResult> list = newsClassService.getNewsClassByAll();
		String result = JsonUtils.objectToJson(list);
		System.out.println(result);
		return result;
	}
	
	/**
	 * 显示添加分类窗口
	 * @addDate： 2017年10月5日
	 * @autho： add by daihj
	 * @version： 1.0
	 * @return
	 */
	@RequestMapping("/showNewsClassAddWindow.action")
	public String showNewsClassAddWindow(int classId,String className,Model model) {
		model.addAttribute("classId", classId);
		model.addAttribute("className", className);
		return "/admin/news_class_add.jsp";
	}

	/**
	 * 显示分类修改窗口
	 * @addDate： 2017年10月5日
	 * @autho： add by daihj
	 * @version： 1.0
	 * @param classId
	 * @param className
	 * @param model
	 * @return
	 */
	@RequestMapping("/showNewsClassEditWindow.action")
	public String showNewsClassEditWindow(int classId,Model model) {
		Newsclass newsClass = newsClassService.getNewsClassById(classId);
		model.addAttribute("newsClass", newsClass);
	return "/admin/news_class_edit.jsp";
	}
	
	/**
	 * 获取所有分类，返回combotree所需要的json串
	 * @addDate： 2017年10月5日
	 * @autho： add by daihj
	 * @version： 1.0
	 * @return
	 */
	@RequestMapping(value="/getNewsClassByAllInComBoTree.action",produces="application/json; charset=utf-8")
	@ResponseBody
	public String getNewsClassByAllInComBoTree() {
		List<EUITreeResult> list = newsClassService.getNewsClassByAll();
		String result = JsonUtils.objectToJson(list);
		result = result.replace("className", "text");
		System.out.println(result);
		return result;
	}
	
	/**
	 * 添加栏目分类
	 * @addDate： 2017年10月5日
	 * @autho： add by daihj
	 * @version： 1.0
	 * @param newsclass
	 * @return
	 */
	@RequestMapping("/addChildNewsClass.action")
	@ResponseBody
	public ResultData addChildNewsClass(Newsclass newsClass) {
		return newsClassService.addChildNewsClass(newsClass);
	}
	
	/**
	 * 取子栏目数量
	 * @addDate： 2017年10月12日
	 * @autho： add by daihj
	 * @version： 1.0
	 * @param classId
	 * @return
	 */
	@RequestMapping("/getNewsClassChild.action")
	@ResponseBody
	public String getNewsClassChild(int classId) {
		Newsclass newsClass = newsClassService.getNewsClassById(classId);
		String result = "{\"child\":" + newsClass.getChild() + "}";
		return result;
	}
	
	/**
	 * 把指定classID下的新闻放入回收站
	 * @addDate： 2017年10月15日
	 * @autho： add by daihj
	 * @version： 1.0
	 * @param classID
	 * @return
	 */
	@RequestMapping("/delNewsClass.action")
	@ResponseBody
	public ResultData delNewsClass(int classID) {
		return newsClassService.delNewsClass(classID);
	}
	
	/**
	 * 修改栏目
	 * @addDate： 2017年10月15日
	 * @autho： add by daihj
	 * @version： 1.0
	 * @param newsClass
	 * @return
	 */
	@RequestMapping("/updateNewsClass.action")
	@ResponseBody
	public ResultData updateNewsClass(Newsclass newsClass) {
		return newsClassService.updateNewsClass(newsClass);
	}
	
	/**
	 * 显示添加一级主栏目窗口
	 * @addDate： 2017年10月15日
	 * @autho： add by daihj
	 * @version： 1.0
	 * @return
	 */
	@RequestMapping("/showParentClassAddWindow.action")
	public String showParentClassAddWindow() {
		return "/admin/news_class_add_root.jsp";
	}
	
	/**
	 * 添加一级主栏目
	 * @addDate： 2017年10月15日
	 * @autho： add by daihj
	 * @version： 1.0
	 * @param newsClass
	 * @return
	 */
	@RequestMapping("/addParentNewsClass.action")
	@ResponseBody
	public ResultData addParentNewsClass(Newsclass newsClass) {
		return newsClassService.addParentNewsClass(newsClass);
	}
}
