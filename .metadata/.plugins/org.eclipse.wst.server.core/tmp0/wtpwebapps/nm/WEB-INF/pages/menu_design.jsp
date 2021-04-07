<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
   <%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>免费web资源分享</title>
<link rel="stylesheet" id="style-css" href="assets/css/style.css" type="text/css" media="all"> 
<link rel="stylesheet" id="fancybox-css" href="assets/css/jquery.fancybox.1.3.23.min.css" type="text/css" media="screen">


</head>
<body>

	<iframe src="HeaderController" style="width:100%;height: 180px;" ></iframe>
	
	<section class=" container">
		 <div class="breadcrumbs">
			<a title="返回首页" href="MainController">
				<i class="fa fa-home"></i>
			</a>
			<small>&gt;</small> 
			<a href="MenuServlet${list11.list.get(0).categoryId}">
				<c:if test="${list11.list.get(0).categoryId == 1}">电影</c:if>
				<c:if test="${list11.list.get(0).categoryId == 2}">电视剧</c:if>
				<c:if test="${list11.list.get(0).categoryId == 3}">动漫</c:if>
				<c:if test="${list11.list.get(0).categoryId == 4}">综艺</c:if>
				<c:if test="${list11.list.get(0).categoryId == 5}">用户上传</c:if>
			</a> 
			<span class="muted">${resource.name}</span>
		</div>
		
      

		
		<div class="content-wrap">
			<div class="content">
				 <div class="related_posts"> 
				 	<c:forEach items="${list11.list}" var="resource">
						 <ul class="related_img" style="display:inline">
							 <li class="related_box" style="width:278px">
								 <a href="DetailsController?ID=${resource.resourceId}" title="${resource.name}">
									 <img style="width: 270px; height: 350px; display: inline;" data-original="#" alt="${resource.name}" src="/nm/upload/${resource.image}"><br>
									 <span class="r_title">${resource.name}</span>
								 </a>
							 </li>
						 </ul> 
				    </c:forEach>
			     </div>
			      <div class="pagination">
					<ul>
					 <c:if test="${list11.currentPage>1 }">
					   	<li><a href="${pageContext.request.contextPath }/MenuServlet${list11.list.get(0).categoryId}?currentPage=${list11.currentPage-1}">上一页</a></li>
					   </c:if>
						
						<c:forEach begin="${list11.beginPage }" end="${list11.endPage }" varStatus="status">
							<!-- 判断 -->
							<c:if test="${list11.currentPage eq status.index}">
								<li><span>${status.index}</span></li>
							</c:if>
							<c:if test="${list11.currentPage ne status.index}">
								<li><a href="${pageContext.request.contextPath }/MenuServlet${list11.list.get(0).categoryId}?currentPage=${status.index}">${status.index}</a></li>
							</c:if>
							
						</c:forEach>
						<c:if test="${list11.currentPage < list11.totalPages }">
						 	<li class="next-page"><a href="${pageContext.request.contextPath }/MenuServlet${list11.list.get(0).categoryId}?currentPage=${list11.currentPage+1}">下一页</a></li>
						</c:if>
						<c:if test="${list11.currentPage != list11.totalPages }">
							<li><a href="${pageContext.request.contextPath }/MenuServlet${list11.list.get(0).categoryId}?currentPage=${list11.totalPages}">尾页</a></li>
						</c:if>
						<li><span>总页数：${list11.totalPages }</span></li>
						<li><span>总记录数：${list11.totalRecord }</span></li>
					</ul>
				</div>
			</div> 
		</div>
		
		
		
		<aside class="sidebar"> 
	 	
	 	<div class="widget git_comment">
	 	<div class="title">
	 		<h2>最新讨论</h2>
	 	</div>
	 	<ul>
	 		<c:forEach items="${comment_time}" var="comment" end="4">
			 	<li>
				 	<a target="_blank" href="DetailsController?ID=${comment.resourceId}" title="${comment.studentId}">
					 	<img alt="" data-original="https://secure.gravatar.com/avatar/73d0c54c94e077513f7f28460ad18dcc?s=36&amp;d=https%3A%2F%2Fwww.ziyuan.tv%2Fwp-content%2Fthemes%2FGit-alpha%2Fassets%2Fimg%2Fdefault.png&amp;r=g" 
					 	srcset="https://secure.gravatar.com/avatar/73d0c54c94e077513f7f28460ad18dcc?s=72&amp;d=https%3A%2F%2Fwww.ziyuan.tv%2Fwp-content%2Fthemes%2FGit-alpha%2Fassets%2Fimg%2Fdefault.png&amp;r=g 2x" 
					 	class="avatar avatar-36 photo" height="36" width="36" 
					 	src="/nm/image/1.png" style="display: block;width:48px;height:48px" >
					 	<div class="muted">
					 	<i>${comment.studentId}</i>在${comment.comment_time}时说：${comment.words}
					 	</div>
				 	</a>
			 	</li>
		 	</c:forEach>
	 	</ul>
	 	</div>
	 	<div class="widget git_postlist">
		 	<div class="title"><h2>猜你喜欢</h2></div>
		 	<ul>
			 	<c:forEach items="${list}" var="resource" end="4">
				 	<li>
					 	<a target="_blank" href="DetailsController?ID=${resource.resourceId}" title="${resource.name}">
						 	<span class="thumbnail">
						 	<img width="100px" height="64px" src="/nm/upload/${resource.image}" alt="${resource.name}"></span>
						 	<span class="text">${resource.descn}</span>
						 	<span class="muted">${resource.publish_time}</span>
					 	</a>
				 	</li>
				 </c:forEach>
		 	</ul>
	 	</div>
	 	<div class="widget git_tongji">
		 	<div class="title">
		 		<h2>网站统计</h2>
		 	</div>
		 	<div class="tongji">
			 	<ul>
				 	<li>文章总数：${list.size()} 篇</li><li>评论数目：${comment_time.size()}条</li>
				 	<li>建站日期：2019-12-10</li>
			 	</ul>
		 	</div>
	 	</div>
	 	
	 </aside>	

	</section>
	<div class="footer-inner">
		<div class="footer-copyright"> 友情链接:
			<a href="https://www.ziyuan.tv" title="资源分享网" >&nbsp;资源分享网</a> 
		</div>
	</div>
	
	
</body>
</html>