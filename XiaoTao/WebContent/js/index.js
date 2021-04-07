var timer;
function start_carousel(){
	 timer = setInterval(function(){
		$(".carousel_ul").animate({left:'-=1200px'},1500,function(){
			if ($(".carousel_ul").css("left")=="-4800px") {$(".carousel_ul").css("left","0px");}
			carousel_control_position($(".carousel_ul").css("left"));
		});
	},4000);
}
function carousel_control_position(left){
	$(".carousel_control li").css("background-color","#00000040");
	if(left=="0px") $(".carousel_control li:eq(0)").css("background-color","#ffffff40");	
	// console.log(n);
	else{
		var n = -parseInt(left)/1200;
		 $(".carousel_control li:eq("+ -parseInt(left)/1200 +")").css("background-color","#ffffff40");
}
}
function nav_bar_position(top){
	$(".nav_bar li").css("background-color","#00000040");
	$(".nav_bar li:first").css("background-color","#f00");
	if(top<=1100) $(".nav_bar li:eq(1)").css("background-color","#f40");
	else if(top<=1600) $(".nav_bar li:eq(2)").css("background-color","#f40");
	else if(top<=2400) $(".nav_bar li:eq(3)").css("background-color","#f40");
	else if(top<=3000) $(".nav_bar li:eq(4)").css("background-color","#f40");
	else  $(".nav_bar li:eq(5)").css("background-color","#f40");

}


$(document).ready(function(){
	$(".nav_bar").hide();
	start_carousel();
	$(".carousel_ul").mouseover(function(){
		clearInterval(timer);
	});
	$(".carousel_ul").mouseleave(function(){
		start_carousel();
	});
	$(window).scroll(function(){
		if($(window).scrollTop()<=500) $(".nav_bar").hide(1000);
	 	else if($(window).scrollTop()>500) $(".nav_bar").show(1000);
	 	nav_bar_position($(window).scrollTop());
	});
	$(".nav_bar li").click(function(){
		switch(this.className){
			case "1" :$('html,body').animate({scrollTop: '501px'}, 1000);break;
			case "2" :$('html,body').animate({scrollTop: '1101px'}, 1000);break;
			case "3" :$('html,body').animate({scrollTop: '1601px'}, 1000);break;
			case "4" :$('html,body').animate({scrollTop: '2401px'}, 1000);break;
			case "5" :$('html,body').animate({scrollTop: '3001px'}, 1000);break;
			case "6" :$('html,body').animate({scrollTop: '0px'}, 1000);break;
		}
		
	});
			/*//跳转到单个商品页面（携带商品id参数）
			$(".product li").click(function(){
				var link = "goods?pid="+this.pid;
				window.parent.location.href=link;
			});*/
			//跳转到商品种类页面（携带商品种类class参数）
			$(".classily li").click(function(){
				var link = "index?classily="+this.className;
				window.parent.location.href=link;
			});
			//logo跳转主页
			$(".logo").click(function(){
				var link = "start";
				window.parent.location.href=link;
			});

});