<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>注册界面</title>
</head>
<body>
<center>
<h1 style="color:black">注册</h1>
<form  action="registerservlet?sid=${Student.studentId}" class="form-inline" >
	<div class="form-group" >-         
	</div>
	<div class="form-group" >-         
	</div>
	<div class="form-group" >请输入学生数据         
	</div>
		<div class="form-group" style="display: block">
			<label for="exampleInput">输入姓名</label>
			<input type="text" value="${Student.name}"  name="name" class="form-control">
		</div>
		<div class="form-group" style="display: block">
			<label for="exampleInput">登陆密码</label>
			<input type="text" value="${Student.password }"  name="password" class="form-control">
		</div>
		<div class="form-group" style="display: block">
			<label for="exampleInput">所在班级</label>
			<input type="text" value="${Student.CLASS}"  name="CLASS" class="form-control">
		</div>
		<%-- <div class="form-group" style="display: block">
			<label for="exampleInput">必或选修</label>
			<input type="text" value="${Student.majorOrEle}"  name="majorOrEle" class="form-control">
		</div> --%>
		<div class="form-group majorOrEle">
			<label for="exampleInput">必或选修</label>
		
			
			<c:if test="${Student.majorOrEle!=1&&Student.majorOrEle!=0}"> 
			
			<label for="exampleInput"><input type="radio"   name="majorOrEle" class="form-control" value="0" checked="checked" }>必修</label>
		<label for="exampleInput"><input type="radio" name="majorOrEle" class="form-control" value="1" >选修</label>
			
			</c:if>
		</div>
		<div class="form-group" style="display: block">
			<label for="exampleInput">任课老师</label>
			<input type="text" value="${Student.teacher }"  name="teacher" class="form-control">
		</div>
		<div class="form-group" style="display: block">
			<label for="exampleInput">自我描述</label>
			<input type="text" value="${Student.selfDescn}"  name="selfDescn" class="form-control">
		</div>
		
		
		<button type="submit" class="btn btn-default form-control" style="margin-top: 20px;margin-left: 100px;" >提交</button>
	</form>
</center>
</body>
</html>