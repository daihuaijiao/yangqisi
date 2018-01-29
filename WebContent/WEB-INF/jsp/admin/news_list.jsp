<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<div id="toolbar" style="padding: 5px; height: auto">
	<div style="margin-bottom: 5px">
		<a href="javascript:void(0)" class="easyui-linkbutton" title="新闻添加" iconCls="icon-add" onclick="addPage()">新闻添加</a> 
		<a href="javascript:void(0)" class="easyui-linkbutton" title="新闻修改" iconCls="icon-edit" onclick="editPage()">新闻修改</a> 
		<a href="javascript:void(0)" class="easyui-linkbutton" title="新闻删除" iconCls="icon-remove" onclick="deleteNews()">新闻删除</a>
	</div>
	<div><form id="searchNewsDataForm">
		搜索: <input id="start_date" name="start_date"  type="text"  class="easyui-datebox" style="width: 120px"> 到: 
		<input id="end_date" name="end_date" class="easyui-datebox" style="width: 120px"> 栏目: 
		<select class="easyui-combotree" id="classID" name="classID" data-options="url:'admin/getNewsClassByAllInComBoTree.action',editable:true" style="width: 200px;"></select>
		新闻标题:<input id="d_title" name="d_title" class="easyui-textbox" type="text" style="width: 120px"> 
		<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-search" onclick="searchNewsData()" style="margin-right: 10px"> 搜索</a>
		<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-clear" onclick="searchClean()"> 清空</a>
		</form>
	</div>
</div>
<!-- 数据表格 -->
<table id="newsList"></table>
<!-- 分页栏 -->
<div id="pagination" class="easyui-pagination"></div>
<script>
	var rows = 10, page = 1;

	$("#newsList").datagrid({
		url : 'admin/getNewsList.action',
		border : false,
		singleSelect : false,
		collapsible : true,
		rownumbers : true,
		idField : 'dId',
		loadMsg : '数据加载中……',
		fitColumns : true,
		toolbar : '#toolbar',
		queryParams : {
			page : page,
			rows : rows
		},
		columns : [ [ {
			field : 'ck',
			checkbox : true,
			title : '全选',
			width : 100
		}, {
			field : 'dId',
			title : '新闻编号',
			width : 90
		}, {
			field : 'dTitle',
			title : '新闻标题',
			fixed : false,
			width : 400
		}, {
			field : 'dClassid',
			title : '栏目分类',
			width : 100,
			formatter : getclassname
		}, {
			field : 'dAuthor',
			title : '录入',
			width : 100,
		}, {
			field : 'dTime',
			title : '添加时间',
			width : 150,
			formatter : function(value,row,index) {
				var dat = new Date(value);
				return dat.format('yyyy-MM-dd');
			}
		}, {
			field : 'setorder',
			title : '权重',
			width : 100,
		} ] ],
		loadFilter : function(data) {
			$("#pagination").pagination({
				total : data.total,
				displayMsg : '第{from}-{to}行   共{total}行',
				beforePageText : '第',
				afterPageText : '页  共 {pages}页'
			});
			return data;
		}
	})

	$("#pagination").pagination({
		onSelectPage : function(pageNumber, pageSize) {
			rows = pageSize, page = pageNumber;
			$('#newsList').datagrid('load', {
				rows : pageSize,
				page : pageNumber,
				start_date : start_date,
				end_date : end_date,
				classID : classID,
				d_title : d_title,
			});
		}
	});

	/* $(function(){
	 var pager = $('#newsList').datagrid.datagrid('getPager');	// get the pager of datagrid
	 pager.pagination({
	 buttons:[{
	 iconCls:'icon-search',
	 handler:function(){
	 alert('search');
	 }
	 },{
	 iconCls:'icon-add',
	 handler:function(){
	 alert('add');
	 }
	 },{
	 iconCls:'icon-edit',
	 handler:function(){
	 alert('edit');
	 }
	 }]
	 });			
	 }) */

	/* $(function() {
		var pager = $('#newsList').datagrid().datagrid('getPager');	// get the pager of datagrid
		pager.pagination({
			beforePageText:'第',
			afterPageText:'页        共{pages}页',
			displayMsg:'当前显示 {from} - {to} 条记录        总共 {total}条记录',
		});
	}) */

	//显示栏目名称
	function getclassname(value,row,index) {
		var re;
		$.ajax({
			url : 'admin/getNewsClassById.action',
			type : 'post',
			data : {classID:value},
			async: false,//不异步，执行结束后再返回
			success : function(data) {
				re = data;
			}
		})
		return re.classname;
	}

	function addPage() {
		$('#tabs').tabs('add', {
			title : "新闻添加",
			//content:content,  
			href : "admin/showNewsAddPage.action",
			border : false,
			closable : true,
			selected : true
		});
	}
	
	function editPage() {
		var ids = $('#newsList').datagrid('getSelections');
		if (ids.length == 0) {
			$.messager.alert('提示', '必须选择一篇新闻才能编辑!');
			return;
		}
		if (ids.length > 1) {
			$.messager.alert('提示', '只能选择一篇新闻行进行编辑!');
			return;
		}
		$('#tabs').tabs('add', {
			title : "新闻修改",
			href : "admin/showNewsEditPage.action?dId="+ids[0].dId,
			border : false,
			closable : true,
			selected : true,
			content : $('newsEditForm').form('load',ids[0])
		});
	}

	function deleteNews() {
		var ids = null;
		ids = $('#newsList').datagrid('getSelections');
		if (ids.length == 0) {
			$.messager.alert('提示', '未选中任何新闻!');
			return;
		}
		var strids = '';
		for(var i=0; i<ids.length; i++) {
			if(i > 0) {
				strids = strids + ',';
			}
			strids = strids + ids[i].dId;
		}
		$.messager.confirm({title:'警告',msg:'确定删除编号为 ' + strids + ' 的新闻吗？',ok:'确定',cancel:'取消',fn:function(r) {
			if (r) {
				var params = {
					'ids' : strids
				};
				$.post("admin/newsDeleteToRecycleByID.action",params,function(data) {
					if (data.status == 200) {
						$.messager.alert('提示','新闻已放入回收站!');
						refDataGrid();
					} else {
						$.messager.alert('提示','新闻删除失败!');
					}
				});
			}
		}});
	}
	
	var toolbar = [
			{
				text : '新闻添加',
				iconCls : 'icon-add',
				handler : function() {
					$('#tabs').tabs('add', {
						title : '新闻添加',
						href : 'admin/showNewsAddPage.action',
						border : false,
						closable : true,
						selected : true
					});
				}
			},
			{} 
			];
	
	var start_date;
	var end_date;
	var classID;
	var d_title;
	
	function searchNewsData() {
		start_date = $('#start_date').datebox('getValue');
		end_date = $('#end_date').datebox('getText');
		classID = $('#classID').combotree('getValue');
		d_title = $('#d_title').textbox('getText');
		
		$('#newsList').datagrid('load', {
			rows : 10,
			page : 1,
			start_date : start_date,
			end_date : end_date,
			classID : classID,
			d_title : d_title,
		});
	}
	
	function searchClean() {
		$('#searchNewsDataForm').form('reset');
	}
	
	//添加新闻管理标签页
	function refDataGrid() {
		//$('#itemList').datagrid('reload');
		var tabs = $("#tabs");
		tabs.tabs("close","新闻管理");
		tabs.tabs('add',{
		    title:"新闻管理",
		    href: "admin/showNewsListPage.action",
		    closable:true,
		    bodyCls:"content"
		});
	}
	
</script>