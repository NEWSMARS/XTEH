/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.35
 * Generated at: 2020-01-13 11:41:00 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.manage.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class upload_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <title>后台管理系统</title>\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <!-- Fonts -->\r\n");
      out.write("    <link href='http://fonts.googleapis.com/css?family=Roboto+Condensed:300,400' rel='stylesheet' type='text/css'>\r\n");
      out.write("    <link href='http://fonts.googleapis.com/css?family=Lato:300,400,700,900' rel='stylesheet' type='text/css'>\r\n");
      out.write("    <!-- CSS Libs -->\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"manage/lib/css/bootstrap.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"manage/lib/css/font-awesome.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"manage/lib/css/animate.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"manage/lib/css/bootstrap-switch.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"manage/lib/css/checkbox3.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"manage/lib/css/jquery.dataTables.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"manage/lib/css/dataTables.bootstrap.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"manage/lib/css/select2.min.css\">\r\n");
      out.write("    \r\n");
      out.write("    <!-- CSS App -->\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"manage/css/style.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"manage/css/themes/flat-blue.css\">\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("<style>\r\n");
      out.write("        * {\r\n");
      out.write("      \r\n");
      out.write("            margin: 0;\r\n");
      out.write("            padding: 0;\r\n");
      out.write("        }\r\n");
      out.write("        /*图片上传*/\r\n");
      out.write("        \r\n");
      out.write("       /*  html,\r\n");
      out.write("        body {\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            height: 100%;\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        .container {\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            height: 100%;\r\n");
      out.write("            clear: both;\r\n");
      out.write("        } */\r\n");
      out.write("        \r\n");
      out.write("        .z_photo {\r\n");
      out.write("            width: 300px;\r\n");
      out.write("            height: 250px;\r\n");
      out.write("            padding: 0;\r\n");
      out.write("            overflow: auto;\r\n");
      out.write("            clear: both;\r\n");
      out.write("            margin: 0px 0px;\r\n");
      out.write("            border: 1px solid #555;\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        .z_photo img {\r\n");
      out.write("            width: 100px;\r\n");
      out.write("            height: 100px;\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        .z_addImg {\r\n");
      out.write("            float: left;\r\n");
      out.write("            margin-right: 20px;\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        .z_file {\r\n");
      out.write("            width: 100px;\r\n");
      out.write("            height: 100px;\r\n");
      out.write("            background: url(image/z_add.png) no-repeat;\r\n");
      out.write("            background-size: 100% 100%;\r\n");
      out.write("            float: left;\r\n");
      out.write("            margin-right: 20px;\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        .z_file input::-webkit-file-upload-button {\r\n");
      out.write("            width: 100px;\r\n");
      out.write("            height: 100px;\r\n");
      out.write("            border: none;\r\n");
      out.write("            position: absolute;\r\n");
      out.write("            outline: 0;\r\n");
      out.write("            opacity: 0;\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        .z_file input#file {\r\n");
      out.write("            display: block;\r\n");
      out.write("            width: 0px;\r\n");
      out.write("            border: 0px;\r\n");
      out.write("            padding: 0px;\r\n");
      out.write("            vertical-align: middle;\r\n");
      out.write("        }\r\n");
      out.write("        /*遮罩层*/\r\n");
      out.write("        \r\n");
      out.write("        .z_mask {\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            height: 100%;\r\n");
      out.write("            background: rgba(0, 0, 0, .5);\r\n");
      out.write("            position: fixed;\r\n");
      out.write("            top: 0;\r\n");
      out.write("            left: 0;\r\n");
      out.write("            z-index: 999;\r\n");
      out.write("            display: none;\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        .z_alert {\r\n");
      out.write("            width: 300px;\r\n");
      out.write("            height: 200px;\r\n");
      out.write("            border-radius: .200px;\r\n");
      out.write("            background: #fff;\r\n");
      out.write("            font-size: 24px;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            position: absolute;\r\n");
      out.write("            left: 50%;\r\n");
      out.write("            top: 50%;\r\n");
      out.write("            margin-left: -150px;\r\n");
      out.write("            margin-top: -200px;\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        .z_alert p:nth-child(1) {\r\n");
      out.write("            line-height: 150px;\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        .z_alert p:nth-child(2) span {\r\n");
      out.write("            display: inline-block;\r\n");
      out.write("            width: 49%;\r\n");
      out.write("            height: 50px;\r\n");
      out.write("            line-height: 50px;\r\n");
      out.write("            float: left;\r\n");
      out.write("            border-top: 1px solid #ddd;\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        .z_cancel {\r\n");
      out.write("            border-right: 1px solid #ddd;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("    </style>\r\n");
      out.write("<style>@font-face{font-family:uc-nexus-iconfont;src:url(chrome-extension://pogijhnlcfmcppgimcaccdkmbedjkmhi/res/font_9qmmi8b8jsxxbt9.woff) format('woff'),url(chrome-extension://pogijhnlcfmcppgimcaccdkmbedjkmhi/res/font_9qmmi8b8jsxxbt9.ttf) format('truetype')}</style>\r\n");
      out.write("    \r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body class=\"flat-blue\">\r\n");
      out.write("<div class=\"app-container\">\r\n");
      out.write("    <div class=\"row content-container\">\r\n");
      out.write("        <!-- 顶部导航 -->\r\n");
      out.write("        <nav class=\"navbar navbar-default navbar-fixed-top navbar-top\">\r\n");
      out.write("            <div class=\"container-fluid\">\r\n");
      out.write("                <div class=\"navbar-header\">\r\n");
      out.write("                    <button type=\"button\" class=\"navbar-expand-toggle\">\r\n");
      out.write("                        <i class=\"fa fa-bars icon\"></i>\r\n");
      out.write("                    </button>\r\n");
      out.write("                    <ol class=\"breadcrumb navbar-breadcrumb\">\r\n");
      out.write("                        <li class=\"active\">后台信息</li>\r\n");
      out.write("                    </ol>\r\n");
      out.write("                    <button type=\"button\" class=\"navbar-right-expand-toggle pull-right visible-xs\">\r\n");
      out.write("                        <i class=\"fa fa-th icon\"></i>\r\n");
      out.write("                    </button>\r\n");
      out.write("                </div>\r\n");
      out.write("                <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("                    <li >\r\n");
      out.write("                    \t<a href=\"UploadB\" role=\"button\" >上传视频</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"dropdown profile\">\r\n");
      out.write("                        <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-expanded=\"false\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${User_name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("<span class=\"caret\"></span></a>\r\n");
      out.write("                        <ul class=\"dropdown-menu animated fadeInDown\">\r\n");
      out.write("                            <li class=\"profile-img\">\r\n");
      out.write("                                <img src=\"manage/img/profile/picjumbo.com_HNCK4153_resize.jpg\" class=\"profile-img\">\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <div class=\"profile-info\">\r\n");
      out.write("                                    <h4 class=\"username\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${User_name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</h4>\r\n");
      out.write("                                    <p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${User_email}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("                                    <div class=\"btn-group margin-bottom-2x\" role=\"group\">\r\n");
      out.write("                                        <button type=\"button\" class=\"btn btn-default\"><i class=\"fa fa-user\"></i> Profile\r\n");
      out.write("                                        </button>\r\n");
      out.write("                                        <button type=\"button\" class=\"btn btn-default\" onclick=\"location='loginservlet'\"><i class=\"fa fa-sign-out\"></i>\r\n");
      out.write("                                            Logout\r\n");
      out.write("                                        </button>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </nav>\r\n");
      out.write("        <!-- 侧边栏 -->\r\n");
      out.write("        <div class=\"side-menu sidebar-inverse\">\r\n");
      out.write("            <nav class=\"navbar navbar-default\" role=\"navigation\">\r\n");
      out.write("                <div class=\"side-menu-container\">\r\n");
      out.write("                    <div class=\"navbar-header\">\r\n");
      out.write("                        <a class=\"navbar-brand\" href=\"#\">\r\n");
      out.write("                            <div class=\"icon fa fa-paper-plane\"></div>\r\n");
      out.write("                              <div class=\"title\">后台管理</div>\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <button type=\"button\" class=\"navbar-expand-toggle pull-right visible-xs\">\r\n");
      out.write("                            <i class=\"fa fa-times icon\"></i>\r\n");
      out.write("                        </button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <ul class=\"nav navbar-nav\">\r\n");
      out.write("                        <li class=\"active\">\r\n");
      out.write("                            <a href=\"mindex\">\r\n");
      out.write("                                <span class=\"icon fa fa-tachometer\"></span><span class=\"title\">后台信息</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"panel panel-default dropdown\">\r\n");
      out.write("                            <a data-toggle=\"collapse\" href=\"#dropdown-element\">\r\n");
      out.write("                                <span class=\"icon fa fa-desktop\"></span><span class=\"title\">用户信息管理</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <!-- Dropdown level 1 -->\r\n");
      out.write("                            <div id=\"dropdown-element\" class=\"panel-collapse collapse\">\r\n");
      out.write("                                <div class=\"panel-body\">\r\n");
      out.write("                                    <ul class=\"nav navbar-nav\">\r\n");
      out.write("  \r\n");
      out.write("                                        <li><a href=\"m_find_student\">用户查询</a>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                        <li><a href=\"m_find_teacher\">管理员查询</a>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                       \r\n");
      out.write("                                        <li><a href=\"m_studentadd1\">添加用户</a>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                         <li><a href=\"m_teacher1\">添加管理员</a>\r\n");
      out.write("                                        </li>\r\n");
      out.write(" \r\n");
      out.write("                                    </ul>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </li>\r\n");
      out.write("                         \r\n");
      out.write("                            \r\n");
      out.write("                        <li class=\"panel panel-default dropdown\">\r\n");
      out.write("                            <a data-toggle=\"collapse\" href=\"#dropdown-table\">\r\n");
      out.write("                                <span class=\"icon fa fa-table\"></span><span class=\"title\">信息批量导入</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <!-- Dropdown level 1 -->\r\n");
      out.write("                            <div id=\"dropdown-table\" class=\"panel-collapse collapse\">\r\n");
      out.write("                                <div class=\"panel-body\">\r\n");
      out.write("                                    <ul class=\"nav navbar-nav\">\r\n");
      out.write("                                        <li><a href=\"m_student_add2\">用户信息批量导入</a>\r\n");
      out.write("                                        </li>\r\n");
      out.write("     \r\n");
      out.write("                                    </ul>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"panel panel-default dropdown\">\r\n");
      out.write("                            <a data-toggle=\"collapse\" href=\"#dropdown-form\">\r\n");
      out.write("                                <span class=\"icon fa fa-file-text-o\"></span><span class=\"title\">资源管理</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <!-- Dropdown level 1 -->\r\n");
      out.write("                            <div id=\"dropdown-form\" class=\"panel-collapse collapse\">\r\n");
      out.write("                                <div class=\"panel-body\">\r\n");
      out.write("                                    <ul class=\"nav navbar-nav\">\r\n");
      out.write("                                        <li><a href=\"m_resoure\">查询资源</a>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                    </ul>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </li>\r\n");
      out.write("\r\n");
      out.write("                        <!-- Dropdown-->\r\n");
      out.write("                        <li class=\"panel panel-default dropdown\">\r\n");
      out.write("                            <a data-toggle=\"collapse\" href=\"#component-example\">\r\n");
      out.write("                                <span class=\"icon fa fa-cubes\"></span><span class=\"title\">交流区管理</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <!-- Dropdown level 1 -->\r\n");
      out.write("                            <div id=\"component-example\" class=\"panel-collapse collapse\">\r\n");
      out.write("                                <div class=\"panel-body\">\r\n");
      out.write("                                    <ul class=\"nav navbar-nav\">\r\n");
      out.write("                                                   <li><a href=\"m_post_set\">贴吧设置</a>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                    </ul>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("            </nav>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- Main Content -->\r\n");
      out.write("       <form action=\"/nm/UploadHandleServlet22\" enctype=\"multipart/form-data\" method=\"post\">\r\n");
      out.write("\t\t\t<div class=\"content-wrap\">\r\n");
      out.write("\t\t\t\t<div style=\"height:334px;margin-top:100px;margin-left:80px\">\r\n");
      out.write("\t\t\t\t\t<label>选择封面</label><br/>\r\n");
      out.write("\t\t            <div class=\"z_photo\" style=\"display:inline-block;\">\r\n");
      out.write("\t\t            \t\r\n");
      out.write("\t\t\t            <div class=\"z_file\">\r\n");
      out.write("\t\t\t                <input  type=\"file\" name=\"picture\" id=\"file\" value=\"\" accept=\"image/*\" multiple=\"\" onchange=\"imgChange('z_photo','z_file');\">\r\n");
      out.write("\t\t\t            </div>\r\n");
      out.write("\t\t\t\t        <div class=\"z_addImg\" style=\"display: none;\">\r\n");
      out.write("\t\t\t\t        \t<img src=\"#\">\r\n");
      out.write("\t\t\t\t        </div>\r\n");
      out.write("\t\t\t        </div>\r\n");
      out.write("\t\t\t        \r\n");
      out.write("\t\t\t        <div class=\"z_mask\"  style=\"display: none;\">\r\n");
      out.write("\t\t\t            <!--弹出框-->\r\n");
      out.write("\t\t\t            <div class=\"z_alert\">\r\n");
      out.write("\t\t\t                <p>确定要删除这张图片吗？</p>\r\n");
      out.write("\t\t\t                <p>\r\n");
      out.write("\t\t\t                    <span class=\"z_cancel\">取消</span>\r\n");
      out.write("\t\t\t                    <span class=\"z_sure\">确定</span>\r\n");
      out.write("\t\t\t                </p>\r\n");
      out.write("\t\t\t            </div>\r\n");
      out.write("\t\t\t        </div>\r\n");
      out.write("\t\t\t        <div style=\"margin-top:0px;\">\r\n");
      out.write("\t\t\t        \t<label>选择视频文件</label>\r\n");
      out.write("\t\t                <input name=\"thumb\" id=\"thumb\" type=\"file\" style=\"width:458px;\">\r\n");
      out.write("\t\t            </div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div style=\"display:inline-block;width:500px;height:343px;\">\r\n");
      out.write("\t\t\t        <div class=\"form-group\" style=\"display:inline-block;width:100%;margin-left:80px\">\r\n");
      out.write("\t                    <label>视频名字:</label>\r\n");
      out.write("\t                    <input type=\"text\" class=\"form-control\" id=\"counts\" name=\"count\" placeholder=\"视频名字\" style=\"display:inline-block;width:458px\">\r\n");
      out.write("\t                </div>\r\n");
      out.write("\t                <div class=\"form-group\" style=\"display:inline-block;width:100%;margin-left:80px\">\r\n");
      out.write("\t                    <label>主演姓名:</label>\r\n");
      out.write("\t                    <input type=\"text\" class=\"form-control\" id=\"who\" name=\"who\" placeholder=\"主演\" style=\"display:inline-block;width:458px\">\r\n");
      out.write("\t                </div>\r\n");
      out.write("\t\t\t        <div  class=\"form-group \" style=\"display:inline-block;width:100%;margin-left:80px\">\r\n");
      out.write("\t                    <label >视频分类:</label>\r\n");
      out.write("\t                    <select  class=\"form-control\" name=\"card\"style=\"display:inline-block;width:458px\">\r\n");
      out.write("\t                         \r\n");
      out.write("\t                         <option value=\"1\">电影</option>\r\n");
      out.write("\t                         <option value=\"2\">电视剧</option>\r\n");
      out.write("\t                         <option value=\"3\">动漫</option>\r\n");
      out.write("\t                         <option value=\"4\">综艺</option>\r\n");
      out.write("\t                         <option value=\"5\">用户上传</option>\r\n");
      out.write("\t                    </select>\r\n");
      out.write("\t                </div>\r\n");
      out.write("\t                <div class=\"form-group\" style=\"display:inline-block;width:100%;margin-left:80px\">\r\n");
      out.write("\t                    <label>所属地区:</label>\r\n");
      out.write("\t                    <input type=\"text\" class=\"form-control\" id=\"areas\" name=\"area\" placeholder=\"地区\" style=\"display:inline-block;width:458px\">\r\n");
      out.write("\t                </div>\r\n");
      out.write("\t                <div class=\"form-group\" style=\"display:inline-block;width:100%;margin-left:80px\">\r\n");
      out.write("\t                    <label>视频语言:</label>\r\n");
      out.write("\t                    <input type=\"text\" class=\"form-control\" id=\"languages\" name=\"language\" placeholder=\"语言\" style=\"display:inline-block;width:458px\">\r\n");
      out.write("\t                </div>\r\n");
      out.write("\t                <div class=\"form-group\" style=\"display:inline-block;width:100%;margin-left:80px\">\r\n");
      out.write("\t                    <label>上映日期:</label>\r\n");
      out.write("\t                    <input type=\"text\" class=\"form-control\" id=\"show_times\" name=\"show_time\" placeholder=\"上映日期\" style=\"display:inline-block;width:458px\">\r\n");
      out.write("\t                </div>\r\n");
      out.write("\t                <!-- <div class=\"form-group\" style=\"display:inline-block;width:100%\">\r\n");
      out.write("\t                \t<label>视频等级</label>\r\n");
      out.write("\t                \t<select class=\"form-control\" name=\"level\"style=\"display:inline-block;width:500px\">\r\n");
      out.write("\t                         <option value=\"初级\">初级</option>\r\n");
      out.write("\t                         <option value=\"中级\">中级</option>\r\n");
      out.write("\t                         <option value=\"高级\">高级</option>\r\n");
      out.write("\t                    </select>\r\n");
      out.write("\t                </div> -->\r\n");
      out.write("\t                \r\n");
      out.write("\t\t\t     </div>\r\n");
      out.write("\t            \t\r\n");
      out.write("\t                \r\n");
      out.write("\t                <div class=\"form-group\" style=\"display:inline-block;width:100%;margin-left:80px;margin-top:20px\">\r\n");
      out.write("\t                   <label >视频简介</label><br/>\r\n");
      out.write("\t                   <textarea class=\"form-control\" rows=\"5\" name=\"describe\" style=\"display:inline-block;width:70%;margin-top:2px\"></textarea>\r\n");
      out.write("\t                </div>\r\n");
      out.write("\t                <input type=\"hidden\" name=\"uploader\" value=\"1\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<button type=\"submit\" class=\"btn btn-primary  tj\" style=\"height:45px;width:150px;margin-left:45%;background:#5fbaac\" >上传</button>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("                               \r\n");
      out.write("                     \r\n");
      out.write("<!-- Javascript Libs -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"manage/lib/js/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"manage/lib/js/bootstrap.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"manage/lib/js/Chart.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"manage/lib/js/bootstrap-switch.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"manage/lib/js/jquery.matchHeight-min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"manage/lib/js/jquery.dataTables.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"manage/lib/js/dataTables.bootstrap.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"manage/lib/js/select2.full.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"manage/lib/js/ace/ace.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"manage/lib/js/ace/mode-html.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"manage/lib/js/ace/theme-github.js\"></script>\r\n");
      out.write("<!-- Javascript -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"manage/js/app.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"manage/js/index.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("    function changeContent(url, obj) {\r\n");
      out.write("\r\n");
      out.write("        $(\"li.active\").removeClass(\"active\");\r\n");
      out.write("        $(\"#\" + obj).addClass(\"active\");\r\n");
      out.write("        $.ajax({\r\n");
      out.write("            type: \"get\",\r\n");
      out.write("            async: true,  //同步请求\r\n");
      out.write("            url: url,\r\n");
      out.write("            timeout: 60000, //请求超时时间，数据统计功能较为耗时，此处为兼容其设置\r\n");
      out.write("            success: function (htmlData) {\r\n");
      out.write("                $(\"#main_content\").html(htmlData);\r\n");
      out.write("            },\r\n");
      out.write("            error: function (request) {\r\n");
      out.write("                alert('操作失败，请稍候重试。' + request.status + ' - ' + url);\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("    }\r\n");
      out.write("    function imgChange(obj1, obj2) {\r\n");
      out.write("        //获取点击的文本框\r\n");
      out.write("        var file = document.getElementById(\"file\");\r\n");
      out.write("        //存放图片的父级元素\r\n");
      out.write("        var imgContainer = document.getElementsByClassName(obj1)[0];\r\n");
      out.write("        //获取的图片文件\r\n");
      out.write("        var fileList = file.files;\r\n");
      out.write("        //文本框的父级元素\r\n");
      out.write("        var input = document.getElementsByClassName(obj2)[0];\r\n");
      out.write("        var imgArr = [];\r\n");
      out.write("        //遍历获取到得图片文件\r\n");
      out.write("        for (var i = 0; i < fileList.length; i++) {\r\n");
      out.write("            var imgUrl = window.URL.createObjectURL(file.files[i]);\r\n");
      out.write("            imgArr.push(imgUrl);\r\n");
      out.write("            var img = document.createElement(\"img\");\r\n");
      out.write("            img.setAttribute(\"src\", imgArr[i]);\r\n");
      out.write("            var imgAdd = document.createElement(\"div\");\r\n");
      out.write("            imgAdd.setAttribute(\"class\", \"z_addImg\");\r\n");
      out.write("            imgAdd.appendChild(img);\r\n");
      out.write("            imgContainer.appendChild(imgAdd);\r\n");
      out.write("        };\r\n");
      out.write("        imgRemove();\r\n");
      out.write("    };\r\n");
      out.write("\r\n");
      out.write("    function imgRemove() {\r\n");
      out.write("        var imgList = document.getElementsByClassName(\"z_addImg\");\r\n");
      out.write("        var mask = document.getElementsByClassName(\"z_mask\")[0];\r\n");
      out.write("        var cancel = document.getElementsByClassName(\"z_cancel\")[0];\r\n");
      out.write("        var sure = document.getElementsByClassName(\"z_sure\")[0];\r\n");
      out.write("        for (var j = 0; j < imgList.length; j++) {\r\n");
      out.write("            imgList[j].index = j;\r\n");
      out.write("            imgList[j].onclick = function() {\r\n");
      out.write("                var t = this;\r\n");
      out.write("                mask.style.display = \"block\";\r\n");
      out.write("                cancel.onclick = function() {\r\n");
      out.write("                    mask.style.display = \"none\";\r\n");
      out.write("                };\r\n");
      out.write("                sure.onclick = function() {\r\n");
      out.write("                    mask.style.display = \"none\";\r\n");
      out.write("                    t.style.display = \"none\";\r\n");
      out.write("                };\r\n");
      out.write("\r\n");
      out.write("            }\r\n");
      out.write("        };\r\n");
      out.write("    };\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
