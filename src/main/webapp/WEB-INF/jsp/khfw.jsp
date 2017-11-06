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
$(function(){
	var myChart = echarts.init(document.getElementById('main'));
//异步加载数据
$.post('${ctx}/customer/findkhfw.action',
		function(result){
			if(result.status == Util.SUCCESS) {
				var xAxisData=new Array();
					var seriesData=new Array();
					var data = result.data;
		        	// 填入数据
					option = {
						    backgroundColor: '#2c343c',

						    title: {
						        text: '客户服务分析',
						        left: 'center',
						        top: 20,
						        textStyle: {
						            color: '#ccc'
						        }
						    },

						    tooltip : {
						        trigger: 'item',
						        formatter: "{a} <br/>{b} : {c} ({d}%)"
						    },

						    visualMap: {
						        show: false,
						        min: 80,
						        max: 600,
						        inRange: {
						            colorLightness: [0, 1]
						        }
						    },
						    series : [
						        {
						            name:'客户服务',
						            type:'pie',
						            radius : '55%',
						            center: ['50%', '50%'],
						            data:[
							                {value:data[0].num, name:data[0].serviceType},
							                {value:data[1].num, name:data[1].serviceType},
							                {value:data[2].num, name:data[2].serviceType},
						            ].sort(function (a, b) { return a.value - b.value; }),
						            roseType: 'radius',
						            label: {
						                normal: {
						                    textStyle: {
						                        color: 'rgba(255, 255, 255, 0.3)'
						                    }
						                }
						            },
						            labelLine: {
						                normal: {
						                    lineStyle: {
						                        color: 'rgba(255, 255, 255, 0.3)'
						                    },
						                    smooth: 0.2,
						                    length: 10,
						                    length2: 20
						                }
						            },
						            itemStyle: {
						                normal: {
						                    color: '#c23531',
						                    shadowBlur: 200,
						                    shadowColor: 'rgba(0, 0, 0, 0.5)'
						                }
						            },

						            animationType: 'scale',
						            animationEasing: 'elasticOut',
						            animationDelay: function (idx) {
						                return Math.random() * 200;
						            }
						        }
						    ]
						};
					myChart.setOption(option);
			} else {
				alert("查询失败");
			}
	        	
		},
		'json'
	);
})
</script>
</body>
</html>