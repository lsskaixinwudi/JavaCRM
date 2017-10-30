<%@page import="com.situ.crm.pojo.User"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1 , user-scalable=no">
<title></title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/lib/bootstrap-3.3.7-dist/css/bootstrap.css" />
<script type="text/javascript"	charset="utf-8"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/lib/jquery/jquery-1.11.1.js"></script>
<script src="${pageContext.request.contextPath}/resources/lib/bootstrap-3.3.7-dist/js/bootstrap.js"	type="text/javascript" charset="utf-8"></script>
<script type="text/javascript">
    
</script>
<style> 
#main {position: absolute;width:400px;height:200px;left:50%;top:50%; 
margin-left:-200px;margin-top:-100px;border:1px} 
/*css注释：为了方便截图，对CSS代码进行换行*/ 
</style> 
	</head>
<body>
		<div id="main" class="container">
		    <div class="row">
		        <div class="col-md-10">
		            
		            <!-- 学生添加表单  begin -->
		            <form id="form-add" action="${ctx}/user/login.action" enctype="multipart/form-data" method="post">
	                    <div class="form-group">
	                        <label for="addname">用户名</label>
	                        <input type="text" name="name" id="name" class="form-control" placeholder="请输入用户名">
	                    </div>
	                    <div class="form-group">
	                        <label for="addpassword">密码</label>
	                        <input type="text" name="password" id="password" class="form-control" placeholder="请输入密码">
	                    </div>
	                   
	                    
					  
					  	<input class="btn btn-success btn-lg" type="submit" value="登录"/>
					</form>
		            <!-- 学生添加表单  end -->
		            
		        </div>
		    </div>
		</div>
		
		
	</body>

</html>