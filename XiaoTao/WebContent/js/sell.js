//在页面显示上次的图片
  $("#file").change(function(){
    var objUrl = getObjectURL(this.files[0]) ;
    console.log("objUrl = "+objUrl) ;
    if (objUrl) 
    {
    	// $("#show_pic").css("background-color", "black");
    	$("#show_pic").css("background-image", "url("+objUrl+")");
      // $("#show_pic").attr("src", objUrl);
      $("#show_pic").removeClass("hide");
    }
  }) ;
  //建立一個可存取到該file的url
  function getObjectURL(file) 
  {
    var url = null ;
    if (window.createObjectURL!=undefined) 
    { // basic
      url = window.createObjectURL(file) ;
    }
    else if (window.URL!=undefined) 
    {
      // mozilla(firefox)
      url = window.URL.createObjectURL(file) ;
    } 
    else if (window.webkitURL!=undefined) {
      // webkit or chrome
      url = window.webkitURL.createObjectURL(file) ;
    }
    return url ;
  }