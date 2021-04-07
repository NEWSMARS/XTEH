<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
   <%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>下载视频</title>
</head>
<body>
	<div style="display:block;margin:100px auto;width:300px;height:400px;background:#eee;">
		<%-- <form action="ListFileServlet?ID=${resource.resourceId}" method="post">
			<input type="hidden" name="resource_code" value="${resource.code}" id="comment_post_ID">
			<!--  <textarea class="form-control" rows="5" name="describe" style="display:inline-block;width:98.8%"></textarea> -->
			<button type="submit" class="btn btn-primary  tj" style="width:100px;height:30px;margin-left:100px;background:#5fbaac" >下载视频</button>
		</form> --%>
		<div style="height:50px;background:#dbece8;text-align:center">
		 <div style="height:10px;width:100%"></div> 
		<h3 style="margin-top:0">下载视频</h2></div>
		<c:forEach var="me" items="${fileNameMap}">
			
			<c:url value="DownLoadServlet" var="downurl">
				<c:param name="filename" value="${me.key}"></c:param>
			</c:url>
			<c:if test="${resource.code == me.key}">
				<span style="margin-left:20px">${me.value}<a href="${downurl}">下载</a></span>
			</c:if>
			<br/>
		</c:forEach>
	</div>
</body>
</html>