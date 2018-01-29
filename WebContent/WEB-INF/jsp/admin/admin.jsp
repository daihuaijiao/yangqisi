<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();   
    String basePath = request.getScheme()+"://" +request.getServerName()+":" +request.getServerPort()+path+"/" ;   
%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>后台管理</title>
<script type="text/javascript" src="<%=path%>/js/jquery-easyui-1.5/jquery.min.js"></script>
<script type="text/javascript" src="<%=path%>/js/jquery-easyui-1.5/jquery.form.js"></script>
<script type="text/javascript" src="<%=path%>/js/jquery-easyui-1.5/jquery.easyui.min.js"></script>
<link rel="stylesheet" type="text/css" href="<%=path%>/js/jquery-easyui-1.5/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="<%=path%>/js/jquery-easyui-1.5/themes/icon.css">
<script type="text/javascript" src="<%=path%>/js/jquery-easyui-1.5/locale/easyui-lang-zh_CN.js"></script>
<script type="text/javascript" src="<%=path%>/js/common.js"></script>
<link rel="stylesheet" type="text/css" href="<%=path%>/css/yangqisi.css" />
<style type="text/css">
	.user_info {
		float: right;
		padding-right: 5px;
	}

</style>
</head>
<body class="easyui-layout">

	<div data-options="region:'north'" style="height:50px">
		<div>
			<h3>&nbsp;后台管理系统</h3>
		</div>
		<div id="user_info" class="user_info">
			<p>，欢迎你！</p>
			<a href="logout.jsp">退出</a>
		</div>
	</div>
    <div data-options="region:'west',title:'菜单',split:true" style="width:180px;">
    	<ul id="menu" class="easyui-tree" style="margin-top: 10px;margin-left: 5px;">
         	
         	<li>
         		<span>新闻中心</span>
         		<ul>
	         		<li data-options="attributes:{'url':'admin/showNewsAddPage.action'}">新闻添加</li>
	         		<li data-options="attributes:{'url':'admin/showNewsListPage.action','border':'false'}">新闻管理</li>
	         		<li data-options="attributes:{'url':'admin/showNewsRecycleListPage.action'}">回收站</li>
	         		<li data-options="attributes:{'url':'admin/showNewsClassManagerPage.action'}">栏目管理</li>
	         	</ul>
         	</li>
         	<li>
         		<span>图片管理</span>
         		<ul>
	         		<li data-options="attributes:{'url':'prcture_add'}">图片添加</li>
	         		<li data-options="attributes:{'url':'prcture_manage'}">图片管理</li>
	         		<li data-options="attributes:{'url':'prcture_recycle'}">回收站</li>
	         		<li data-options="attributes:{'url':'prcture_class'}">分类管理</li>
	         	</ul>
         	</li>
         	<li>
         		<span>留言反馈</span>
         		<ul>
	         		<li data-options="attributes:{'url':'foodback'}">反馈管理</li>
	         	</ul>
         	</li>
         	<li>
         		<span>链接管理</span>
         		<ul>
	         		<li data-options="attributes:{'url':'friend_links'}">友情链接管理</li>
	         	</ul>
         	</li>
         	<li>
         		<span>用户管理</span>
         		<ul>
	         		<li data-options="attributes:{'url':'admin/showUserListPage.action'}">用户管理</li>
	         		<li data-options="attributes:{'url':'user_log'}">登录历史</li>
	         	</ul>
         	</li>
         	<li>
         		<span>关于我们</span>
         		<ul>
	         		<li data-options="attributes:{'url':'abouts_jianjie'}">关于我们</li>
	         		<li data-options="attributes:{'url':'abouts_rongyu'}">网站导航</li>
	         		<li data-options="attributes:{'url':'abouts_wenhua'}">免责声明</li>
	         		<li data-options="attributes:{'url':'abouts_lianxi'}">联系我们</li>
	         	</ul>
         	</li>
         </ul>
    </div>
    <div data-options="region:'center',title:''">
    	<div id="tabs" class="easyui-tabs" >
		    <div title="首页" style="padding:20px;">
		        	
		    </div>
		</div>
    </div>
    <div data-options="region:'south',split:true" style="height:50px;"></div>
<script type="text/javascript">
$(function(){
	$('#menu').tree({
		onClick: function(node){
			if($('#menu').tree("isLeaf",node.target)){
				var tabs = $("#tabs");
				var tab = tabs.tabs("getTab",node.text);
				if(tab){
					tabs.tabs("select",node.text);
				}else{
					tabs.tabs('add',{
					    title:node.text,
					    href: node.attributes.url,
					    closable:true,
					    bodyCls:"content"
					});
				}
			}
		}
	});
});
</script>
</body>
</html>