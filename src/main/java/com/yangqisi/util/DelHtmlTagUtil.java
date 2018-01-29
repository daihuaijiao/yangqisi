package com.yangqisi.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 删除字符串中的html标签
 * @addDate： 2017年12月5日
 * @autho： add by daihj
 * @version： 1.0
 */
public class DelHtmlTagUtil {

	public static String delTag(String str) {
		if(null != str && !"".equals(str)) {
			String result = "";
			String regEx_script = "<script[^>]*?>[\\s\\S]*?<\\/script>";	//定义script的正则
			String regEx_style = "<style[^>]*?>[\\s\\S]*><\\/style>";	//定义style的正则
			String regEx_html = "<[^>]+>";	//定义html标签
			String regEx_space = "\\s*|\t|\r|\n";	//定义空格 回车 换行符
			
			Pattern p_script = Pattern.compile(regEx_script, Pattern.CASE_INSENSITIVE);
			Matcher m_script = p_script.matcher(str);
			result = m_script.replaceAll("");
			
			Pattern p_style = Pattern.compile(regEx_style, Pattern.CASE_INSENSITIVE);
			Matcher m_style = p_style.matcher(result);
			result = m_style.replaceAll("");
			
			Pattern p_html = Pattern.compile(regEx_html, Pattern.CASE_INSENSITIVE);
			Matcher m_html = p_html.matcher(result);
			result = m_html.replaceAll("");
			
			Pattern p_space = Pattern.compile(regEx_space, Pattern.CASE_INSENSITIVE);
			Matcher m_space = p_space.matcher(result);
			result = m_space.replaceAll("");
			
			result = result.replace(" ", "");
			
			return result;
			
		}
		return null;
	}
	
}
