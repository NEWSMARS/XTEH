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
			<div class="widget git_postlist" >
			<div style="height:100px;background: #fafbfc;">
				<div style="margin:0 20px 0 20px;padding:40px 0 10px 0;font-size:25px">${listInfo1.list.get(0).words}</div>
			</div>
			<ul>
			<c:forEach items="${listInfo.list}" var="Interchange">
			    <li style="padding:10px 0;height:180px">
					<div class="thumbnail" style="display:inline-block;margin-left:0;margin-top:0;height:150px;width:80px;background: #fafbfc;">
					<img  src="/nm/image/1.png" alt="${Interchange.studentId}" style="display:inline-block;width:80px;max-height:80px">
						<span style="display:block;margin-left:20px;margin-top:20px">${Interchange.studentId}</span>
					</div>
					<div class="text" style="display:block;padding-left:10px;width:90%;height:150px">${Interchange.comment} </div>
					<div class="muted pull-right" style="border-bottom: solid 1px #eee;width:100%">
						<div style="margin-right:10px;margin-bottom:10px;" class="pull-right">
							<span style="display:inline-block">${Interchange.comment_time}</span>
							<!-- <a class="reply" style="display:inline-block;padding:0;margin:0;border-bottom:0 ;top:4px" >回复</a>
							 -->
						</div>
					
<%-- 						<div style="display:none;width:100%;height:400px;" class="reply_list" >
								<div style="margin-left:100px;margin-top:20px;height:380px;overflow: auto;background:#fafbfc">
									
									<ul>
									<c:forEach items="${listflow.list}" var="Interflow">
										<li style="padding:10px 0;height:30px">
											<div class="thumbnail" style="display:inline-block;margin-left:0;margin-top:0;height:30px;width:30px;background: #fafbfc;">
												<img  src="/nm/upload/1.png" alt="${Interflow.comment}" style="display:inline-block;width:30px;max-height:30px">
											</div>
											<div class="text" style="display:block;padding-left:10px;width:90%;height:20px;">${Interflow.comment} </div>
											<div class="muted pull-right" style="border-bottom: solid 1px #eee;width:100%;height:20px">
												<div style="margin-right:10px;" class="pull-right">
													<span style="display:inline-block">${Interflow.comment_time}</span>
													<a class="reply2" style="display:inline-block;padding:0;margin:0;border-bottom:0 ;top:4px">回复</a>
												</div>
											</div>	
											<div id="respond" class="no_webshot reply2_submit" style="margin-top:20px;display:none;width:100%"> 
												<div style="border-bottom: solid 10px #eee;width:100%"></div>
												<form action="AddInterflowServlet?currentPage=${listInfo.currentPage}" method="post" id="commentform"> 
													<div class="comt-author pull-left"> 发表我的评论 </div> 
													<textarea placeholder="说点什么吧…" class="input-block-level comt-area" name="comment" id="comment" cols="100%" rows="5" tabindex="1" ></textarea> 
													<div class="comt-tips pull-right">
														 <input type="hidden" name="commenter_ID" value="${listInfo.list.get(0).studentId}" id="comment_post_ID"> 
														 <input type="hidden" name="communication_ID" value="${listInfo.list.get(0).communicationId}" id="comment_post_ID"> 
														  <input type="hidden" name="interchange_ID" value="${listInfo.list.get(0).interchangeId}" id="comment_post_ID"> 
													</div> 
													<button class="btn btn-primary pull-right" type="submit" name="submit" id="submit" tabindex="5">
														<i class="fa fa-check-square-o"></i> 发表评论
													</button> 
												</form> 
											</div>	
										</li>
										</c:forEach>
									</ul>
								</div>
							</div>
 --%>					</div>		
				</li>
				 
				</c:forEach>
				
			</ul>
			</div>
			<div class="pagination">
					<ul>
					 <c:if test="${listInfo.currentPage>1 }">
					   	<li><a href="${pageContext.request.contextPath }/Com_inforController?currentPage=${listInfo.currentPage-1}">上一页</a></li>
					   </c:if>
						
						<c:forEach begin="${listInfo.beginPage }" end="${listInfo.endPage }" varStatus="status">
							<!-- 判断 -->
							<c:if test="${listInfo.currentPage eq status.index}">
								<li><span>${status.index}</span></li>
							</c:if>
							<c:if test="${listInfo.currentPage ne status.index}">
								<li><a href="${pageContext.request.contextPath }/Com_inforController?currentPage=${status.index}">${status.index}</a></li>
							</c:if>
							
						</c:forEach>
						<c:if test="${listInfo.currentPage < list11.totalPages }">
						 	<li class="next-page"><a href="${pageContext.request.contextPath }/Com_inforController?currentPage=${listInfo.currentPage+1}">下一页</a></li>
						</c:if>
						<c:if test="${listInfo.currentPage != list11.totalPages }">
							<li><a href="${pageContext.request.contextPath }/Com_inforController?currentPage=${listInfo.totalPages}">尾页</a></li>
						</c:if>
						<li><span>总页数：${listInfo.totalPages }</span></li>
						<li><span>回复总数：${listInfo.totalRecord }</span></li>
					</ul>
				</div>
				 <div id="respond" class="no_webshot"> 
					<div style="border-bottom: solid 10px #eee;width:100%"></div>
					<form action="AddInterchangeServlet?currentPage=${listInfo.currentPage}" method="post" id="commentform"> 
						<div class="comt-author pull-left"> 发表我的评论 </div> 
						<textarea placeholder="说点什么吧…" class="input-block-level comt-area" name="comment" id="comment" cols="100%" rows="5" tabindex="1" ></textarea> 
						<div class="comt-tips pull-right">
							 <input type="hidden" name="commenter_ID" value="${listInfo.list.get(0).studentId}" id="comment_post_ID"> 
							 <input type="hidden" name="communication_ID" value="${listInfo.list.get(0).communicationId}" id="comment_post_ID"> 
						</div> 
						<button class="btn btn-primary pull-right" type="submit" name="submit" id="submit" tabindex="5">
							<i class="fa fa-check-square-o"></i> 发表评论
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
		<script type="text/javascript">
								var replys= document.getElementsByClassName("reply");
								var reply_lists = document.getElementsByClassName("reply_list");
								var replys2= document.getElementsByClassName("reply2");
								var reply2_submit = document.getElementsByClassName("reply2_submit");
								
								
										
											for(var i = 0;i<replys.length;i++)
												{
												(function(k){
													replys[i].onclick = function(){
														if(reply_lists[k].style.display!="none")
															reply_lists[k].style.display = "none";
														else{
															reply_lists[k].style.display = "inline-block";
														}
														console.log(k);
														};
														
														replys2[i].onclick = function(){
															if(reply2_submit[k].style.display!="none")
																reply2_submit[k].style.display = "none";
															else{
																reply2_submit[k].style.display = "inline-block";
															}
															console.log(k);
															};
													
												})(i);

										}
								
								
						</script>
</body>
</html>