
$(function  () {
    layui.use('form', function(){
      var form = layui.form;
      // layer.msg('玩命卖萌中', function(){
      //   //关闭后的操作
      //   });
      //监听提交
      form.on('submit(login)', function(data){
        // alert(888)
        $.ajax({
            url: '/login',
            data: JSON.stringify(data.field),
            type: 'POST',
            dataType: 'JSON',
            contentType: "application/json",
            success: function(response){
                if(response.status == 1){
                    layer.msg(response.message,function(){
                                    location.href='/index';
                                });
                }else{
                    layer.msg(response.message,function(){
                                 location.href='/';
                        });
                }
            }
        });
        return false;
      });
    });
})



//百度统计可去掉
var _hmt = _hmt || [];
(function() {
  var hm = document.createElement("script");
  hm.src = "https://hm.baidu.com/hm.js?b393d153aeb26b46e9431fabaf0f6190";
  var s = document.getElementsByTagName("script")[0];
  s.parentNode.insertBefore(hm, s);
})();
