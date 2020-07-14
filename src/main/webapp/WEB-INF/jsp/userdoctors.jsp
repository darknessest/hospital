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
    <title>医生管理</title>
    <jsp:include page="/part/manager.css.jsp"></jsp:include>

    <script type="text/javascript">
        var msg = '${msg}';
        if(msg!=""&&msg!=undefined){
            alert(msg);
        }
    </script>
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
                            <font size="4">预约医生</font>
                            <a href="<%=basePath%>showdoctors.us">
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
                                        <th>医师编号</th>
                                        <th>医师姓名</th>
                                        <th>医师类别</th>
                                        <th>医师简述</th>
                                        <th>医师联系方式</th>
                                        <th>医师所属诊室</th>
                                        <th>所属医院</th>
                                        <th>预约</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <c:if test="${not empty list }">
                                        <c:forEach var="doctors" items="${list }">
                                            <tr>
                                                <td>${doctors.dId }</td>
                                                <td>${doctors.dName }</td>
                                                <td>${doctors.dType }</td>
                                                <td>${doctors.dDesc }</td>
                                                <td>${doctors.dPhone }</td>
                                                <td>${doctors.dRid }</td>
                                                <td>${doctors.dHid }</td>
                                                <td><a id="add" href="#" data-toggle="modal" data-target="#myModal" onclick="addOrder(this)">
                                                    <span class="glyphicon glyphicon-edit"></span>
                                                </a></td>
<%--                                                <td><a href="javascript:doDelete(${doctors.dId })" style="color:red">--%>
<%--                                                    <span class="glyphicon glyphicon-remove"></span>--%>
<%--                                                </a></td>--%>
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
                                    <form action="addorder.us" method="post" role="form" id="editForm">
                                        <input type="hidden" id="oDid" name="oDid" class="form-control">
                                        <div class="form-group">
                                            <table class="table" style="font: '黑体';">
                                                <thead>
                                                <tr>
                                                    <th>医师信息：</th>
                                                    <th></th>
                                                </tr>
                                                </thead>
                                                <tbody>
                                                <tr>
                                                    <td><b>医师姓名:</b></td>
                                                    <td><input type="text" id="dName" name="dName" class="form-control" disabled/></td>
                                                </tr>
                                                <tr>
                                                    <td><b>医师类别:</b></td>
                                                    <td><input type="text" id="dType" name="dType" class="form-control" disabled/></td>
                                                </tr>
                                                <tr>
                                                    <td><b>医师简述:</b></td>
                                                    <td><input type="text" id="dDesc" name="dDesc" class="form-control" disabled/></td>
                                                </tr>
                                                <tr>
                                                    <td><b>医师联系方式:</b></td>
                                                    <td><input type="text" id="dPhone" name="dPhone" class="form-control" disabled/></td>
                                                </tr>
                                                <tr>
                                                    <td><b>医师所属诊室：</b></td>
                                                    <td><input type="number" id="dRid" name="dRid" step="1" min="1"
                                                               max="999" class="form-control" disabled/></td>
                                                </tr>
                                                <tr>
                                                    <td><b>所属医院：</b></td>
                                                    <td><input type="number" id="oHid" name="oHid" step="1" min="1"
                                                               max="999" class="form-control" disabled/></td>
                                                </tr>
                                                <tr>
                                                    <td><b>预约日期</b></td>
                                                    <td><input type="date" id="oDate" name="oDate" class="form-control"/></td>
                                                </tr>
                                                </tbody>
                                            </table>
                                            <div class="modal-footer">
                                                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
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
    function addOrder(obj){
        var doctorsInfo = obj.parentNode.parentNode.childNodes;
        console.log(doctorsInfo);
        $("#oDid").val(doctorsInfo[1].innerHTML);
        $("#dName").val(doctorsInfo[3].innerHTML);
        $("#dType").val(doctorsInfo[5].innerHTML);
        $("#dDesc").val(doctorsInfo[7].innerHTML);
        $("#dPhone").val(doctorsInfo[9].innerHTML);
        $("#dRid").val(doctorsInfo[11].innerHTML);
        $("#oHid").val(doctorsInfo[13].innerHTML);
    }

    function doDelete(dId){
        if(confirm("您确定要删除编号为："+dId+"的医师吗？")){
            location.href="<%=basePath%>removedoctors.hp?dId="+dId;
        }
    }
</script>
</html>