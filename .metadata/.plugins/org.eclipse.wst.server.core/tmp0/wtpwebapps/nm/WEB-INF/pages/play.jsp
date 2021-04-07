<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
   <%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" id="style-css" href="assets/css/style.css" type="text/css" media="all"> 
<link rel="stylesheet" id="fancybox-css" href="assets/css/jquery.fancybox.1.3.23.min.css" type="text/css" media="screen">

</head>
<body>
	<iframe src="HeaderController" style="width:100%;height: 180px;" ></iframe>
	<section class=" container">
		<div class="content-wrap">
				<div class="breadcrumbs">
					<a title="返回首页" href="MainController">
						<i class="fa fa-home"></i>
					</a>
					<small>&gt;</small> 
					<a href="MenuServlet${resource.categoryId}">
						<c:if test="${resource.categoryId == 1}">电影</c:if>
						<c:if test="${resource.categoryId == 2}">电视剧</c:if>
						<c:if test="${resource.categoryId == 3}">动漫</c:if>
						<c:if test="${resource.categoryId == 4}">综艺</c:if>
						<c:if test="${resource.categoryId == 5}">用户上传</c:if>
					</a> 
					<small>&gt;</small> 
					<span class="muted">${resource.name}</span>
				</div>
				<div id="app" style="width: 1226px;height: 620px;background:black" align="center">
					<div style="height:20px;text-align:center;color:#f0f0f0">${resource.name}</div>
		           <video controls style="width:100%;height:600px">
		             <source src="/nm/upload/${resource.code}" type="video/mp4"></source>
		           </video>
		        </div>
		        <!-- <div style="width: 1226px;height: 600px" align="center">
		            <iframe height=600 width=1226 src='http://player.youku.com/embed/XNDExMDIyMDg5Ng==' frameborder=0 'allowfullscreen'></iframe>
		        </div> -->
		        <div style="width:1226px;height:200px;background:#f7f7f7;border-top:50px solid #eee;border-bottom:50px solid #eee;">
					<div style="background:#dbece8;"><h2 style="margin:0 20px;padding:7px 0">${resource.name}的剧情简介</h2></div>
					<p style="margin-left:20px">${resource.descn}</p>
				</div>
				<div style="width:1226px;height:390px;background:#f7f7f7;">
					<div style="width:100%;height:50px;background:#dbece8;"><h2 style="margin:0 20px;padding:7px 0">你可能还喜欢</h2></div>
					<div class="related_posts" style="margin-top:0;padding-top:10px"> 
						<ul class="related_img" style="display:inline">
							 <c:forEach items="${list}" var="resource" end="5">
								 <li class="related_box" style="width:201px">
									 <a href="DetailsController?ID=${resource.resourceId}" title="${resource.name}">
										 <img style="width: 194px; height: 260px; display: inline;" data-original="#" alt="${resource.name}" src="/nm/upload/${resource.image}"><br>
										 <span class="r_title" style="height:30px">${resource.name}</span>
									 </a>
								 </li>
							</c:forEach>
						 </ul>
					</div>
				</div>
			</div>
	</section>
	<div class="footer-inner">
		<div class="footer-copyright"> 友情链接:
			<a href="https://www.ziyuan.tv" title="资源分享网" >&nbsp;资源分享网</a> 
		</div>
	</div>
</body>
</html>