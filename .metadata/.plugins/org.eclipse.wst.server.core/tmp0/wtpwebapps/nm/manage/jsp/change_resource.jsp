<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %><%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>

<head>
    <title>后台管理系统</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- Fonts -->
    <link href='http://fonts.googleapis.com/css?family=Roboto+Condensed:300,400' rel='stylesheet' type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=Lato:300,400,700,900' rel='stylesheet' type='text/css'>
    <!-- CSS Libs -->
    <link rel="stylesheet" type="text/css" href="manage/lib/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="manage/lib/css/font-awesome.min.css">
    <link rel="stylesheet" type="text/css" href="manage/lib/css/animate.min.css">
    <link rel="stylesheet" type="text/css" href="manage/lib/css/bootstrap-switch.min.css">
    <link rel="stylesheet" type="text/css" href="manage/lib/css/checkbox3.min.css">
    <link rel="stylesheet" type="text/css" href="manage/lib/css/jquery.dataTables.min.css">
    <link rel="stylesheet" type="text/css" href="manage/lib/css/dataTables.bootstrap.css">
    <link rel="stylesheet" type="text/css" href="manage/lib/css/select2.min.css">
    <!-- CSS App -->
    <link rel="stylesheet" type="text/css" href="manage/css/style.css">
    <link rel="stylesheet" type="text/css" href="manage/css/themes/flat-blue.css">
    	<link rel="stylesheet" type="text/css" href="manage/iconfont/iconfont.css">
    <link rel="stylesheet" type="text/css" href="manage/bootstrap-3.3.7-dist/css/bootstrap.min.css">
	<script type="text/javascript" src="manage/js/jquery-3.4.1.min.js"></script>
	<script type="text/javascript" src="manage/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>

<body class="flat-blue">
<div class="app-container">
    <div class="row content-container">
        <!-- 顶部导航 -->
        <nav class="navbar navbar-default navbar-fixed-top navbar-top">
            <div class="container-fluid">
                <div class="navbar-header">
                    <button type="button" class="navbar-expand-toggle">
                        <i class="fa fa-bars icon"></i>
                    </button>
                    <ol class="breadcrumb navbar-breadcrumb">
                        <li class="active">后台信息</li>
                    </ol>
                    <button type="button" class="navbar-right-expand-toggle pull-right visible-xs">
                        <i class="fa fa-th icon"></i>
                    </button>
                </div>
                <ul class="nav navbar-nav navbar-right">
                    
                    <li class="dropdown profile">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">${User_name}<span class="caret"></span></a>
                        <ul class="dropdown-menu animated fadeInDown">
                            <li class="profile-img">
                                <img src="manage/img/profile/picjumbo.com_HNCK4153_resize.jpg" class="profile-img">
                            </li>
                            <li>
                                <div class="profile-info">
                                    <h4 class="username">${User_name}</h4>
                                    <p>${User_email}</p>
                                    <div class="btn-group margin-bottom-2x" role="group">
                                        <button type="button" class="btn btn-default"><i class="fa fa-user"></i> Profile
                                        </button>
                                        <button type="button" class="btn btn-default" onclick="location='loginservlet'"><i class="fa fa-sign-out"></i>
                                            Logout
                                        </button>
                                    </div>
                                </div>
                            </li>
                        </ul>
                    </li>
                </ul>
            </div>
        </nav>
        <!-- 侧边栏 -->
        <div class="side-menu sidebar-inverse">
            <nav class="navbar navbar-default" role="navigation">
                <div class="side-menu-container">
                    <div class="navbar-header">
                        <a class="navbar-brand" href="#">
                            <div class="icon fa fa-paper-plane"></div>
                              <div class="title">后台管理</div>
                        </a>
                        <button type="button" class="navbar-expand-toggle pull-right visible-xs">
                            <i class="fa fa-times icon"></i>
                        </button>
                    </div>
                    <ul class="nav navbar-nav">
                        <li class="active">
                            <a href="mindex">
                                <span class="icon fa fa-tachometer"></span><span class="title">后台信息</span>
                            </a>
                        </li>
                        <li class="panel panel-default dropdown">
                            <a data-toggle="collapse" href="#dropdown-element">
                                <span class="icon fa fa-desktop"></span><span class="title">用户信息管理</span>
                            </a>
                            <!-- Dropdown level 1 -->
                            <div id="dropdown-element" class="panel-collapse collapse">
                                <div class="panel-body">
                                    <ul class="nav navbar-nav">
  
                                        <li><a href="m_find_student">用户查询</a>
                                        </li>
                                        <li><a href="m_find_teacher">管理员查询</a>
                                        </li>
                                       
                                        <li><a href="m_studentadd1">添加用户</a>
                                        </li>
                                         <li><a href="m_teacher1">添加管理员</a>
                                        </li>
 
                                    </ul>
                                </div>
                            </div>
                        </li>
                         
                            
                        <li class="panel panel-default dropdown">
                            <a data-toggle="collapse" href="#dropdown-table">
                                <span class="icon fa fa-table"></span><span class="title">信息批量导入</span>
                            </a>
                            <!-- Dropdown level 1 -->
                            <div id="dropdown-table" class="panel-collapse collapse">
                                <div class="panel-body">
                                    <ul class="nav navbar-nav">
                                        <li><a href="m_student_add2">用户信息批量导入</a>
                                        </li>
     
                                    </ul>
                                </div>
                            </div>
                        </li>
                        <li class="panel panel-default dropdown">
                            <a data-toggle="collapse" href="#dropdown-form">
                                <span class="icon fa fa-file-text-o"></span><span class="title">资源管理</span>
                            </a>
                            <!-- Dropdown level 1 -->
                            <div id="dropdown-form" class="panel-collapse collapse">
                                <div class="panel-body">
                                    <ul class="nav navbar-nav">
                                        <li><a href="m_resoure">查询资源</a>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                        </li>

                        <!-- Dropdown-->
                        <li class="panel panel-default dropdown">
                            <a data-toggle="collapse" href="#component-example">
                                <span class="icon fa fa-cubes"></span><span class="title">交流区管理</span>
                            </a>
                            <!-- Dropdown level 1 -->
                            <div id="component-example" class="panel-collapse collapse">
                                <div class="panel-body">
                                    <ul class="nav navbar-nav">
                                             
                                        <li><a href="m_post_set">贴吧设置</a>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                        </li>
            </nav>
        </div>
            
            <body>
            <style type="text/css">
		.form-inline .form-group{
			display: block;
			margin-top: 20px;
		}
		.form-inline label{
			margin-right: 30px;
		}
	</style>
	<form  action="m_change_r22?resourceId=${Resource.resourceId}" class="form-inline" style="margin-left: 40%;margin-top: 50px" method="post">
	<div class="form-group" >-         
	</div>
	<div class="form-group" >-         
	</div>
	<div class="form-group" >请修改资源数据         
	</div>
	
			
				<div class="form-group">
			<label for="exampleInput">视频分类</label>
			<select  name="categoryId" class="form-control categoryId" >
					 <option value="5">用户上传</option>
	                         <option value="2">电影</option>
	                         <option value="3">电视剧</option>
	                         <option value="4">动漫</option>
	                         <option value="1">综艺</option>
	                 
	
				</select>
		</div>		
													
	
		<div class="form-group" style="display: block">
			<label for="exampleInput">视频名字</label>
			<input type="text" value="${Resource.name}"  name="name" class="form-control">
		</div>
		 <div class="form-group" style="display: block">
			<label for="exampleInput">主演姓名</label>
			<input type="text" value="${Resource.who}"  name="who" class="form-control">
		</div> 
		
	
		<div class="form-group" style="display: block">
			<label for="exampleInput">运行效果</label>
			<input type="text" value="${Resource.image}"  name="image" class="form-control">
		</div>
		
		<div class="form-group" style="display: block">
			<label for="exampleInput">源代码处</label>
			<input type="text" value="${Resource.code}"  name="code" class="form-control">
		</div>
		 <div class="form-group" style="display: block">
			<label for="exampleInput">所属地区</label>
			<input type="text" value="${Resource.area}"  name="area" class="form-control">
		</div> 
		<div class="form-group" style="display: block">
			<label for="exampleInput">视频语言</label>
			<input type="text" value="${Resource.language}"  name="language" class="form-control">
		</div> 
		<div class="form-group" style="display: block">
			<label for="exampleInput">视频简介</label>
			<input type="text" value="${Resource.descn}"  name="descn" class="form-control">
		</div>
		
		<button type="submit" class="btn btn-default form-control" style="margin-top: 20px;margin-left: 100px;" >提交</button>
	</form>
	
	<script type="text/javascript">
//获取url中的参数值
var staff_id,update=0;
$(function () {
   (function ($) {
        $.getUrlParam = function (name) {
            var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)");
            var r = window.location.search.substr(1).match(reg);
            if (r != null) 
            	// return unescape(r[2]); 不能传输中文
            	return decodeURI(r[2]); 
            return null;
        }
    })(jQuery);
    update = $.getUrlParam('update');
     staff_id = $.getUrlParam('staff_id');
     //如果是修改用户，改变表单提交地址
    /*  if(staff_id!=null) $("form").attr('href','update_staff_servlet'); */
     
     
});
$(document).ready(function(){
	$(".categoryId").val("${staff.categoryId}");
	$(".level").val("${Resource.categoryId}");
	// $('.up_dept').attr('value',up_dept);
});
	</script>
</body>
  
<!-- Javascript Libs -->
<script type="text/javascript" src="manage/lib/js/jquery.min.js"></script>
<script type="text/javascript" src="manage/lib/js/bootstrap.min.js"></script>
<script type="text/javascript" src="manage/lib/js/Chart.min.js"></script>
<script type="text/javascript" src="manage/lib/js/bootstrap-switch.min.js"></script>
<script type="text/javascript" src="manage/lib/js/jquery.matchHeight-min.js"></script>
<script type="text/javascript" src="manage/lib/js/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="manage/lib/js/dataTables.bootstrap.min.js"></script>
<script type="text/javascript" src="manage/lib/js/select2.full.min.js"></script>
<script type="text/javascript" src="manage/lib/js/ace/ace.js"></script>
<script type="text/javascript" src="manage/lib/js/ace/mode-html.js"></script>
<script type="text/javascript" src="manage/lib/js/ace/theme-github.js"></script>
<!-- Javascript -->
<script type="text/javascript" src="manage/js/app.js"></script>
<script type="text/javascript" src="manage/js/index.js"></script>
</body>

</html>
