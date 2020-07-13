<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

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
    <jsp:include page="/part/hospital.css.jsp"></jsp:include>
</head>
<body>
<div id="wrapper">
    <!--头部：页面标题栏-->
    <jsp:include page="/part/hospital.header.jsp"></jsp:include>
    <!--导航栏：页面菜单栏-->
    <jsp:include page="/part/hospital.menu.jsp"></jsp:include>
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
                            <font size="4">查看订单</font>
                            <a href="<%=basePath%>showorder.hp">
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
                                                <td>${order.o_id }</td>
                                                <td>${order.d_name }</td>
                                                <td>${order.h_name }</td>
                                                <td>${order.u_name }</td>
                                                <td>${order.o_raddress }</td>
                                                <td>
                                                    <c:if test="${order.o_status==1 }">未支付</c:if>
                                                    <c:if test="${order.o_status==2 }">已支付</c:if>
                                                    <c:if test="${order.o_status==3 }">已完成</c:if>
                                                    <c:if test="${order.o_status!=1&&order.o_status!=2&&order.o_status!=3 }">
                                                        <span style="color: red">异常</span>
                                                    </c:if>
                                                </td>
                                                <td><fmt:formatDate value="${order.o_date }" pattern="yyyy-MM-dd"/></td>
                                                <td>${order.o_price }</td>
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
                                    <!-- 表单嵌套表格：规范表单格式 -->
                                    <form action="" method="post" role="form" id="editForm">
                                        <input type="hidden" id="oId" name="oId" class="form-control">
                                        <div class="form-group">
                                            <table class="table" style="font: '黑体';">
                                                <thead>
                                                <tr>
                                                    <th>订单信息：</th>
                                                    <th></th>
                                                </tr>
                                                </thead>
                                                <tbody>
                                                <tr>
                                                    <td><b>订单状态：</b></td>
                                                    <td><select id="oStatus" name="oStatus" class="form-control">
                                                        <option>未支付</option>
                                                        <option>已支付</option>
                                                        <option>已完成</option>
                                                    </select>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td><b>价格：</b></td>
                                                    <td><input type="number" id="oPrice" name="oPrice" step="0.01"
                                                               maxlength="10" class="form-control"/></td>
                                                </tr>
                                                </tbody>
                                            </table>
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
<jsp:include page="/part/manager.js.jsp"></jsp:include>
</body>
</html>