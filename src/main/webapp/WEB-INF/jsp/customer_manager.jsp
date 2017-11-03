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
			url:'${ctx}/customer/findAll.action',
			method:'get',
			fit:true,
			singleSelect:false,
			toolbar:'#toolbar',
			rownumbers:true,
			fitColumns:true,
			pagination:true,
			columns:[[    
			     {field:'cb',checkbox:true,align:'center'},    
			     {field:'num',title:'客户编号',width:80,align:'center'},    
			     {field:'name',title:'客户名称',width:100,align:'center'},    
			     {field:'managerName',title:'客户经理',width:80,align:'center'},    
			     {field:'level',title:'客户等级',width:80,align:'center'},    
			     {field:'phone',title:'联系电话',width:80,align:'center'},    
			     {field:'address',title:'客户地区',width:80,align:'center'},    
			     {field:'satisfy',title:'客户满意度',width:80,align:'center'},
			     {field:'credit',title:'客户信用度',width:80,align:'center'},
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
	
	/*添加或修改的dialog */
	function doSave() {
		$('#form').form('submit', {    
		    url:url,    
		    onSubmit: function(){    
		        // do some check    
		        /* if($("#saleChanceName").combobox("getValue") == "") {
		        	$.messager.alert("系统提示", "请选择用户角色");
		        	return false;
		        } */
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
	});
	/* 查找 */
	function doSearch(){
		$("#datagrid").datagrid("load",{
			'num':$("#num").val(),
			'name':$("#name").val(),
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
					"${ctx}/customer/delete.action",
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
		$('#form').form("clear");
		url = "${ctx}/customer/add.action";
		
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
		url = "${ctx}/customer/update.action";
		$('#form').form("load", row);
	}
	
	function openjwDialog() {
		var selections = $("#datagrid").datagrid("getSelections");
		if(selections.length == 0){
			 $.messager.alert("系统提示", "请选择交往管理的数据");
			 return;
	    	 }
		var row = selections[0];
		window.parent.openTab('客户交往记录管理','${ctx}/customerContact/index.action?customerId='+row.id,'icon-khkfjh');
		}
	
	function openlxDialog() {
		var selections = $("#datagrid").datagrid("getSelections");
		if(selections.length == 0){
			 $.messager.alert("系统提示", "请选择联系人");
			 return;
	    	 }
		var row = selections[0];
		window.parent.openTab('客户联系人管理','${ctx}/customerLinkman/index.action?customerId='+row.id,'icon-khkfjh');
		}
	
	function openlsDialog() {
		var selections = $("#datagrid").datagrid("getSelections");
		if(selections.length == 0){
			 $.messager.alert("系统提示", "请选择联系人");
			 return;
	    	 }
		var row = selections[0];
		window.parent.openTab('历史订单查看','${ctx}/customerOrder/index.action?customerId='+row.id,'icon-khkfjh');
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
			<a class="easyui-linkbutton" href="javascript:openlxDialog()" iconCls="icon-man">联系人管理</a>
			<a class="easyui-linkbutton" href="javascript:openjwDialog()" iconCls="icon-jwjl">交往记录管理</a>
			<a class="easyui-linkbutton" href="javascript:openlsDialog()" iconCls="icon-jwjl">历史订单查看</a>
		</div>
		<div>
			客户编号：	<input type="text" id="num"/>
			客户名称：		<input type="text" id="name"/>
		  <a href="javascript:doSearch();" class="easyui-linkbutton" iconCls="icon-search">搜索</a>
		</div>
	</div>
	<!-- toolbar结束 -->
	
	<!-- 添加和修改的dialog 开始 -->
	<div id="dialog" style="width:650;height:280,padding: 10px 20px">
		<form action="" id="form" method="post">
			<input type="hidden" id="id" name="id"/>
			<table cellspacing="8px">
		   		<tr>
		   			<td>客户名称：</td>
		   			<td><input type="text" id="name" name="name" class="easyui-validatebox" required="true"/>&nbsp;<font color="red">*</font></td>
		   			<td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
		   			<td>地区</td>
		   			<td><input type="text" id="region" name="region" class="easyui-validatebox" required="true"/>&nbsp;<font color="red">*</font></td>
		   		</tr>
		   		<tr>
		   			<td>客户经理：</td>
		   			<td><input class="easyui-combobox"  id="managerName" name="managerName" data-options="panelHeight:'auto',editable:false,valueField:'trueName',textField:'trueName',url:'${ctx}/user/getCustomerManagerList.action'" /></td>
		   			<td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
		   			<td>客户等级：</td>
		   			<td>
		   			<input class="easyui-combobox" id="level" name="level" data-options="panelHeight:'auto',editable:false,valueField:'dataDicValue',textField:'dataDicValue',url:'${ctx}/dataDic/getCustomerManagerList.action'" />
		   			    <!-- <select class="easyui-combobox" id="level" editable="false" panelHeight="auto" name="level" style="width:160">
							<option value="重点开发客户">重点开发客户</option>
							<option value="合作伙伴">合作伙伴</option>
							<option value="大客户">大客户</option>
							<option value="战略合作伙伴">战略合作伙伴</option>
							<option value="普通客户">普通客户</option>
						</select> -->
						<!-- <font color="red">*</font> -->
		   			</td>
		   		</tr>
		   		<tr>
		   			<td>客户满意度：</td>
		   			<td>
		   			    <select panelHeight="auto" class="easyui-combobox" id="satisfy" editable="false" name="satisfy" style="width:160">
							<option value="☆">☆</option>
							<option value="☆☆">☆☆</option>
							<option value="☆☆☆">☆☆☆</option>
							<option value="☆☆☆☆">☆☆☆☆</option>
							<option value="☆☆☆☆☆">☆☆☆☆☆</option>
						</select>
		   			</td>
		   			<td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
		   			<td>客户信用度：</td>
		   			<td>
		   			    <select panelHeight="auto" class="easyui-combobox" id="credit"  editable="false" name="credit" style="width:160">
							<option value="☆">☆</option>
							<option value="☆☆">☆☆</option>
							<option value="☆☆☆">☆☆☆</option>
							<option value="☆☆☆☆">☆☆☆☆</option>
							<option value="☆☆☆☆☆">☆☆☆☆☆</option>
						</select></td>
		   		</tr>
		   		<tr>
		   			<td>邮政编码：</td>
		   			<td><input type="text" id="postCode" name="postCode" /></td>
		   			<td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
		   			<td>联系电话：</td>
		   			<td><input type="text" id="phone" name="phone" /></td>
		   		</tr>
		   		<tr>
		   			<td>传真：</td>
		   			<td><input type="text" id="fax" name="fax" /></td>
		   			<td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
		   			<td>网址：</td>
		   			<td><input type="text" id="webSite" name="webSite" /></td>
		   		</tr>
		   		<tr>
		   			<td>客户地址：</td>
		   			<td><input type="text" id="address" name="address" class="easyui-validatebox" required="true"/>&nbsp;<font color="red">*</font></td>
		   			<td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
		   		</tr>
		   		<tr>
		   			<td>营业执照注册号：</td>
		   			<td><input type="text" id="licenceNo" name="licenceNo"/></td>
		   			<td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
		   			<td>法人：</td>
		   			<td><input type="text" id="legalPerson" name="legalPerson"/></td>
		   		</tr>
		   		<tr>
		   			<td>注册资金（万元）：</td>
		   			<td><input type="text" id="bankroll" name="bankroll"/></td>
		   			<td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
		   			<td>年营业额（万元）：</td>
		   			<td><input type="text" id="turnover" name="turnover"/></td>
		   		</tr>
		   		<tr>
		   			<td>开户银行：</td>
		   			<td><input type="text" id="bankName" name="bankName"/></td>
		   			<td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
		   			<td>开户账号：</td>
		   			<td><input type="text" id="bankAccount" name="bankAccount"/></td>
		   		</tr>
		   		<tr>
		   			<td>地税登记号：</td>
		   			<td><input type="text" id="localTaxNo" name="localTaxNo"/></td>
		   			<td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
		   			<td>国税登记号：</td>
		   			<td><input type="text" id="nationalTaxNo" name="nationalTaxNo"/></td>
		   		</tr>
		   	</table>
		</form>
	</div>
	<!-- 添加和修改的dialog 结束 -->


</body>
</html>