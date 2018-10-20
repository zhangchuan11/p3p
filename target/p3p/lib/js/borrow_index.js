function submit(){
    //$.messager.progress();
    $('#ff').form('submit',{
        url:"Borrow/DoSave",
        onSubmit:function(){
            return $(this).form('enableValidation').form('validate');
        },
        success:function(data){
           data = eval( '('+data+')' );
           console.log(data);
            $.messager.show({
                    title:'系统提示',
                    msg:data.msage
                })
        }
    });
}
function clearForm(){
    $('#ff').form('clear');
}
$.extend($.fn.validatebox.defaults.rules, {
    selectValueRequired: {
        validator: function (value, param) {
            return $(param[0]).find("option:contains('" + value + "')").val() != '';
        },
        message: '该选项为必选项'
    }
});

$.extend($.fn.validatebox.defaults.rules, {
    selectMax: {
        validator: function (value, param) {
            // alert(value);
            // alert($("#amountGuarantee").val());

            return parseFloat($("#amountGuarantee").val()) > parseFloat(value);
        },
        message: '不能高于总价值'
    }
});
$.extend($.fn.validatebox.defaults.rules, {
    length: {
        validator: function (value, param) {
            return value.length ==11;
        },
        message: '请正确填写'
    }
});

