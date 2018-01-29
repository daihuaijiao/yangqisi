<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<script type="text/javascript">
	// 表单提交客户端检测
	function doSubmit() {

		if (document.myform.username.value == "") {
			alert("用户名不能为空！");
			return false;
		}
		if (document.myform.password.value == "") {
			alert("密码不能为空！");
			return false;
		}
		if (document.myform.password.value != document.myform.password1.value) {
			alert("密码与确认密码不同！");
			return false;
		}
	}
</Script>

<table class="easyui-datagrid" id="itemList" title="用户管理"
	data-options="singleSelect:false,collapsible:true,pagination:true,rownumbers:true,url:'/user/user_list',method:'get',pageSize:20,toolbar:toolbar">
	<thead>
		<tr>
			<th data-options="field:'userid',width:60">用户名</th>
			<th data-options="field:'auth',width:200">权 限</th>
			<th data-options="field:'lastip',width:100">最后登录IP</th>
			<th data-options="field:'lasttime',width:100">最后登录时间</th>
			<th data-options="field:'log',width:100">登录次数</th>
			<th data-options="field:'lasttime',width:100">修改</th>
			<th data-options="field:'lasttime',width:100">删除</th>
		</tr>
	</thead>
</table>

<hr>
<table width="350" border="0" cellpadding="5" cellspacing="1"
	bgcolor="#DEDFDE">
	<form name="myform" method="post" action="user_add.asp"
		onSubmit="return doSubmit();">
		<tr bgcolor="#F7F7F7">
			<td colspan="2"><div align="center">
					<strong><font color="#FF0000">管 理 员 添 加</font></strong>
				</div></td>
		</tr>
		<tr bgcolor="#FFFFFF">
			<td width="93">管理员名称：</td>
			<td width="234"><input name="username" type="text" class="INPUT"
				id="username"></td>
		</tr>
		<tr bgcolor="#FFFFFF">
			<td>管理员密码：</td>
			<td><input name="password" type="password" class="INPUT"
				id="password"></td>
		</tr>
		<tr bgcolor="#FFFFFF">
			<td>确认密码 ：</td>
			<td><input name="password1" type="password" class="INPUT"
				id="password1"></td>
		</tr>
		<tr bgcolor="#FFFFFF">
			<td colspan="2"><div align="center">
					<input name="userclass" type="radio" value="0" checked>
					普通管理员 <input type="radio" name="userclass" value="1"> 超级管理员
				</div></td>
		</tr>
		<tr bgcolor="#FFFFFF">
			<td colspan="2"><div align="center">
					<input type="submit" name="Submit" value=" 提　交 " class="INPUT">

					<input type="reset" name="Submit2" value=" 重　置 " class="INPUT">
				</div></td>
		</tr>
	</form>
</table>
