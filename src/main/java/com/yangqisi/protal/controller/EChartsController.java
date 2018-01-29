package com.yangqisi.protal.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yangqisi.protal.service.EChartsService;
import com.yangqisi.util.ResultData;

@Controller
public class EChartsController {

	@Resource
	private EChartsService echartsService;
	
	@RequestMapping("/protal/getEChartData.action")
	@ResponseBody
	public ResultData getEchartData(String types) {
		return echartsService.getEchartData(types);
	}
}
