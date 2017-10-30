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
		url:'${ctx}/datadic/findAll.action',
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
		     {field:'dataDicName',title:'数据字典名',width:100,align:'center'},    
		     {field:'dataDicValue',title:'数据字典值',width:80,align:'center'},    
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
	        if($("#dataDicName").combobox("getValue") == "") {
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
		'dataDicName':$("#dataDicName").val(),
		'dataDicValue':$("#dataDicValue").val()
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
				"${ctx}/datadic/delete.action",
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
	url = "${ctx}/datadic/add.action";
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
	url = "${ctx}/datadic/update.action";
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
			数据字典名：<input type="text" id="dataDicName" class="easyui-combobox"
					 data-options="
					 	url:'${ctx}/datadic/findDataDicName.action',
					 	valueField: 'dataDicName',
					 	textField: 'dataDicName',
					 	panelHeight:'auto',
					 	editable:false  "/>
		       数据字典值：<input type="text" id="dataDicValue"></input>
		  <a href="javascript:doSearch();" class="easyui-linkbutton" iconCls="icon-search">搜索</a>
		</div>
	</div>
	<!-- toolbar 结束 -->
	
	<!-- 添加和修改的dialog 开始 -->
	<div id="dialog" style="width:650;height:280,padding: 10px 20px">
		<form action="" id="form" method="post">
			<input type="hidden" id="id" name="id"/>
			<table cellspacing="8px">
				<tr>
					<td>数据字典名：</td>
					<td><input type="text" id="dataDicName" name="dataDicName" class="easyui-combobox"
					 data-options="
					 	url:'${ctx}/datadic/findDataDicName.action',
					 	valueField: 'dataDicName',
					 	textField: 'dataDicName',
					 	panelHeight:'auto' "/><font color="red">*</font></td>
					<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
					<td>数据字典值：</td>
					<td><input type="text" id="dataDicValue" name="dataDicValue" class="easyui-validatebox" required="true"/><font color="red">*</font></td>
				</tr>
			</table>
		</form>
	</div>
	<!-- dialog-button 结束-->
</body>
</html>
