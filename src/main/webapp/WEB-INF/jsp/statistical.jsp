<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";;
	String basePathManager = basePath + "manager/";
%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<meta content="" name="description" />
<meta content="webthemez" name="author" />
<title>统计信息</title>
<jsp:include page="/part/manager.css.jsp"></jsp:include>
</head>
<body>
	<div id="wrapper">
		<!--头部：页面标题栏-->
		<jsp:include page="/part/manager.header.jsp"></jsp:include>
		<!--导航栏：页面菜单栏-->
		<jsp:include page="/part/manager.menu.jsp"></jsp:include>
		<!--表格-->
		<div id="page-wrapper">
			<div id="page-inner">
				<div class="row">
					<div class="col-md-6">
						<div class="panel panel-default">
							<div class="panel-heading">品类销量柱状图</div>
							<div class="panel-body">
								<div id="quantitiy-bar-echarts" style="width: 700px; height: 350px"></div>
							</div>
						</div>
					</div>
					<div class="col-md-6">
						<div class="panel panel-default">
							<div class="panel-heading">品类销量环形图</div>
							<div class="panel-body">
								<div id="quantitiy-doughnut-echarts" style="width: 700px; height: 350px"></div>
							</div>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-md-6">
						<div class="panel panel-default">
							<div class="panel-heading">品类销售额柱状图</div>
							<div class="panel-body">
								<div id="total-bar-echarts" style="width: 700px; height: 350px"></div>
							</div>
						</div>
					</div>
					<div class="col-md-6">
						<div class="panel panel-default">
							<div class="panel-heading">品类销售额环形图</div>
							<div class="panel-body">
								<div id="total-doughnut-echarts" style="width: 700px; height: 350px"></div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<jsp:include page="/part/manager.js.jsp"></jsp:include>
</body>
<script type="text/javascript">
	//图表数据初始化
	var types = new Array();
	var nums = new Array();
	var amounts = new Array();
	var typeAndNums = new Array();
	var typeAndAmounts = new Array();
	
	//初始化图表对象
	var qbeChart = echarts.init(document.getElementById("quantitiy-bar-echarts"));
	var qdeChart = echarts.init(document.getElementById("quantitiy-doughnut-echarts"));
	var tbeChart = echarts.init(document.getElementById("total-bar-echarts"));
	var tdeChart = echarts.init(document.getElementById("total-doughnut-echarts"));
	
	//发起Ajax请求，获取图表数据
	$.get("<%=basePath%>showchart.do", function(data) {
		$.each(data,function(){
			types.push(this.type);
			nums.push(this.num);
			amounts.push(this.amount);
			typeAndNums.push({"value":this.num,"name":this.type});
			typeAndAmounts.push({"value":this.amount,"name":this.type});
		});
		//定义图表配置项
		var qbeOption = {
		    xAxis: {
		        type: 'category',
		        data: types
		    },
		    yAxis: {
		        type: 'value'
		    },
		    series: [{
		        data: nums,
		        type: 'bar'
		    }]
		};
		var tbeOption = {
		    xAxis: {
		        type: 'category',
		        data: types
		    },
		    yAxis: {
		        type: 'value'
		    },
		    series: [{
		        data: amounts,
		        type: 'bar'
		    }]
		};
		
		var qdeOption = {
		    tooltip: {
		        trigger: 'item',
		        formatter: '{a} <br/>{b}: {c} ({d}%)'
		    },
		    legend: {
		        orient: 'vertical',
		        left: 10,
		        data: types
		    },
		    series: [
		        {
		            name: '商品类型',
		            type: 'pie',
		            radius: ['50%', '70%'],
		            avoidLabelOverlap: false,
		            label: {
		                show: false,
		                position: 'center'
		            },
		            emphasis: {
		                label: {
		                    show: true,
		                    fontSize: '30',
		                    fontWeight: 'bold'
		                }
		            },
		            labelLine: {
		                show: false
		            },
		            data: typeAndNums
		        }
		    ]
		};
		
		var tdeOption = {
		    tooltip: {
		        trigger: 'item',
		        formatter: '{a} <br/>{b}: {c} ({d}%)'
		    },
		    legend: {
		        orient: 'vertical',
		        left: 10,
		        data: types
		    },
		    series: [
		        {
		            name: '商品类型',
		            type: 'pie',
		            radius: ['50%', '70%'],
		            avoidLabelOverlap: false,
		            label: {
		                show: false,
		                position: 'center'
		            },
		            emphasis: {
		                label: {
		                    show: true,
		                    fontSize: '30',
		                    fontWeight: 'bold'
		                }
		            },
		            labelLine: {
		                show: false
		            },
		            data: typeAndAmounts
		        }
		    ]
		};
		//将图表配置项设置入图表对象中
		qbeChart.setOption(qbeOption);
		qdeChart.setOption(qdeOption);
		tbeChart.setOption(tbeOption);
		tdeChart.setOption(tdeOption);
	});
	
	
	
</script>
</html>