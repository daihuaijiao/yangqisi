package com.yangqisi.manager.service;


import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yangqisi.pojo.Newsdata;
import com.yangqisi.pojo.NewsdataWithBLOBs;
import com.yangqisi.util.EUIDataGridResult;
import com.yangqisi.util.ResultData;

/**
 * 文章service接口
 * @addDate： 2017年9月17日
 * @autho： add by daihj
 * @version： 1.0
 */
public interface NewsDataService {

	public EUIDataGridResult getNewsList(int rows, int page, Map<String, String> param);
	
	public EUIDataGridResult getRecycleNewsDataList(int rows, int page);
	
	public Newsdata getNewsdateById(int dId);
	
	public NewsdataWithBLOBs getNewsdataBlobById(int dId);
	
	long getNewsDataCountByClassID(int classID);
	
	ResultData delNewsDataToRecycleByClassID(int classID);
	
	ResultData delNewsDataToRecycleByID(int[] ids);
	
	List<?> uploadFile(HttpServletRequest request, HttpServletResponse response, String savePath);
	
	ResultData addNewsData(NewsdataWithBLOBs newsData);
	
	ResultData updateNewsData(NewsdataWithBLOBs newsData);
	
	ResultData deleteNewsDataByIds(int[] ids);
	ResultData deleteNewsDataById(Integer id);
	ResultData rollBackNewsDataByIds(int[] ids);
	ResultData rollBackNewsDataById(Integer id);
	
}
