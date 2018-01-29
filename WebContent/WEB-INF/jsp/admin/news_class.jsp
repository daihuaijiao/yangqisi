<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div id="addParentClass" style="margin:10px; 10px; 10px; 10px;"></div>
<div id="reloadClassTree" style="margin:10px; 10px; 10px; 10px;"></div>
<table id="classTree"></table>
<div id="childClassAddWindow"></div>
<div id="classEditWindow"></div>
<div id="parentClassAddWindow"></div>


<script>

	$(function() {
		loadingMessage : '数据加载中……'
	});

	$('#classTree').treegrid({
		url : 'admin/getNewsClassByAll.action',
		idField : 'id',
		lines : true,
		loadingMessage : '数据加载中……',
		loadMsg : '数据加载中……',
		treeField : 'className',
		columns : [[
		            {field:'className',title:'栏目名称',width:'55%',formatter : function(value,rowData,rowIndex) {
		    			var s = rowData.className;
		    			if(rowData.children.length > 0) {
		    				s = s + '<span style="color:blue">(' + rowData.children.length + ')</span>';
		    			}
		    			return s;
		    		}},
		            {field:'addChildClass',title:'添加子栏目',width:'10%',formatter:function(value,rowData,rowIndex) {
		            	//return '<a href=\'javascript:void(0)\' onclick=\"newsChildClassAdd(\''+rowData.id+'\',\''+rowData.className+'\')\">添加子栏目</a>';
		            	return '<a href=\'javascript:void(0)\' onclick=\"newsChildClassAdd(\''+rowData.id+'\',\''+rowData.className+'\')\"'+
		            	'style=\'color:#000000;'+
		                'padding:2px 10px 2px 10px;'+
		                'background-color:#cccccc;'+
		               	'text-decoration:none;'+
		               	'border-top:1px solid #EEEEEE;'+ /* 边框实现阴影效果 */
		                'border-left:1px solid #EEEEEE;'+
		                'border-bottom:1px solid #717171;'+
		                'border-right:1px solid #717171;\'' +
		            	'>添加子栏目</a>';
		            }},
		            {field:'editClass',title:'修改栏目',formatter:function(value,rowData,rowIndex) {
		            	//return '<a href=\'javascript:void(0)\' onclick=\"newsClassEdit(\''+rowData.id+'\')\">修改栏目</a>';
		            	return '<a href=\'javascript:void(0)\' onclick=\"newsClassEdit(\''+rowData.id+'\')\"' + 
		            	'style=\'color:#000000;'+
		                'padding:2px 10px 2px 10px;'+
		                'background-color:#cccccc;'+
		               	'text-decoration:none;'+
		               	'border-top:1px solid #EEEEEE;'+ /* 边框实现阴影效果 */
		                'border-left:1px solid #EEEEEE;'+
		                'border-bottom:1px solid #717171;'+
		                'border-right:1px solid #717171;\'' +
		            	'>修改栏目</a>';
		            },width:'10%'},
		            {field:'cleanClass',title:'清空栏目下新闻',width:'15%',formatter:function(value,rowData,rowIndex) {
		            	return '<a href=\'javascript:void(0)\' style=\'color:#000000;'+
		                'padding:2px 10px 2px 10px;'+
		                'background-color:#cccccc;'+
		               	'text-decoration:none;'+
		               	'border-top:1px solid #EEEEEE;'+ /* 边框实现阴影效果 */
		                'border-left:1px solid #EEEEEE;'+
		                'border-bottom:1px solid #717171;'+
		                'border-right:1px solid #717171;\'' +
		            	'onclick=\"delNewsDataByClassID(\''+rowData.id+'\',\''+rowData.className+'\')\">清空栏目下新闻</a>';
		            	}
		            },
		            {field:'delClass',title:'删除栏目',formatter:function(value,rowData,rowIndex) {
		            	//return '<a href=\'javascript:void(0)\' onclick=\"newsClassDel(\''+rowData.id+'\')\">删除栏目</a>';
		            	return '<a href=\'javascript:void(0)\' style=\'color:#000000;'+
		                'padding:2px 10px 2px 10px;'+
		                'background-color:#cccccc;'+
		               	'text-decoration:none;'+
		               	'border-top:1px solid #EEEEEE;'+ /* 边框实现阴影效果 */
		                'border-left:1px solid #EEEEEE;'+
		                'border-bottom:1px solid #717171;'+
		                'border-right:1px solid #717171;\'' +
		            	'onclick=\"newsClassDel(\''+rowData.id+'\',\''+rowData.className+'\')\">删除栏目</a>';
		            },width:'10%'}
		            ]],
		
	});

	function newsChildClassAdd(id,className) {
		$('#childClassAddWindow').window({
			title:'添加子栏目',
			href:'admin/showNewsClassAddWindow.action',
			method:'post',
			queryParams:{'classId':id,'className':className},
			width:370,    
		    height:280,    
		    loadingMessage:'数据加载中……',
		    maximizable:false,
		    minimizable:false,
		    collapsible:false,
		    resizable:false,
		    modal:true,
		    cache:false
		    });
	}
	
	function newsClassEdit(id) {
		$('#classEditWindow').window({
			title:'修改栏目',
			href:'admin/showNewsClassEditWindow.action',
			method:'post',
			queryParams:{'classId':id},
			width:380,    
		    height:280,   
		    loadingMessage:'数据加载中……',
		    maximizable:false,
		    minimizable:false,
		    collapsible:false,
		    resizable:false,
		    modal:true,
		    cache:false
		});
	}
	
	function delNewsDataByClassID(id,className) {
		$.post('admin/getNewsClassChild.action',{classId:id},function(data,status){
			var obj = eval("(" + data + ")");
			var child = obj.child;
			if(child > 0) {
				$.messager.alert('提示','只能批量删除单个子栏目下的所有新闻！');
				return;
			} else {
				$.messager.confirm({title:'警告',msg:'注意：该操作将删除<b>\"'+className+'\"</b>下的所有新闻，请确定是否继续！',ok:'确定',cancel:'取消',fn:function(r){
					if(r) {
						$.post('admin/delNewsDataByClassID.action',{classID:id},function(data,status){
							if(data.status == 200) {
								$.messager.alert('提示',data.msg);
							} else {
								$.messager.alert('提示','删除失败！'+data.msg);
							}
						})
					}
				}});
			}
		})
	}
	
	function newsClassDel(id,className) {
		var flg = false;
		$.messager.confirm({title:'警告',msg:'确认要删除<b>\"'+className+'\"</b>栏目吗？',ok:'确定',cancel:'取消',fn:function(r) {
			if(r) {
				//检查是否有子栏目
				$.post('admin/getNewsClassChild.action',{classId:id},function(data,status) {
					var obj = eval("(" + data +")");
					var child = obj.child;
					if(child > 0) {
						$.messager.alert('提示','该栏目下含有子栏目，请先删除子栏目！');
						return ;
					} else {
						//检查栏目下是否有新闻
						$.post('admin/getNewsDataCountByClassID.action',{classID:id},function(data,status) {
							var obj = eval("(" + data +")");
							var count = obj.count;
							if(count > 0) {
								$.messager.confirm({title:'警告',msg:'删除栏目会同时删除该栏目下的所有新闻，确定要继续吗？',ok:'确定',cancel:'取消',fn:function(r) {
									if(r) {
										//删除栏目  物理删除
										$.post('admin/delNewsClass.action',{classID:id},function(data,status) {
											if(data.status == 200) {
												$.messager.alert('提示',data.msg,'info');
												$('#classTree').treegrid('reload');
											} else {
												$.messager.alert('提示','栏目删除失败！','info');
											}
										});									
									} 
								}});
							} else {
								//删除栏目  物理删除
								$.post('admin/delNewsClass.action',{classID:id},function(data,status) {
									if(data.status==200) {
										$.messager.alert('提示',data.msg,'info');
										$('#classTree').treegrid('reload');
									} else {
										$.messager.alert('提示','栏目删除失败！','info');
									}
								});			
							}
						});
					}
				});
			}
		}});
		
	}
	
	$("#addParentClass").linkbutton({
		text : '添加主栏目',
		iconCls : 'icon-add'
	});
	$("#addParentClass").bind('click',function() {
		$("#parentClassAddWindow").window({
			title:'添加主栏目',
			href:'admin/showParentClassAddWindow.action',
			width:380,    
		    height:280,   
		    loadingMessage:'数据加载中……',
		    maximizable:false,
		    minimizable:false,
		    collapsible:false,
		    resizable:false,
		    modal:true,
		    cache:false
		});
	});
	$("#reloadClassTree").linkbutton({
		text : '刷新',
		iconCls : 'icon-reload'
	});
	$("#reloadClassTree").bind('click',function() {
		$("#classTree").treegrid('reload');
	});
	
</script>