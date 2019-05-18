<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.*" %>
<% request.setCharacterEncoding("UTF-8"); %>
<%
String dept_id = request.getParameter("dept_id");
String dept_name = request.getParameter("dept_name");
String phone = request.getParameter("phone");
String url =  "jdbc:oracle:thin:@localhost:1521:XE";
String sql = "update major ";
sql = sql + " set dept_name=?, phone=?";
sql = sql + " where dept_id=?";
try {
	Class.forName("oracle.jdbc.driver.OracleDriver");
    Connection con = DriverManager.getConnection(url, "system", "1234");
    PreparedStatement pstmt = con.prepareStatement(sql);
    pstmt.setString(1, dept_name);
    pstmt.setString(2, phone);
    pstmt.setString(3, dept_id);
    pstmt.executeUpdate();
    pstmt.close();
    con.close();
    out.println(dept_name + " , " + phone + "로 수정되었습니다.");
} catch (Exception e) {
	out.println(dept_id + "의 학과코드 수정이 실패했습니다.");
}
%>
<!DOCTYPE html>
<html>
<body>
<BR>
[<A href="index.jsp">main으로</A>] &nbsp;
[<A href="subjectlist.jsp">학과입력화면으로</A>];
</body>
</html>