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
        <br>

        <form  action="tologin">
            <button  class="btn-theme" >已有账号，去登陆</button>
        </form>


        <form class="form-login" id="reg" action="register" method="post">
            <h2 class="form-login-heading">医院预约管理系统|用户注册</h2>
            <div class="login-wrap"><!-- required 必填， autofocus 光标锁定-->
                <input class="form-control" placeholder="请输入用户名（十二个字符以内）" name="uaccount" msg="用户名不合规范" style="" required autofocus>
                <br>
                <input datatype="SafeString" type="password"  class="form-control" placeholder="请输入用户密码（十八个字符以内）" name="upassword"  msg="密码不符合安全规则" style="" required>
                <br>
<%--                <input  datatype="Repeat"  type="password"  class="form-control" placeholder="请确认密码"  to="Password" msg="两次输入的密码不一致"required>--%>
<%--                <br>--%>
                <input datatype="Chinese" class="form-control" placeholder="请输入真实姓名" name="uname"   msg="真实姓名只允许中文"  style="" required>
                <br>
                <input  datatype="Range"  class="form-control" placeholder="请输入年龄" name="uage"   msg="年龄必须在12~110之间" min="12" max="110"  operator="GreaterThanEqual" style="" required>
                <br>
                <input datatype="Sex"  class="form-control" placeholder="请输入性别(男性输入1 女性输入0）" name="usex" msg="性别不合规范" style="" required="true">
                <br>
                <input datatype="Phone" class="form-control" name="uphone"  msg="手机号码不正确" placeholder="请输入联系电话" style="" required >
                <br>
                <input class="btn btn-theme btn-block" onclick="Validator.Validate(document.getElementById('reg'),3)" value="检验信息" type="button">
                <br>
                <button class="btn btn-theme btn-block" type="submit"><i class="fa fa-lock"></i>注册</button>
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
    $.backstretch("images/img_bg_1.jpg", {speed: 0});
</script>


<script>
    Validator = {
        Require : /.+/,
        Email : /^([a-zA-Z0-9._-])+@([a-zA-Z0-9_-]+\.)+([a-zA-Z0-9_-]{1,})$/,
        Sex : /^[0|1]*$/,
        Phone : /^1[3456789]\d{9}$/,
        Mobile : /\w/,
        Url : /^http:\/\/[A-Za-z0-9]+\.[A-Za-z0-9]+[\/=\?%\-&_~`@[\]\':+!]*([^<>\"\"])*$/,
        IdCard : "this.IsIdCard(value)",
        Currency : /^\d+(\.\d+)?$/,
        Number : /^\d+$/,
        Zip : /^[1-9]\d{5}$/,
        Ip : /^((\d|[1-9]\d|1\d\d|2[0-4]\d|25[0-5])\.){3}(\d|[1-9]\d|1\d\d|2[0-4]\d|25[0-5])$/,
        QQ : /^[1-9]\d{4,8}$/,
        Integer : /^[-\+]?\d+$/,
        Double : /^[-\+]?\d+(\.\d+)?$/,
        English : /^[A-Za-z]+$/,
        Chinese :  /^[\u0391-\uFFE5]+$/,
        Username : /^[a-z]\w{3,}$/i,
        UnSafe : /^(([A-Z]*|[a-z]*|\d*|[-_\~!@#\$%\^&\*\.\(\)\[\]\{\}<>\?\\\/\'\"]*)|.{0,5})$|\s/,
        IsSafe : function(str){return !this.UnSafe.test(str);},
        SafeString : "this.IsSafe(value)",
        Filter : "this.DoFilter(value, getAttribute('accept'))",
        Limit : "this.limit(value.length,getAttribute('min'),  getAttribute('max'))",
        LimitB : "this.limit(this.LenB(value), getAttribute('min'), getAttribute('max'))",
        Date : "this.IsDate(value, getAttribute('min'), getAttribute('format'))",
        Repeat : "value == document.getElementsByName(getAttribute('to'))[0].value",
        Range : "getAttribute('min') < (value|0) && (value|0) < getAttribute('max')",
        Compare : "this.compare(value,getAttribute('operator'),getAttribute('to'))",
        Custom : "this.Exec(value, getAttribute('regexp'))",
        Group : "this.MustChecked(getAttribute('name'), getAttribute('min'), getAttribute('max'))",
        ErrorItem : [document.forms[0]],
        ErrorMessage : ["以下原因导致提交失败：\t\t\t\t"],
        Validate : function(theForm, mode){

            var obj = theForm || event.srcElement;
            var count = obj.elements.length;
            this.ErrorMessage.length = 1;
            this.ErrorItem.length = 1;
            this.ErrorItem[0] = obj;
            for(var i=0;i<count;i++){
                with(obj.elements[i]){
                    var _dataType = getAttribute("dataType");
                    var _msg = getAttribute("msg");
                    if(_dataType==null || _dataType.length == 0)  continue;
                    this.ClearState(obj.elements[i]);
                    if(getAttribute("require") == "false" && value == "") continue;
                    var dts = _dataType.split('|');
                    var ems = _msg.split('|');
                    var errmes="";
                    for (var j=0; j<dts.length; j++) {
                        var curValidType = dts[j];
                        var curErrorMsg = ems[j];
                        switch(curValidType){
                            case "IdCard" :
                            case "Date" :
                            case "Repeat" :
                            case "Range" :
                            case "Compare" :
                            case "Custom" :
                            case "Group" :
                            case "Limit" :
                            case "LimitB" :
                            case "SafeString" :
                            case "Filter" :
                                if(!eval(this[curValidType]))	{
                                    errmes=errmes+curErrorMsg
                                    //this.AddError(i, curErrorMsg);
                                }
                                break;
                            default :
                                if(!this[curValidType].test(value)){
                                    errmes=errmes+curErrorMsg
                                    //this.AddError(i, curErrorMsg);
                                }
                                break;
                        }
                    }
                    if(errmes != "")
                        this.AddError(i, errmes);
                }
            }
            if(this.ErrorMessage.length > 1){
                mode = mode || 1;
                var errCount = this.ErrorItem.length;
                switch(mode){
                    case 2 :
                        for(var i=1;i<errCount;i++)
                            this.ErrorItem[i].style.color = "red";
                    case 1 :
                        alert(this.ErrorMessage.join("\n"));
                        this.ErrorItem[1].focus();
                        break;
                    case 3 :
                        for(var i=1;i<errCount;i++){
                            try{
                                var span = document.createElement("SPAN");
                                span.id = "__ErrorMessagePanel";
                                span.style.color = "red";
                                this.ErrorItem[i].parentNode.appendChild(span);
                                span.innerHTML = this.ErrorMessage[i].replace(/\d+:/,"*");
                            }
                            catch(e){alert(e.description);}
                        }
                        this.ErrorItem[1].focus();
                        break;
                    default :
                        alert(this.ErrorMessage.join("\n"));
                        break;
                }
                return false;
            }
            return true;
        },
        limit : function(len,min, max){
            min = min || 0;
            max = max || Number.MAX_VALUE;
            return min <= len && len <= max;
        },
        LenB : function(str){
            return str.replace(/[^\x00-\xff]/g,"**").length;
        },
        ClearState : function(elem){
            with(elem){
                if(style.color == "red")
                    style.color = "";
                var lastNode = parentNode.childNodes[parentNode.childNodes.length-1];
                if(lastNode.id == "__ErrorMessagePanel")
                    parentNode.removeChild(lastNode);
            }
        },
        AddError : function(index, str){
            this.ErrorItem[this.ErrorItem.length] = this.ErrorItem[0].elements[index];
            this.ErrorMessage[this.ErrorMessage.length] = this.ErrorMessage.length + ":" + str;
        },
        Exec : function(op, reg){
            return new RegExp(reg,"g").test(op);
        },
        compare : function(op1,operator,op2){
            switch (operator) {
                case "NotEqual":
                    return (op1 != op2);
                case "GreaterThan":
                    return (op1 > op2);
                case "GreaterThanEqual":
                    return (op1 >= op2);
                case "LessThan":
                    return (op1 < op2);
                case "LessThanEqual":
                    return (op1 <= op2);
                default:
                    return (op1 == op2);
            }
        },
        MustChecked : function(name, min, max){
            var groups = document.getElementsByName(name);
            var hasChecked = 0;
            min = min || 1;
            max = max || groups.length;
            for(var i=groups.length-1;i>=0;i--)
                if(groups[i].checked) hasChecked++;
            return min <= hasChecked && hasChecked <= max;
        },
        DoFilter : function(input, filter){
            return new RegExp("^.+\.(?=EXT)(EXT)$".replace(/EXT/g, filter.split(/\s*,\s*/).join("|")), "gi").test(input);
        },
        IsIdCard : function(idcard){
            var area={11:"北京",12:"天津",13:"河北",14:"山西",15:"内蒙古",21:"辽宁",22:"吉林",23:"黑龙江",31:"上海",32:"江苏",33:"浙江",34:"安徽",35:"福建",36:"江西",37:"山东",41:"河南",42:"湖北",43:"湖南",44:"广东",45:"广西",46:"海南",50:"重庆",51:"四川",52:"贵州",53:"云南",54:"西藏",61:"陕西",62:"甘肃",63:"青海",64:"宁夏",65:"新疆",71:"台湾",81:"香港",82:"澳门",91:"国外"}
            var idcard,Y,JYM;
            var S,M;
            var idcard_array = new Array();
            idcard_array = idcard.split("");
            if(area[parseInt(idcard.substr(0,2))]==null) return false;
            switch(idcard.length){
                case 15:
                    if ( (parseInt(idcard.substr(6,2))+1900) % 4 == 0 || ((parseInt(idcard.substr(6,2))+1900) % 100 == 0 && (parseInt(idcard.substr(6,2))+1900) % 4 == 0 )){
                        ereg=/^[1-9][0-9]{5}[0-9]{2}((01|03|05|07|08|10|12)(0[1-9]|[1-2][0-9]|3[0-1])|(04|06|09|11)(0[1-9]|[1-2][0-9]|30)|02(0[1-9]|[1-2][0-9]))[0-9]{3}$/;//测试出生日期的合法性
                    } else {
                        ereg=/^[1-9][0-9]{5}[0-9]{2}((01|03|05|07|08|10|12)(0[1-9]|[1-2][0-9]|3[0-1])|(04|06|09|11)(0[1-9]|[1-2][0-9]|30)|02(0[1-9]|1[0-9]|2[0-8]))[0-9]{3}$/;//测试出生日期的合法性
                    }
                    if(ereg.test(idcard)) return true;
                    else return false;
                    break;
                case 18:
                    if ( parseInt(idcard.substr(6,4)) % 4 == 0 || (parseInt(idcard.substr(6,4)) % 100 == 0 && parseInt(idcard.substr(6,4))%4 == 0 )){
                        ereg=/^[1-9][0-9]{5}19[0-9]{2}((01|03|05|07|08|10|12)(0[1-9]|[1-2][0-9]|3[0-1])|(04|06|09|11)(0[1-9]|[1-2][0-9]|30)|02(0[1-9]|[1-2][0-9]))[0-9]{3}[0-9Xx]$/;//闰年出生日期的合法性正则表达式
                    } else {
                        ereg=/^[1-9][0-9]{5}19[0-9]{2}((01|03|05|07|08|10|12)(0[1-9]|[1-2][0-9]|3[0-1])|(04|06|09|11)(0[1-9]|[1-2][0-9]|30)|02(0[1-9]|1[0-9]|2[0-8]))[0-9]{3}[0-9Xx]$/;//平年出生日期的合法性正则表达式
                    }
                    if(ereg.test(idcard)){
                        S = (parseInt(idcard_array[0]) + parseInt(idcard_array[10])) * 7
                            + (parseInt(idcard_array[1]) + parseInt(idcard_array[11])) * 9
                            + (parseInt(idcard_array[2]) + parseInt(idcard_array[12])) * 10
                            + (parseInt(idcard_array[3]) + parseInt(idcard_array[13])) * 5
                            + (parseInt(idcard_array[4]) + parseInt(idcard_array[14])) * 8
                            + (parseInt(idcard_array[5]) + parseInt(idcard_array[15])) * 4
                            + (parseInt(idcard_array[6]) + parseInt(idcard_array[16])) * 2
                            + parseInt(idcard_array[7]) * 1
                            + parseInt(idcard_array[8]) * 6
                            + parseInt(idcard_array[9]) * 3 ;
                        Y = S % 11;
                        M = "F";
                        JYM = "10X98765432";
                        M = JYM.substr(Y,1);
                        if(M == idcard_array[17]) return true;
                        else return false;
                    }
                    else return false;
                    break;
                default:
                    return false;
                    break;
            }
        },
        IsDate : function(op, formatString){
            formatString = formatString || "ymd";
            var m, year, month, day;
            switch(formatString){
                case "ymd" :
                    m = op.match(new RegExp("^((\\d{4})|(\\d{2}))([-./])(\\d{1,2})\\4(\\d{1,2})$"));
                    if(m == null ) return false;
                    day = m[6];
                    month = m[5]*1;
                    year =  (m[2].length == 4) ? m[2] : GetFullYear(parseInt(m[3], 10));
                    break;
                case "dmy" :
                    m = op.match(new RegExp("^(\\d{1,2})([-./])(\\d{1,2})\\2((\\d{4})|(\\d{2}))$"));
                    if(m == null ) return false;
                    day = m[1];
                    month = m[3]*1;
                    year = (m[5].length == 4) ? m[5] : GetFullYear(parseInt(m[6], 10));
                    break;
                default :
                    break;
            }
            if(!parseInt(month)) return false;
            month = month==0 ?12:month;
            var date = new Date(year, month-1, day);
            return (typeof(date) == "object" && year == date.getFullYear() && month == (date.getMonth()+1) && day == date.getDate());
            function GetFullYear(y){return ((y<30 ? "20" : "19") + y)|0;}
        }
    }

</script>
</body>
</html>
