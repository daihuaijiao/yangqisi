package com.yangqisi.util;

import java.util.List;

/**
 * jquery easy ui需要的json数据
 * @addDate： 2017年9月17日
 * @autho： add by daihj
 * @version： 1.0
 */
public class EUIDataGridResult {

	/**
	 * 记录条数
	 */
	private long total;
	/**
	 * 记录明细
	 */
	private List<?> rows;
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public List<?> getRows() {
		return rows;
	}
	public void setRows(List<?> rows) {
		this.rows = rows;
	}
}
