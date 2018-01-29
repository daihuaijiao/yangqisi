
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<div style="padding: 10px 10px 10px 10px">
	<form id="newsClassEditForm" class="itemForm" method="post">
		<input type="hidden" name="classid" value="${newsClass.classid}" />
		<table cellpadding="5">
			<tr bgcolor="#F7F7F7">
				<td colspan="3" align="center"><STRONG>修  改 栏 目</STRONG></td>
			</tr>
			<tr bgcolor="#FFFFFF">
				<td width="110">修改所属栏目分类：</td>
				<td><select class="easyui-combotree" id="parentid" name="parentid"
					data-options="required:true,missingMessage:'栏目分类不能为空',invalidMessage:'格式不正确'" style="width: 200px;"></select></td>
			</tr>
			<tr bgcolor="#FFFFFF">
				<td>修改栏目名称：</td>
				<td><input class="easyui-textbox" type="text"
					name="classname" data-options="required:true,missingMessage:'栏目名称不能为空'"
					style="width: 200px;" value="${newsClass.classname }"></input>
			</tr>
			<tr bgcolor="#FFFFFF">
				<td>管理员选项：</td>
				<td><input class="easyui-combobox" name="username"
					data-options="required:true" style="width: 200px;" value="${newsClass.username }"></input></td>
			</tr>
			<tr bgcolor="#FFFFFF">
				<td>是否首页显示</td>
				<td><input id="cShow" name="cShow" type="checkbox" value=1></td>
			</tr>
			<tr bgcolor="#FFFFFF">
				<td></td>
				<td><a href="javascript:void(0)" class="easyui-linkbutton" onclick="newsClassEditForm.submitForm()">提  交</a>
				<a href="javascript:void(0)" class="easyui-linkbutton"	onclick="newsClassEditForm.clearForm()">重  置</a></td>
			</tr>
		</table>
	</form>
	<br>
</div>

<script>
	
	var parent = '${newsClass.parentid}';
	var parentValue;
	if(parent == 0) {
		parentValue = '一级主栏目';
		$('#parentid').attr('readonly','true');
		
		$('#parentid').click(function(){
			$.messager.alert('提示','一级主栏目不能修改');
		});
	} else {
		parentValue = '${newsClass.parentid}';
	}

	$('#newsClassEditForm [name="parentid"]').combotree({
		url : 'admin/getNewsClassByAllInComBoTree.action',
		value : parentValue,
		idField : 'id',
		lines : true,
	});
	
	$('#newsClassEditForm [name="username"]').combobox({
		url : 'admin/getUserList.action',
		valueField : 'id',
		textField : 'username',
	});

	var cShow = "${newsClass.cShow}";
	if(cShow == 1 ) {
		$('#cShow').attr('checked','checked');
	}
	
	var newsClassEditForm = {
			submitForm : function() {
				$.post('admin/updateNewsClass.action',$("#newsClassEditForm").serialize(),function(data){
					if(data.status == 200) {
						$.messager.alert('提示',data.msg);
						$("#classTree").treegrid('reload');
						$('#classEditWindow').window('close');
					} else {
						$.messager.alert('提示','栏目修改失败！');
					}
				});
			},
			clearForm : function() {
				$("#newsClassEditForm").form('reset');
			}
	}
	
</script>