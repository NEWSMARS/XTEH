<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
  
                                        <li><a href="m_find_student">学生查询</a>
                                        </li>
                                        <li><a href="m_find_teacher">教师查询</a>
                                        </li>
                                       
                                        <li><a href="m_studentadd1">添加学生</a>
                                        </li>
                                         <li><a href="m_teacher1">添加教师</a>
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
                                        <li><a href="m_student_add2">学生信息批量导入</a>
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
                                                   <li><a href="m_post_set">帖子权限设置</a>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                        </li>
            </nav>
        </div>
        <!-- Main Content -->
        <div class="container-fluid" id="main_content">
            <div class="side-body padding-top">
                <div class="row">
                    <div class="col-lg-3 col-md-6 col-sm-6 col-xs-12">
                        <a href="#">
                            <div class="card red summary-inline">
                                <div class="card-body">
                                    <i class="icon fa fa-inbox fa-4x"></i>
                                    <div class="content">
                                        <div class="title">${student_count}</div>
                                        <div class="sub-title">学生人数</div>
                                    </div>
                                    <div class="clear-both"></div>
                                </div>
                            </div>
                        </a>
                    </div>
                    <div class="col-lg-3 col-md-6 col-sm-6 col-xs-12">
                        <a href="#">
                            <div class="card yellow summary-inline">
                                <div class="card-body">
                                    <i class="icon fa fa-comments fa-4x"></i>
                                    <div class="content">
                                        <div class="title">${teacher_count}</div>
                                        <div class="sub-title">教师人数</div>
                                    </div>
                                    <div class="clear-both"></div>
                                </div>
                            </div>
                        </a>
                    </div>
                    <div class="col-lg-3 col-md-6 col-sm-6 col-xs-12">
                        <a href="#">
                            <div class="card green summary-inline">
                                <div class="card-body">
                                    <i class="icon fa fa-tags fa-4x"></i>
                                    <div class="content">
                                        <div class="title">${resource_count}</div>
                                        <div class="sub-title">资源总数</div>
                                    </div>
                                    <div class="clear-both"></div>
                                </div>
                            </div>
                        </a>
                    </div>
                    <div class="col-lg-3 col-md-6 col-sm-6 col-xs-12">
                        <a href="#">
                            <div class="card blue summary-inline">
                                <div class="card-body">
                                    <i class="icon fa fa-share-alt fa-4x"></i>
                                    <div class="content">
                                        <div class="title">16</div>
                                        <div class="sub-title">帖子总数</div>
                                    </div>
                                    <div class="clear-both"></div>
                                </div>
                            </div>
                        </a>
                    </div>
                </div>
                
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
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

<script>
    function changeContent(url, obj) {

        $("li.active").removeClass("active");
        $("#" + obj).addClass("active");
        $.ajax({
            type: "get",
            async: true,  //同步请求
            url: url,
            timeout: 60000, //请求超时时间，数据统计功能较为耗时，此处为兼容其设置
            success: function (htmlData) {
                $("#main_content").html(htmlData);
            },
            error: function (request) {
                alert('操作失败，请稍候重试。' + request.status + ' - ' + url);
            }
        });
    }
</script>
</body>

</html>
