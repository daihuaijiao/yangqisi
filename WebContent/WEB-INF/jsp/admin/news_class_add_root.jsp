
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<div style="padding: 10px 10px 10px 10px">
	<form id="parentNewsClassAddForm" class="itemForm">
		<table cellpadding="5">
			<input type="hidden" name="parentid" value='0' />
			<tr bgcolor="#F7F7F7">
				<td colspan="3" align="center"><STRONG>添 加 栏 目</STRONG></td>
			</tr>
			<tr bgcolor="#FFFFFF">
				<td width="100">所属栏目分类：</td>
				<td><input class="easyui-textbox" id="parentid" 
					data-options="required:true,missingMessage:'栏目分类不能为空'" value='一级主栏目' style="width: 200px;"></input></td>
			</tr>
			<tr bgcolor="#FFFFFF">
				<td>新加栏目名称：</td>
				<td><input class="easyui-textbox" type="text"
					name="classname" data-options="required:true,missingMessage:'栏目名称不能为空'"
					style="width: 200px;"></input>
			</tr>
			<tr bgcolor="#FFFFFF">
				<td>管理员选项：</td>
				<td><input class="easyui-combobox" name="username"
					data-options="required:true" style="width: 200px;" value='admin'></input></td>
				<!-- <td><select name="CurrentName">
				</select></td> -->
			</tr>
			<tr bgcolor="#FFFFFF">
				<td>是否首页显示</td>
				<td><input  id='cShow' name="cShow" type="checkbox" value='0'></td>
			</tr>
			<tr bgcolor="#FFFFFF">
				<td></td>
				<td><a href="javascript:void(0)" class="easyui-linkbutton" onclick="parentNewsClassAddForm.submitForm()">提  交</a>
				<a href="javascript:void(0)" class="easyui-linkbutton" onclick="parentNewsClassAddForm.clearForm()">重  置</a></td>
			</tr>
		</table>
	</form>
	<br>
</div>

<script>

	$('#parentNewsClassAddForm [name="username"]').combobox({
		url : 'admin/getUserList.action',
		valueField : 'id',
		textField : 'username'
	});
	
	var parentNewsClassAddForm = {
			submitForm : function() {
				//$('#parentid').attr("value",0);
				if(!$('#parentNewsClassAddForm').form('validate')){
					$.messager.alert('提示','表单还未填写完成!');
					return ;
				}
				if(!($('#cShow').is(':checked'))) {
					$('#cShow').attr("value",'0');
				}
				$.post('admin/addParentNewsClass.action',$('#parentNewsClassAddForm').serialize(), function(data){
					if(data.status == 200){
						$.messager.alert('提示',data.msg);
						$('#parentClassAddWindow').window('close');
						$('#classTree').treegrid('reload');
					} else {
						var obj = data.data;
						$.messager.alert('提示','一级主栏目添加失败!');
					}
				});
			},
			clearForm : function() {
				$('#childNewsClassAddForm').form('reset');
			}
	}

</script>
