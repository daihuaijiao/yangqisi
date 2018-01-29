package com.yangqisi.manager.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yangqisi.manager.service.UserService;
import com.yangqisi.mapper.AdminListMapper;
import com.yangqisi.mapper.AdminMapper;
import com.yangqisi.pojo.Admin;
import com.yangqisi.pojo.AdminExample;
import com.yangqisi.pojo.AdminList;
import com.yangqisi.pojo.AdminListExample;
import com.yangqisi.util.EUIDataGridResult;

/**
 * 用户相关接口实现
 * @addDate： 2017年9月26日
 * @autho： add by daihj
 * @version： 1.0
 */
@Service
public class UserServiceImpl implements UserService {

	@Resource
	AdminMapper adminMapper;
	@Resource
	AdminListMapper adminListMapper;
	
	/**
	 * 取所有用户
	 * add by daihj 
	 * 20170926
	 */
	@Override
	public List<Admin> getUserList() {
		AdminExample example = new AdminExample();
		List<Admin> list = adminMapper.selectByExample(example);
		return list;
	}

	/**
	 * 根据ID取用户
	 * add by daihj 
	 * 20170926
	 */
	@Override
	public Admin getUserById(int id) {
		Admin user = adminMapper.selectByPrimaryKey(id);
		return user;
	}

	/**
	 * 取所有用户登录历史
	 * add by daihj 
	 * 20170926
	 */
	@Override
	public EUIDataGridResult getUserLogInList(int rows, int page) {
		AdminListExample example = new AdminListExample();
		example.setOrderByClause(" ID DESC");
		PageHelper.startPage(page, rows);
		List<AdminList> list = adminListMapper.selectByExample(example);
		EUIDataGridResult result = new EUIDataGridResult();
		PageInfo<AdminList> info = new PageInfo<>(list);
		long total = info.getTotal();
		result.setTotal(total);
		result.setRows(list);
		return result;
	}

}
