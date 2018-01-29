package com.yangqisi.protal.service;

import com.yangqisi.pojo.Liuyan;
import com.yangqisi.pojo.ProtalClassNewsList;
import com.yangqisi.pojo.ShowNewsData;
import com.yangqisi.util.ResultData;

public interface ProtalService {

	ProtalClassNewsList getProtalClassNewsList();
	
	ShowNewsData getNewsContentData(Integer id, Integer classID, Integer flg);
	
	ResultData getNewsPageContent(Integer id, Integer classID, Integer flg);
	
	ResultData getNewsList(Integer classID,Integer page);
	
	ResultData getGongGao(int classID);
	
	ResultData getFriendLink();
	
	ResultData addLiuYan(Liuyan liuYan);
	
	ResultData getLiuYanList(int page);
	
	ResultData getLiuYanCount();
}
