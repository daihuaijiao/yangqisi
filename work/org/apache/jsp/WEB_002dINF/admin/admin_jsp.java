/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.70
 * Generated at: 2017-08-15 08:06:31 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>后台管理</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"./js/jquery-easyui-1.5/themes/default/easyui.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"./js/jquery-easyui-1.5/themes/icon.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"./js/jquery-easyui-1.5/locale/easyui-lang-zh_CN.js\">\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-easyui-1.5/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-easyui-1.5/jquery.easyui.min.js\"></script>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\t.user_info {\r\n");
      out.write("\t\tfloat: right;\r\n");
      out.write("\t\tpadding-right: 5px;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"easyui-layout\">\r\n");
      out.write("\r\n");
      out.write("\t<div data-options=\"region:'north'\" style=\"height:50px\">\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t<h3>&nbsp;后台管理系统</h3>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"user_info\" class=\"user_info\">\r\n");
      out.write("\t\t\t<p>，欢迎你！</p>\r\n");
      out.write("\t\t\t<a href=\"logout.jsp\">退出</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("    <div data-options=\"region:'west',title:'菜单',split:true\" style=\"width:180px;\">\r\n");
      out.write("    \t<ul id=\"menu\" class=\"easyui-tree\" style=\"margin-top: 10px;margin-left: 5px;\">\r\n");
      out.write("         \t\r\n");
      out.write("         \t<li>\r\n");
      out.write("         \t\t<span>文章中心</span>\r\n");
      out.write("         \t\t<ul>\r\n");
      out.write("\t         \t\t<li data-options=\"attributes:{'url':'news_add'}\">文章添加</li>\r\n");
      out.write("\t         \t\t<li data-options=\"attributes:{'url':'news_manage'}\">文章管理</li>\r\n");
      out.write("\t         \t\t<li data-options=\"attributes:{'url':'news_recycle'}\">回收站</li>\r\n");
      out.write("\t         \t\t<li data-options=\"attributes:{'url':'news_class'}\">栏目管理</li>\r\n");
      out.write("\t         \t</ul>\r\n");
      out.write("         \t</li>\r\n");
      out.write("         \t<li>\r\n");
      out.write("         \t\t<span>图片管理</span>\r\n");
      out.write("         \t\t<ul>\r\n");
      out.write("\t         \t\t<li data-options=\"attributes:{'url':'prcture_add'}\">图片添加</li>\r\n");
      out.write("\t         \t\t<li data-options=\"attributes:{'url':'prcture_manage'}\">图片管理</li>\r\n");
      out.write("\t         \t\t<li data-options=\"attributes:{'url':'prcture_recycle'}\">回收站</li>\r\n");
      out.write("\t         \t\t<li data-options=\"attributes:{'url':'prcture_class'}\">分类管理</li>\r\n");
      out.write("\t         \t</ul>\r\n");
      out.write("         \t</li>\r\n");
      out.write("         \t<li>\r\n");
      out.write("         \t\t<span>留言反馈</span>\r\n");
      out.write("         \t\t<ul>\r\n");
      out.write("\t         \t\t<li data-options=\"attributes:{'url':'foodback'}\">反馈管理</li>\r\n");
      out.write("\t         \t</ul>\r\n");
      out.write("         \t</li>\r\n");
      out.write("         \t<li>\r\n");
      out.write("         \t\t<span>链接管理</span>\r\n");
      out.write("         \t\t<ul>\r\n");
      out.write("\t         \t\t<li data-options=\"attributes:{'url':'friend_links'}\">友情链接管理</li>\r\n");
      out.write("\t         \t</ul>\r\n");
      out.write("         \t</li>\r\n");
      out.write("         \t<li>\r\n");
      out.write("         \t\t<span>用户管理</span>\r\n");
      out.write("         \t\t<ul>\r\n");
      out.write("\t         \t\t<li data-options=\"attributes:{'url':'user_list'}\">用户管理</li>\r\n");
      out.write("\t         \t\t<li data-options=\"attributes:{'url':'user_log'}\">登录历史</li>\r\n");
      out.write("\t         \t</ul>\r\n");
      out.write("         \t</li>\r\n");
      out.write("         \t<li>\r\n");
      out.write("         \t\t<span>关于我们</span>\r\n");
      out.write("         \t\t<ul>\r\n");
      out.write("\t         \t\t<li data-options=\"attributes:{'url':'abouts_jianjie'}\">关于我们</li>\r\n");
      out.write("\t         \t\t<li data-options=\"attributes:{'url':'abouts_rongyu'}\">网站导航</li>\r\n");
      out.write("\t         \t\t<li data-options=\"attributes:{'url':'abouts_wenhua'}\">免责声明</li>\r\n");
      out.write("\t         \t\t<li data-options=\"attributes:{'url':'abouts_lianxi'}\">联系我们</li>\r\n");
      out.write("\t         \t</ul>\r\n");
      out.write("         \t</li>\r\n");
      out.write("         </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div data-options=\"region:'center',title:''\">\r\n");
      out.write("    \t<div id=\"tabs\" class=\"easyui-tabs\">\r\n");
      out.write("\t\t    <div title=\"首页\" style=\"padding:20px;\">\r\n");
      out.write("\t\t        \t\r\n");
      out.write("\t\t    </div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div data-options=\"region:'south',split:true\" style=\"height:50px;\"></div>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$(function(){\r\n");
      out.write("\t$('#menu').tree({\r\n");
      out.write("\t\tonClick: function(node){\r\n");
      out.write("\t\t\tif($('#menu').tree(\"isLeaf\",node.target)){\r\n");
      out.write("\t\t\t\tvar tabs = $(\"#tabs\");\r\n");
      out.write("\t\t\t\tvar tab = tabs.tabs(\"getTab\",node.text);\r\n");
      out.write("\t\t\t\tif(tab){\r\n");
      out.write("\t\t\t\t\ttabs.tabs(\"select\",node.text);\r\n");
      out.write("\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\ttabs.tabs('add',{\r\n");
      out.write("\t\t\t\t\t    title:node.text,\r\n");
      out.write("\t\t\t\t\t    href: node.attributes.url,\r\n");
      out.write("\t\t\t\t\t    closable:true,\r\n");
      out.write("\t\t\t\t\t    bodyCls:\"content\"\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}