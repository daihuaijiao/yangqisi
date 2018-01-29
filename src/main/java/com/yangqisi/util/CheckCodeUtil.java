package com.yangqisi.util;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 验证码生成工具类
 * @addDate： 2017年12月19日
 * @autho： add by daihj
 * @version： 1.0
 */
public class CheckCodeUtil {
	
	/**
	 * 生成验证码
	 * @addDate： 2017年12月31日
	 * @autho： add by daihj
	 * @version： 1.0
	 * @param response
	 * @param request
	 * @return
	 */
	public static String setCheckCode(HttpServletResponse response, HttpServletRequest request) {
		BufferedImage bi = new BufferedImage(80, 20, BufferedImage.TYPE_INT_RGB);
		Graphics g = bi.getGraphics();
		Color color = new Color(255, 255, 255);
		Random r = new Random();
		g.setColor(color);
		g.fillRect(0, 0, 80, 20);
		
		color = new Color(r.nextInt(255), r.nextInt(100), r.nextInt(254));
		g.setColor(color);
		g.drawLine(5, 1, 70, 7);
		g.drawLine(5, 13, 65, 12);
		
		char[] c = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
		int len = c.length;
		int index = 0;
		StringBuffer code = new StringBuffer();
		long time = System.currentTimeMillis();
		int max = 20,min = 9;
		for(int i=0; i<4; i++) {
			index = r.nextInt(len);
			color = new Color(r.nextInt(155), r.nextInt(255), r.nextInt(180));
			g.setColor(color);
			g.drawString(c[index] + "", (i*18)+8, r.nextInt(max)%(max-min+1) + min);
			code.append(c[index]);
		}
		request.getSession().setAttribute("checkCode",code.toString());
		String dir = "/UploadFile/checkCode/";
		String name = time + ".jpg";
		OutputStream fot = null;
		String contextPath = request.getSession().getServletContext().getRealPath("/");
		File directory = new File(contextPath + dir);
		if(directory.exists()) {
			directory.delete();
		}
		directory.mkdirs();
		File file = new File(contextPath + dir + name);
		try {
			fot = new FileOutputStream(file);
			ImageIO.write(bi, "jpg", fot);
			fot.flush();
			fot.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return dir + name;
	}
	
	/**
	 * 	验证码验证
	 * @addDate： 2017年12月31日
	 * @autho： add by daihj
	 * @version： 1.0
	 * @param response
	 * @param request
	 * @return
	 */
	public static boolean checkCode(HttpServletResponse response, HttpServletRequest request, String code) {
		HttpSession session = request.getSession();
		String sessionCode = (String) session.getAttribute("checkCode");
		session.setAttribute("checkCode", null);
		if(sessionCode == null || sessionCode.equals("")) {
			return false;
		}
		if(code == null || code.equals("")) {
			return false;
		}
		if(sessionCode.equalsIgnoreCase(code)) {
			return true;
		}
		return false;
	}

}
