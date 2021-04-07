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
			<div class="content">
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
				
				<div class="article-site" style="background:#fff">
						<div >
						        <img data-original="#" alt=" 11111" title="111111" class="aligncenter size-full wp-image-15151" 
								src="/nm/upload/${resource.image}" style="display: inline-block;width:194px;height:260px;margin-right:20px">
								<small style="background: url(image/tips-black.png);width: 194px;height: 26px;line-height: 26px;color: #FFF;position: absolute;left: 0px;bottom: 1220px;text-align: center;">${resource.name}</small>
							
						   <div style="display:inline-block;width:300px;height:260px;">
						        	<h1 style="margin-left:0">${resource.name}</h1>
							        <p >主演：${resource.who}</p>
							        <p >类型：
							        	<c:if test="${resource.categoryId == 1}">电影</c:if>
										<c:if test="${resource.categoryId == 2}">电视剧</c:if>
										<c:if test="${resource.categoryId == 3}">动漫</c:if>
										<c:if test="${resource.categoryId == 4}">综艺</c:if>
										<c:if test="${resource.categoryId == 5}">用户上传</c:if>
										</p>
							        <p >地区：${resource.area}</p>
							        <p >语言：${resource.language}</p>
							        <p >上映日期：${resource.show_time}</p>
							        <p >更新日期：${resource.publish_time}</p>
							        <p >简介：${resource.descn}</p>
							        <span style="display:block;overflow:hidden; width:0; height:0;"> 111 </span>
							</div>  
						</div>
						<div style="display:block;height:125px;margin:15px 0;border:2px solid #dbece8;background:#dbece8">
							<div>
								<h3>云视频在线播放</h3>
							</div>
							<div style="background:#fff;height:80px;">
								<div style="height:20px;width:100%"></div>
								<div style="display:block;background:#5fbaac;width:80px;height:34px;margin:0 20px">
									<div style="height:5px;width:80px"></div>
									<a target="_blank" title="播放" href="${pageContext.request.contextPath}/PlayController?ID=${resource.resourceId}"  style="line-height:20px;color:#fff;font-size:17px;text-align:center;margin: 0 22px ;">播放</a>
								</div>
							</div>
						</div>
						<div style="display:block;height:125px;margin:15px 0;border:2px solid #dbece8;background:#dbece8">
							<div>
								<h3>下载地址</h3>
							</div>
							<div style="background:#fff;height:80px;">
								<div style="height:20px;width:100%"></div>
								<div style="display:block;background:#5fbaac;width:80px;height:34px;margin:0 20px">
									<div style="height:5px;width:80px"></div>
									<a title="下载" href="${pageContext.request.contextPath}/ListFileServlet?ID=${resource.resourceId}"  style="line-height:20px;color:#fff;font-size:17px;text-align:center;margin: 0 22px ;">下载</a>
								</div>
							</div>
						</div>
						 <div style="height:200px;background:#f7f7f7">
						 <div style="background:#dbece8;height:45px;">
						 	<h2 style="padding-top:5px">${resource.name}的剧情简介</h2>
						 </div>
						 	
						 	<p style="margin-left:20px">${resource.descn}</p>
						 </div>
						  	
						  	
						  	
						  	
				</div>
				<div id="respond" class="no_webshot" style="margin-top:30px"> 
					<form action="AddCommentServlet" method="post" id="commentform"> 
						<div class="comt-title"> <div class="comt-avatar pull-left"> 
							<img alt="" src="/nm/image/1.png" style="display: block;width:48px;height:48px" 
							srcset="https://secure.gravatar.com/avatar/?s=108&amp;d=https%3A%2F%2Fwww.ziyuan.tv%2Fwp-content%2Fthemes%2FGit-alpha%2Fassets%2Fimg%2Fdefault.png&amp;r=g 2x" class="avatar avatar-54 photo avatar-default" height="54" width="54"> </div> 
							<div class="comt-author pull-left"> 发表我的评论 </div> 
							<a id="cancel-comment-reply-link" class="pull-right" href="javascript:;">取消评论</a> 
						</div>
						<textarea placeholder="说点什么吧…" class="input-block-level comt-area" name="comment" id="comment" cols="100%" rows="3" tabindex="1" ></textarea> 
						<div class="comt-tips pull-right">
							<input type="hidden" name="commenter_ID" value="${resource.uploader}" id="comment_post_ID">
							<input type="hidden" name="resource_ID" value="${resource.resourceId}" id="comment_post_ID">
						</div> 
						<button class="btn btn-primary pull-right" type="submit" name="submit" id="submit" tabindex="5">
							<i class="fa fa-check-square-o"></i> 提交评论
						</button> 
					</form> 
				</div>
				<div id="comments"style="margin-top:60px;border-top:1px solid #dbece8;"> 
						<i class="fa fa-comments-o"></i> 
						一起吐槽 
					</div>
				<div id="postcomments" style="height:350px;overflow: auto;"> 
					 
					<c:forEach items="${comment_list}" var="resource_comment_view">
					<%-- //<c:if test="${resource.resourceId == comment.resourceId}"> --%>
					<ol class="commentlist"> 
							<li class="comment even thread-even depth-1" id="comment-9228">
								<div class="c-avatar">
									<img alt="" data-original="https://secure.gravatar.com/avatar/73d0c54c94e077513f7f28460ad18dcc?s=54&amp;d=https%3A%2F%2Fwww.ziyuan.tv%2Fwp-content%2Fthemes%2FGit-alpha%2Fassets%2Fimg%2Fdefault.png&amp;r=g" 
									srcset="https://secure.gravatar.com/avatar/73d0c54c94e077513f7f28460ad18dcc?s=108&amp;d=https%3A%2F%2Fwww.ziyuan.tv%2Fwp-content%2Fthemes%2FGit-alpha%2Fassets%2Fimg%2Fdefault.png&amp;r=g 2x" class="avatar avatar-54 photo" height="54" width="54" 
									src="/nm/image/1.png" style="display: block;width:48px;height:48px">
									<div class="c-main" id="div-comment-9228">${resource_comment_view.words}<div class="c-meta">
										<span class="c-author">${resource_comment_view.studentId}</span>${resource_comment_view.comment_time}
										</div>
									</div>
								</div>
							</li>
						
						<!-- #comment-## --> 
					</ol> 
					</c:forEach>
					<div class="commentnav"> </div>
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
						 	<span class="text">${resource.name}</span>
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