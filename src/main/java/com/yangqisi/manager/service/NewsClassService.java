package com.yangqisi.manager.service;

import java.util.List;

import com.yangqisi.pojo.Newsclass;
import com.yangqisi.util.EUITreeResult;
import com.yangqisi.util.ResultData;

/**
 * 新闻分类Service
 * @addDate： 2017年9月23日
 * @autho： add by daihj
 * @version： 1.0
 */
public interface NewsClassService {

	List<EUITreeResult> getNewsClassByAll();
	Newsclass getNewsClassById(int classID);
	ResultData addChildNewsClass(Newsclass newsClass);
	long getChildCount(int parentID);
	ResultData delNewsClass(int classID);
	ResultData updateNewsClass(Newsclass newsClass);
	ResultData addParentNewsClass(Newsclass newsClass);
	
//	int getPrevID(int parentID);
//	int getMaxClassID();
//	int getChildCount(int  parentID);
}
