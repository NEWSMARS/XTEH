/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.35
 * Generated at: 2019-12-27 11:25:04 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.manage.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class find_005fpost_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/WEB-INF/lib/standard.jar", Long.valueOf(1575818953231L));
    _jspx_dependants.put("jar:file:/D:/校淘二货/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/nm/WEB-INF/lib/standard.jar!/META-INF/fn.tld", Long.valueOf(1098682292000L));
    _jspx_dependants.put("jar:file:/D:/校淘二货/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/nm/WEB-INF/lib/standard.jar!/META-INF/c-1_0-rt.tld", Long.valueOf(1098682292000L));
    _jspx_dependants.put("jar:file:/D:/校淘二货/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/nm/WEB-INF/lib/standard.jar!/META-INF/c.tld", Long.valueOf(1098682292000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

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
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("      \r\n");
      out.write("\t\r\n");
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
      out.write("    <!-- CSS App -->\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"manage/css/style.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"manage/css/themes/flat-blue.css\">\r\n");
      out.write("    \t<link rel=\"stylesheet\" type=\"text/css\" href=\"manage/iconfont/iconfont.css\">\r\n");
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
      out.write("                    \r\n");
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
      out.write("                                              <li><a href=\"m_post_set\">贴吧设置</a>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                    </ul>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </li>\r\n");
      out.write("            </nav>\r\n");
      out.write("        </div>\r\n");
      out.write("            <!-- Main Content -->\r\n");
      out.write("            <div class=\"container-fluid\">\r\n");
      out.write("                <div class=\"side-body\">\r\n");
      out.write("                    <div class=\"page-title\">\r\n");
      out.write("                        <span class=\"title\">查询资源</span>\r\n");
      out.write("                        <div class=\"description\">输入信息，找到相关信息的资源</div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-xs-12\">\r\n");
      out.write("                            <div class=\"card\">\r\n");
      out.write("                                <div class=\"card-header\">\r\n");
      out.write("\r\n");
      out.write("                                    <div class=\"card-title\">\r\n");
      out.write("                                    <div class=\"title\">查询表</div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"card-body\">\r\n");
      out.write("                                    <table class=\"datatable table table-striped\" cellspacing=\"0\" width=\"100%\">\r\n");
      out.write("                                        <thead>\r\n");
      out.write("                                            <tr>\r\n");
      out.write("                                            \r\n");
      out.write("                                                  <td>帖子编号</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>发帖者姓名</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>内容</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>发帖日期</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>删除</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("                                            </tr>\r\n");
      out.write("                                        </tdead>\r\n");
      out.write("                                        <tfoot>\r\n");
      out.write("                                             <tr>\r\n");
      out.write("                                            \r\n");
      out.write("                                                  <td>帖子编号</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>发帖者姓名</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>内容</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>发帖日期</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>删除</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("                                            </tr>\r\n");
      out.write("                                        </tfoot>\r\n");
      out.write("                                        \r\n");
      out.write("                                             ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("     \r\n");
      out.write("                                           \r\n");
      out.write("                                            <!-- <tr>\r\n");
      out.write("                                                <td>Donna Snider</td>\r\n");
      out.write("                                                <td>Customer Support</td>\r\n");
      out.write("                                                <td>New York</td>\r\n");
      out.write("                                                <td>27</td>\r\n");
      out.write("                                                <td>2011/01/25</td>\r\n");
      out.write("                                                <td>$112,000</td>\r\n");
      out.write("                                            </tr> -->\r\n");
      out.write("                                        </tbody>\r\n");
      out.write("                                    </table>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <footer class=\"app-footer\">\r\n");
      out.write("            <div class=\"wrapper\">\r\n");
      out.write("                <span class=\"pull-right\">2.1 <a href=\"#\"><i class=\"fa fa-long-arrow-up\"></i></a></span> © 2015 Copyright.\r\n");
      out.write("            </div>\r\n");
      out.write("        </footer>\r\n");
      out.write("  \r\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /manage/jsp/find_post.jsp(208,45) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Post}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      // /manage/jsp/find_post.jsp(208,45) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("newPro");
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write(" \r\n");
            out.write("\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
            out.write("                                                   <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${newPro.communicationId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("                                                        <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${newPro.studentId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("                                               <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${newPro.communicat_time}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("                                               <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${newPro.words}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("                               \r\n");
            out.write("                                                 \r\n");
            out.write("                                     <td><a href=\"delect_p?delete_id=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${newPro.communicationId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\"  class=\"confont icon-13 delete\"></a></td>\r\n");
            out.write("\t\t\t\t\t\t\t\r\n");
            out.write("\t\t\t\t\r\n");
            out.write("                                                    </tr>\r\n");
            out.write("\r\n");
            out.write("\t\t\t\t \t");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }
}
