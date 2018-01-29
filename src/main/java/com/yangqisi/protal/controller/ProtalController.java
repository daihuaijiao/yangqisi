package com.yangqisi.protal.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yangqisi.pojo.Liuyan;
import com.yangqisi.pojo.ProtalClassNewsList;
import com.yangqisi.pojo.ShowNewsData;
import com.yangqisi.protal.service.ProtalService;
import com.yangqisi.util.CheckCodeUtil;
import com.yangqisi.util.ResultData;

/**
 * 门户首页controller
 * @addDate： 2017年12月4日
 * @autho： add by daihj
 * @version： 1.0
 */
//@RequestMapping("/protal")
@Controller
public class ProtalController {

	@Resource
	private ProtalService protalService;
	
	/**
	 * 显示新闻内容
	 * @addDate： 2017年12月6日
	 * @autho： add by daihj
	 * @version： 1.0
	 * @return
	 */
	@RequestMapping("/protal/showNewsPage.action")
	public String showNewsPage(Model model,Integer id, Integer classID, Integer flg) {
		if(flg == 1) {
			model.addAttribute("autoGetList", true);
			model.addAttribute("classID", classID);
		}
		ShowNewsData newsContentData = protalService.getNewsContentData(id, classID, flg);
		model.addAttribute("newsContentData", newsContentData);
		return "/protal/show_news.jsp";
	}
	
	/**
	 * 新闻内容面容的新闻内容
	 * @addDate： 2017年12月14日
	 * @autho： add by daihj
	 * @version： 1.0
	 * @param id
	 * @param classID
	 * @param flg
	 * @return
	 */
	@RequestMapping("/protal/getNewsPageContent.action")
	@ResponseBody
	public ResultData getNewsPageContent(Integer id, Integer classID, Integer flg) {
		return protalService.getNewsPageContent(id, classID, flg);
	}
	
	/**
	 * 新闻内容页面的新闻列表
	 * @addDate： 2017年12月14日
	 * @autho： add by daihj
	 * @version： 1.0
	 * @param classID
	 * @param page
	 * @return
	 */
	@RequestMapping("/protal/getNewsList.action")
	@ResponseBody
	public ResultData getNewsList(Integer classID,Integer page) {
		return protalService.getNewsList(classID,page);
	}
	
	/**
	 * 打开视频页面
	 * @addDate： 2017年12月14日
	 * @autho： add by daihj
	 * @version： 1.0
	 * @return
	 */
	@RequestMapping("/protal/showVideoPage.action")
	public String showVideoPage() {
		
		return "/protal/show_video.jsp";
	}
	
	/**
	 * 顶部公告
	 * @addDate： 2017年12月14日
	 * @autho： add by daihj
	 * @version： 1.0
	 * @param classID
	 */
	@RequestMapping("/protal/getGongGao.action")
	@ResponseBody
	public ResultData getGongGao(int classID) {
		return protalService.getGongGao(classID);
	}
	
	/**
	 * 显示主页
	 * @addDate： 2017年12月6日
	 * @autho： add by daihj
	 * @version： 1.0
	 * @param model
	 * @return
	 */
	@RequestMapping("/protal/showProtalPage.action")
	public String showProtalPage(Model model) {
		ProtalClassNewsList protalClassNewsList = getProtalClassNewsList();
		model.addAttribute("obj", protalClassNewsList);
		return "/protal/index.jsp";
	}
	
	/**
	 * 主页需要显示的所有栏目列表
	 * @addDate： 2017年12月6日
	 * @autho： add by daihj
	 * @version： 1.0
	 * @return
	 */
	private ProtalClassNewsList getProtalClassNewsList() {
		return protalService.getProtalClassNewsList();
	}
	
	/**
	 * 显示“关于我们”页面
	 * @addDate： 2017年12月16日
	 * @autho： add by daihj
	 * @version： 1.0
	 * @param model
	 * @param linkSource
	 * @return
	 */
	@RequestMapping("/protal/showAboutPage.action")
	public String showAboutPage(Model model,int linkSource) {
		model.addAttribute("linkSource", linkSource);
		return "/protal/show_about.jsp";
	}
	
	/**
	 * 获取友情链接
	 * @addDate： 2017年12月16日
	 * @autho： add by daihj
	 * @version： 1.0
	 * @return
	 */
	@RequestMapping("/protal/getFriendLink.action")
	@ResponseBody
	public ResultData getFriendLink() {
		return protalService.getFriendLink();
	}
	
	/**
	 * 获取验证码
	 * @addDate： 2018年1月27日
	 * @autho： add by daihj
	 * @version： 1.0
	 * @param response
	 * @param request
	 * @return
	 */
	@RequestMapping("/protal/getCheckCode.action")
	@ResponseBody
	public ResultData getCheckCode(HttpServletResponse response, HttpServletRequest request) {
		String result = CheckCodeUtil.setCheckCode(response, request);
		if(result != null && !result.equals("")) {
			return new ResultData(200, "成功！", result);
		}
		return new ResultData(300, "失败！", null);
	}
	
	/**
	 * 验证码验证
	 * @addDate： 2018年1月27日
	 * @autho： add by daihj
	 * @version： 1.0
	 * @param response
	 * @param request
	 * @param code
	 * @return
	 */
	@RequestMapping("/protal/checkCode.action")
	@ResponseBody
	public ResultData checkCode(HttpServletResponse response, HttpServletRequest request, String code) {
		if(CheckCodeUtil.checkCode(response, request, code)) {
			return new ResultData(200,"验证成功！", code);
		} else {
			return new ResultData(300,"验证失败！", code);
		}
	}
	
	/**
	 * 添加留言
	 * @addDate： 2018年1月27日
	 * @autho： add by daihj
	 * @version： 1.0
	 * @param liuYan
	 * @return
	 */
	@RequestMapping("/protal/addLiuYan.action")
	@ResponseBody
	public ResultData addLiuYan(Liuyan liuYan) {
		return protalService.addLiuYan(liuYan);
	}
	
	/**
	 * 查看留言
	 * @addDate： 2018年1月27日
	 * @autho： add by daihj
	 * @version： 1.0
	 * @param page
	 * @return
	 */
	@RequestMapping("/protal/getLiuYanList.action")
	@ResponseBody
	public ResultData getLiuYanList(int page, Model model) {
		ResultData result = protalService.getLiuYanList(page);
		model.addAttribute("liuYanList", result);
		return result;
	}
	
	
	/**
	 * 留言总数量
	 * @addDate： 2018年1月27日
	 * @autho： add by daihj
	 * @version： 1.0
	 * @param page
	 * @return
	 */
	@RequestMapping("/protal/getLiuYanCount.action")
	@ResponseBody
	public ResultData getLiuYanCount() {
		return protalService.getLiuYanCount();
	}
	
}
