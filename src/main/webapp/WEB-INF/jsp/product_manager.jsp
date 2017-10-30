<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@include file="../common/head.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script type="text/javascript">

$(function(){
	/*展示数据的datagrid表格*/
	$("#datagrid").datagrid({
		url:'${ctx}/product/findAll.action',
		method:'get',
		fit:true,
		singleSelect:false,
		toolbar:'#toolbar',
		rownumbers:true,
		fitColumns:true,
		pagination:true,
		columns:[[    
		     {field:'cb',checkbox:true,align:'center'},    
		     {field:'id',title:'编号',width:80,align:'center'},    
		     {field:'name',title:'产品名',width:100,align:'center'},    
		     {field:'model',title:'型号',width:80,align:'center'},
		     {field:'unit',title:'单位',width:100,align:'center'},    
		     {field:'price',title:'价格',width:80,align:'center'},
		     {field:'stock',title:'库存',width:100,align:'center'},    
		     {field:'remark',title:'备注',width:80,align:'center'}
		]]  
	});
	
	/*添加和修改弹出的dialog */
	$("#dialog").dialog({
		closed:'true',
		buttons:[
			{
				text:'保存',
				iconCls:'icon-ok',
				handler:function(){
					doSave();
				}
			},
			{
				text:'关闭',
				iconCls:'icon-cancel',
				handler:function(){
					$("#dialog").dialog("close");
				}
			}
			
		]
		
	});
});
/*添加或修改的dialog */
function doSave() {
	$('#form').form('submit', {    
	    url:url,    
	    onSubmit: function(){    
	        // do some check    
	        if($("#name").combobox("getValue") == "") {
	        	$.messager.alert("系统提示", "请选择用户角色");
	        	return false;
	        }
	        //validate none 做表单字段验证，当所有字段都有效的时候返回true。该方法使用validatebox(验证框)插件。 
	        // return false to prevent submit;  
	        return $(this).form("validate");
	    },    
	    success:function(data){//正常返回ServerResponse
	    	//alert(data);
	    	var data = eval('(' + data + ')');
	    	if(data.status == Util.SUCCESS) {
	    		$.messager.alert("系统提示", data.msg);
	    		$("#dialog").dialog("close");
	    		$("#datagrid").datagrid("reload");
	    	}
	    }    
	});  
}
/* 查找 */
function doSearch(){
	$("#datagrid").datagrid("load",{
		'name':$("#name").val(),
		'model':$("#model").val()
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
				"${ctx}/product/delete.action",
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
	url = "${ctx}/product/add.action";
	$('#form').form("clear");
	
}
/* 打开修改dialog */
function openUpdateDialog() {
	var selections = $("#datagrid").datagrid("getSelections");
	if(selections.length == 0) {
		$.messager.alert("系统提示", "请选择要删除的数据");
		return;
	}
	var row = selections[0];
	$("#dialog").dialog("open").dialog("setTitle","修改信息");
	url = "${ctx}/product/update.action";
	$('#form').form("load", row);
}

</script>
</head>
<body>
	<table id="datagrid"></table>
	
	<!-- toolbar 开始 -->
	<div id="toolbar">
		<div>
			<a class="easyui-linkbutton" href="javascript:openAddDialog()" iconCls="icon-add">添加</a>
			<a class="easyui-linkbutton" href="javascript:openUpdateDialog()" iconCls="icon-edit">修改</a>
			<a class="easyui-linkbutton" href="javascript:doDelete()" iconCls="icon-remove">删除</a>
		</div>
		<div>
			产品名：<input type="text" id="name" class="easyui-combobox"
					 data-options="
					 	url:'${ctx}/product/findProductName.action',
					 	valueField: 'name',
					 	textField: 'name',
					 	panelHeight:'auto',
					 	editable:false  "/>
		       型号：<input type="text" id="model"></input>
		  <a href="javascript:doSearch();" class="easyui-linkbutton" iconCls="icon-search">搜索</a>
		</div>
	</div>
	<!-- toolbar 结束 -->
	
	
	
	
	<!-- 添加和修改的dialog开始 -->
	<div id = "dialog" class="easyui-dialog" closed="true" style="width:650;height:280,padding: 10px 20px" buttons="#dialog-button">
		<form action="" id = "form" method="post">
			<input type="hidden" id="id" name="id"/>
			<table cellspacing="8px">
				<tr>
					<td>产品名：</td>
					<td><input type="text" id="name" name="name" class="easyui-validatebox"
					 data-options="
					 	url:'${ctx}/product/findProductName.action',
					 	valueField: 'name',
					 	textField: 'name',
					 	panelHeight:'auto' "/><font color="red">*</font></td>
					<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
					<td>型号：</td>
					<td><input type="text" id="model" name="model" class="easyui-validatebox" required="true"/><font color="red">*</font></td>
				</tr>
				<tr>
					<td>单位：</td>
					<td><input type="text" id="unit" name="unit" class="easyui-validatebox" required="true"/><font color="red">*</font></td>
					<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
					<td>价格：</td>
					<td><input type="text" id="price" name="price" class="easyui-validatebox" required="true" /><font color="red">*</font></td>
				</tr>
				<tr>
					<td>库存：</td>
					<td><input type="text" id="stock" name="stock" class="easyui-validatebox" required="true"/><font color="red">*</font></td>
					<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
					<td>备注：</td>
					<td><input type="text" id="remark" name="remark" class="easyui-validatebox" required="true"/><font color="red">*</font></td>
				</tr>
			</table>
		</form>
	</div>
	<!-- dialog-button 结束-->
</body>
</html>
