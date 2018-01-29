package com.yangqisi.pojo;

/**
 * 新闻内容页面动态添加的字段
 * @addDate： 2017年12月10日
 * @autho： add by daihj
 * @version： 1.0
 */
public class ShowNewsData {

	private String classList;
	private String banner;
	private String title;
	private String time;
	private String content;
	private String prev;
	private String next;
	public String getBanner() {
		return banner;
	}
	public void setBanner(String banner) {
		this.banner = banner;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getPrev() {
		return prev;
	}
	public void setPrev(String prev) {
		this.prev = prev;
	}
	public String getNext() {
		return next;
	}
	public void setNext(String next) {
		this.next = next;
	}
	public String getClassList() {
		return classList;
	}
	public void setClassList(String classList) {
		this.classList = classList;
	}
	
}
