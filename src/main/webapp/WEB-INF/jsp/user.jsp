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
    <title>User Page</title>
</head>
<body>

Hi, ${user.uName }. <br/>
Your info:<br/>
<table class="table table-striped">
    <tr>
        <th>id</th>
        <th>acc</th>
        <th>pass</th>
        <th>name</th>
        <th>age</th>
        <th>sex</th>
        <th>phone</th>
    </tr>
    <tr>
        <td>${user.uId }</td>
        <td>${user.uAccount }</td>
        <td>${user.uPassword }</td>
        <td>${user.uName }</td>
        <td>${user.uAge }</td>
        <td>${user.uSex }</td>
        <td>${user.uPhone }</td>
</table>

<%--<input type="submit" value="Edit Info" class="btn btn-default" href="/update-user?id=${user.uId}">--%>
<a href="/update-user?id=${user.uId}">Edit Info</a>


    <%--All Users: <br>--%>
    <%--<table class="table table-striped">--%>

    <%--    <tr>--%>
    <%--        <th>id</th>--%>
    <%--        <th>acc</th>--%>
    <%--        <th>pass</th>--%>
    <%--        <th>name</th>--%>
    <%--        <th>age</th>--%>
    <%--        <th>sex</th>--%>
    <%--        <th>phone</th>--%>
    <%--    </tr>--%>
    <%--    <c:forEach items="${users}" var="_user">--%>
    <%--        <tr>--%>
    <%--            <td>${_user.uId }</td>--%>
    <%--            <td>${_user.uAccount}</td>--%>
    <%--            <td>${_user.uPassword}</td>--%>
    <%--            <td>${_user.uName}</td>--%>
    <%--            <td>${_user.uAge }</td>--%>
    <%--            <td>${_user.uSex }</td>--%>
    <%--            <td>${_user.uPhone }</td>--%>
    <%--        </tr>--%>
    <%--    </c:forEach>--%>
    <%--</table>--%>


</body>

</html>