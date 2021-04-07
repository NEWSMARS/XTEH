<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<title>我的二货</title>
	<meta charset="utf-8">
	<style type="text/css">
		*{
			margin: 0;
			padding: 0;

		}
		.time{
			width: 100%;
			height: 30px;
			line-height: 30px;
			font-size: 16px;
			color: #aaa;
			border-bottom: 1px solid #f2f2f2;
		}
		li{
			position: relative;
			width: 100%;
			height: 140px;
			margin-bottom: 20px;
			background-color: #fff;
		}
		.content{
			width: 300px;
			height: 110px;
			position: relative;
		}
		img{
			width: 100px;
			height: 100px;
			margin: 5px;
			display:inline-block;
			background-size: 100% 100%;
		}
		.content div{
			position: absolute;
			width: 180px;
			left: 110px;
			top: 0px;
			height: 100px;
			margin: 5px;
		}
		.name , .price{
			display: block;
			width: 500px;
			overflow: hidden;
			height: 40px;
			line-height: 40px;
		}
		.bar{
			position: absolute;
			width: 150px;
			height: 100px;
			right: 0px;
			top: 30px;
			margin: 5px;
			border-left: 1px solid #f2f2f2;
		}
		.bar div{
			cursor: pointer;
			width: 60px;
			height: 30px;
			margin: 10px;
			margin-left: 30px;
			text-align: center;
			line-height: 30px;
			border: 1px solid #f2f2f2;
		}
		a{
			text-decoration: none;
			color: #000;

		}

	</style>
	<script type="text/javascript" src="js/jquery-3.4.1.min.js"></script>
	<script type="text/javascript">
		//跳转到单个商品页面（携带商品id参数）
		$(document).ready(function(){

		$(".turn").click(function(){
				var link = "goods.html?id="+this.product_id;
				window.parent.location.href=link;
			});
		// //删除某个商品，跳转到删除servlet
		// $(".delete").click(function(){
		// 		var link = "#?id="+this.product_id;
		// 		window.parent.location.href=link;
		// 	});

		 });
			
	</script>
</head>
<body>
	<div style="width: 100%;background-color: #f2f2f2">
		<!-- 读取所有已发布的商品信息显示在ul -->
		<ul>
			<li>
				<div class="goods">
					<div class="time" >时间：2019-09-26</div>
					<div class="body">
							<div class="content">
								<img src="img/shopping.jpg">
								<div><span class="name">名称</span>
								<span class="price" style="color: #f00;">价格</span></div>
								
							</div>
							<div class="bar">
								<div class="turn">查看</div>
								<!-- 删除某个商品，跳转到删除servlet -->
								<div class="delete"><a href="#">删除</a></div>
							</div>
					</div>
				</div>
			</li>
			
			<li>
				<div class="goods">
					<div class="time" >时间：2019-09-26</div>
					<div class="body">
							<div class="content">
								<img src="img/shopping.jpg">
								<div><span class="name">名称</span>
								<span class="price" style="color: #f00;">价格</span></div>
								
							</div>
							<div class="bar">
								<div class="turn">查看</div>
								<!-- 删除某个商品，跳转到删除servlet -->
								<div class="delete"><a href="#">删除</a></div>
							</div>
					</div>
				</div>
			</li>
			<li>
				<div class="goods">
					<div class="time" >时间：2019-09-26</div>
					<div class="body">
							<div class="content">
								<img src="img/shopping.jpg">
								<div><span class="name">名称</span>
								<span class="price" style="color: #f00;">价格</span></div>
								
							</div>
							<div class="bar">
								<div class="turn">查看</div>
								<!-- 删除某个商品，跳转到删除servlet -->
								<div class="delete"><a href="#">删除</a></div>
							</div>
					</div>
				</div>
			</li>
		</ul>
	</div>
</body>
</html>