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
			url:'${ctx}/customerService/findAll2.action',
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
				{field:'serviceType',title:'服务类型',width:100,align:'center'},    
				{field:'overview',title:'概要',width:80,align:'center'},    
				{field:'customer',title:'客户',width:80,align:'center'},    
			/* 	{field:'status',title:'状态',width:100,align:'center'},  */   
				{field:'createPeople',title:'创建人',width:100,align:'center'}, 
				{field:'createTime',title:'创建日期',width:80,align:'center'},
				{field:'assigner',title:'分配人',width:100,align:'center'}, 
				{field:'assignTime',title:'分配日期',width:80,align:'center'} 
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
	
	//如果分配指派人，指派时间为当前时间
	$(function(){
		$("#serviceDealPeople").combobox({
			onSelect:function(record){
				if(record.trueName!=''){
					$("#serviceDealTime").val(Util.getCurrentDateTime());
				}else{
					$("#serviceDealTime").val("");
				}
			}
		}); 
	 });
	});
	
	/*添加或修改的dialog */
	function doSave() {
		$('#form').form('submit', {    
		    url:url,    
		    onSubmit: function(){    
		        // do some check    
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
			'customer':$("#customer").val(),
			'status':$("#status").val()
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
					"${ctx}/customerService/delete.action",
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
		url = "${ctx}/customerService/add.action";
		$('#form').form("clear");
		
	}
	/* 打开修改dialog */
	function openUpdateDialog() {
		var selections = $("#datagrid").datagrid("getSelections");
		if(selections.length == 0) {
			$.messager.alert("系统提示", "请选择要查看的数据");
			return;
		}
		var row = selections[0];
		$("#dialog").dialog("open").dialog("setTitle","处理客户服务");
		url = "${ctx}/customerService/update.action";
		$('#form').form("load", row);
	}
	
</script>
</head>
<body>
	<table id="datagrid"></table>
	
	<!-- toolbar 开始 -->
	<div id="toolbar">
<!-- 		<a class="easyui-linkbutton" href="javascript:openAddDialog()" iconCls="icon-add">添加</a> -->
		<a class="easyui-linkbutton" href="javascript:openUpdateDialog()" iconCls="icon-item">处理</a>
	<!-- 	<a class="easyui-linkbutton" href="javascript:doDelete()" iconCls="icon-remove">删除</a> -->
		&nbsp;&nbsp;&nbsp;&nbsp;
		
	<!-- toolbar 结束 -->
	
	<!-- 添加和修改的dialog 开始 -->
	<div id="dialog" style="width:650;height:280,padding: 10px 20px">
		<form action="" id="form" method="post">
			<input type="hidden" id="id" name="id"/>
			<table cellspacing="8px">
				
				<tr>
		   			<td>服务类型</td>
		   			<td><input type="text" id="serviceType" name="serviceType" class="easyui-validatebox" readonly="readonly" required="true"/>&nbsp;<font color="red">*</font></td>
		   			<td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
		   			<td>客户：</td>
		   			<td><input readonly="readonly" type="text" id="customer" name="customer" /></td>
		   		</tr>
		   		<tr>
		   			<td>概要：</td>
		   			<td colspan="4"><input readonly="readonly" type="text" id="overview" name="overview" style="width: 420px"/></td>
		   		</tr>
		   		<tr>
		   			<td>服务请求：</td>
		   			<td colspan="4">
		   				<textarea rows="5" cols="50" readonly="readonly" id="serviceRequest" name="serviceRequest"></textarea>
		   			</td>
		   		</tr>
		   		<tr>
		   			<td>创建人：</td>
		   			<td><input type="text" editable="false" readonly="readonly" id="createPeople" name="createPeople" class="easyui-validatebox" required="true"/>&nbsp;<font color="red">*</font></td>
		   			<td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
		   			<td>创建时间：</td>
		   			<td><input type="text" readonly="true" id="createTime" readonly="readonly" name="createTime"/>&nbsp;<font color="red">*</font></td>
		   		</tr>
		   		<tr>
		   			<td>指派给：</td>
		   			<td><input type="text" id="assigner"  name="assigner" readonly="readonly" /></td>
		   			<td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
		   			<td>指派时间：</td>
		   			<td><input type="text" id="assignTime" name="assignTime" readonly="readonly"/></td>
		   		</tr>
		   		<tr>
		   			<td>服务处理：</td>
		   			<td colspan="4">
		   				<textarea rows="5" cols="50" id="serviceDeal" name="serviceDeal" class="easyui-validatebox" required="true" ></textarea>
		   			</td>
		   		</tr>
		   		<tr>
		   			<td>处理人：</td>
		   			<td><input  class="easyui-combobox" id="serviceDealPeople"  name="serviceDealPeople"  data-options="panelHeight:'auto',editable:false,valueField:'trueName',textField:'trueName',url:'${ctx}/user/getCustomerManagerList.action'"/></td>
		   			<td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
		   			<td>处理时间：</td>
		   			<td><input type="text" readonly="true" id="serviceDealTime" name="serviceDealTime" readonly="readonly"/>&nbsp;<font color="red">*</font></td>
		   		</tr>
				
			</table>
		</form>
	</div>
	<!-- 添加和修改的dialog 结束 --></body>
</html>
