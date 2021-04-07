//获取url中的参数值
var classily ,page;
$(function () {
   (function ($) {
        $.getUrlParam = function (name) {
            var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)");
            var r = window.location.search.substr(1).match(reg);
            if (r != null) return unescape(r[2]); return null;
        }
    })(jQuery);
     classily = $.getUrlParam('classily');
     page = $.getUrlParam('page');
     if(!classily) classily="classily_all";
     if(!page) page=1;
     console.log(classily+" "+page);
});

$(document).ready(function(){

//设置商品页面的选择栏跳转的地址
    var link = "index?classily="+classily + "&page=";
        $(".page_bar a").click(function(){
            if($(this).text()==page) $(this).attr('href',"javascript:;");
        else if($(this).text()=="上一页") $(this).attr('href',link+ --page);
        else if($(this).text()=="下一页") $(this).attr('href',link+ ++page);
        else $(this).attr('href',link+$(this).text());
    });

//根据种类和当前页面改变背景颜色
  $("."+classily).css('background-color',"#ff0036");
  $("."+classily).css('color',"#fff"); 
  $("."+page).css({'color':"#aaa","cursor":"default",}); 
  if(page==1) {
    $(".0").css({'color':"#aaa","cursor":"default",});
}
});
