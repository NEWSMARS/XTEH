// $(".login_toast").hide();
var login_n = 0;
$(document).ready(function(){
	//联系卖家点击显示
	$(".contact_seller").click(function(){
		if(login_n==0){
			$(".login_toast").show();
			setTimeout(function(){
			$(".login_toast").hide();
		},2000);
		}
		else{
			$(".contact_seller_toast").show();
		}
		
	});
	// 点击x关闭联系
	$(".close_contact").click(function(){
		$(".contact_seller_toast").hide();
	});
	//加入购物车
	$(".add_to_cart").click(function(){
		if(login_n==0){
			$(".login_toast").show();
			setTimeout(function(){
			$(".login_toast").hide();
		},2000);
		}
		else{
			$(".add_to_cart_toast").show();
			setTimeout(function(){
			$(".add_to_cart_toast").hide();
		},2000);
		}
		
	});
	//举报点击显示
	$(".report").click(function(){
		if(login_n==0){
			$(".login_toast").show();
			setTimeout(function(){
			$(".login_toast").hide();
		},2000);
		}
		else{
			$(".report_toast").show();
		}
		
	});
	// 点击x关闭举报
	$(".close_report").click(function(){
		$(".report_toast").hide();
	});
	//跳转到单个商品页面（携带商品id参数）
			$(".recommend_goods li").click(function(){
				/*var link = "goods?pid="+this.product_id;
				window.parent.location.href=link;*/
			});

	//点击切换商品主图片
	$(".goods_pics li").click(function(){
		
		$(".goods_item_pic").css("background-image",$(this).css("background-image"));
	});

});