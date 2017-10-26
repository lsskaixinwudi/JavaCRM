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
	<table class="easyui-datagrid" title="DataGrid with Toolbar"
		data-options="rownumbers:true,fit:true,singleSelect:true,url:'${ctx}/user/findAll.action',method:'get',toolbar:'#toolbar'">
		<thead>
			<tr>
				<th data-options="field:'id',width:130,align:'center'">编号</th>
				<th data-options="field:'userName',width:150,align:'center'">用户名</th>
				<th data-options="field:'password',width:130,align:'center'">密码</th>
				<th data-options="field:'trueName',width:130,align:'center'">真实姓名</th>
				<th data-options="field:'email',width:280,align:'center'">邮件</th>
				<th data-options="field:'phone',width:140,align:'center'">联系电话</th>
				<th data-options="field:'roleName',width:160,align:'center'">角色</th>
			</tr>
		</thead>
	</table>
	
	<!-- toolbar -->
	<div id="toolbar">
		<a class="easyui-linkbutton" iconCls="icon-add">添加</a>
		<a class="easyui-linkbutton" iconCls="icon-edit">修改</a>
		<a class="easyui-linkbutton" iconCls="icon-remove">删除</a>
	</div>

</body>
</html>