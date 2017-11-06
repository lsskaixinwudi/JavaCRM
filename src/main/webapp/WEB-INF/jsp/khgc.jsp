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

<div id="main" style="width: 600px;height:400px;"></div>
<script type="text/javascript">
$(function() {
	 // 基于准备好的dom，初始化echarts实例
   var myChart = echarts.init(document.getElementById('main'));

   // 异步加载数据
   $.post('${ctx}/customer/findCustomerConstitute.action',
   		function(result){
   			if(result.status == Util.SUCCESS) {
   				var xAxisData=new Array();
					var seriesData=new Array();
					var data = result.data;
					for(var i=0;i<data.length;i++){
						xAxisData.push(data[i].customerLevel);
						console.log(data[i].customerLevel);
						seriesData.push(data[i].customerNum);
						console.log(data[i].customerNum);
					}
					console.log(xAxisData);
		        	// 填入数据
		            myChart.setOption({
		                title: {
		                    text: '客户构成分析'
		                },
		                tooltip: {},
		                legend: {
		                    data:['数量']
		                },
		                xAxis: {
		                    data: xAxisData
		                },
		                yAxis: {},
		                series: [{
		                    // 根据名字对应到相应的系列
		                    name: '数量',
		                    type: 'bar',
		                    data: seriesData
		                }]
		            });
   			} else {
   				alert("查询失败");
   			}
	        	
   		},
   		'json'
   	);
   
});

</script>
</body>
</html>