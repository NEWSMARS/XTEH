<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
   <%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" id="style-css" href="${pageContext.request.contextPath}/assets/css/style.css" type="text/css" media="all"> 
<link rel="stylesheet" id="fancybox-css" href="${pageContext.request.contextPath}/assets/css/jquery.fancybox.1.3.23.min.css" type="text/css" media="screen">

</head>
<body>
	<header id="header" class="header" style="bacgroup-color:#00a67c;">
	  
		<div class="container-inner">
			<div class="g-logo pull-center">
				<a target="_parent" href="${pageContext.request.contextPath}/MainController">
					<h1>
						<span class="g-mono" style="font-family:楷体;">私人影院</span>
						<span class="g-bloger" style="font-family:楷体;">免费视频资源分享</span>
					</h1>
				</a>
				<div class="search " style="width:260px;display:block;position:absolute;bottom:0;right:87px;">
					<form target="_parent" method="get"  style="height:40px" class="searchform themeform"  action="QueryServlet">
						<div >
							<input type="text"  class="search" name="s"  placeholder="输入内容并回车">
						</div>
					</form>
				</div>
			</div>
		</div>
		
		<div id="nav-header" class="navbar" style="border-bottom: 4px solid #00a67c ;">
			<style type="text/css">.bdsharebuttonbox a{cursor:pointer;border-bottom:0;margin-right:5px;width:28px;height:28px;line-height:28px;color:#fff}.bds_renren{background:#94b3eb}.bds_qzone{background:#fac33f}.bds_more{background:#40a57d}.bds_weixin{background:#7ad071}.bdsharebuttonbox a:hover{background-color:#7fb4ab;color:#fff;border-bottom:0}</style>
			
			<ul class="nav">
				<li id="menu-item-15" class="menu-item menu-item-tpye-custom menu-itme-object-custom  current_page_item menu-item-home menu-itme-15">
					<a target="_parent" href="${pageContext.request.contextPath}/MainController"><i class="fa fa-home"></i>首页</a>
				</li>
				<li id="menu-item-10" class="menu-item menu-item-type-taxonomy menu-item-object-category menu-item-10">
					<a target="_parent" href="${pageContext.request.contextPath}/MenuServlet1"><i class="fa fa-html5"></i>电影</a>
				</li>
				<li id="menu-item-7" class="menu-item menu-item-type-taxonomy menu-item-object-category menu-item-7">
					<a target="_parent" href="${pageContext.request.contextPath}/MenuServlet2"><i class="fa fa-cogs"></i>电视剧</a>
				</li>
				<li id="menu-item-9" class="menu-item menu-item-type-taxonomy menu-item-object-category menu-item-has-children menu-item-9">
					<a target="_parent" href="${pageContext.request.contextPath}/MenuServlet3"><i class="fa fa-firefox"></i>动漫</a>
					<!-- <ul class="sub-menu"> 
						<li id="menu-item-11541" class="menu-item menu-item-type-taxonomy menu-item-object-category menu-item-11541">
							<a href="/">棋牌源码</a>
						</li>
						<li id="menu-item-782" class="menu-item menu-item-type-taxonomy menu-item-object-category menu-item-782">
							<a href="/">游戏源码</a>
						</li>
						<li id="menu-item-781" class="menu-item menu-item-type-taxonomy menu-item-object-category menu-item-781">
							<a href="/">教程工具</a>
						</li>
					</ul> -->
				</li>
				<li id="menu-item-11" class="menu-item menu-item-type-taxonomy menu-item-object-category menu-item-has-children menu-item-11">
					<a target="_parent" href="${pageContext.request.contextPath}/MenuServlet4"><i class="fa fa-flag"></i>综艺</a>
					<!-- <ul class="sub-menu"> 
						<li id="menu-item-786" class="menu-item menu-item-type-taxonomy menu-item-object-category menu-item-786">
							<a href="/">英文程序</a>
						</li> 
						<li id="menu-item-783" class="menu-item menu-item-type-taxonomy menu-item-object-category menu-item-783">
							<a href="/">英文工具</a>
						</li> 
						<li id="menu-item-785" class="menu-item menu-item-type-taxonomy menu-item-object-category menu-item-785">
							<a href="/">英文模板</a>
						</li> 
						<li id="menu-item-784" class="menu-item menu-item-type-taxonomy menu-item-object-category menu-item-784">
							<a href="/">英文数据</a>
						</li>
					</ul> -->
				</li>
				<li id="menu-item-8" class="menu-item menu-item-type-taxonomy menu-item-object-category menu-item-has-children menu-item-8">
					<a target="_parent" href="${pageContext.request.contextPath}/MenuServlet5"><i class="fa fa-users"></i>用户上传</a>
					<!-- <ul class="sub-menu"> 
						<li id="menu-item-769" class="menu-item menu-item-type-taxonomy menu-item-object-category menu-item-769">
							<a href="/">wordpress</a>
						</li> 
						<li id="menu-item-764" class="menu-item menu-item-type-taxonomy menu-item-object-category menu-item-764">
							<a href="/">dedecms</a>
						</li> 
						<li id="menu-item-766" class="menu-item menu-item-type-taxonomy menu-item-object-category menu-item-766">
							<a href="#">Discuz</a>
						</li> 
						<li id="menu-item-767" class="menu-item menu-item-type-taxonomy menu-item-object-category menu-item-767">
							<a href="#">ECshop</a>
						</li> 
						<li id="menu-item-770" class="menu-item menu-item-type-taxonomy menu-item-object-category menu-item-770">
							<a href="#">其他</a>
						</li>
					</ul> -->
				</li>
				 <li id="menu-item-6" class="menu-item menu-item-type-taxonomy menu-item-object-category menu-item-has-children menu-item-6">
					<a target="_parent" href="${pageContext.request.contextPath}/CommunicationController"><i class="fa fa-comments-o"></i>交流区</a>
				</li> 
				 <!-- <li id="menu-item-5" class="menu-item menu-item-type-taxonomy menu-item-object-category menu-item-has-children menu-item-5">
					<a target="_parent" href="UploadController"><i class="fa fa-user"></i>用户上传</a>
					
				</li> -->
					<li id="menu-item-5" class="menu-item menu-item-type-taxonomy menu-item-object-category menu-item-has-children menu-item-5" style="margin-left:335.5px">
						<a target="_parent" href="UploadController"><i class="fa fa-user"></i>上传视频</a>
					</li>
					
				<li id="menu-item-16" style="float:right;" class="menu-item menu-item-tpye-custom menu-itme-object-custom current-menu-item current_page_item menu-item-home menu-itme-16" >
						<a target="_parent" href="${pageContext.request.contextPath}/login.jsp"><i class="fa fa-upload"></i>登录</a>
					</li>
			</ul>
		</div>
	</header>
	
</body>
</html>