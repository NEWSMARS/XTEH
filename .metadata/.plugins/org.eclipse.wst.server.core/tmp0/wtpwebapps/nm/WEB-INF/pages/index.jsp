<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
   <%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>私人影院</title>
<link rel="stylesheet" id="style-css" href="${pageContext.request.contextPath}/assets/css/style.css" type="text/css" media="all"> 
<link rel="stylesheet" id="fancybox-css" href="${pageContext.request.contextPath}/assets/css/jquery.fancybox.1.3.23.min.css" type="text/css" media="screen">

<style>
*{margin: 0;padding: 0;}
  
  .box{
      width: 1186px;
      height: 240px;
      margin: auto 24px;
      overflow: hidden;
      position: relative;
  }
 .contents{
     width: 1386px;
     height: 220px;
     overflow: hidden;
     position: relative;
 }
 .contents div{
     position: absolute;
     height:220px;
     top: 0;
     left: 0;
 }

 .contents div img{
 	margin-right:10px;
     width: 184px;
     height: 220px;
 }

 
.control{
     width: 0;
     height: 0;
     text-align: center;
 }
 .control-bar{
     display: inline-block;
     width: 24px;
     height: 5px;
     margin: 12px 2px 0 2px;
     cursor: pointer;
 }
 .control .control-bar:hover{
 }
 
 .control .control-bar.current{
 }
 #pre, #next{
     position: absolute;
     top: 50%;
     margin-top: -35px;
     width: 40px;
     height: 60px;
     background-color: pink;
    cursor: pointer;
 }    
 #pre{
     left: 3px;
    background:url(image/arror_left2.png) no-repeat 0 0;
 }
 #next{
    right: 209px;
     background:url(image/arror_right2.png) no-repeat 9px 1px;
 }
 </style>
</head>
<body>
	<iframe src="HeaderController?userName=${userName}" style="width:100%;height: 180px;" ></iframe>
	
	<section class="container">
	
		<!-- <div class="speedbar">
			<div class="toptip" id="callboard"><ul style="font-size:16px;margin-top: 2px;"> 资源分享网正式开通，我们为大家提供免费资源，欢迎大家踊跃投稿！</ul></div>
		</div> -->
		<div style="width:1226px;height:240px;background:black;margin:0 auto;border-top:20px solid black">
	<div class="box" >
          <div class="contents" >
              
              <div>
	              <c:forEach items="${list}" var="resource" end="5">
		              <a target="_blank" href="DetailsController?ID=${resource.resourceId}" title="${resource.name}"><img src="upload/${resource.image}" alt=" "></a>
		          </c:forEach>
              </div>
              <div>
	              <c:forEach items="${list}" var="resource" begin="5" end="10">
		              <a target="_blank" href="DetailsController?ID=${resource.resourceId}" title="${resource.name}"><img src="upload/${resource.image}" alt=" "></a>
		          </c:forEach>
		      </div>
              <div>
	              <c:forEach items="${list}" var="resource" begin="10" end="15">
		              <a target="_blank" href="DetailsController?ID=${resource.resourceId}" title="${resource.name}"><img src="upload/${resource.image}" alt=" "></a>
		          </c:forEach>
		      </div>
         <div class="control">
             <span class="control-bar current"></span>
            <span class="control-bar"></span>
            <span class="control-bar"></span>            <span class="control-bar"></span>
          <span class="control-bar"></span>
             <span class="control-bar"></span>
             <span class="control-bar"></span>
         </div>
 
         <span id="pre"></span>
         <span id="next"></span>
    </div>
    </div>
    </div>
		<div class="content-wrap">
			<div class="content">
				<div class="relates">
					<h2 class="title">
						<small>最新资讯</small>
					</h2>
					<ul style="padding: 5px 0px 15px 20px;">
						<c:forEach items="${list}" var="resource"  end="9"  >
							 <li>
								 <i class="fa fa-minus"> </i>
								 <a class="lastitle" href="DetailsController?ID=${resource.resourceId}" title="${resource.name}">${resource.name}</a>
							 </li> 
						 </c:forEach>
					 </ul>
				  </div>
				  <div class="widget-title" > 
					 <h2 class="title-h2">
						 <small>电影 </small>
						 <span class="more" style="float:right;">
							 <a style="left: 0px;" href="MenuController?ID=-1" title="阅读更多" target="_blank">
							 	<small>查看更多</small>
							 </a>
						 </span>
					 </h2> 
					 <div class="related_posts"> 
					 	<c:forEach items="${list1}" var="resource"  end="3"  >
							 <ul class="related_img" style="display:inline" >
								 <li class="related_box" >
									 <a href="DetailsController?ID=${resource.resourceId}" title="${resource.name}">
										 <img style="width: 185px; height: 250px; display: inline;" data-original="#" alt="${resource.name}" src="/nm/upload/${resource.image}"><br>
										 <span class="r_title">${resource.name}</span>
									 </a>
								 </li>
							 </ul> 
						 </c:forEach>
					 </div>
					 
					 <h2 class="title-h2">
						 <small>电视剧</small>
						 <span class="more" style="float:right;">
							 <a style="left: 0px;" href="MenuController?ID=-2" title="阅读更多" target="_blank">
							 	<small>查看更多</small>
							 </a>
						 </span>
					 </h2> 
					 <div class="related_posts"> 
					 	<c:forEach items="${list2}" var="resource"  end="3"  >
							 <ul class="related_img" style="display:inline" >
								 <li class="related_box" >
									 <a href="DetailsController?ID=${resource.resourceId}" title="${resource.name}">
										 <img style="width: 185px; height: 250px; display: inline;" data-original="#" alt="${resource.name}" src="/nm/upload/${resource.image}"><br>
										 <span class="r_title">${resource.name}</span>
									 </a>
								 </li>
							 </ul> 
						 </c:forEach>
					 </div>
					 
					 <h2 class="title-h2">
						 <small>动漫 </small>
						 <span class="more" style="float:right;">
							 <a style="left: 0px;" href="MenuController?ID=-3" title="阅读更多" target="_blank">
							 	<small>查看更多</small>
							 </a>
						 </span>
					 </h2> 
					 <div class="related_posts"> 
					 	<c:forEach items="${list3}" var="resource"  end="3"  >
							 <ul class="related_img" style="display:inline" >
								 <li class="related_box" >
									 <a href="DetailsController?ID=${resource.resourceId}" title="${resource.name}">
										 <img style="width: 185px; height: 250px; display: inline;" data-original="#" alt="${resource.name}" src="/nm/upload/${resource.image}"><br>
										 <span class="r_title">${resource.name}</span>
									 </a>
								 </li>
							 </ul> 
						 </c:forEach>
					 </div>
					 
					 <h2 class="title-h2">
						 <small>综艺 </small>
						 <span class="more" style="float:right;">
							 <a style="left: 0px;" href="MenuController?ID=-4" title="阅读更多" target="_blank">
							 	<small>查看更多</small>
							 </a>
						 </span>
					 </h2> 
					 <div class="related_posts"> 
					 	<c:forEach items="${list4}" var="resource"  end="3"  >
							 <ul class="related_img" style="display:inline" >
								 <li class="related_box" >
									 <a href="DetailsController?ID=${resource.resourceId}" title="${resource.name}">
										 <img style="width: 185px; height: 250px; display: inline;" data-original="#" alt="${resource.name}" src="/nm/upload/${resource.image}"><br>
										 <span class="r_title">${resource.name}</span>
									 </a>
								 </li>
							 </ul> 
						 </c:forEach>
					 </div>
					 
					 <h2 class="title-h2">
						 <small>用户上传 </small>
						 <span class="more" style="float:right;">
							 <a style="left: 0px;" href="MenuController?ID=-5" title="阅读更多" target="_blank">
							 	<small>查看更多</small>
							 </a>
						 </span>
					 </h2> 
					<div class="related_posts"> 
					 	<c:forEach items="${list5}" var="resource"  end="3"  >
							 <ul class="related_img" style="display:inline" >
								 <li class="related_box" >
									 <a href="DetailsController?ID=${resource.resourceId}" title="${resource.name}">
										 <img style="width: 185px; height: 250px; display: inline;" data-original="#" alt="${resource.name}" src="/nm/upload/${resource.image}"><br>
										 <span class="r_title">${resource.name}</span>
									 </a>
								 </li>
							 </ul> 
						 </c:forEach>
					 </div>
					 
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
		 	<c:forEach items="${list}" var="resource" end="4">
		 		<tr>
					<ul>
				 		<li>
						 	<a target="_blank" href="DetailsController?ID=${resource.resourceId}" title="${resource.name}" >
							 	<span class="thumbnail">
							 	<img width="100px" height="64px" src="/nm/upload/${resource.image}" alt="${resource.name}"></span>
							 	<span class="text" >${resource.name}</span>
							 	<span class="muted">${resource.publish_time}</span>
						 	</a>
				 		</li>
		 			</ul>
				</tr>
			</c:forEach>
		 	
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
	<!-- 跑马灯 -->
	<script>
	// 前面内容已讲过
   // 封装好的获取属性函数
   function getStyle(element, styleName){
       if(element.currentStyle){
           return element.currentStyle[styleName];
       }else{
           var computedStyle = window.getComputedStyle(element, null);
          return computedStyle[styleName];
       }
  }
  //封装好的动画函数
  function animate(element,json){
      clearInterval(element.timer);
      var isStop = false;
      element.timer = setInterval(function(){
          isStop = true;
          for(var key in json){
              var current = parseInt(getStyle(element, key));
              var target = json[key];
              var step = (target - current) / 10;
              step = step > 0 ? Math.ceil(step) : Math.floor(step);
              current += step;
              if(Math.abs(target -current) > Math.abs(step)){
                  isStop = false;
              }else{ 
                  current = target;
              }
              element.style[key] = current + 'px';    
          }
          if(isStop){
              clearInterval(element.timer);
          }
      },30);
  }
  
  //实现轮播图
  window.onload = function(){
      var box = document.getElementsByClassName('box')[0];
      var contentBox = document.getElementsByClassName('contents')[0];
      var controlBox = document.getElementsByClassName('control')[0];
      var imageDivArr = contentBox.getElementsByTagName('div');
  
      var currentIndex = 0;
      var boxWidth = box.offsetWidth;
      //1.动态创建横条
      for(var i= 0; i < imageDivArr.length; i++){
          var span = document.createElement('span');
          if(i == 0){
              span.className = 'control-bar current';
          }else{
              span.className = 'control-bar'; 
          }
          span.index = i;
          controlBox.appendChild(span);
 
         //6.设置span点击事件
        span.onclick = function(){
              //如果当前点击的按钮,就是当前的按钮则不作操作
             if(currentIndex != this.index){
 
                 //点击的图片，在当前图片的右边
                if(this.index >　currentIndex){
                     //当前的图片向左移  移除当前位置
                     animate(imageDivArr[currentIndex],{left:-boxWidth});

                  //此时被点击对应的图片放在显示框右边 再进行向左移
                    currentIndex = this.index;
                   imageDivArr[currentIndex].style.left = boxWidth;
 
                }else{ //点击的图片，在当前图片的右边
                    animate(imageDivArr[currentIndex],{left:boxWidth});

                    currentIndex = this.index;
                   imageDivArr[currentIndex].style.left = boxWidth;
                }

                 //
                 animate(imageDivArr[currentIndex], {left : 0})
                 //刷新控制条
                 refresh();
            }
         }
     }

     //2.放置图片位置
     // var boxWidth = box.offsetWidth;
     for(var i= 0; i < imageDivArr.length; i++){
         var imgDiv = imageDivArr[i];
         imgDiv.style.left = boxWidth + 'px';
     }
    imageDivArr[0].style.left = '0';

 
    //3.从左边划入
     // var currentIndex = 0;
    function nextImage(){
        animate(imageDivArr[currentIndex],{left:-boxWidth});
    
         currentIndex++;
     
         if(currentIndex >= imageDivArr.length-1){
            currentIndex = 0;
        }
        imageDivArr[currentIndex].style.left = boxWidth + 'px';
    
         animate(imageDivArr[currentIndex],{left:0});
         refresh();
     }
 
     //3.1从右边划入
    function prevImage(){
         animate(imageDivArr[currentIndex],{left:boxWidth}); //最后一张currentIndex = 6
     
         currentIndex--;
     
         if(currentIndex < 0){
           currentIndex = imageDivArr.length - 1;  //返回到最后一张
        }
        imageDivArr[currentIndex].style.left = (-boxWidth) + 'px';
    
      animate(imageDivArr[currentIndex],{left:0});
         refresh();
     }
 
     //4.刷新横条显示
    function refresh(){
         for(var i = 0; i < controlBox.children.length; i++ ){
             // console.log(controlBox.children[i]);
            var bar = controlBox.children[i];
             bar.className = 'control-bar'
            // console.log(bar);
        }
         controlBox.children[currentIndex].className = 'control-bar current';
    }
 
     //点击箭头切换
     document.getElementById('next').onclick = nextImage;
     document.getElementById('pre').onclick = prevImage;
 
     //自动播放
     var timer = setInterval(nextImage,4000);
 
     box.onmouseover = function (){
         clearInterval(timer);
     }
     //移出时，重新开始定时器
     box.onmouseout = function (){
         timer = setInterval(nextImage ,4000);  
     }
 }
  </script>
	</body>
</html>


























