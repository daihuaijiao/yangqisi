package com.yangqisi.protal.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yangqisi.mapper.SvrMsgTblMapper;
import com.yangqisi.pojo.SvrMsgTbl;
import com.yangqisi.pojo.SvrMsgTblExample;
import com.yangqisi.pojo.SvrMsgTblExample.Criteria;
import com.yangqisi.protal.service.EChartsService;
import com.yangqisi.util.ResultData;

@Service
public class EChartsServiceImpl implements EChartsService {

	@Resource
	private SvrMsgTblMapper mapper;
	
	@Override
	public ResultData getEchartData(String type) {
		SvrMsgTblExample example = new SvrMsgTblExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andSvrMsgSeqIsNotNull();
		List<SvrMsgTbl> selectByExample = mapper.selectByExample(example);
		boolean typeIsNull = true;
		if(null != type && !"".equals(type)) {
			typeIsNull = false;
		}
		if(!typeIsNull) {
			
		}
		ResultData result = new ResultData(200, "成功", selectByExample);
		return result;
	}

}
