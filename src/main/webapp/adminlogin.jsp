<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
<head>
    <base href="<%=basePath%>">

    <title>医院预约后台管理系统</title>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="Dashboard">
    <meta name="keyword" content="Dashboard, Bootstrap, Admin, Template, Theme, Responsive, Fluid, Retina">

    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.css" rel="stylesheet">
    <!--external css-->
    <link href="css/font-awesome.css" rel="stylesheet" />

    <!-- Custom styles for this template -->
    <link href="css/style.css" rel="stylesheet">
    <link rel="shortcut icon" href="favicon.ico" type="image/x-icon" />
    <!-- Copy Head from index.jsp-->
    <link rel="stylesheet" type="text/css" href="styles/bootstrap4/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="styles/login_head_styles.css">

    <script type="text/javascript">
        var msg = '${msg}';
        if(msg!=""&&msg!=undefined){
            alert(msg);
        }

    </script>
</head>

<body>


<header class="header trans_200">
    <!-- Header Content -->
    <div class="header_container">
        <div class="container">
            <div class="row">
                <div class="col">
                    <div class="header_content d-flex flex-row align-items-center justify-content-start">
                        <nav class="main_nav ml-auto">
                            <ul>
                                <li><a href="index.jsp">Home</a></li>
                                <li><a href="index.jsp">About us</a></li>
                                <li><a href="userlogin.jsp">用户登录</a></li>
                                <li><a href="hospitallogin.jsp">医院登录</a></li>
                                <li><a href="adminlogin.jsp">管理员登录</a></li>
                                <li><a href="register.jsp">用户注册</a></li>
                            </ul>
                        </nav>
                        <div class="hamburger ml-auto"><i class="fa fa-bars" aria-hidden="true"></i></div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- Logo -->
    <div class="logo_container_outer">
        <div class="container">
            <div class="row">
                <div class="col">
                    <div class="logo_container">
                        <a href="#">
                            <div class="logo_content d-flex flex-column align-items-start justify-content-center">
                                <div class="logo_line"></div>
                                <div class="logo d-flex flex-row align-items-center justify-content-center">
                                    <div class="logo_text">医院<span>预约</span></div>
                                    <div class="logo_box">+</div>
                                </div>
                                <div class="logo_sub">Health Care Center</div>
                            </div>
                        </a>
                    </div>
                </div>
            </div>
        </div>
    </div>
</header>
<div id="login-page">
    <br><br>
    <div class="container">
        <form class="form-login" action="adminlogin" method="post">
            <h2 class="form-login-heading">医院预约后台管理系统</h2>
            <div class="login-wrap"><!-- required 必填， autofocus 光标锁定-->
                <input type="text" class="form-control" placeholder="请输入管理员名" name="aAccount" required autofocus>
                <br>
                <input type="password" class="form-control" placeholder="请输入管理员密码" name="aPassword" required>
                <br>
                <button class="btn btn-theme btn-block" type="submit"><i class="fa fa-lock"></i>登录</button>
                <hr>
            </div>
        </form>

    </div>
</div>

<!-- js placed at the end of the document so the pages load faster -->
<script src="js/jquery-1.10.2.js"></script>
<script src="js/bootstrap.min.js"></script>

<!--BACKSTRETCH-->
<!-- You can use an image of whatever size. This script will stretch to fit in any screen size.-->
<script type="text/javascript" src="js/jquery.backstretch.min.js"></script>
<script type="text/javascript">
    $.backstretch("images/home_background_11.jpg", {speed: 500});
</script>


</body>
</html>
