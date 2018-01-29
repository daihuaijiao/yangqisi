package com.yangqisi.manager.service;


import java.util.List;

import com.yangqisi.pojo.Admin;
import com.yangqisi.util.EUIDataGridResult;

/**
 * 用户相关service
 * @addDate： 2017年9月26日
 * @autho： add by daihj
 * @version： 1.0
 */
public interface UserService {

	List<Admin> getUserList();
	
	Admin getUserById(int id);
	
	EUIDataGridResult getUserLogInList(int rows, int page);
}
