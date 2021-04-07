<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<title>校淘二货</title>
	<link rel="stylesheet" type="text/css" href="css/index.css">
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
				<li><a class="my_sell" href="User">我的二货</a></li>
				<li><a class="shopping_cart" href="#">购物车</a></li>
			</ul>
		</div>
	</div>

	<!-- 悬浮搜索框 -->
	<div>
		<div class="headerLayout">
			<div class="logo" style="background-image: url(pic/logo.PNG);"></div>
			<div class="search">
				<form action="classily.html" method="get">
					<input id="search_input" type="input" name="search_shopping">
					<input id="search_sub" type="submit"  value="搜索" >
				</form>
					
			</div>
			<div class="sell_shopping"><a href="sell.jsp" class="selling">发布二货</a></div>
		</div>
	</div>

	<!-- 分类框 -->
	<div>
		<div class="classily" >
			<ul>
				<li class="100">全部</li>
				<li class="4" >手机</li>
				<li class="5">电脑</li>
				<li class="6"> 配件</li>
				<li class="7"> 电器</li>
				<li class="1"> 书籍</li>
				<li class="3"> 娱乐</li>
				<li class="2">运动</li>
				<li class="8"> 代步</li>
			</ul>
		</div>
	</div>

	<!-- 轮播图 -->
	<div >
		<div class="carousel">
			<ul class="carousel_ul">
				<li class="ad1" style="background-image: url(pic/ad1.jpg);"></li>
				<li class="ad2" style="background-image: url(pic/ad2.jpg);"></li>
				<li class="ad3" style="background-image: url(pic/ad3.jpg);"></li>
				<li class="ad4" style="background-image: url(pic/ad4.jpg);"></li>
				<li class="ad5" style="background-image: url(pic/ad1.jpg);"></li>
			</ul>
		</div>
		<div class="carousel_control">
			<ul class="carousel_">
				<li class="con1" style="background-color:#ffffff40;"></li>
				<li class="con2" ></li>
				<li class="con3" ></li>
				<li class="con4" ></li>
			</ul>
		</div>
	</div>

	<!-- 新品上架 -->
	<div >
		<div class="new_product" id="new_product">
			<div class="title">
				<a href="#">新品上市</a>
			</div>
			
				
				<c:forEach items="${newProductList}" var="newPro">

						
						<li class="product" >
							<a href='goods?pid=${newPro.pid}'>
							<img src="${pageContext.request.contextPath }/${newPro.pimage}" style="background-size: 100% 100%">
							</a>
							<p><a href="goods?pid=${newPro.pid}" style='color:#666'>${newPro.pid }</a></p>
							<p><font color="#E4393C" style="font-size:16px">&yen;${newPro.shop_price }</font></p>
							
						</li>

					</c:forEach>
		</div>
	</div>
	
	<!-- 书籍 -->
	<div >
		<div class="book" id="book">
			<div class="title">
				<a href="#">书籍</a>
			</div>
			<img class="classily_pic" src="pic/book.jpg" style="background-size: 100% 100%">
			<ul class="product_ul">
				<c:forEach items="${productlist1}" var="newPro">

						<li class="product" >
						 	<a href="goods?pid=${newPro.pid}">
								<img src="${pageContext.request.contextPath }/${newPro.pimage}" style="background-size: 100% 100%">
							</a> 
							<p><a href="goods?pid=${newPro.pid}" style='color:#666'>${newPro.pname }</a></p>
							<p><font color="#E4393C" style="font-size:16px">&yen;${newPro.shop_price }</font></p>
						</li>

					</c:forEach>
			</ul>
		</div>
	</div>

	<!-- 运动 -->
	<div >
		<div class="sport" id="sport">
			<div class="title">
				<a href="#">运动</a>
			</div>
			<img class="classily_pic" src="pic/sport.jpg" style="background-size: 100% 100%">
			<ul class="product_ul">
				<c:forEach items="${productlist2}" var="newPro">
				
				<li class="product" >
						 	<a href="goods?pid=${newPro.pid}">
								<img src="${pageContext.request.contextPath }/${newPro.pimage}" style="background-size: 100% 100%" a href="goods?pid=${newPro.pid}">
							</a> 
							<p><a href="goods?pid=${newPro.pid}" style='color:#666'>${newPro.pname }</a></p>
							<p><font color="#E4393C" style="font-size:16px">&yen;${newPro.shop_price }</font></p>
						</li>
						</c:forEach>
			</ul>
		</div>
	</div>

	<!-- 娱乐 -->
	<div >
		<div class="recreation" id="recreation">
			<div class="title">
				<a href="#">娱乐</a>
			</div>
			<img class="classily_pic" src="pic/recreation.jpg" style="background-size: 100% 100%">
			<ul class="product_ul">
			
					<c:forEach items="${productlist3}" var="newPro">
				
				<li class="product" >
						 	<a href="goods?pid=${newPro.pid}">
								<img src="${pageContext.request.contextPath }/${newPro.pimage}" style="background-size: 100% 100%">
							</a> 
							<p><a href="goods?pid=${newPro.pid}" style='color:#666'>${newPro.pname }</a></p>
							<p><font color="#E4393C" style="font-size:16px">&yen;${newPro.shop_price }</font></p>
						</li>
						</c:forEach>
			</ul>
		</div>
	</div>

	<!-- 手机 -->
	<div >
		<div class="phone" id="phone">
			<div class="title">
				<a href="#">手机</a>
			</div>
			<img class="classily_pic" src="pic/phone.jpg" style="background-size: 100% 100%">
			<ul class="product_ul">
					<c:forEach items="${productlist4}" var="newPro">
				
				<li class="product">
						 	<a href="goods?pid=${newPro.pid}">
								<img src="${pageContext.request.contextPath }/${newPro.pimage}" style="background-size: 100% 100%">
							</a> 
							<p><a href="goods?pid=${newPro.pid}" style='color:#666'>${newPro.pname }</a></p>
							<p><font color="#E4393C" style="font-size:16px">&yen;${newPro.shop_price }</font></p>
						</li>
						</c:forEach>
			</ul>
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
	<div class="nav_bar">
		<ul>
			<li style="background-color: #f00"><a href="javascript:;" >导航</a></li>
		

 			<li class="1">新品</li>
			<li class="2">书籍</li>
			<li class="3">运动</li>
			<li class="4">娱乐</li>
			<li class="5">手机</li>
			<li class="6">置顶</li>
		</ul>
		

	</div>

	<script type="text/javascript" src="js/index.js"></script>

	
	
</body>
</html>