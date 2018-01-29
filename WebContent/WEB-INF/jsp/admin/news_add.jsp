<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();   
    String basePath = request.getScheme()+"://" +request.getServerName()+":" +request.getServerPort()+path+"/" ;   
%> 
<link href="<%=path%>/js/kindeditor-4.1.11/themes/default/default.css" type="text/css" rel="stylesheet">
<!-- <script type="text/javascript" charset="utf-8" src="<%=path%>/js/kindeditor-4.1.11/kindeditor-all-min.js"></script> -->
<script type="text/javascript" charset="utf-8" src="<%=path%>/js/kindeditor-4.1.11/kindeditor-all.js"></script>
<script type="text/javascript" charset="utf-8" src="<%=path%>/js/kindeditor-4.1.11/lang/zh-CN.js"></script>
<div style="padding:10px 10px 10px 10px">
	<form id="newsDataAddForm" method="post">
	    	<input type="hidden" name="dOriginalfilename" id="dOriginalfilename"/>
	    	<input type="hidden" name="dSavefilename" id="dSavefilename"/>
	    	<input type="hidden" name="dSavepathfilename" id="dSavepathfilename"/>
	    	<input type="hidden" name="dEditor" id="dEditor" value="杨岐普通禅寺"/>
	    	<input type="hidden" id="sSoftdown1" name="sSoftdown1"  />
	    	<input type="hidden" id="dClassname" name="dClassname" />
	    	<input type="hidden" name="dNum" id="dNum" value="0" />
	    	<input type="hidden" name="dCount" id="dCount" value="0" />
	    	<input type="hidden" name="dRecycle" id="dRecycle" value="0" />
	    	<input type="hidden" name="dTime" id="dTime" />
	    <table cellspacing="15">
	        <tr>
	            <td>新闻标题：</td>
	            <td><input class="easyui-textbox" type="text" name="dTitle" data-options="required:true" style="width: 300px;"></input><font color="#ff6600">&nbsp;*</font></td>
	        </tr>
	        <tr>
	            <td>新闻分类：</td>
	            <td><input class="easyui-combotree" data-options="required:true,url:'admin/getNewsClassByAllInComBoTree.action'" id="dClassid" name="dClassid" style="width: 300px;"></input><FONT color=#ff6600><a>&nbsp;注意：不能指定含有子栏目的新闻分类</a></FONT></td>
	        </tr>
	        <tr>
	            <td>作　　者：</td>
	            <td><input class="easyui-textbox" type="text" name="dAuthor" data-options="required:true" style="width: 300px;" value="杨岐普通禅寺"></input>
	            </td>
	        </tr>
	        <tr>
	            <td>出　　处：</td>
	            <td><input class="easyui-textbox" type="text" name="dSource" data-options="required:true" style="width: 300px;" value="杨岐普通禅寺"></input>
	            </td>
	        </tr>
	        <tr>
	            <td>关  键  字：</td>
	            <td><input class="easyui-textbox" type="text" name="keyword" data-options="required:true" style="width: 300px;" value="杨岐普通禅寺"></input>
	            </td>
	        </tr>
	        <tr>
	            <td>描　　述：</td>
	            <td><input class="easyui-textbox" type="text" name="descrip" data-options="required:true" style="width: 300px;" value="杨岐普通禅寺"></input>
	            </td>
	        </tr>
	        <tr>
	            <td>图片新闻：</td>
	            <td><select class="easyui-combobox" id="dPicture" name="dPicture" style="width: 300px;" ><option>不指定首页图片</option></select>
	            <FONT color=#ff6600><a>&nbsp;添加首页图片新闻，请您选择相应的图片</a></FONT>
	            </td>
	        </tr>
	        <tr>
	            <td>添加时间：</td>
	            <td><input class="easyui-datetimebox" id="d_time" type="text" style="width: 300px;"></input>
	            </td>
	        </tr>
	         <tr>
	            <td>设置权重：</td>
	            <td><input class="easyui-textbox" type="text" name="setorder" style="width: 300px;" value="0"></input><FONT color=#ff6600><a>&nbsp;注意：此项用于设置显示顺序</a></FONT></td>
	        </tr>
	        <tr>
	            <td>文件上传：</td>
	            <td>
	            	<label id="fileNameLabel" ></label>
	                <a href="javascript:void(0)" onclick="showUploadFileWindow()" class="easyui-linkbutton uploadFile">上传</a>&nbsp;
	                <a href="javascript:void(0)" onclick="delUploadFile()" class="easyui-linkbutton uploadFiledel" style="padding:0px 5px 7px 5px">删除</a>&nbsp;
	                
	            </td>
	        </tr>
	        <tr>
	        	<td></td>
	        	<td><FONT color=#ff6600><a>注意：此项用于文档，允许上传的格式（jpg|gif|bmp|png|rar|zip|doc|xls|ppt|docx|xlsx|pptx），只能上传小于10M的文件。</a></FONT></td>
	        </tr>
	        <tr>
	            <td>新闻内容:</td>
	            <td>
	                <textarea style="width:900px;height:400px;" name="dContent"></textarea>
	            </td>
	        </tr>
	    </table>
	</form>
	<br>
	<div style="padding:5px; width: 100%; text-align:center">
	    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="contentAddPage.submitForm()">&nbsp;提交&nbsp;</a>&nbsp;&nbsp;
	    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="contentAddPage.clearForm()">&nbsp;重置&nbsp;</a>
	</div>
</div>
<div id="fileUploadWindow"></div>
<script type="text/javascript">
	var contentAddEditor ;
	$(function(){
		contentAddEditor = DAI.createEditor("#newsDataAddForm [name=dContent]");
		//DAI.initOnePicUpload();
		//初始化类目选择和图片上传器
		//DAI.init({fun:function(node){
			//根据商品的分类id取商品 的规格模板，生成规格信息。第四天内容。
			//TAOTAO.changeItemParam(node, "itemAddForm");
		//}});
		//DAI.initPicUpload();
		//$("#newsDataAddForm [name=categoryId]").val($("#contentCategoryTree").tree("getSelected").id);
		
		$('a.uploadFiledel').hide();
	});
	
	var errText;
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
						errText = '不能指定含有子栏目的新闻分类！';
						return false;
					} else {
						$('#dClassname').val(classname);
						errText = null;
					}
				}
				
			}
		});
	}
	});
	
	var contentAddPage  = {
			submitForm : function (){
				//把日期串转为日期对象
				var d_str = $('#d_time').datetimebox('getValue');
				var d_date = d_str.replace(/-/g, "/");
				var dt = new Date(Date.parse(d_date));
				$('#dTime').val(dt);
				
				if(!$('#newsDataAddForm').form('validate')){
					$.messager.alert('提示','表单还未填写完成!');
					return ;
				}
				if(errText != null) {
					$.messager.alert('提示',errText);
					return ;
				}
				//将KindEditor的数据同步到textarea标签。
				contentAddEditor.sync();
				
				$.post("admin/newsDataAdd.action",$("#newsDataAddForm").serialize(), function(data){
					if(data.status == 200){
						$.messager.alert('提示','新闻添加成功!');
						jumpTab('新闻添加');
					} else {
						$.messager.alert('提示','新闻添加失败!');
					}
				});
			},
			clearForm : function(){
				$('#newsDataAddForm').form('reset');
				contentAddEditor.html('');
			}
	};
	
	$('#d_time').datetimebox({
		required : true,
		value : DAI.formatDateTime(null),
	});
	
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
	
	//打开或者添加新闻管理标签页
	function jumpTab(val) {
		var tabs = $("#tabs");
		var tab = tabs.tabs("getTab","新闻管理");
		if(tab){
			tabs.tabs("close",val);
			tabs.tabs('close',"新闻管理");
		}
		tabs.tabs('add',{
		    title:"新闻管理",
		    href: "admin/showNewsListPage.action",
		    closable:true,
		    bodyCls:"content"
		});
	}
	
	// 设置隐藏字段的值
	function setPicNames(_originalfilename,_saveFileName,_savePathFileName) {
		//在已有列表的情况下追加
		var dor_ = $('#dOriginalfilename').val();
		if(!dor_) {
			$('#dOriginalfilename').val(_originalfilename.toString().replace(/,/g,"|"));
		} else {
			$('#dOriginalfilename').val(dor_ + '|' + _originalfilename.toString().replace(/,/g,"|"));
		}
		var dsavef_ = $('#dSavefilename').val();
		if(!dsavef_) {
    		$('#dSavefilename').val(_saveFileName.toString().replace(/,/g,"|"));
		} else {
			$('#dSavefilename').val(dsavef_ + '|' + _saveFileName.toString().replace(/,/g,"|"));
		}
    	var dsavep_ = $('#dSavepathfilename').val();
    	if(!dsavep_) {
    		$('#dSavepathfilename').val(_savePathFileName.toString().replace(/,/g,"|"));
    	} else {
    		$('#dSavepathfilename').val(dsavep_ + '|' + _savePathFileName.toString().replace(/,/g,"|"));
    	}
    	doChange(document.getElementById('dSavepathfilename'), document.getElementById('dPicture'));
	}
	
	// 当上传图片时，往下拉框中填入图片路径
	function doChange(objText, objDrop){
		if (!objDrop) 
			return;
		var files = objText.value;
		var arr = files.split("|");
		var dataList = new Array();
		for (var i=0; i<arr.length; i++){
			dataList.push({"value":arr[i],"text":arr[i]});
		} 
		$("#dPicture").combobox('loadData',dataList);
	}
</script>


