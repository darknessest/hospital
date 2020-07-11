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
	<title>订单管理</title>
	<jsp:include page="/part/manager.css.jsp"></jsp:include>
</head>
<body>
<div id="wrapper">
	<!--头部：页面标题栏-->
	<jsp:include page="/part/admin.header.jsp"></jsp:include>
	<!--导航栏：页面菜单栏-->
	<jsp:include page="/part/admin.menu.jsp"></jsp:include>
	<!--表格-->
	<div id="page-wrapper">
		<div id="page-inner">
			<div class="row">
				<div class="col-md-12">
					<!-- start dataTables -->
					<!-- 表格格式：面板中嵌套表格 -->
					<div class="panel panel-default">
						<!-- 面板头放：页面标题，刷新按钮，添加按钮 -->
						<div class="panel-heading">
							<font size="4">订单管理</font>
							<a href="<%=basePath%>showorder.do">
								<span class="glyphicon glyphicon-repeat"></span>
							</a>
						</div>
						<!-- 面板体放：表格内容，按照dataTable格式来构造-->
						<div class="panel-body">
							<div class="table-responsive">
								<table class="table table-striped table-bordered table-hover"
									   id="dataTables-example">
									<thead>
									<tr>
										<th>订单编号</th>
										<th>医生</th>
										<th>医院</th>
										<th>用户</th>
										<th>诊室</th>
										<th>订单状态</th>
										<th>预约日期</th>
										<th>价格</th>
									</tr>
									</thead>
									<tbody>
									<c:if test="${not empty list }">
										<c:forEach var="order" items="${list }">
											<tr>
												<td>${order.oId }</td>
												<td>${order.dName }</td>
												<td>${order.hName }</td>
												<td>${order.uName }</td>
												<td>${order.oRaddress }</td>
												<td>${order.oStatus }</td>
												<td>${order.oDate }</td>
												<td>${order.oPrice }</td>
<%--												<td><a id="dl" href="#" data-toggle="modal" data-target="#myModal" onclick="showDetail(${order.oid})">--%>
<%--													<span class="glyphicon glyphicon-list-alt"></span>--%>
<%--												</a></td>--%>
<%--												<td><a href="javascript:doDelete(${order.oid })" style="color:red">--%>
<%--													<span class="glyphicon glyphicon-remove"></span>--%>
<%--												</a></td>--%>
											</tr>
										</c:forEach>
									</c:if>
									</tbody>
								</table>
							</div>
						</div>
					</div>
					<!--End dataTables -->
					<!-- 按钮触发模态框 -->
					<!-- 模态框（Modal） myModal-->
					<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
						 aria-labelledby="myModalLabel" aria-hidden="true">
						<div class="modal-dialog">
							<div class="modal-content">
								<div class="modal-header">
									<button type="button" class="close" data-dismiss="modal"
											aria-hidden="true">×</button>
									<h4 class="modal-title">订单详情：</h4>
									<table class="table" style="font: '黑体';">
										<thead>
										<tr>
											<th>详单编号</th>
											<th>客户名称</th>
											<th>商品名称</th>
											<th>购买数量</th>
											<th>商品单价</th>
											<th>单笔总价</th>
										</tr>
										</thead>
										<tbody id="detail">
										<!-- 用Ajax获取的数据，来填充表格内容 -->
										</tbody>
									</table>
									<div class="modal-footer">
										<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
									</div>
								</div>
							</div>
						</div>
						<!-- /.modal-dialog -->
					</div>
					<!-- /.modal -->
				</div>
			</div>
		</div>
	</div>
</div>
<jsp:include page="/part/manager.js.jsp"></jsp:include>
</body>
<script type="text/javascript">
	function showDetail(oid){
		$.get("<%=basePath%>showdetail.do?oid="+oid,function(data){
			$("#detail").empty();
			//console.log(data);
			$.each(data, function() {
				$("#detail").append("<tr><td>"+this.did+"</td><td>"+this.cname+"</td><td>"+this.gname+"</td><td>"+this.count+"</td><td>"+this.price+"</td><td>"+this.amount+"</td><tr>")
			})
		});
	}

	function doDelete(oid){
		if(confirm("您确定要删除编号为："+oid+"的订单吗？")){
			location.href="<%=basePath%>removeorder.do?oid="+oid;
		}
	}
</script>
</html>