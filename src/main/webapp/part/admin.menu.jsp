<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
	<body>
	<!--导航栏class="active-menu-->
	<nav class="navbar-default navbar-side" role="navigation">
	<div class="sidebar-collapse">
	<ul class="nav" id="main-menu">
<%--		<li><a href="<%=basePath %>statistical.do">--%>
<%--		<i class="fa fa-desktop"></i>统计信息</a></li>--%>
		<li><a href="<%=basePath %>showuser.ad">
		<i class="fa fa-user"></i>用户管理 </a></li>
		<li><a href="<%=basePath %>showhospital.ad">
		<i class="fa fa-plus-square"></i>医院管理</a></li>
		<li><a href="<%=basePath %>showorder.ad">
		<i class="fa fa-align-justify"></i>订单管理</a></li>
	</ul>
	</div>
	</nav>
	</body>
</html>
