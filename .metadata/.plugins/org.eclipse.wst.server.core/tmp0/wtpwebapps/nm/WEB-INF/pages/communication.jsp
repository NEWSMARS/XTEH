<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
   <%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>交流区</title>
<link rel="stylesheet" id="style-css" href="assets/css/style.css" type="text/css" media="all"> 
<link rel="stylesheet" id="fancybox-css" href="assets/css/jquery.fancybox.1.3.23.min.css" type="text/css" media="screen">

</head>
<body>
<iframe src="HeaderController" style="width:100%;height: 180px;" ></iframe>
	<section class=" container">
		<div class="content-wrap" >
				
				 	<div class="widget git_postlist" style="margin-bottom:0">
				 	<ul >
					 	<c:forEach items="${listInfo.list}" var="communication">
					 		<li style="padding:10px 0;height:80px">
									<div class="thumbnail" style="margin-left:0;margin-top:0;height:80px;width:80px">
									<img  src="/nm/image/1.png" alt="${communication.studentId}" style="display:inline-block;width:80px;max-height:80px"></div>
									<a target="_blank" href="Com_inforController?ID=${communication.communicationId}" title="222" style="padding:0;margin:0;border-bottom:0">
									<span class="text" style="padding-left:10px;width:90%">${communication.words} 
									<span style="padding-right:100px;" class="pull-right">${communication.studentId}</span></span>
									</a>
									<span class="muted" style="padding-left:10px;width:90%">${communication.words} 
									<span style="padding-right:100px;" class=" pull-right">${communication.communicat_time}</span></span>
								
							</li>
						</c:forEach>
					</ul>
				 	</div>
				<div class="pagination">
					<ul>
					 <c:if test="${listInfo.currentPage>1 }">
					   	<li><a href="${pageContext.request.contextPath }/CommunicationController?currentPage=${listInfo.currentPage-1}">上一页</a></li>
					   </c:if>
						
						<c:forEach begin="${listInfo.beginPage }" end="${listInfo.endPage }" varStatus="status">
							<!-- 判断 -->
							<c:if test="${listInfo.currentPage eq status.index}">
								<li><span>${status.index}</span></li>
							</c:if>
							<c:if test="${listInfo.currentPage ne status.index}">
								<li><a href="${pageContext.request.contextPath }/CommunicationController?currentPage=${status.index}">${status.index}</a></li>
							</c:if>
							
						</c:forEach>
						<c:if test="${listInfo.currentPage < list11.totalPages }">
						 	<li class="next-page"><a href="${pageContext.request.contextPath }/CommunicationController?currentPage=${listInfo.currentPage+1}">下一页</a></li>
						</c:if>
						<c:if test="${listInfo.currentPage != list11.totalPages }">
							<li><a href="${pageContext.request.contextPath }/CommunicationController?currentPage=${listInfo.totalPages}">尾页</a></li>
						</c:if>
						<li><span>总页数：${listInfo.totalPages }</span></li>
						<li><span>贴子总数：${listInfo.totalRecord }</span></li>
					</ul>
				</div>
				<div id="respond" class="no_webshot"> 
					<div style="border-bottom: solid 10px #eee;width:100%"></div>
					<form action="AddCommunicationServlet?currentPage=${listInfo.currentPage}"" method="post" id="commentform"> 
						<div class="comt-author pull-left"> 发表我的贴子 </div> 
						<textarea placeholder="说点什么吧…" class="input-block-level comt-area" name="comment" id="comment" cols="100%" rows="5" tabindex="1" ></textarea> 
						<div class="comt-tips pull-right">
							<%-- <input type="hidden" name="commenter_ID" value="${resource.uploader}" id="comment_post_ID"> --%>
						</div> 
						<button class="btn btn-primary pull-right" type="submit" name="submit" id="submit" tabindex="5">
							<i class="fa fa-check-square-o"></i> 发表贴子
						</button> 
					</form> 
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