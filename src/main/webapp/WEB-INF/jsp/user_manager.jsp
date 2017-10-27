<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@include file="../common/head.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<table id="datagrid" class="easyui-datagrid" rownumbers="true" fitColumns="true"
		pagination="true"
		data-options="fit:true,singleSelect:false,url:'${ctx}/user/findAll.action',method:'get',toolbar:'#toolbar'">
		<thead>
			<tr>
				<th data-options="field:'cb',checkbox:true,align:'center'"></th>
				<th data-options="field:'id',width:80,align:'center'">编号</th>
				<th data-options="field:'userName',width:100,align:'center'">用户名</th>
				<th data-options="field:'password',width:80,align:'center'">密码</th>
				<th data-options="field:'trueName',width:80,align:'center'">真实姓名</th>
				<th data-options="field:'email',width:100,align:'center'">邮件</th>
				<th data-options="field:'phone',width:100,align:'center'">联系电话</th>
				<th data-options="field:'roleName',width:100,align:'center'">角色</th>
			</tr>
		</thead>
	</table>
	
	<!-- toolbar -->
	<div id="toolbar">
		<a class="easyui-linkbutton" iconCls="icon-add">添加</a>
		<a class="easyui-linkbutton" iconCls="icon-edit">修改</a>
		<a class="easyui-linkbutton" href="javascript:doDelete()" iconCls="icon-remove">删除</a>
		&nbsp;&nbsp;&nbsp;&nbsp;
		<input class="easyui-searchbox" data-options="prompt:'用户名',searcher:doSearch" style="width:150px"></input>
	</div>

<script type="text/javascript">
	/* 查找 */
	function doSearch(value){
		$("#datagrid").datagrid('load',{
			'userName':value
		})
	}
	/* 删除 */
	function doDelete(){
		var selectedIds = $("#datagrid").datagrid("getSelections");
		console.log(selectedIds);
		var ids = [];//[1,2,3]
		for(var i in selectedIds){
			ids.push(selectedIds[i].id);
		}
		ids = ids.join(',');
		if (ids.length == 0) {
			$.messager.alert("系统提示", "请选择要删除的数据");
			return;
		}
		$.messager.confirm("系统提示", "您确认要删除么", function(r){
			if (r){
				$.post(
					"${ctx}/user/delete.action",
					{ids:ids}, 
					function(result) {
						$.messager.alert("系统提示", result.msg);
						if(result.status == 0) {
							$("#datagrid").datagrid("reload");
						}
					},
					"json"
				);
			}
		})
	}
</script>
</body>
</html>
