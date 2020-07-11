<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
    ;
    String basePathManager = basePath + "user/";
%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <meta content="" name="description"/>
    <meta content="webthemez" name="author"/>
    <title>Edit User Info</title>
</head>
<body>

<div class="container">
    <div class="row">
        <div class="col-md-2"></div>
        <div class="col-md-8">
            <p></p>
            <form action="update-user" method="post" class="form-horizontal">
                <div class="form-group">
                    <label class="col-sm-2 control-label">password</label>
                    <div class="col-sm-10">
                        <input type="hidden" name="userPassword" value="${user.uPassword }">
                        <input type="text" name="userPassword" class="form-control" value="${user.uPassword }">
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">name</label>
                    <div class="col-sm-10">
                        <input type="hidden" name="userName" value="${user.uName }">
                        <input type="text" name="userName" class="form-control" value="${user.uName }">
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">age</label>
                    <div class="col-sm-10">
                        <input type="hidden" name="userName" value="${user.uAge }">
                        <input type="text" name="userName" class="form-control" value="${user.uAge }">
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">sex</label>
                    <div class="col-sm-10">
                        <input type="hidden" name="userName" value="${user.uSex }">
                        <input type="text" name="userName" class="form-control" value="${user.uSex }">
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">phone</label>
                    <div class="col-sm-10">
                        <input type="hidden" name="userName" value="${user.uPhone }">
                        <input type="text" name="userName" class="form-control" value="${user.uPhone }">
                    </div>
                </div>
                <%--                <div class="form-group">--%>
                <%--                    <label class="col-sm-2 control-label">产品描述</label>--%>
                <%--                    <div class="col-sm-10">--%>
                <%--                        <input type="text" name="productDesc" class="form-control" value="${user.uSex }">--%>
                <%--                    </div>--%>
                <%--                </div>--%>
                <%--                <div class="form-group">--%>
                <%--                    <label class="col-sm-2 control-label"> 产品价格</label>--%>
                <%--                    <div class="col-sm-10">--%>
                <%--                        <input type="text" name="productPrice" class="form-control" value="${user.uPassword }">--%>
                <%--                    </div>--%>
                <%--                </div>--%>
                <div class="col-sm-12 text-center">&nbsp;</div>
                <div class="col-sm-12 text-center">
                    <input type="submit" value="Save Changes" class="btn btn-default">
                </div>
            </form>
        </div>
        <div class="col-md-2"></div>
    </div>
</div>


</body>

</html>