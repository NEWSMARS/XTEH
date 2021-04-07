<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<title>种类</title>
	<script type="text/javascript" src="js/jquery-3.4.1.min.js"></script>
	<link rel="stylesheet" type="text/css" href="css/index.css">
	<style type="text/css">
		.product{
			margin: 10px;
			width: 220px;
			background-color: #fff;

		}
		.product img{
			width: 220px;
			height: 220px;
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
				<li><a class="index" href="#">商城首页</a></li>
				<li><a class="my_sell" href="#">我的二货</a></li>
				<li><a class="shopping_cart" href="#">购物车</a></li>
			</ul>
		</div>
	</div>

	<!-- 悬浮搜索框 -->
	<div>
		<div class="headerLayout">
			<div class="logo"  style="background-image: url(pic/logo.PNG); "></div>
			
			<div class="search">
				<form action="classily.html" method="get" >
					<input id="search_input" type="input" name="search_shopping">
					<input id="search_sub" type="submit"  value="搜索">
				</form>
					
			</div>

			<div class="sell_shopping"><a href="#" class="selling">发布二货</a></div>
		</div>
	</div>

	<!-- 分类框 -->
	<div>
		<div class="classily">
			<ul>
				<li class="100" style="background-color: #fff;color: #000">种类</li>
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

	<div >
		<div class="product_div" >
			
			<ul class="product_ul" style="width: 100% ;height:auto; background-color:#eee">
			<c:forEach items="${Productlist }" var="newPro">

						<li class="product">
						 	<a href='goods?pid=${newPro.pid}'>
							<img src="${pageContext.request.contextPath }/${newPro.pimage}" style="background-size: 100% 100%">
							</a>
							<p><a href="goods?pid=${newPro.pid}" style='color:#666'>${newPro.pid }</a></p>
							<p><font color="#E4393C" style="font-size:16px">&yen;${newPro.shop_price }</font></p>
						</li>

					</c:forEach>
			
			</ul>
		</div>
	</div>
	
	<div>
		<div class="page_bar" style="background-color: #eee ;height: 40px;margin-top: 0px;border: 0; margin-top: -10px;" >
			<div>
				<ul>
					<li><a  class="0" href="#">上一页</a></li>
					<li><a  class="1" href="#">1</a></li>
					<li><a  class="2" href="#">2</a></li>
					<li><a  class="3" href="#">3</a></li>
					<li><a  class="4" href="#">4</a></li>
					<li><a  class="5" href="#">5</a></li>
					<li><a  class="6" href="#">6</a></li>
					<!-- <li><a  class="0" href="javascript:;">...</a></li> -->
					<li><a  class="-1" href="#">下一页</a></li>
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
	<script type="text/javascript" src="js/index.js"></script>
	<script type="text/javascript" src="js/classily.js"></script>
</body>
</html>