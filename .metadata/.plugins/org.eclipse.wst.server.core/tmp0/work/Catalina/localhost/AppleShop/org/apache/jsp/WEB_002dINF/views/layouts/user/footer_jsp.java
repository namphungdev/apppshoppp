/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.34
 * Generated at: 2023-03-26 19:53:08 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.layouts.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!-- \r\n");
      out.write("Clients \r\n");
      out.write("-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!--\r\n");
      out.write("Footer\r\n");
      out.write("-->\r\n");
      out.write("<footer class=\"footer \">\r\n");
      out.write("\t<div class=\"row-fluid \">\r\n");
      out.write(" \t\t\r\n");
      out.write("\t\t<div class=\"span2\" >\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"span2\" >\r\n");
      out.write("\t\t\t<h5>Giới thiệu về Trang Web</h5>\r\n");
      out.write("\t\t\t<a href=\"#\">YOUR ACCOUNT</a><br> <a href=\"#\">PERSONAL\r\n");
      out.write("\t\t\t\tINFORMATION</a><br> <a href=\"#\">ADDRESSES</a><br> <a href=\"#\">DISCOUNT</a><br>\r\n");
      out.write("\t\t\t<a href=\"#\">ORDER HISTORY</a><br>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"span2\">\r\n");
      out.write("\t\t\t<h5>Tin tuyển dụng</h5>\r\n");
      out.write("\t\t\t<a href=\"contact.html\"> Tin khuyến mãi</a><br> <a href=\"#\">Hướng\r\n");
      out.write("\t\t\t\tdẫn mua online</a><br> <a href=\"#\">Hướng dẫn mua trả góp</a><br>\r\n");
      out.write("\t\t\t<a href=\"#\">Chính sách trả góp</a><br> <a href=\"#\">ABOUT US</a><br>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"span2\">\r\n");
      out.write("\t\t\t<h5>Hệ thống cửa hàng</h5>\r\n");
      out.write("\t\t\t<a href=\"#\">Hệ thống bảo hành</a> <br> <a href=\"#\">TOP\r\n");
      out.write("\t\t\t\tSELLERS</a><br> <a href=\"#\">Bán hàng doanh nghiệp</a><br> <a\r\n");
      out.write("\t\t\t\thref=\"#\">MANUFACTURERS</a><br> <a href=\"#\">Giới thiệu máy\r\n");
      out.write("\t\t\t\tđổi trả</a> <br /> <a href=\"#\">Chính sách đổi trả <br />\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"span2\">\r\n");
      out.write("\t\t\t<div class=\"fs-ftcol  fs-ftcol2\">\r\n");
      out.write("\t\t\t\t<ul class=\"fs-ftr2 clearfix\">\r\n");
      out.write("\t\t\t\t\t<p class=\"fs-ftrtit\" style=\"font-size: 15px;\">Tư vấn mua hàng\r\n");
      out.write("\t\t\t\t\t\t(Miễn phí)</p>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"tel:18006601\" title=\"\">1800 6601 </a> <span>(Nhánh\r\n");
      out.write("\t\t\t\t\t\t\t1)</span>\r\n");
      out.write("\t\t\t\t\t\t<p class=\"fs-ftrtit\">Hỗ trợ kỹ thuật</p> <a href=\"tel:18006601\"\r\n");
      out.write("\t\t\t\t\t\ttitle=\"\">1800 6601 </a><span>(Nhánh 2)</span></li>\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t<p class=\"fs-ftrtit\" style=\"font-size: 15px;\">Góp ý, khiếu nại\r\n");
      out.write("\t\t\t\t\t\t\tdịch vụ (8h00-22h00)</p> <a href=\"tel:18006616\" title=\"\">1800\r\n");
      out.write("\t\t\t\t\t\t\t6616</a><br> <!-- <a href=\"tel:18006601\" title=\"\">1800 6601 </a><span>(Nhánh 3)</span> -->\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</footer>");
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
