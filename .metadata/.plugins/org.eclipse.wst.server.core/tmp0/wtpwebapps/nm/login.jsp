<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>	
<head>
<title>Login</title>
<meta name="viewport" content="width=device-width, initial-scale=1" charset="UTF-8">
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<meta name="keywords" content="Flat Dark Web Login Form Responsive Templates, Iphone Widget Template, Smartphone login forms,Login form, Widget Template, Responsive Templates, a Ipad 404 Templates, Flat Responsive Templates" />
<link href="css/style.css" rel='stylesheet' type='text/css' />
<!--webfonts-->
<link href='http://fonts.useso.com/css?family=PT+Sans:400,700,400italic,700italic|Oswald:400,300,700' rel='stylesheet' type='text/css'>
<link href='http://fonts.useso.com/css?family=Exo+2' rel='stylesheet' type='text/css'>
<!--//webfonts-->
<script src="http://ajax.useso.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
</head>
<body>
<script type="text/javascript">
	$(function() {
		var loginfo = '${loginfo}';
		if (loginfo != "") {
			$.messager.alert('登录失败', loginfo, 'error');
		}
	});
</script>
 <!--SIGN UP-->
 <h1>欢迎使用！</h1>
<div class="login-form">
	<div class="close"> </div>
		<div class="head-info">
			<label class="lbl-1"> </label>
			<label class="lbl-2"> </label>
			<label class="lbl-3"> </label>
		</div>
			<div class="clear"> </div>
	<div class="avtar">
		<img src="images/avtar.png" />
	</div>
			<form method="post" action="loginservlet">
		
					 <input type="text" class="text" name="userid"  onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'number';}" >
						<div class="key">
					<input type="password" name="password"  onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'password';}">
						</div>
					<div class="signin">
		<input  id="input_submit" type="submit"  value="登录" >
	</div></form>
	<div class="signin">
		<a href="register.jsp"><input type="button"  value="注册" ></a>
	</div>
	</div>
			
			
			
	
		<div class="tips" id="${is_true}">用户名/密码错误</div>
	<script type="text/javascript">
		function tip_none(){
			$(".tips").text("用户名/密码不能为空");
			$(".tips").css("display","inline-block");
			
			setTimeout(function(){
				$(".tips").css("display","none");
				$(".tips").text("用户名/密码错误");
			},3000);
		};
		function tip_error(){
			$(".tips").css("display","inline-block");
			setTimeout(function(){
				$(".tips").css("display","none");
			},3000);
		};

		$(document).ready(function(){
			$(".submit").click(function(){
				 if ($(".text").val()&&$(".password").val()) return ture;
				 else {
					tip_none();
					return false;
				 };
			});
		});
		
		if($("#0").length){
			tip_error();
		} 
	</script>
	
</body>
</html>