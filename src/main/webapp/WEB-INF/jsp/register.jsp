<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
<head>
    <base href="<%=basePath%>">

    <title>医院预约管理系统</title>

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

    <script type="text/javascript">
        var msg = '${msg}';
        if(msg!=""&&msg!=undefined){
            alert(msg);
        }

    </script>
</head>

<body>
<div id="login-page">
    <div class="container">

        <form class="form-login" action="register" method="post">
            <h2 class="form-login-heading">医院预约管理系统|用户注册</h2>
            <div class="login-wrap"><!-- required 必填， autofocus 光标锁定-->
                <input type="text" class="form-control" placeholder="请输入用户名" name="uaccount" required autofocus>
                <br>
                <input type="password" class="form-control" placeholder="请输入用户密码" name="upassword" required>
                <br>
                <input type="text" class="form-control" placeholder="请输入真实姓名" name="uname" required>
                <br>
                <input type="text" class="form-control" placeholder="请输入年龄" name="uage" required>
                <br>
                <input type="text" class="form-control" placeholder="请输入性别" name="usex" required>
                <br>
                <input type="phone" class="form-control" placeholder="请输入联系电话" name="uphone" required>
                <br>
                <button class="btn btn-theme btn-block" type="submit"><i class="fa fa-lock"></i>注册</button>
                <hr>

            </div>
        </form>
        <form class="form-login" action="tologin">
            <button  class="btn btn-theme btn-block">已有账号，去登陆</button>
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
    $.backstretch("images/img_bg_1.jpg", {speed: 0});
</script>


</body>
</html>
