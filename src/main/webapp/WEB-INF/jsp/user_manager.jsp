<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@include file="../common/head.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script type="text/javascript">
/* 查找 */
function doSearch(value){
	$("#datagrid").datagrid("load",{
		'name':value
	})
}

/* 删除 */
function doDelete(){
	var ids = Util.getSelectionsIds("#datagrid");
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
					if(result.status == Util.SUCCESS) {
						$("#datagrid").datagrid("reload");
					}
				},
				"json"
			);
		}
	})
}

var url;
/* 打开添加dialog */
function openAddDialog() {
	$("#dialog").dialog("open").dialog("setTitle","添加信息");
	url = "${ctx}/user/add.action";
	$('#form').form("clear");
	
}
/* 打开修改dialog */
function openUpdateDialog() {
	var selections = $("#datagrid").datagrid("getSelections");
	if(selections.length == 0) {
		$.messager.alert("系统提示", "请选择要修改的数据");
		return;
	}
	var row = selections[0];
	$("#dialog").dialog("open").dialog("setTitle","修改信息");
	url = "${ctx}/user/update.action";
	$('#form').form("load", row);
}

function closeDialog(){
	 $("#dialog").dialog("close");
}

function doSave(){
	$('#form').form('submit', {    
	    url:url,    
	    onSubmit: function(){    
	        // do some check    
	        if($("#roleName").combobox("getValue") == "") {
	        	$.messager.alert("系统提示", "请选择用户角色");
	        	return false;
	        }
	        //validate none 做表单字段验证，当所有字段都有效的时候返回true。该方法使用validatebox(验证框)插件。 
	        // return false to prevent submit;  
	        return $(this).form("validate");
	    },    
	    success:function(data){//正常返回ServerResponse
	    	/* alert(data); */
	    	var data = eval('(' + data + ')');
	    	if(data.status == Util.SUCCESS) {
	    		$.messager.alert("系统提示", data.msg);
	    		$("#dialog").dialog("close");
	    		$("#datagrid").datagrid("reload");
	    	}
	    }    
	});  
}

</script>
</head>
<body>
	<table id="datagrid" class="easyui-datagrid" rownumbers="true" fitColumns="true"
		pagination="true"
		data-options="fit:true,singleSelect:false,url:'${ctx}/user/findAll.action',method:'get',toolbar:'#toolbar'">
		<thead>
			<tr>
				<th data-options="field:'cb',checkbox:true,align:'center'"></th>
				<th data-options="field:'id',width:80,align:'center'">编号</th>
				<th data-options="field:'name',width:100,align:'center'">用户名</th>
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
		<a class="easyui-linkbutton" href="javascript:openAddDialog()" iconCls="icon-add">添加</a>
		<a class="easyui-linkbutton" href="javascript:openUpdateDialog()" iconCls="icon-edit">修改</a>
		<a class="easyui-linkbutton" href="javascript:doDelete()" iconCls="icon-remove">删除</a>
		&nbsp;&nbsp;&nbsp;&nbsp;
		<input class="easyui-searchbox" data-options="prompt:'用户名',searcher:doSearch" style="width:150px"></input>
	</div>
	
	<!-- 添加和修改的dialog开始 -->
	<div id = "dialog" class="easyui-dialog" closed="true" style="width:650;height:280,padding: 10px 20px" buttons="#dialog-button">
		<form action="" id = "form" method="post">
			<input type="hidden" id="id" name="id"/>
			<table cellspacing="8px">
				<tr>
					<td>用户名：</td>
					<td><input type="text" id="name" name="userName" class="easyui-validatebox" required="true"/></td>
					<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
					<td>密码：</td>
					<td><input type="text" id="password" name="password" class="easyui-validatebox" required="true"/><font color="red">*</font></td>
				</tr>
				<tr>
					<td>真实姓名：</td>
					<td><input type="text" id="trueName" name="trueName" class="easyui-validatebox" required="true"/><font color="red">*</font></td>
					<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
					<td>邮箱：</td>
					<td><input type="text" id="email" name="email" class="easyui-validatebox" required="true" validType="email"/><font color="red">*</font></td>
				</tr>
				<tr>
					<td>联系电话：</td>
					<td><input type="text" id="phone" name="phone" class="easyui-validatebox" required="true"/><font color="red">*</font></td>
					<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
					<td>用户角色：</td>
					<td>
						<select class="easyui-combobox" id="roleName" name="roleName" style="width:160">
							<option></option>
							<option value="系统管理员">系统管理员</option>
							<option value="销售主管">销售主管</option>
							<option value="客户经理">客户经理</option>
							<option value="高管">高管</option>
						</select>
						<font color="red">*</font></td>
				</tr>
			</table>
		</form>
	</div>
	<!-- 添加和修改的dialog 结束 -->
	
	
	<!-- dialog-button 开始-->
	<div id="dialog-button">
		<a href="javascript:doSave()" class="easyui-linkbutton" iconCls="icon-ok">保存</a>
		<a href="javascript:closeDialog()" class="easyui-linkbutton" iconCls="icon-cancel">关闭</a>
	</div>
	<!-- dialog-button 结束-->
</body>
</html>
