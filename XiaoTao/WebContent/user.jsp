<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<title>我的二货</title>
	<meta charset="utf-8">
	<link rel="stylesheet" type="text/css" href="css/index.css">
	<script type="text/javascript" src="js/jquery-3.4.1.min.js"></script>
	<style type="text/css">
		.body{
			position: relative;
			width: 1200px;
			height: auto;
			min-height: 500px;
			margin: 20px auto;
			background-color: #f2f2f2;
		}
		.Navbar{
			display: inline-block;
			width: 250px;
			height: 500px;
			margin: 20px;
			margin-left: 30px;
			background-color: #fff;
			/*border:  1px solid  red;*/
			position: relative;
		}
		.content{
			display: inline-block;
			width: 850px;
			min-height: 500px;
			margin: 20px;
			/*border:  1px solid  red;*/
			position: absolute;
			right: 0px;
			height: 
		}
		.content iframe{
			width: 850px;
			min-height: 500px;
			background-color: #f2f2f2;
			border: 0px;
			/*border:  1px solid  black;*/
		}
		.user_pic div {
			width: 100%;
			font-size: 24px;
			text-align: center;
		} 
		.user_head{
			background-size: 40% 90%;
			background-position: center;
			height: 100px;
			background-repeat: no-repeat;
		}
		.Navbar ul{
			margin-top: 20px;
			border-top: 2px solid #f2f2f2;
		}
		.Navbar ul li{
			display: block;
			width: 250px;
			height: 40px;
			/*background-color: #f2f2f2;*/
			margin-top: 20px;

		}
		.Navbar ul li a{
			display: block;
			width: 250px;
			height: 40px;
			text-align: center;
			line-height: 40px;
			font-size: 18px;
			
		}

	</style>

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
				<li><a class="index" href="index.jsp">商城首页</a></li>
				<li><a class="my_sell" href="#">我的二货</a></li>
				<li><a class="shopping_cart" href="#">购物车</a></li>
			</ul>
		</div>
	</div>
	
	<div class="body" >
		<!-- 导航栏 -->
		<div class="Navbar">
			<div class="user_pic">
				<div class="user_head" style="background-image: url(img/head.jpg);"></div>
				<div class="user_name">${user1.uname}</div>
			</div>
			<ul>
				<!-- n为参数，1表示读取我发布的二货，2表示读取我收藏的二货 -->
				<li><a class="my_goods" href="user_my_goods.jsp?n=1" target="iframe_content">我的发布</a></li>
				<li><a class="shopping_cart" href="user_my_goods.jsp?n=2" target="iframe_content">我的收藏</a></li>
				<li><a class="message" href="user_message.jsp" target="iframe_content">我的留言</a></li>
				<li><a class="personal_information" href="user_personal_information.jsp" target="iframe_content">个人信息</a></li>	
			</ul>
		</div>
		<!-- 主体变换框架 -->
		<div class="content">
			<iframe name="iframe_content" id="iframe_content" src="user_my_goods.jsp?n=1"  ></iframe>
			<!-- <iframe src="user_my_goods.jsp" name="iframe_content" id="iframe_content"frameborder="0" scrolling="no" id="external-frame" onload="setIframeHeight(this)"></iframe> -->
			<!-- <iframe 
			name="iframe_content" id="iframe_content" src="user_my_goods.jsp"
			frameborder="0" onload="this.height=this.contentWindow.document.documentElement.scrollHeight">
			</iframe> -->

		</div>

		</div>


	<div>
		<div class="bottom_bar" >
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
</body>
</html>