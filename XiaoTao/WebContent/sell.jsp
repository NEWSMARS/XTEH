<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<title>校淘二货</title>
	<meta charset="utf-8">
	<link rel="stylesheet" type="text/css" href="css/index.css">
	 <script src="http://img9.tongzhuo100.com/js/jquery-1.7.2.min.js"></script>
	<script type="text/javascript" src="js/jquery-3.4.1.min.js"></script>
<!-- 显示上传的图片 -->
	
	<style type="text/css">
		.sell_title{
			width: 1200px;
			height: 40px;
			border:1px solid #00000040;
			margin: 10px auto;
			text-align: center;	
			line-height: 40px;
			font-size: 24px;
			


		}
		.sell_layout , .pic{
			width: 1200px;
			height: 800px;
			border:1px solid #00000040;
			margin: 10px auto;
		}
		.pics{
			width:1000px;
			margin: 10px auto;
			height: 200px;
			border:1px solid #00000040;
		}
		form div{
			width:1000px;
			margin: 30px auto;
			height: 40px;

			/*border:1px solid #00000040;*/
		}
		form div span{
			display: inline-block;
			width: 100px;
			height: 40px;
			line-height: 40px;
			font-size: 20px;
			background-color: #e6e6e6;
			border:1px solid #00000040;

		}
		form input,form select{
			width:200px;
			height: 40px;
			line-height: 40px;
			font-size: 20px;
		}
		.transaction input{
			width:30px;
			height: 30px;
			/*margin-top: 5px;*/
			margin-left: 20px;
			font-size: 20px;
		
		}
		.pics div{
			margin: 10px;
			width: 180px;
			height: 180px;
			border: 1px solid  #f2f2f2 ;
			position: relative;
			display: inline-block;
			margin-left: 30px;
			background-size: 100% 100%;
			/*display: none;*/
		/*	top: 10px;*/
			float: left;
		}
		.pics input{
			width: 100%;
			height: 100%;
			text-align: center;
			line-height: 100%;
			opacity: 0;
			position:absolute;
			top: 0px;
			left: 0px;
		}
		.pics .file{
			font-size: 22px;
			text-align: center;
			line-height: 180px;
			border: 1px solid red;
			display: inline-block;
		}
	/*	.show_pic{
			width: 100%;
			height: 100%;
			background-size: 100% 100%;
		}
*/

	</style>
</head>
<body >
	<!-- 顶部导航条 -->
	<div style="background-color: #f2f2f2">
		<div class="top_bar" id="top_bar">
			<ul class="top_login">
				<li><a class="login" href="login.html">登录</a></li>
				<li><a class="register" href="logon.html">免费注册</a></li>
			</ul>
			<ul class="quick_menu">
				<li><a class="index" href="index.html">商城首页</a></li>
				<li><a class="my_sell" href="#">我的二货</a></li>
				<li><a class="shopping_cart" href="#">购物车</a></li>
			</ul>
		</div>
	</div>
	<div class="sell_title" style="background-color: #f2f2f2">发布二货</div>

	<div class="sell_layout" style="background-color: #f2f2f2">
	
	<div class="message">
		<form action="#" method="post">
			<div class="pics" style="background-color: #ffffff ; position: relative; overflow: hidden;" >
				
				<!-- <div class="pic2"></div>
				<div class="pic3"></div>
				<div class="pic4"></div> -->
				<div class="file">
					+  上传图片
					<input id="file" class="add_file" type="file" name="img" value="">
					
				</div>
				<div id="show_pic"> </div>
			</div>
			<div><span>商品名称</span><input type="text" name="name"></div>
			<div><span>价格</span><input type="text" name="price">元</div>
			<div><span>商品详情</span><input type="text" name="details" style="width: 894px"></div>			
			<div>
				<span>分类</span>
				<select name="classily">
					<option value="classily_phone">手机</option>
					<option value="classily_compture">电脑</option>
					<option value="classily_part">配件</option>
					<option value="classily_ele">电器</option>
					<option value="classily_book">书籍</option>
					<option value="classily_recreation">娱乐</option>
					<option value="classily_sport">运动</option>
					<option value="classily_walk">代步</option>
				</select></div>
			<div class="transaction"><span style="position: relative; top: 0px;">交易方式</span>
				<input type="radio" name="transaction" value="down" checked="checked">线下交易
				<input type="radio" name="transaction" value="up">线上交易
				<input type="radio" name="transaction" value="down_up">线上/线下交易
			</div>
			<div><span>地址</span><input type="text" name="address"></div>
			<div><span>联系方式</span><input type="text" name="contact"></div>
			<div><input type="submit" value="确认发布" style="width: 998px" ></div>
		</form>
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
	<script type="text/javascript" src="js/sell.js">
    </script>

</body>
</html>