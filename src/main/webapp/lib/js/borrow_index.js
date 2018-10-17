function submit(){
   // $.messager.progress();
    $('#ff').form('submit',{
        url:"Borrow/DoSave",

        // onSubmit:function(){
        //     if ( $(this).form('enableValidation').form('validate') == false)
        //     {
        //         $.messager.show({
        //             title:'系统提示',
        //             msg:"请填写完整信息",
        //             timeout:500,
        //             showType:'slide'
        //         });
        //     }
        //     return $(this).form('enableValidation').form('validate');
        // },
    });
}
function clearForm(){
    $('#ff').form('clear');
}

$.extend($.fn.validatebox.defaults.rules, {
    selectValueRequired: {
        validator: function(value,param){
            return $(param[0]).find("option:contains('"+value+"')").val() != '';
        },
        message: '该选项为必选项'
    }
});