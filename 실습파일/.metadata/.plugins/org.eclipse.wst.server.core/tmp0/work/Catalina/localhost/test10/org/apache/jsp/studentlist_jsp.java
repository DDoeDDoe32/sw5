/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.94
 * Generated at: 2019-05-18 06:42:22 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class studentlist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

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

      out.write('\r');
      out.write('\n');

	int i = 0;

String sql ="select sid, sname, subname, substr(jumin,1,8) jumin, decode(substr(jumin,8,1),'1','남','2','여') gubun, phone, email from student A, subject b where a.subcode = substr(b.subcode,3,2)";

try
{
	String url = "jdbc:oracle:thin:@localhost:1521:XE";
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con = DriverManager.getConnection(url, "system", "1234");
	Statement stmt = con.createStatement();
	ResultSet rs = stmt.executeQuery(sql);

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<script>\r\n");
      out.write("function fInsert(sid)\r\n");
      out.write("{\r\n");
      out.write("\tstulist.action = \"jumsuInsertView.jsp?SID=?\"+sid;\r\n");
      out.write("\tdocument.stulist.submit();\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>학생목록조회</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<form name=\"stulist\" method=\"post\">\r\n");
      out.write("<center>\r\n");
      out.write("\r\n");
      out.write("<h4> 학생목록조회 </h4>\r\n");
      out.write("<table border=\"1\" cellspacing=\"1\">\r\n");
      out.write("<tr>\r\n");
      out.write("<th>학번</th>\r\n");
      out.write("<th>성명</th>\r\n");
      out.write("<th>학과</th>\r\n");
      out.write("<th>생년월일</th>\r\n");
      out.write("<th>성별</th>\r\n");
      out.write("<th>전화번호</th>\r\n");
      out.write("<th>이메일</th>\r\n");
      out.write("</tr>\r\n");

while(rs.next()) {
	String sid = rs.getString("SID");

      out.write("\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t<td><a href=\"javascript:fInsert(");
      out.print(sid );
      out.write(");\">");
      out.print(sid );
      out.write("</a> </td>\r\n");
      out.write("\t<td>");
      out.print( rs.getString("SNAME") );
      out.write(" </td>\r\n");
      out.write("\t<td>");
      out.print( rs.getString("SUBNAME") );
      out.write(" </td>\r\n");
      out.write("\t<td>");
      out.print( rs.getString("JUMIN") );
      out.write(" </td>\r\n");
      out.write("\t<td>");
      out.print( rs.getString("GUBUN") );
      out.write(" </td>\r\n");
      out.write("\t<td>");
      out.print( rs.getString("PHONE") );
      out.write(" </td>\r\n");
      out.write("\t<td>");
      out.print( rs.getString("EMAIL") );
      out.write(" </td>\r\n");
      out.write("\t</tr>\r\n");
 } 
      out.write("\r\n");
      out.write("</table>\r\n");

rs.close();
stmt.close();
con.close();

      out.write('\r');
      out.write('\n');

} catch (SQLException e) {
	e.printStackTrace();
}

      out.write("\r\n");
      out.write("</center>\r\n");
      out.write("</form>\r\n");
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
