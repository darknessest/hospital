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
		<li><a href="<%=basePath %>showdoctors.hp">
		<i class="fa fa-desktop"></i>医生管理</a></li>
		<li><a href="<%=basePath %>showrooms.hp">
		<i class="fa fa-user"></i>诊室管理 </a></li>
		<li><a href="<%=basePath %>showorder.hp">
		<i class="fa fa-shopping-cart"></i>查看订单</a></li>
	</ul>
	</div>
	</nav>
	</body>
</html>
