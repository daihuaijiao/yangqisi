package com.yangqisi.util;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.crypto.Data;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import com.sun.org.glassfish.external.probe.provider.annotations.ProbeParam;
import com.sun.org.glassfish.gmbal.ParameterNames;

/**
 * 上传文件
 * @author Administrator
 *
 */
public class UploadFileUtil extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	// spring加载配置文件（classpath:*.properties）
		// 通过@Value("#{}")取ftpResource.properties中的值
		@Value("${FTP_IP}")
		private String FTP_IP;

	/**
	 * 上传文件
	 * @return 文件名.后辍
	 * @throws IOException 
	 * @throws IllegalStateException 
	 */
	public Map<String,String> uploadFile(HttpServletRequest request, HttpServletResponse response, String savePath, String oldFileNameIn) throws IllegalStateException, IOException {
		
		String newFileName = "";
		Map<String,String> result = null;
		//创建一个通用的多部分解析器
		CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(request.getSession().getServletContext());
		//判断 request 是否有文件上传,即多部分请求  
		if(multipartResolver.isMultipart(request)) {
			result = new HashMap<String,String>();
			//转换成多部分request
			MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) request;
			//MultipartHttpServletRequest multiRequest = multipartResolver.resolveMultipart(request);
			 //取得request中的所有文件名
			Iterator<String> iter = multiRequest.getFileNames();
			String contextPath = request.getSession().getServletContext().getRealPath("/");
			List<String> originalfilename = new ArrayList<String>();
			List<String> saveFileName = new ArrayList<String>();
			List<String> savePathFileName = new ArrayList<String>();
			while(iter.hasNext()) {
				//取得上传文件  
				MultipartFile multipartFile = multiRequest.getFile(iter.next());
				if(multipartFile != null) {
					//取得当前上传文件的文件名称
					String oldFileName = multipartFile.getOriginalFilename();
					if(oldFileNameIn != null && oldFileNameIn.equals(oldFileName)) {
						result.put("msg", "请勿重复上传！");
						return result;
					}
					 //如果名称不为“”,说明该文件存在，否则说明该文件不存在
					if(oldFileName.trim() != "") {
						String[] arr = oldFileName.split("\\.");
						//重命名上传后的文件名
						newFileName = getNewFileName() + "." + arr[arr.length-1];
						String[] dateDirs = getDateDir();
						
						String path = "UploadFile\\" + savePath + "\\" + dateDirs[0] + "\\" + dateDirs[1] + "\\" + dateDirs[2] + "\\" + newFileName;
						File localFile = new File(contextPath + path);
						localFile.mkdirs();
						multipartFile.transferTo(localFile);
						
						if(savePath != null && savePath.equalsIgnoreCase("soft")) {
							result.put("s_softDown1", "\\" + path);
							result.put("oldFileName", oldFileName);
						} else {
							result.put("oldFileName", oldFileName);
							originalfilename.add(oldFileName);
							saveFileName.add(newFileName);
							savePathFileName.add("\\" + path);
						}
					}
				}
			}
			if(savePath != null && !savePath.equalsIgnoreCase("soft")) {
				String originalfilename_str = "";
				String saveFileName_str = "";
				String savePathFileName_str = "";
				
				for (int i=0; i<originalfilename.size(); i++) {
					if(i > 0) {
						originalfilename_str = originalfilename_str + "|";
						saveFileName_str = saveFileName_str + "|";
						savePathFileName_str = savePathFileName_str + "|";
					}
					originalfilename_str = originalfilename_str + originalfilename.get(i);
					saveFileName_str = saveFileName_str + saveFileName.get(i);
					savePathFileName_str = savePathFileName_str + savePathFileName.get(i);
				}
				result.put("originalfilename", originalfilename_str);
				result.put("saveFileName", saveFileName_str);
				result.put("savePathFileName", savePathFileName_str);
			}
		}
		return result;
	}
	
	/**
	 * 生成新文件名  年月日时分秒+一位随机数
	 * @addDate： 2017年11月2日
	 * @autho： add by daihj
	 * @version： 1.0
	 * @return
	 */
	public String getNewFileName() {
		//long s = (long) System.currentTimeMillis();
		Date now = new Date();
		SimpleDateFormat sd = new SimpleDateFormat("yyyyMMddhhmmssHHSS");
		String name = sd.format(now);
		int r = (int)(Math.random() * 3);
		name = name + r;
		return name;
	}
	
	/**
	 * 返回年月日目录
	 * @addDate： 2017年11月2日
	 * @autho： add by daihj
	 * @version： 1.0
	 * @return
	 */
	public String[] getDateDir() {
		Date now = new Date();
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
		String string = sd.format(now);
		return string.split("-");
		
	}
}
