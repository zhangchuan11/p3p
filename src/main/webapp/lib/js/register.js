/**
 *     打开角色编辑窗口
 */
function openaddrole() {
    $('#user-add-form').form('clear');
    $('#user-dialog').dialog({
        closed: false,
        modal: true,
        top:50,
        title: "注册",
        buttons: [{
            text: '确定',
            iconCls: 'icon-ok',
             handler: doSaveRole
        }, {
            text: '取消',
            iconCls: 'icon-cancel',
            handler: function () {
                $('#user-dialog').dialog('close');
            }
        }]
    });
}

function doSaveRole(){
    if($("#LoginUser").val()=="" || $("#LoginUser").val() ==null){
        $.messager.show({
            title:'系统提示',
            msg:"账户没有填写"
        });
        $("#LoginUser").focus();
        return;
    }
    if($("#newpassword").val()==null || $("#newpassword").val()==""){
        $.messager.show({
            title:'系统提示',
            msg:"密码没有填写"
        });
        $("#newpassword").focus();
        return;
    }
    if($("#oldpassword").val()==null || $("#oldpassword").val() ==""){
        $.messager.show({
            title:'系统提示',
            msg:"请确认密码"
        });
        $("#oldpassword").focus();
        return;
    }
    if($("#newpassword").val()!=$("#oldpassword").val()){
        $.messager.show({
            title:'系统提示',
            msg:"两次密码不一致"
        });
        $("#oldpassword").focus();
        return;
    }
    var rolemsg,isExistRole;
    $.ajax({
        url: "checkUser",
        type: "post",
        async: false,
        dataType: "json",
        data: 'LoginName=' + $("#LoginUser").val(),
        success: function (Data) {
             rolemsg = Data.msg;
             isExistRole = Data.code;
        }, error: function () {
            alert("出错了")
        }
    });
    if(isExistRole =="true" ){
        $.messager.show({
            title:'系统提示',
            msg:rolemsg
        });
         $("#LoginUser").focus();
        return;
    }
    $("#user-add-form").ajaxSubmit({
        url: "DoSaveUser",
        type: "post",
        dataType: "json",
        beforeSubmit: function (arr, $form, options) {
            arr.push({'name':"LoginName",'value':$("#LoginUser").val()}),
            arr.push({'name':"PassWord",'value':$("#newpassword").val()})
        },
        //提交成功后的回调函数
        success: function (result, status, xhr, $form) {

            $.messager.show({
                title:'系统提示',
                msg:result.msg,
                timeout:500,
                showType:'slide'
            });
                if(result.errorCode=="1"){
                    $("#LoginUser").val("");
                    $("#newpassword").val("");
                    $("#oldpassword").val("");
                    $("#LoginUser").focus();
                    $('#user-datagrid').datagrid('reload');
                }else{
                    $("#LoginUser").val("");
                    $("#newpassword").val("");
                    $("#oldpassword").val("");
                    $('#user-datagrid').datagrid('reload');
                    $('#user-dialog').dialog('close');
                }
        },
        error: function (xhr, status, error, $form) {
        },
        complete: function (xhr, status, $form) {
        }
    });
}