package com.yangqisi.manager.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yangqisi.mapper.NewsdataMapper;
import com.yangqisi.pojo.Newsdata;
import com.yangqisi.pojo.NewsdataExample;


public class Test {

	@org.junit.Test
	public void testPageHelper() {
		//1、获得mapper代理对象  
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");  
        NewsdataMapper newsdataMapper = applicationContext.getBean(NewsdataMapper.class);  
        NewsdataExample example = new NewsdataExample();
		//2、设置分页  
		PageHelper.startPage(1, 30);  
		//3、执行查询  
		List<Newsdata> selectByExample = newsdataMapper.selectByExample(example);
		//4、取分页后结果  
		PageInfo<Newsdata> pageInfo = new PageInfo<>(selectByExample);
		long total = pageInfo.getTotal();
        System.out.println("total:" + total);  
        int pages = pageInfo.getPages();  
        System.out.println("pages:" + pages);  
        int pageSize = pageInfo.getPageSize();  
        System.out.println("pageSize:" + pageSize);  
	}
	
	public static void main() {
		Date now = new Date();
		SimpleDateFormat sd = new SimpleDateFormat("yyyyMMdd");
		sd.format(now);
		int i = Calendar.YEAR;
		System.out.println(Calendar.YEAR);
	}
}
