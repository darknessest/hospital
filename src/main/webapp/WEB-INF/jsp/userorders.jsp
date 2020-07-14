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
    <title>订单管理</title>
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
    <jsp:include page="/part/manager.css.jsp"></jsp:include>
<%--    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>--%>
<%--    &lt;%&ndash;    <jsp:include page="/js/jquery-1.10.2.js"></jsp:include>&ndash;%&gt;--%>
<%--    <script type="text/javascript">--%>
<%--        function doAjax() {--%>
<%--            $.ajax({--%>
<%--                type: "post",--%>
<%--                url: "helloWorld", //this is my servlet--%>
<%--                success: function(msg){--%>
<%--                    console.log("success")--%>
<%--                    $('#output').append(msg);--%>
<%--                },--%>
<%--                fail: function () {--%>
<%--                    console.log("suck")--%>
<%--                }--%>
<%--            });--%>

<%--        }--%>
<%--    </script>--%>
</head>
<%--<style>--%>
<%--    .modal-confirm {--%>
<%--        color: #636363;--%>
<%--        width: 400px;--%>
<%--    }--%>

<%--    .modal-confirm .modal-content {--%>
<%--        padding: 20px;--%>
<%--        border-radius: 5px;--%>
<%--        border: none;--%>
<%--        text-align: center;--%>
<%--        font-size: 14px;--%>
<%--    }--%>

<%--    .modal-confirm .modal-header {--%>
<%--        border-bottom: none;--%>
<%--        position: relative;--%>
<%--    }--%>

<%--    .modal-confirm h4 {--%>
<%--        text-align: center;--%>
<%--        font-size: 26px;--%>
<%--        margin: 30px 0 -10px;--%>
<%--    }--%>

<%--    .modal-confirm .close {--%>
<%--        position: absolute;--%>
<%--        top: -5px;--%>
<%--        right: -2px;--%>
<%--    }--%>

<%--    .modal-confirm .modal-body {--%>
<%--        color: #999;--%>
<%--    }--%>

<%--    .modal-confirm .modal-footer {--%>
<%--        border: none;--%>
<%--        text-align: center;--%>
<%--        border-radius: 5px;--%>
<%--        font-size: 13px;--%>
<%--        padding: 10px 15px 25px;--%>
<%--    }--%>

<%--    .modal-confirm .modal-footer a {--%>
<%--        color: #999;--%>
<%--    }--%>

<%--    .modal-confirm .icon-box {--%>
<%--        width: 80px;--%>
<%--        height: 80px;--%>
<%--        margin: 0 auto;--%>
<%--        border-radius: 50%;--%>
<%--        z-index: 9;--%>
<%--        text-align: center;--%>
<%--        border: 3px solid #f15e5e;--%>
<%--    }--%>

<%--    .modal-confirm .icon-box i {--%>
<%--        color: #f15e5e;--%>
<%--        font-size: 46px;--%>
<%--        display: inline-block;--%>
<%--        margin-top: 13px;--%>
<%--    }--%>

<%--    .modal-confirm .btn, .modal-confirm .btn:active {--%>
<%--        color: #fff;--%>
<%--        border-radius: 4px;--%>
<%--        background: #60c7c1;--%>
<%--        text-decoration: none;--%>
<%--        transition: all 0.4s;--%>
<%--        line-height: normal;--%>
<%--        min-width: 120px;--%>
<%--        border: none;--%>
<%--        min-height: 40px;--%>
<%--        border-radius: 3px;--%>
<%--        margin: 0 5px;--%>
<%--    }--%>

<%--    .modal-confirm .btn-secondary {--%>
<%--        background: #c1c1c1;--%>
<%--    }--%>

<%--    .modal-confirm .btn-secondary:hover, .modal-confirm .btn-secondary:focus {--%>
<%--        background: #a8a8a8;--%>
<%--    }--%>

<%--    .modal-confirm .btn-danger {--%>
<%--        background: #f15e5e;--%>
<%--    }--%>

<%--    .modal-confirm .btn-danger:hover, .modal-confirm .btn-danger:focus {--%>
<%--        background: #ee3535;--%>
<%--    }--%>

<%--    .trigger-btn {--%>
<%--        display: inline-block;--%>
<%--        margin: 100px auto;--%>
<%--    }--%>
<%--</style>--%>
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
                            <font size="4">${name}的订单</font>
                            <a href="<%=basePath%>user-orders">
                                <span class="glyphicon glyphicon-repeat"></span>
                            </a>
<%--                            <a href="<%=basePath%>create-new-order" style="position: relative; left: 7em"--%>
<%--                               data-toggle="modal" data-target="#modalNewOrder" onclick="doAjax()">--%>
<%--                                新订单--%>
<%--                                <span class="glyphicon glyphicon-plus"></span>--%>
<%--                            </a>--%>
                        </div>
                        <!-- 面板体放：表格内容，按照dataTable格式来构造-->
                        <div class="panel-body">
                            <div class="table-responsive">
                                <table class="table table-striped table-bordered table-hover"
                                       id="dataTables-example">
                                    <thead>
                                    <tr>
                                        <th>预约日期</th>
                                        <th>订单编号</th>
                                        <th>医生</th>
                                        <th>医院</th>
                                        <th>诊室</th>
                                        <th>订单状态</th>
                                        <th>价格</th>
                                        <th>支付</th>
                                        <th>取消订单</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <c:if test="${not empty list }">
                                        <c:forEach var="order" items="${list }">
                                            <tr>
                                                <td><fmt:formatDate value="${order.o_date }" pattern="yyyy-MM-dd"/></td>
                                                <td>${order.o_id }</td>
                                                <td>${order.d_name }</td>
                                                <td>${order.h_name }</td>
                                                <td>${order.o_raddress }</td>
                                                <td>
                                                    <c:if test="${order.o_status==1 }">未支付</c:if>
                                                    <c:if test="${order.o_status==2 }">已支付</c:if>
                                                    <c:if test="${order.o_status==3 }">已完成</c:if>
                                                    <c:if test="${order.o_status!=1&&order.o_status!=2&&order.o_status!=3 }">
                                                        <span style="color: red">异常</span>
                                                    </c:if>
                                                </td>

                                                <td>${order.o_price }</td>
                                                <td><a id="pay" onclick="getPaymentLink(${order.o_id})">
                                                    <span class="glyphicon glyphicon-credit-card"></span>
                                                </a></td>
                                                <td><c:if test="${order.o_status==1 }"><a id="cancel" href="#"
                                                                                          onclick="doDelete(${order.o_id})">
                                                    <span class="glyphicon glyphicon-remove"></span>
                                                </a></c:if>
                                                </td>
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
                    <div class="modal fade" id="modalPay" tabindex="-1" role="dialog"
                         aria-labelledby="myModalLabel" aria-hidden="true">
                        <div class="modal-dialog">
                            <div class="modal-content">
                                <div class="modal-header">
                                    <button type="button" class="close" data-dismiss="modal"
                                            aria-hidden="true">×
                                    </button>
                                    <!-- 表单嵌套表格：规范表单格式 -->
                                    <form action="" method="post" role="form" id="getPaymentLink">
                                        <input type="hidden" id="oId2" name="oId2" class="form-control">
                                        <div class="form-group">
                                            LINK FOR PAYMENT
                                            <br/>

                                            <div class="modal-footer">
                                                <button type="button" class="btn btn-default" data-dismiss="modal">关闭
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

                    <div class="modal fade" id="modalCancel" tabindex="-1" role="dialog"
                         aria-labelledby="modalCancel" aria-hidden="true">
                        <div class="modal-dialog">
                            <div class="modal-content">
                                <div class="modal-header">
                                    <button type="button" class="close" data-dismiss="modal"
                                            aria-hidden="true">×
                                    </button>
                                    <!-- 表单嵌套表格：规范表单格式 -->
                                    <form action="" method="post" role="form" id="cancelForm">
                                        <input type="hidden" id="oIdDelete" name="oIdDelete" class="form-control">
                                        <div class="form-group">

                                            <div class="modal-footer">
                                                <button type="button" class="btn btn-default" data-dismiss="modal">
                                                    关闭
                                                </button>
                                                <input type="submit" value="提交"
                                                       class="btn btn-primary">
                                            </div>

                                        </div>
                                    </form>
                                </div>
                            </div>
                        </div>
                        <!-- /.modal-dialog -->
                    </div>
                    <!-- /.modal -->
                    <%--                    <div id="modalCancel" class="modal fade">--%>
                    <%--                        <div class="modal-dialog modal-confirm">--%>
                    <%--                            <div class="modal-content">--%>

                    <%--                                <div class="modal-header flex-column">--%>
                    <%--                                    <div class="icon-box">--%>
                    <%--                                        <i class="material-icons">&#xE5CD;</i>--%>
                    <%--                                    </div>--%>
                    <%--                                    <h4 class="modal-title w-100">Are you sure?</h4>--%>
                    <%--                                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">--%>
                    <%--                                        &times;--%>
                    <%--                                    </button>--%>
                    <%--                                </div>--%>
                    <%--                                <div class="modal-body">--%>
                    <%--                                    <p>Do you really want to delete these records? This process cannot be undone.</p>--%>
                    <%--                                </div>--%>
                    <%--                                <div class="modal-footer justify-content-center">--%>
                    <%--                                    <button type="button" href="<%=basePath%>cancel-order" class="btn btn-secondary"--%>
                    <%--                                            data-dismiss="modal">Cancel</button>--%>
                    <%--                                    <button type="button" class="btn btn-danger">Delete</button>--%>
                    <%--                                </div>--%>
                    <%--                            </div>--%>
                    <%--                        </div>--%>
                    <%--                    </div>--%>
                    <%--                    <!-- /.modal -->--%>

                    <div id="modalNewOrder" class="modal fade">
                        <script>doAjax();</script>
                        <div class="modal-dialog">
                            <div class="modal-content">
                                <div class="modal-header">
                                    <button type="button" class="close" data-dismiss="modal"
                                            aria-hidden="true">×
                                    </button>
                                    <!-- 表单嵌套表格：规范表单格式 -->
                                    <form action="" method="post" role="form" id="newOrderForm">
                                        <input type="hidden" id="oId1" name="oId1" class="form-control">
                                        <div class="form-group">
                                            <table class="table" style="font: '黑体';">
                                                <thead>
                                                <tr>
                                                    <th>预约信息：</th>
                                                    <th></th>
                                                </tr>
                                                </thead>
                                                <tbody>
                                                <tr>
                                                    <td><b>医院：</b></td>
                                                    <td><select id="hospital" name="hospital" class="form-control">

                                                        <c:if test="${not empty hospitals }">
                                                        <c:forEach var="hospital" items="${hospitals }">
                                                        <option>${hospital}</option>
                                                        </c:forEach>
                                                        </c:if>

                                                </tr>
                                                <tr>
                                                    <td><b>医生：</b></td>
                                                    <td><input type="text" id="doctor" name="doctor"
                                                               maxlength="15" class="form-control"/></td>
                                                </tr>
                                                <tr>
                                                    <td><b>时间：</b></td>
                                                    <td><input type="text" id="Date" name="Date"
                                                               maxlength="20" class="form-control"/></td>
                                                </tr>
                                                </tbody>
                                            </table>
                                            <div id="output"></div>
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
<jsp:include page="/part/manager.js.jsp"></jsp:include>
</body>
<script type="text/javascript">
    function getPaymentLink(oId) {
        if(confirm("模拟支付订单")){
            location.href="<%=basePath%>payorder.us?oId="+oId;
        }
    }

    function cancelOrder(obj) {
        $("#cancelForm").attr("action", "<%=basePath%>cancel-order");
        var orderInfo = obj.parentNode.parentNode.childNodes;
        // console.log(orderInfo[3].innerText);
        $("#oIdDelete").val(orderInfo[3].innerText);
        // $("#oStatus").val(orderInfo[11].innerText);
        // $("#oPrice").val(orderInfo[15].innerHTML);
    }

    function newOrder(obj) {
        $("#newOrderForm").attr("action", "<%=basePath%>new-order");
        var orderInfo = obj.parentNode.parentNode.childNodes;
        console.log(orderInfo);
        $("#oId").val(orderInfo[1].innerHTML);
        $("#oStatus").val(orderInfo[11].innerText);
        $("#oPrice").val(orderInfo[15].innerHTML);
    }

    function getHospitals(obj) {
        $("#newOrderForm").attr("action", "<%=basePath%>new-order");
        var orderInfo = obj.parentNode.parentNode.childNodes;
        console.log(orderInfo);
        $("#oId").val(orderInfo[1].innerHTML);
        $("#oStatus").val(orderInfo[11].innerText);
        $("#oPrice").val(orderInfo[15].innerHTML);
    }
    function doDelete(oId){
        if(confirm("您确定要删除编号为："+oId+"的医院吗？")){
            location.href="<%=basePath%>cancelorder.us?oId="+oId;
        }
    }




    <%--function doDelete(oid){--%>
    <%--	if(confirm("您确定要删除编号为："+oid+"的订单吗？")){--%>
    <%--		location.href="<%=basePath%>removeorder.do?oid="+oid;--%>
    <%--	}--%>
    <%--}--%>
</script>
</html>