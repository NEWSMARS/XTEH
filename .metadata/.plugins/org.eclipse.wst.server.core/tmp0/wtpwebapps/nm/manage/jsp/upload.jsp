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
    
    
<style>
        * {
      
            margin: 0;
            padding: 0;
        }
        /*图片上传*/
        
       /*  html,
        body {
            width: 100%;
            height: 100%;
        }
        
        .container {
            width: 100%;
            height: 100%;
            clear: both;
        } */
        
        .z_photo {
            width: 300px;
            height: 250px;
            padding: 0;
            overflow: auto;
            clear: both;
            margin: 0px 0px;
            border: 1px solid #555;
        }
        
        .z_photo img {
            width: 100px;
            height: 100px;
        }
        
        .z_addImg {
            float: left;
            margin-right: 20px;
        }
        
        .z_file {
            width: 100px;
            height: 100px;
            background: url(image/z_add.png) no-repeat;
            background-size: 100% 100%;
            float: left;
            margin-right: 20px;
        }
        
        .z_file input::-webkit-file-upload-button {
            width: 100px;
            height: 100px;
            border: none;
            position: absolute;
            outline: 0;
            opacity: 0;
        }
        
        .z_file input#file {
            display: block;
            width: 0px;
            border: 0px;
            padding: 0px;
            vertical-align: middle;
        }
        /*遮罩层*/
        
        .z_mask {
            width: 100%;
            height: 100%;
            background: rgba(0, 0, 0, .5);
            position: fixed;
            top: 0;
            left: 0;
            z-index: 999;
            display: none;
        }
        
        .z_alert {
            width: 300px;
            height: 200px;
            border-radius: .200px;
            background: #fff;
            font-size: 24px;
            text-align: center;
            position: absolute;
            left: 50%;
            top: 50%;
            margin-left: -150px;
            margin-top: -200px;
        }
        
        .z_alert p:nth-child(1) {
            line-height: 150px;
        }
        
        .z_alert p:nth-child(2) span {
            display: inline-block;
            width: 49%;
            height: 50px;
            line-height: 50px;
            float: left;
            border-top: 1px solid #ddd;
        }
        
        .z_cancel {
            border-right: 1px solid #ddd;
        }

    </style>
<style>@font-face{font-family:uc-nexus-iconfont;src:url(chrome-extension://pogijhnlcfmcppgimcaccdkmbedjkmhi/res/font_9qmmi8b8jsxxbt9.woff) format('woff'),url(chrome-extension://pogijhnlcfmcppgimcaccdkmbedjkmhi/res/font_9qmmi8b8jsxxbt9.ttf) format('truetype')}</style>
    
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
                    <li >
                    	<a href="UploadB" role="button" >上传视频</a>
                    </li>
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
                    </ul>
            </nav>
        </div>
        <!-- Main Content -->
       <form action="/nm/UploadHandleServlet22" enctype="multipart/form-data" method="post">
			<div class="content-wrap">
				<div style="height:334px;margin-top:100px;margin-left:80px">
					<label>选择封面</label><br/>
		            <div class="z_photo" style="display:inline-block;">
		            	
			            <div class="z_file">
			                <input  type="file" name="picture" id="file" value="" accept="image/*" multiple="" onchange="imgChange('z_photo','z_file');">
			            </div>
				        <div class="z_addImg" style="display: none;">
				        	<img src="#">
				        </div>
			        </div>
			        
			        <div class="z_mask"  style="display: none;">
			            <!--弹出框-->
			            <div class="z_alert">
			                <p>确定要删除这张图片吗？</p>
			                <p>
			                    <span class="z_cancel">取消</span>
			                    <span class="z_sure">确定</span>
			                </p>
			            </div>
			        </div>
			        <div style="margin-top:0px;">
			        	<label>选择视频文件</label>
		                <input name="thumb" id="thumb" type="file" style="width:458px;">
		            </div>
				</div>
				<div style="display:inline-block;width:500px;height:343px;">
			        <div class="form-group" style="display:inline-block;width:100%;margin-left:80px">
	                    <label>视频名字:</label>
	                    <input type="text" class="form-control" id="counts" name="count" placeholder="视频名字" style="display:inline-block;width:458px">
	                </div>
	                <div class="form-group" style="display:inline-block;width:100%;margin-left:80px">
	                    <label>主演姓名:</label>
	                    <input type="text" class="form-control" id="who" name="who" placeholder="主演" style="display:inline-block;width:458px">
	                </div>
			        <div  class="form-group " style="display:inline-block;width:100%;margin-left:80px">
	                    <label >视频分类:</label>
	                    <select  class="form-control" name="card"style="display:inline-block;width:458px">
	                         
	                         <option value="1">电影</option>
	                         <option value="2">电视剧</option>
	                         <option value="3">动漫</option>
	                         <option value="4">综艺</option>
	                         <option value="5">用户上传</option>
	                    </select>
	                </div>
	                <div class="form-group" style="display:inline-block;width:100%;margin-left:80px">
	                    <label>所属地区:</label>
	                    <input type="text" class="form-control" id="areas" name="area" placeholder="地区" style="display:inline-block;width:458px">
	                </div>
	                <div class="form-group" style="display:inline-block;width:100%;margin-left:80px">
	                    <label>视频语言:</label>
	                    <input type="text" class="form-control" id="languages" name="language" placeholder="语言" style="display:inline-block;width:458px">
	                </div>
	                <div class="form-group" style="display:inline-block;width:100%;margin-left:80px">
	                    <label>上映日期:</label>
	                    <input type="text" class="form-control" id="show_times" name="show_time" placeholder="上映日期" style="display:inline-block;width:458px">
	                </div>
	                <!-- <div class="form-group" style="display:inline-block;width:100%">
	                	<label>视频等级</label>
	                	<select class="form-control" name="level"style="display:inline-block;width:500px">
	                         <option value="初级">初级</option>
	                         <option value="中级">中级</option>
	                         <option value="高级">高级</option>
	                    </select>
	                </div> -->
	                
			     </div>
	            	
	                
	                <div class="form-group" style="display:inline-block;width:100%;margin-left:80px;margin-top:20px">
	                   <label >视频简介</label><br/>
	                   <textarea class="form-control" rows="5" name="describe" style="display:inline-block;width:70%;margin-top:2px"></textarea>
	                </div>
	                <input type="hidden" name="uploader" value="1">
			</div>
			<button type="submit" class="btn btn-primary  tj" style="height:45px;width:150px;margin-left:45%;background:#5fbaac" >上传</button>
		</form>
                
                
                               
                     
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
    function imgChange(obj1, obj2) {
        //获取点击的文本框
        var file = document.getElementById("file");
        //存放图片的父级元素
        var imgContainer = document.getElementsByClassName(obj1)[0];
        //获取的图片文件
        var fileList = file.files;
        //文本框的父级元素
        var input = document.getElementsByClassName(obj2)[0];
        var imgArr = [];
        //遍历获取到得图片文件
        for (var i = 0; i < fileList.length; i++) {
            var imgUrl = window.URL.createObjectURL(file.files[i]);
            imgArr.push(imgUrl);
            var img = document.createElement("img");
            img.setAttribute("src", imgArr[i]);
            var imgAdd = document.createElement("div");
            imgAdd.setAttribute("class", "z_addImg");
            imgAdd.appendChild(img);
            imgContainer.appendChild(imgAdd);
        };
        imgRemove();
    };

    function imgRemove() {
        var imgList = document.getElementsByClassName("z_addImg");
        var mask = document.getElementsByClassName("z_mask")[0];
        var cancel = document.getElementsByClassName("z_cancel")[0];
        var sure = document.getElementsByClassName("z_sure")[0];
        for (var j = 0; j < imgList.length; j++) {
            imgList[j].index = j;
            imgList[j].onclick = function() {
                var t = this;
                mask.style.display = "block";
                cancel.onclick = function() {
                    mask.style.display = "none";
                };
                sure.onclick = function() {
                    mask.style.display = "none";
                    t.style.display = "none";
                };

            }
        };
    };
</script>
</body>

</html>
