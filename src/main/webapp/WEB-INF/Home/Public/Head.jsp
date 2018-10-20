<%@ page isELIgnored="false"%>
<%@ page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" type="text/css" href="./lib/css/style.css">
<link rel="stylesheet" type="text/css" href="./lib/bootstrap-3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="./lib/easyui-1.6.6/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="./lib/easyui-1.6.6/themes/icon.css">
<%--<link rel="stylesheet" type="text/css" href="./lib/css/verify.css">--%>
<script type="text/javascript" src="./lib/easyui-1.6.6/jquery-1.8.0.min.js"></script>
<script type="text/javascript"  src="./lib/js/prot.js"></script>
<script src="./lib/js/hm.js"></script>
<script type="text/javascript" src="./lib/js/all.js"></script>
<script type="text/javascript" src="./lib/js/all.js"></script>
<script type="text/javascript" src="./lib/easyui-1.6.6/jquery.easyui.min.js"></script>
<script type="text/javascript" src="./lib/easyui-1.6.6/locale/easyui-lang-zh_CN.js"></script>
<%--<script type="text/javascript" src="./lib/js/verify.js"></script>--%>
<script type="text/javascript" src="./lib/js/register.js"></script>
<script type="text/javascript" src="./lib/easyui-1.6.6/jquery.form.min.js"></script>
<script type="text/javascript" src="./lib/js/borrow_index.js"></script>
<script type="text/javascript" src="./lib/js/borrow_index.js"></script>

</head>
<body>

<div id="user-dialog" class="easyui-dialog" data-options="closed:true,iconCls:'icon-save'" style="width:400px; padding:10px;">
    <form id="user-add-form" method="post">
        <table class="add_user_table" style="border-collapse:separate; border-spacing:0px 20px;">
            <tr>
                <td width="100px">账户:</td>
                <td>
                    <input id="LoginUser" class="easyui-validatebox" type="text" name="LoginUser" data-options="multiline:true,required:true,prompt:'账户'" style="width:240px;height:25px;"></input>
                </td>
            </tr>
            <tr>
                <td>密码:</td>
                <td>
                    <input id="newpassword"class="easyui-validatebox" type="password" data-options="multiline:true,required:true,prompt:'密码'" name="newpassword"
                           style="width:240px;height:25px;"></input>
                </td>
            </tr>
            <tr>
                <td>确认密码:</td>
                <td>
                    <input id="oldpassword" class="easyui-validatebox" type="password" data-options="multiline:true,required:true,prompt:'密码'" name="oldpassword"
                           style="width:240px;height:25px;"></input>
                </td>
            </tr>
        </table>
    </form>
</div>