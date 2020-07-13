<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
    ;
    String basePathManager = basePath + "manager/";
%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <meta content="" name="description"/>
    <meta content="webthemez" name="author"/>
    <title>User Page</title>
    <jsp:include page="/part/manager.css.jsp"></jsp:include>
</head>
<body>

<div id="wrapper">
    <!--头部：页面标题栏-->
    <jsp:include page="/part/user.header.jsp"></jsp:include>
    <!--导航栏：页面菜单栏-->
    <jsp:include page="/part/user.menu.jsp"></jsp:include>
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
                            <font size="4">用户管理</font>
                            <a href="<%=basePath%>user">
                                <span class="glyphicon glyphicon-repeat"></span>
                            </a>
                        </div>

                        <div class="panel-body">
                            <div class="table-responsive">
                                <table class="table table-striped table-bordered table-hover"
                                       id="dataTables-example">
                                    <thead>
                                    <tr>
                                        <th>id</th>
                                        <th>acc</th>
                                        <th>pass</th>
                                        <th>name</th>
                                        <th>age</th>
                                        <th>sex</th>
                                        <th>phone</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <tr>
                                        <td>${user.uId }</td>
                                        <td>${user.uAccount }</td>
                                        <td>${user.uPassword }</td>
                                        <td>${user.uName }</td>
                                        <td>${user.uAge }</td>
                                        <td>${user.uSex }</td>
                                        <td>${user.uPhone }</td>

                                        <td><a id="edit" href="#" data-toggle="modal" data-target="#myModal"
                                               onclick="editInfo(this)">
                                            <span class="glyphicon glyphicon-edit"></span>
                                        </a></td>

                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>


                    <div class="modal fade" id="myModal" tabindex="-1" role="dialog"
                         aria-labelledby="myModalLabel" aria-hidden="true">
                        <div class="modal-dialog">
                            <div class="modal-content">
                                <div class="modal-header">
                                    <button type="button" class="close" data-dismiss="modal"
                                            aria-hidden="true">×
                                    </button>
                                    <!-- 表单嵌套表格：规范表单格式 -->
                                    <form action="" method="post" role="form" id="editForm">
                                        <input type="hidden" id="uId" name="uId" class="form-control">
                                        <div class="form-group">
                                            <table class="table" style="font: '黑体';">
                                                <thead>
                                                <tr>
                                                    <th>用户信息：</th>
                                                    <th></th>
                                                </tr>
                                                </thead>
                                                <tbody>
                                                <tr>
                                                    <td><b>Phone：</b></td>
                                                    <td><input type="text" id="uPhone" name="uPhone"
                                                               maxlength="15" class="form-control"/></td>
                                                </tr>
                                                <tr>
                                                    <td><b>Password：</b></td>
                                                    <td><input type="text" id="uPassword" name="uPassword"
                                                               maxlength="20" class="form-control"/></td>
                                                </tr>
                                                </tbody>
                                            </table>
                                            <div class="modal-footer">
                                                <button type="button" class="btn btn-default" data-dismiss="modal">
                                                    关闭
                                                </button>
                                                <input type="submit" value="提交" class="btn btn-primary">
                                            </div>
                                        </div>
                                    </form>
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
<%--TODO: change toolbar--%>
<jsp:include page="/part/manager.js.jsp"></jsp:include>
</body>
<script type="text/javascript">
    function editInfo(obj) {
        $("#editForm").attr("action", "<%=basePath%>edit-user");
        var orderInfo = obj.parentNode.parentNode.childNodes;
        // console.log(orderInfo);
        $("#uId").val(orderInfo[1].innerHTML);
        $("#uPassword").val(orderInfo[5].innerHTML);
        $("#uPhone").val(orderInfo[13].innerText);
    }

</script>
</html>