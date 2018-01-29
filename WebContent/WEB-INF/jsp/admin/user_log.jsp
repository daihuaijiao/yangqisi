<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<table class="easyui-datagrid" id="itemList" title="登录历史" 
       data-options="singleSelect:false,collapsible:true,pagination:true,rownumbers:true,url:'/user/user_log',method:'get',pageSize:20,toolbar:toolbar">
    <thead>
        <tr>
        	<th data-options="field:'userid',width:60">用户名</th>
            <th data-options="field:'auth',width:200">权 限</th>
            <th data-options="field:'lastip',width:100">最后登录IP</th>
            <th data-options="field:'lasttime',width:100">最后登录时间</th>
        </tr>
    </thead>
</table>
