package com.yangqisi.util;

import java.util.ArrayList;
import java.util.List;

/**
 * easy ui支持的json串 
 * @addDate： 2017年9月24日
 *  @autho： add by daihj 
 *  @version： 1.0
 */
public class EUITreeResult {

	private int id;
	private String className;
	private String addChildClass = "添加子栏目";
	private String editClass = "修改栏目";
	private String cleanClass = "清空栏目下新闻";
	private String delClass = "删除栏目";
	private List<EUITreeResult> children = new ArrayList<EUITreeResult>();

	public String getAddChildClass() {
		return addChildClass;
	}

	public void setAddChildClass(String addChildClass) {
		this.addChildClass = addChildClass;
	}

	public String getEditClass() {
		return editClass;
	}

	public void setEditClass(String editClass) {
		this.editClass = editClass;
	}

	public String getCleanClass() {
		return cleanClass;
	}

	public void setCleanClass(String cleanClass) {
		this.cleanClass = cleanClass;
	}

	public String getDelClass() {
		return delClass;
	}

	public void setDelClass(String delClass) {
		this.delClass = delClass;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<EUITreeResult> getChildren() {
		return children;
	}

	public void setChildren(List<EUITreeResult> children) {
		this.children = children;
	}

}
