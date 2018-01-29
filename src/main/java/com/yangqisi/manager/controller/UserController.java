package com.yangqisi.manager.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yangqisi.manager.service.UserService;
import com.yangqisi.pojo.Admin;
import com.yangqisi.util.JsonUtils;

/**
 * 用户controller层
 * @Title: UserController.java
 * @addDate： 2017年9月17日
 * @autho： add by daihj
 * @version： 1.0
 */
@Controller
@RequestMapping("/admin")
public class UserController {

	@Resource
	UserService userService;
	
	/**
	 * 打开用户列表页面
	 * @addDate： 2017年9月17日
	 * @autho： add by daihj
	 * @version： 1.0
	 * @return
	 */
	@RequestMapping("/showUserListPage.action")
	public String showUserListPage() {
		return "/admin/user_list.jsp";
	}
	
	/**
	 * 检索用户列表
	 * @addDate： 2017年9月17日
	 * @autho： add by daihj
	 * @version： 1.0
	 * @return
	 */
	@RequestMapping("/getUserList.action")
	@ResponseBody
	public String getUserList() {
		List<Admin> list = userService.getUserList();
		String str = JsonUtils.objectToJson(list);
		System.out.println(str);
		return str;
	}
}
