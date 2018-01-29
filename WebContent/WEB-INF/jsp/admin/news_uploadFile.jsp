<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div id="testaa" style="padding:10px 10px 10px 10px">
	<form id="uploadNewsFileForm" method="post" action="admin/uploadFile.action" enctype="multipart/form-data">
	    <table cellpadding="5">
	        <tr>
	            <td>文件上传：</td>
	            <td>
	                <input id="uploadFile" name="s_softDown1" class="easyui-filebox" type="text" style="width: 250px;"/>
	            </td>
	        </tr>
	    </table>
	<div style="padding:5px; width: 100%; text-align:center">
		<input type="submit" value="上传" class="easyui-linkbutton" style="padding:5px 5px;margin: 0px 10px 0px 10px">
		<input type="button" value="删除" class="easyui-linkbutton" onclick="uploadFileForm_delFile()" style="padding:5px 5px;margin: 0px 10px 0px 10px">
		<input type="button" value="添加" class="easyui-linkbutton" onclick="uploadFileForm_addFile()" style="padding:5px 5px;margin: 0px 10px 0px 10px">
	</div>
	</form>
</div>

<script type="text/javascript">

	var fileName;
	var returnFileNames;
	var errText1;
	$('#uploadFile').filebox({
		buttonText: '选择文件', 
	    buttonAlign: 'right' 

	});
	
	//提交表单，上传文件
	$("#uploadNewsFileForm").submit(function() {
		var uploadFilePath = $('#uploadFile').filebox('getValue');
		fileName = uploadFilePath;
		fileName = fileName.substring(fileName.lastIndexOf('\\') + 1, fileName.length);
		if(errText1 == fileName) {
			$.messager.alert('提示','请勿重复上传！');
			return false;
		}
		if(!uploadFilePath) {
			$.messager.alert('提示','未选择任何文件！');
			return false;
		}
		//取出后辍名判断上传文件的类型
		uploadFilePath = uploadFilePath.substring(uploadFilePath.lastIndexOf('.') + 1,uploadFilePath.length);
		var filergx = new Array("jpg","gif","bmp","png","rar","zip","doc","xls","ppt","docx","xlsx","pptx");
		var errflg = true;
		uploadFilePath = uploadFilePath.toLowerCase();
		for(var i=0; i<filergx.length; i++) {
			if(uploadFilePath == filergx[i]) {
				errflg = false;
				break;
			}
		}
		if(errflg) {
			$.messager.alert('提示','只能上传以下类型文件（jpg|gif|bmp|png|rar|zip<br>|doc|xls|ppt|docx|xlsx|pptx）');
			return false;
		}
		// jquery.form 插件提交表单
		$(this).ajaxSubmit({
			url: 'admin/uploadFile.action',
	     	type: "Post",
	     	success: function (data) {
	     		if(data.status == 200) {
	     			returnFileNames = data.data;
	     			errText1 = data.msg;
	    			$.messager.alert('提示','上传成功！');
	    		} else {
	    			$.messager.alert('提示','上传失败！');
	    		}
	     	},
	     	error: function (data) {
    			$.messager.alert('提示','上传失败！只能上传小于10M的文件。');
	     	}
		}); 
		return false; // 阻止表单自动提交事件
	}); 
	
	function uploadFileForm_addFile() {
		if(returnFileNames) {
	    	$('#sSoftdown1').val(returnFileNames.sSoftdown1);
		}
		if(fileName) {
			//fileName = fileName.substring(fileName.lastIndexOf('\\') + 1, fileName.length);
			$('#fileNameLabel').text(fileName);
			$('#fileUploadWindow').window('close');
			$('a.uploadFiledel').show();
			$('a.uploadFile').hide();
		} else {
			$.messager.alert('提示','未上传文件！');
		}
	}
	function uploadFileForm_delFile(){
		fileName = null;
		$('#uploadNewsFileForm').form('reset');
		// 从服务器上删除刚刚上传的文件
	}
	
</script>