/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.94
 * Generated at: 2019-05-18 07:09:00 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/main_contents.jsp", Long.valueOf(1558156919642L));
    _jspx_dependants.put("/main_footer.jsp", Long.valueOf(1558163336794L));
    _jspx_dependants.put("/main_header.jsp", Long.valueOf(1558154697824L));
    _jspx_dependants.put("/main_nav.jsp", Long.valueOf(1558157153298L));
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
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
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>교무학사관리시스템 Ver1.0</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div style='height:150PX; text-align:center'>\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<div align=\"center\">\r\n");
      out.write("<h2><B>학사관리프로그램 Ver1.0</B></h2>\r\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<div style='text-align:center'>\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<center>\r\n");
      out.write("<table width=\"100%\" align=\"left\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td width=\"20%\">&nbsp;</td>\r\n");
      out.write("\t\t<td width=\"15%\"><a href=\"studentlist.jsp\">학생목록</a>\r\n");
      out.write("\t\t<td width=\"15%\"><a href=\"subjectlist.jsp\">교과목코드조회</a>\r\n");
      out.write("\t\t<td width=\"15%\"><a href=\"subjectscore.jsp\">과목별성적조회</a>\r\n");
      out.write("\t\t<td width=\"15%\"><a href=\"scorelist.jsp\">개별성적조회</a></td>\r\n");
      out.write("\t\t<td width=\"20%\">&nbsp;</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("</table>\r\n");
      out.write("</center>");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<div style='text-align:center'>\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<div style='text-align:center'><h1><B>학사관리 프로그램</B></h1></div>\r\n");
      out.write("학사관리 프로그램을 작성할 수 있다. <br/>\r\n");
      out.write("1. 학생정보 테이블을 생성한다. <br/>\r\n");
      out.write("2. 교과목코드 정보 테이블을 생성한다. <br/>\r\n");
      out.write("3. 성적정보 테이블을 생성한다. <br/>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<div style='text-align:center'>\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<div style='text-align:center'>\r\n");
      out.write("<h4><B>HRDKOREA Copyright@2019 All rights reserved Human Resource Development Service of Korea\r\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
