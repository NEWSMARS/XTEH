<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>上传资源</title>
<link rel="stylesheet" id="style-css" href="assets/css/style.css" type="text/css" media="all"> 
<link rel="stylesheet" id="fancybox-css" href="assets/css/jquery.fancybox.1.3.23.min.css" type="text/css" media="screen">

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
<body>
	<iframe src="HeaderController" style="width:100%;height: 180px;" ></iframe>
	<section class=" container">
		<div class="breadcrumbs">
			<a title="返回首页" href="index.jsp">
				<i class="fa fa-home"></i>
			</a>
			<small>&gt;</small> 
			<a href="menu_design.jsp">上传视频</a>
			<span class="muted"></span>
		</div>
		<form action="/nm/UploadHandleServlet" enctype="multipart/form-data" method="post">
			<div class="content-wrap">
				<div style="height:334px;margin-top:10px">
					<label>选择封面</label>
		            <div class="z_photo" style="display:inline-block;">
		            	
			            <div class="z_file">
			                <input  type="file" name="picture" id="file" value="" accept="image/*" multiple="" onchange="imgChange('z_photo','z_file');">
			            </div>
				        <div class="z_addImg" style="display: none;">
				        	<img src="#">
				        </div>
			        </div>
			        
			        <div class="z_mask" style="display: none;">
			            <!--弹出框-->
			            <div class="z_alert">
			                <p>确定要删除这张图片吗？</p>
			                <p>
			                    <span class="z_cancel">取消</span>
			                    <span class="z_sure">确定</span>
			                </p>
			            </div>
			        </div>
			        <div style="margin-top:8px;">
			        	<label>选择视频文件</label>
		                <input name="thumb" id="thumb" type="file" style="width:458px;">
		            </div>
				</div>
				<div style="display:inline-block;width:500px;height:57px;">
			        <div class="form-group" style="display:inline-block;width:100%">
	                    <label>视频名字</label>
	                    <input type="text" class="form-control" id="counts" name="count" placeholder="视频名字" style="display:inline-block;width:458px">
	                </div>
	                <!-- <div class="form-group" style="display:inline-block;width:100%">
	                    <label>主演</label>
	                    <input type="text" class="form-control" id="who" name="who" placeholder="主演" style="display:inline-block;width:458px">
	                </div>
			        <div  class="form-group " style="display:inline-block;width:100%">
	                    <label >视频分类</label>
	                    <select  class="form-control" name="card"style="display:inline-block;width:500px">
	                         <option value="5">用户上传</option>
	                         <option value="2">电影</option>
	                         <option value="3">电视剧</option>
	                         <option value="4">动漫</option>
	                         <option value="1">综艺</option>
	                    </select>
	                </div>
	                <div class="form-group" style="display:inline-block;width:100%">
	                    <label>地区</label>
	                    <input type="text" class="form-control" id="areas" name="area" placeholder="地区" style="display:inline-block;width:458px">
	                </div>
	                <div class="form-group" style="display:inline-block;width:100%">
	                    <label>语言</label>
	                    <input type="text" class="form-control" id="languages" name="language" placeholder="语言" style="display:inline-block;width:458px">
	                </div>
	                <div class="form-group" style="display:inline-block;width:100%">
	                    <label>上映日期</label>
	                    <input type="text" class="form-control" id="show_times" name="show_time" placeholder="上映日期" style="display:inline-block;width:458px">
	                </div> -->
	                <!-- <div class="form-group" style="display:inline-block;width:100%">
	                	<label>视频等级</label>
	                	<select class="form-control" name="level"style="display:inline-block;width:500px">
	                         <option value="初级">初级</option>
	                         <option value="中级">中级</option>
	                         <option value="高级">高级</option>
	                    </select>
	                </div> -->
	                
			     </div>
	            	
	                
	                <div class="form-group">
	                   <label >视频简介</label>
	                   <textarea class="form-control" rows="5" name="describe" style="display:inline-block;width:98.8%"></textarea>
	                </div>
	                <input type="hidden" name="uploader" value="1">
			</div>
			<button type="submit" class="btn btn-primary  tj" style="width:100px;margin-left:46.8%" >上传</button>
		</form>
	</section>
	<div class="footer-inner">
		<div class="footer-copyright"> 友情链接:
			<a href="https://www.ziyuan.tv" title="资源分享网" >&nbsp;资源分享网</a> 
		</div>
	</div>
	<script type="text/javascript">
        //px转换为rem
        /* (function(doc, win) {
            var docEl = doc.documentElement,
                resizeEvt = 'orientationchange' in window ? 'orientationchange' : 'resize',
                recalc = function() {
                    var clientWidth = docEl.clientWidth;
                    if (!clientWidth) return;
                    if (clientWidth >= 640) {
                        docEl.style.fontSize = '100px';
                    } else {
                        docEl.style.fontSize = 100 * (clientWidth / 640) + 'px';
                    }
                };

            if (!doc.addEventListener) return;
            win.addEventListener(resizeEvt, recalc, false);
            doc.addEventListener('DOMContentLoaded', recalc, false);
        })(document, window); */

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