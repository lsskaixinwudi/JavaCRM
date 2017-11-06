<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@include file="../common/head.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script type="text/javascript">
function closeDialog(){
	$('#form').form("clear");
}

function doSave(){
	$('#form').form('submit', {    
	    url:'${ctx}/customerService/add.action',    
	    onSubmit: function(){  
	        //validate none 做表单字段验证，当所有字段都有效的时候返回true。该方法使用validatebox(验证框)插件。 
	        // return false to prevent submit;  
	        return $(this).form("validate");
	    },    
	    success:function(data){//正常返回ServerResponse		    	
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
	<!-- 服务创建面板  开始 -->
	<div id="p" class="easyui-panel" title="客户服务创建" style="width: 700px;height: 350px;padding: 10px;margin-bottom: 10px">
		 <form id="form" action="">
		 	<table cellspacing="8px">
		   		<tr>
		   			<td>服务类型：</td>
		   			<td>
		   			<select panelHeight="auto" class="easyui-combobox" id="serviceType" editable="false" name="serviceType" style="width:160">
							<option></option>
							<option value="咨询">咨询</option>
							<option value="建议">建议</option>
							<option value="投诉">投诉</option>
						</select>
		   			<td>
		   			<td>客户：</td>
		   			<td><input type="text" id="customerId" name="customer" /></td>
		   		</tr>
		   		<tr>
		   			<td>概要：</td>
		   			<td colspan="4">
		   				<textarea rows="5" cols="50" id="overviewId" name="overview"></textarea>
		   			</td>
		   		</tr>
		   		<tr>
		   			<td>服务请求：</td>
		   			<td colspan="4">
		   				<textarea rows="5" cols="50" id="serviceRequestId" name="serviceRequest" ></textarea>
		   			</td>
		   		</tr>	   		
		   		<tr>
		   			<td>创建人：</td>
		   			<td><input type="text"  value="${user.name}" id="createPeople" name="createPeople" /></td>
		   			<td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
		   			<td>创建时间：</td>
		   			<td><input type="text" id="createTimeId" name="createTime" class="easyui-datetimebox"/></td>
		   		</tr>
		   	</table>
		 </form>	  	
	 </div>
	 <div id="dialog-button">
		<a href="javascript:doSave()" class="easyui-linkbutton" iconCls="icon-ok">保存</a>
		<a href="javascript:closeDialog()" class="easyui-linkbutton" iconCls="icon-cancel">重置</a>
	</div>
	 <!-- 服务创建  结束  -->
</html>
