<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();   
    String basePath = request.getScheme()+"://" +request.getServerName()+":" +request.getServerPort()+path+"/" ;   
%> 
<link href="<%=path%>/js/kindeditor-4.1.11/themes/default/default.css" type="text/css" rel="stylesheet">
<script type="text/javascript" charset="utf-8" src="<%=path%>/js/kindeditor-4.1.11/kindeditor-all.js"></script>
<script type="text/javascript" charset="utf-8" src="<%=path%>/js/kindeditor-4.1.11/lang/zh-CN.js"></script>
<div style="padding:10px 10px 10px 10px">
	<form id="newsEditForm" method="post">
		<input type="hidden" name="dId" value="${newsDataBlob.dId}" />
		<input type="hidden" name="dOriginalfilename" id="dOriginalfilename" value="${newsDataBlob.dOriginalfilename}"/>
    	<input type="hidden" name="dSavefilename" id="dSavefilename" value="${newsDataBlob.dSavefilename}"/>
    	<input type="hidden" name="dSavepathfilename" id="dSavepathfilename" value="${newsDataBlob.dSavepathfilename}"/>
    	<input type="hidden" id="sSoftdown1" name="sSoftdown1" value="${newsDataBlob.sSoftdown1}" />
    	<input type="hidden" id="dClassname" name="dClassname" value="${newsDataBlob.dClassname}"/>
    	<input type="hidden" name="dTime" id="dTime" value="${newsDataBlob.dTime}" />
	    <table cellspacing="15">
	        <tr>
	            <td>新闻标题：</td>
	            <td><input class="easyui-textbox" type="text" name="dTitle" value="${newsDataBlob.dTitle}" data-options="required:true" style="width: 300px;"></input><font color="#ff6600">&nbsp;*</font></td>
	        </tr>
	        <tr>
	            <td>新闻分类：</td>
	            <td><input class="easyui-combotree" data-options="required:true,url:'admin/getNewsClassByAllInComBoTree.action'" name="d_classid" value="${newsDataBlob.dClassid}" style="width: 300px;"></input><FONT color=#ff6600>&nbsp;<a>注意：不能指定为含有子栏目的栏目</a></FONT></td>
	        </tr>
	        <tr>
	            <td>作　　者：</td>
	            <td><input class="easyui-textbox" type="text" name="dAuthor" value="${newsDataBlob.dAuthor}" data-options="required:true" style="width: 300px;" ></input>
	            </td>
	        </tr>
	        <tr>
	            <td>出　　处：</td>
	            <td><input class="easyui-textbox" type="text" name="dSource" value="${newsDataBlob.dSource}" data-options="required:true" style="width: 300px;" ></input>
	            </td>
	        </tr>
	        <tr>
	            <td>关  键  字：</td>
	            <td><input class="easyui-textbox" type="text" name="keyword" value="${newsDataBlob.keyword}" data-options="required:true" style="width: 300px;" ></input>
	            </td>
	        </tr>
	        <tr>
	            <td>描　　述：</td>
	            <td><input class="easyui-textbox" type="text" name="descrip" value="${newsDataBlob.descrip}" data-options="required:true" style="width: 300px;" ></input>
	            </td>
	        </tr>
	        <tr>
	            <td>图片新闻：</td>
	            <td><select class="easyui-combobox" id="dPicture_edit" name="dPicture" style="width: 300px;" ><option>不指定首页图片</option></select>
	            <FONT color=#ff6600>&nbsp;<a>添加首页图片新闻，请您选择相应的图片</a></FONT>
	            </td>
	        </tr>
	        <tr>
	            <td>添加时间：</td>
	            <td><input class="easyui-datetimebox" id="d_time" type="text" value="" data-options="required:true" style="width: 300px;" ></input>
	            </td>
	        </tr>
	         <tr>
	            <td>设置权重：</td>
	            <td><input class="easyui-textbox" type="text" type="text" name="setorder" value="${newsDataBlob.setorder}" style="width: 300px;" ></input><FONT color=#ff6600>&nbsp;<a>注意：此项用于设置显示顺序</a></FONT></td>
	        </tr>
	        <tr>
	            <td>文件上传：</td>
	            <td>
	                <label id="fileNameLabel"></label>
	                <a href="javascript:void(0)" onclick="showUploadFileWindow()" class="easyui-linkbutton uploadFile">上传</a>&nbsp;
	                <a href="javascript:void(0)" onclick="delUploadFile()" class="easyui-linkbutton uploadFiledel" >删除</a>&nbsp;
	                <FONT color=#ff6600><a>注意：此项用于技术文档，允许上传的格式（jpg|gif|bmp|png|rar|zip|doc|xls|ppt|docx|xlsx|pptx），只能上传小于10M的文件。</a></FONT>
	            </td>
	        </tr>
	        <tr>
	            <td>内容:</td>
	            <td>
	                <textarea style="width:900px;height:500px;" id="content" name="content" >${newsDataBlob.dContent}</textarea>
	            </td>
	        </tr>
	    </table>
	</form>
	<br>
	<div style="padding:5px; width: 100%; text-align:center">
	    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="contentEditPage.submitForm()">&nbsp;提交&nbsp;</a>&nbsp;&nbsp;
	    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="contentEditPage.clearForm()">&nbsp;重置&nbsp;</a>
	</div>
</div>
<div id="fileUploadWindow"></div>
<script type="text/javascript">

	var dataList_newsEdit;
	var contentEditEditor;
	$(function(){
		contentEditEditor = DAI.createEditor("#newsEditForm [name=content]");
		
		//如果存在上传文件，显示文件名和删除按钮
		var sSoftdown1 = $('#sSoftdown1').val();
		if(sSoftdown1) {
			var fileName = sSoftdown1.substring(sSoftdown1.lastIndexOf('/')+1,sSoftdown1.length);
			$('#fileNameLabel').text(fileName);
			$('a.uploadFiledel').show();
			$('a.uploadFile').hide();
		}
		
	});
	
	$(function(){
		var dOriginalfilename = $('#dOriginalfilename').val();
		if(dOriginalfilename) {
			var arr = dOriginalfilename.split("|");
			var dataList = new Array();
			for(var i=0; i<arr.length; i++) {
				dataList.push({"value":arr[i],"text":arr[i]});
			}
			dataList_newsEdit = dataList;
			//组件未渲染完成会出找不到options异常
			//设定一段时间后再设值 25秒左右
			var t = setTimeout('doChange_newsEdit(dataList_newsEdit)',8500);
		}
	}); 
	
	//给首页图片下拉设值
	function doChange_newsEdit(dataList){
		$('#dPicture_edit').combobox('loadData',dataList);
		var pic = '${newsDataBlob.dPicture}';
		$('#dPicture_edit').combobox('select',pic);
	}
	
	/* $('#content').input(function(){
		$.messager.alter('input')
	})
	 */
	var errText_edit;
	$('#dClassid').combotree({onChange :function(){
		//以下两种方法都可取值
		//classid = $('#dClassid').combotree('getValue');
		classid = $(this).combotree('getValue');
		classname = $(this).combotree('getText');
		$.ajax({
			url : 'admin/getNewsClassById.action',
			type : 'POST',
			data : {classID:classid},
			async: false,//不异步，执行结束后再返回
			success : function(data){
				if(data) {
					var newsClass = data;
					if(newsClass.child>0) {
						$.messager.alert('提示','不能指定含有子栏目的新闻分类！');
						//$(this).combotree('clear');
						errText_edit = '不能指定含有子栏目的新闻分类！';
						return false;
					} else {
						$('#dClassname').val(classname);
						errText_edit = null;
					}
				}
				
			}
		});
	}
	});
	
	var contentEditPage  = {
			submitForm : function (){
				//把日期串转为日期对象
				var d_str = $('#d_time').datetimebox('getValue');
				var d_date = d_str.replace(/-/g, "/");
				var dt = new Date(Date.parse(d_date));
				$('#dTime').val(dt);
				
				if(!$('#newsEditForm').form('validate')){
					$.messager.alert('提示','表单还未填写完成!');
					return ;
				}
				if(errText_edit != null) {
					$.messager.alert('提示',errText_edit);
					return ;
				}
				//将KindEditor的数据同步到textarea标签。
				contentEditEditor.sync();
				
				$.post("admin/newsUpdate.action",$("#newsEditForm").serialize(), function(data){
					if(data.status == 200){
						$.messager.alert('提示','新闻修改成功!');
						jumpTab('新闻修改');
					} else {
						$.messager.alert('提示','新闻修改失败!');
					}
				});
			},
			clearForm : function(){
				$('#newsEditForm').form('reset');
				contentEditEditor.html('');
			}
	};
	
	
	//日期格式转换
	$('#d_time').datetimebox({
		required : true,
		value : getTaskTime('${newsDataBlob.dTime}'),
	});
	
	//Thu Aug 18 20:38:54 CST 2016，时间格式转换  
	//输出格式：yyyy-MM-dd HH:mm:ss  
	//Thu Aug 18 2016 20:38:54 GMT+0800  
	function getTaskTime(strDate) {   
	    if(null==strDate || ""==strDate){  
	        return "";  
	    }  
	    var dateStr=strDate.trim().split(" ");  
	    var strGMT = dateStr[0]+" "+dateStr[1]+" "+dateStr[2]+" "+dateStr[5]+" "+dateStr[3]+" GMT+0800";  
	    var date = new Date(Date.parse(strGMT));  
	    var y = date.getFullYear();  
	    var m = date.getMonth() + 1;    
	    m = m < 10 ? ('0' + m) : m;  
	    var d = date.getDate();    
	    d = d < 10 ? ('0' + d) : d;  
	    var h = date.getHours();  
	    var minute = date.getMinutes();    
	    minute = minute < 10 ? ('0' + minute) : minute;  
	    var second = date.getSeconds();  
	    second = second < 10 ? ('0' + second) : second;  
	      
	    return y+"-"+m+"-"+d+" "+h+":"+minute+":"+second;  
	};  
	
	function delUploadFile() {
		$.messager.confirm({title:'警告',msg:'确定要删除上传好的文件吗？',ok:'确定',cancel:'取消',fn:function(r){
			if(r) {
				$('#fileNameLabel').text("");
				$('a.uploadFiledel').hide();
				$('a.uploadFile').show();
				// 从服务器上删除刚刚上传的文件
			}
		}});
	}
	
	function showUploadFileWindow() {
		$('#fileUploadWindow').window({
			title:'文件上传',
			href:'admin/showUploadFilePage.action',
			method:'post',
			width:380,    
		    height:140,    
		    loadingMessage:'数据加载中……',
		    maximizable:false,
		    minimizable:false,
		    collapsible:false,
		    resizable:false,
		    modal:true,
		    cache:false
		});
	}
	
</script>
