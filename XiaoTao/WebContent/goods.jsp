<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>商品详情</title>
	<link rel="stylesheet" type="text/css" href="css/index.css">
	<link rel="stylesheet" type="text/css" href="css/goods.css">
	<script type="text/javascript" src="js/jquery-3.4.1.min.js"></script>
</head>
<body>
<!-- 顶部导航条 -->
	<div style="background-color: #f2f2f2">
		<div class="top_bar" id="top_bar">
			<ul class="top_login">
		<li><a class="login" href="login.jsp">登录</a></li>
				<li><a class="register" href="logon.jsp">免费注册</a></li>
			</ul>
			<ul class="quick_menu">
				<li><a class="index" href="start">商城首页</a></li>
				<li><a class="my_sell" href="#">我的二货</a></li>
				<li><a class="shopping_cart" href="#">购物车</a></li>
			</ul>
		</div>
	</div>
	<!-- 悬浮搜索框 -->
	<div>
		<div class="headerLayout">
			<div class="logo" style="background-image: url(img/logo.png);"></div>
			<div class="search">
				<form action="classily.html" method="get">
					<input id="search_input" type="input" name="search_shopping">
					<input id="search_sub" type="submit"  value="搜索" >
				</form>
					
			</div>
			<div class="sell_shopping"><a href="#" class="selling">发布二货</a></div>
		</div>
	</div>
	<script type="text/javascript" src="js/index.js"></script>
	<div>
		<div class="Layout">
			<!-- 商品详情窗口 -->
			<div class="goodsLayout">
				<div class="goods_title">
					<span>发布于：</span>
					<span class="publish_time">2019-04-19</span>
					<a class="report" href="javascript:;">举报</a>
				</div>
				<div class="goods_subject">
					<!-- 商品图片 -->
					<div>
						<img class="goods_item_pic"  style="background-image: url(${product.pimage});width: 100%;height: 400px;background-size: 100% 100%;">
						
						
					</div>
					<!-- 商品属性 -->
					<div style="right: 0px;">
						<div class="attr goods_name" style="font-size: 20px; line-height: 50px;">${product.pname}</div>
						<div class="attr"><span>价格</span><span class="goods_price" style="color: #f00;font-size: 30px" >${product.shop_price}</span></div>
						<div class="attr"><span>评论</span><span class="goods_address">${product.pcomman}</span></div>
						<div class="attr"><span>卖家</span><span class="goods_user">${user.uname}</span></div>
						<div class="attr"><span>方式</span><span class="goods_trading">${user.ucontact}</span></div>
						<div>
							<a class="contact_seller" href="javascript:;" style="left: 0;">联系卖家</a>
							<a class="add_to_cart" href="javascript:;" style="right: 0;">加入购物车</a>
						</div>
					</div>
				</div>
				<span>商品描述</span>
				<div class="goods_describe">卖家有点懒，什么都没有留下</div>
				<span>留言板</span>
				<div class="goods_message"></div>

			</div>


			<!-- 推荐窗口 -->
			<div class="recommend_goods">
				<div class="title">推荐二货</div>
				<!-- <ul>
					<li>
						<div class="goods"><img src="img/shopping.jpg" alt="" class="pic"><div class="name">漫威复仇者联盟4蜘蛛侠无线蓝牙音响小型音箱电脑台式家用手机彩灯立体声户外迷你重低音漫威英雄创意小钢炮</div><div class="price">¥79.00</div></div>
					</li>
					<li>
						<div class="goods"><img src="img/shopping.jpg" alt="" class="pic"><div class="name">名称</div><div class="price">¥79.00</div></div>
					</li>
					<li>
						<div class="goods"><img src="img/shopping.jpg" alt="" class="pic"><div class="name">名称</div><div class="price">¥79.00</div></div>
					</li>
					<li>
						<div class="goods"><img src="img/shopping.jpg" alt="" class="pic"><div class="name">名称</div><div class="price">¥79.00</div></div>
					</li>
					<li>
						<div class="goods"><img src="img/shopping.jpg" alt="" class="pic"><div class="name">名称</div><div class="price">¥79.00</div></div>
					</li>
				</ul> -->
				<c:forEach items="${Productlist}" var="newPro">
				<li >
				<a href="goods?pid=${newPro.pid}" class="goods" ><img src="${newPro.pimage}" alt="" class="pic"> 
				<div>${newPro.shop_price}</div>
				<div >${newPro.pname}</div>
				
				 </a>
				</li>
				</c:forEach>
			</div>
		</div>
	</div>
	<div>
		<div class="bottom_bar">
			<div>
				<ul>
					<li><a href="#">关于我们</a></li>
					<li><a href="#">常见问题</a></li>
					<li><a href="#" >意见反馈</a></li>
					<li><a href="#">服务协议</a></li>
					<li><a href="#">联系我们</a></li>
				</ul>
			</div>
			<div>
			本站所有信息均为用户自由发布，本站不对信息的真实性负任何责任，交易时请注意识别信息的真假如有网站内容侵害了您的权益请联系我们删除，举报QQ：000000000
			</div>

		</div>
	</div>
	<div class="login_toast" style="display: none;">请先登录</div>
	<div class="contact_seller_toast" style="display: none;">卖家联系方式<span class="close_contact" style="background-image: url(img/close.png);background-size:100%;width: 24px;height: 24px;display: inline-block;" ></span>
	<div class="seller_phone">13433333333</div>

	</div>
	<div class="add_to_cart_toast" style="display: none;">添加购物车成功</div>
	<div class="report_toast" style="display: none;">举报成功<span class="close_report" style="background-image: url(img/close.png);background-size:100%;width: 24px;height: 24px;display: inline-block;" ></span></div>
	<script type="text/javascript" src="js/goods.js" ></script>
</body>
</html>