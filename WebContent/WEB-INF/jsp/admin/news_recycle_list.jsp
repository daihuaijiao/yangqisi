<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<div id="toolbar_recycle" style="padding: 5px; height: auto">
	<div style="margin-bottom: 5px">
		<a href="javascript:void(0)" class="easyui-linkbutton" title="新闻添加" iconCls="icon-add" onclick="rollBackNewsDataByIDs()">还原选定新闻</a> 
		<!-- <a href="javascript:void(0)" class="easyui-linkbutton" title="新闻修改" iconCls="icon-add" onclick="rollBackNewsDataByAll()">还原所有新闻</a>  -->
		<a href="javascript:void(0)" class="easyui-linkbutton" title="新闻删除" iconCls="icon-remove" onclick="delNewsDataByIDs()">彻底删除选定新闻</a>
		<a href="javascript:void(0)" class="easyui-linkbutton" title="新闻删除" iconCls="icon-remove" onclick="delNewsDataByAll()">清空回收站</a>
	</div>
</div>	
<!-- 数据表格 -->
<table id="recycleNewsList"></table>
<!-- 分页栏 -->
<div id="pagination_recycle" class="easyui-pagination"></div>
<script>
	var rows = 10, page = 1;

	$("#recycleNewsList").datagrid({
		url : 'admin/getRecycleNewsDataList.action',
		border : false,
		singleSelect : false,
		collapsible : true,
		rownumbers : true,
		idField : 'dId',
		loadMsg : '数据加载中……',
		fitColumns : true,
		toolbar : '#toolbar_recycle',
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
			field : 'dRecycletime',
			title : '删除时间',
			width : 150,
			formatter : function(value,row,index) {
				var dat = new Date(value);
				return dat.format('yyyy-MM-dd');
			}
		},{field:'rollback',title:'还原',width:'15%',formatter:function(value,rowData,rowIndex) {
        	return '<a href=\'javascript:void(0)\' style=\'color:#000000;'+
            'padding:2px 10px 2px 10px;'+
            'background-color:#cccccc;'+
           	'text-decoration:none;'+
           	'border-top:1px solid #EEEEEE;'+ /* 边框实现阴影效果 */
            'border-left:1px solid #EEEEEE;'+
            'border-bottom:1px solid #717171;'+
            'border-right:1px solid #717171;\'' +
        	'onclick=\"rollBackNewsDataByID(\''+rowData.dId+'\')\">还原</a>';
        	}
        },{field:'del',title:'删除',width:'15%',formatter:function(value,rowData,rowIndex) {
        	return '<a href=\'javascript:void(0)\' style=\'color:#000000;'+
            'padding:2px 10px 2px 10px;'+
            'background-color:#cccccc;'+
           	'text-decoration:none;'+
           	'border-top:1px solid #EEEEEE;'+ /* 边框实现阴影效果 */
            'border-left:1px solid #EEEEEE;'+
            'border-bottom:1px solid #717171;'+
            'border-right:1px solid #717171;\'' +
        	'onclick=\"delNewsDataByID(\''+rowData.dId+'\')\">删除</a>';
        	}
        } ] ],
		loadFilter : function(data) {
			$("#pagination_recycle").pagination({
				total : data.total,
				displayMsg : '第{from}-{to}行   共{total}行',
				beforePageText : '第',
				afterPageText : '页  共 {pages}页'
			});
			return data;
		}
	})

	$("#pagination_recycle").pagination({
		onSelectPage : function(pageNumber, pageSize) {
			rows = pageSize, page = pageNumber;
			$('#recycleNewsList').datagrid('load', {
				rows : pageSize,
				page : pageNumber,
			});
		}
	});
	
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
	
	//删除单条新闻
	function delNewsDataByID(id) {
		if(id) {
			$.messager.confirm({title:'提示',msg:'确定要删除吗？',ok:'确定',cancel:'取消',fn:function(r){
				if(r) {
					$.ajax({
						url : 'admin/newsDataDeleteById.action',
						type : 'post',
						data : {'id':id},
						success : function(data) {
							if(data.status == 200) {
								$.messager.alert('提示', '新闻删除成功！');
								$('#recycleNewsList').datagrid('reload');
							} else {
								$.messager.alert('提示', '新闻删除失败!');
							}
						},
						error : function() {
							$.messager.alert('提示', '系统错误，请重试！');
						}
					});
				}
			}})
		}
	}
	
	//还原单条新闻
	function rollBackNewsDataByID(id) {
		if(id) {
			$.messager.confirm({title:'提示',msg:'确定要还原选定新闻吗？',ok:'确定',cancel:'取消',fn:function(r) {
				if(r) {
					$.ajax({
						url : 'admin/newsDataRollBackById.action',
						type : 'post',
						data : {'id':id},
						success : function(data) {
							if(data.status == 200) {
								$.messager.alert('提示', '还原成功！');
								$('#recycleNewsList').datagrid('reload');
							} else {
								$.messager.alert('提示', '还原失败!');
							}
						},
						error : function() {
							$.messager.alert('提示', '系统错误，请重试！');
						}
					})
				}
			}});
		}
	}
	
	//批量还原新闻
	function rollBackNewsDataByIDs() {
		var ids = null;
		ids = $('#recycleNewsList').datagrid('getSelections');
		if(ids.length == 0) {
			$.messager.alert('提示', '未选中任何新闻！');
			return;
		}
		var strIds = '';
		for(var i=0; i<ids.length; i++) {
			if(i > 0) {
				strIds = strIds + ',';
			}
			strIds = strIds + ids[i].dId;
		}
		$.messager.confirm({title:'警告',msg:'确定要还原编号为 ' + strIds + ' 的新闻吗？',ok:'确定',cancel:'取消',fn:function(r) {
			if(r) {
				$.ajax({
					url : 'admin/newsDataRollBackByIds.action',
					type : 'post',
					data : {'ids':strIds},
					success : function(data) {
						if(data.status == 200) {
							$.messager.alert('提示', '您选择的新闻已经还原成功！');
							$('#recycleNewsList').datagrid('reload');
						} else {
							$.messager.alert('提示', '新闻还原失败！');
						}
					}
				});
			}
		}});
	}
	
	//批量删除新闻
	function delNewsDataByIDs() {
		var ids = null;
		ids = $('#recycleNewsList').datagrid('getSelections');
		if(ids.length == 0) {
			$.messager.alert('提示', '未选中任何新闻！');
			return;
		}
		var strIds = '';
		for(var i=0; i<ids.length; i++) {
			if(i > 0) {
				strIds = strIds + ',';
			}
			strIds = strIds + ids[i].dId;
		}
		$.messager.confirm({title:'警告',msg:'确定要彻底删除编号为 ' + strIds + ' 的新闻吗？',ok:'确定',cancel:'取消',fn:function(r) {
			if(r) {
				$.ajax({
					url : 'admin/newsDataDeleteByIds.action',
					type : 'post',
					data : {'ids':strIds},
					success : function(data) {
						if(data.status == 200) {
							$.messager.alert('提示', '删除成功！');
							$('#recycleNewsList').datagrid('reload');
						} else {
							$.messager.alert('提示', '删除失败!');
						}
					}
				});
			}
		}});
	}
	
	//删除回收站的所有新闻
	function delNewsDataByAll() {
		$.messager.confirm({title:'警告',msg:'确定要清空回收站吗？',ok:'确定',cancel:'取消',fn:function(r) {
			if(r) {
				$.ajax({
					url : '',
					type : 'post',
					success : function(data) {
						if(data.status == 200) {
							$.messager.alert('提示', '回收站已清空！');
						} else {
							$.messager.alert('提示', '回收站清空失败！');
						}
					}
				});
			}
		}
		});
	}
	
</script>