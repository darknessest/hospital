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
			<li><a href="<%=basePath %>showorder.us">
				<i class="fa fa-credit-card"></i>订单管理</a></li>
			<li><a href="<%=basePath %>showdoctors.us">
				<i class="fa fa-credit-card"></i>预约医生</a></li>
			<li><a href="<%=basePath %>showinfo.us">
				<i class="fa fa-desktop"></i>个人信息</a></li>
		</ul>
	</div>
</nav>
</body>
</html>
