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
			url:'${ctx}/customerLoss/findAll.action',//只查询已分配咨询师的
			method:'get',
			fit:true,
			singleSelect:false,
			toolbar:'#toolbar',
			rownumbers:true,
			fitColumns:true,
			pagination:true,
			columns:[[    
			     {field:'cb',checkbox:true,align:'center'},    
			     {field:'customerNo',title:'客户编号',width:100,align:'center'},    
			     {field:'customerName',title:'客户名称',width:80,align:'center'},    
			     {field:'customerManager',title:'客户经理',width:80,align:'center'},    
			     {field:'lastOrderTime',title:'上次下单日期',width:80,align:'center'},    
			     {field:'confirmLossTime',title:'确认流失日期',width:100,align:'center'},    
			     {field:'status',title:'客户状态',width:80,align:'center',formatter:function(value,row,index){
			    	 //客户开发状态 0 未开发 1 开发中 2 开发成功 3 开发失败
			    	 if(value==0){
			    		 return "暂缓流失";
			    	 }else if(value==1){
			    		 return "确认流失";
			    	 }
			     }},       
			     {field:'lossReason',title:'流失原因',width:100,align:'center'},    
			     {field:'a',title:'操作',width:80,align:'center',formatter:function(value,row,index){
			    	 if(row.status==0){
			    		 return "<a href='javascript:openCustomerLossMeasureTab("+row.id+")'>暂缓流失</a>";
			    	 }else{
			    		 return "客户确认流失";
			    	 }
			     }},    
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
		$("#assignMan").combobox({
			onSelect:function(record){
				if(record.trueName!=''){
					$("#assignTime").val(Util.getCurrentDateTime());
				}else{
					$("#assignTime").val("");
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
	/* 查找 */
	function doSearch(){
		$("#datagrid").datagrid("load",{
			'customerName':$("#s_customerName").val(),
			'customerManager':$("#s_customerManager").val(),
			'status':$("#s_status").val(),
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
					"${ctx}/saleChance/delete.action",
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
		$("#createMan").val("Gao");
		$("#createTime").val(Util.getCurrentDateTime());
		url = "${ctx}/saleChance/add.action";
		
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
		url = "${ctx}/saleChance/update.action";
		$('#form').form("load", row);
	}
	
	function formatStatus(val,row){
		 if(val==1){
			 return "已分配";
		 }else{
			 return "未分配";
		 }
	 }
	
	//可以修改添加开发项
	function openCustomerLossMeasureTab(id){
		window.parent.openTab('客户流失基本信息','${ctx}/customerLoss/customerLosss.action?id='+id,'icon-khkfjh');
	}
</script>
</head>
<body>
	<table id="datagrid"></table>
	
	<!-- toolbar 开始 -->
	<div id="toolbar">
		<!-- <div>
			<a class="easyui-linkbutton" href="javascript:openAddDialog()" iconCls="icon-add">添加</a>
			<a class="easyui-linkbutton" href="javascript:openUpdateDialog()" iconCls="icon-edit">修改</a>
			<a class="easyui-linkbutton" href="javascript:doDelete()" iconCls="icon-remove">删除</a>
		</div> -->
		<div>
		       客户名称：<input type="text" id="s_customerName"/>
		       客户状态：<select type="text" id="s_status" class="easyui-combobox"
		     		panelHeight="auto" editable="false">
		     		<option value="">请选择...</option>	
 					<option value="0">暂缓流失</option>
 					<option value="1">确认流失</option>	
		     	</select>
		  <a href="javascript:doSearch();" class="easyui-linkbutton" iconCls="icon-search">搜索</a>
		</div>
	</div>
	<!-- toolbar 结束 -->
	
</body>
</html>