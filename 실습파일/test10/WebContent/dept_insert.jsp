<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.*"%>
<% request.setCharacterEncoding("UTF-8"); %>
<%
String Dept_ID = request.getParameter("dept_id"); 
String Dept_Name = request.getParameter("dept_name");
String Phone = request.getParameter("phone");
String url = "jdbc:oracle:thin:@localhost:1521:XE";
String sql = "INSERT INTO MAJOR(dept_id, dept_name, phone) VALUES(?,?,?)";
try{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con = DriverManager.getConnection(url, "system", "1234");
	PreparedStatement pstmt = con.prepareStatement(sql);
	pstmt.setString(1, Dept_ID);
	pstmt.setString(2, Dept_Name);
	pstmt.setString(3, Phone);
	pstmt.executeUpdate();
	pstmt.close();
	con.close();
	out.println("<h4>학과 테이블에 한 행이 추가되었습니다!!</h4>");
} catch (SQLException e) {
	out.println("<h4>오류 발생하였습니다. 확인해보세요!!</h4>");
}
%>
<html>
<body>
<BR>
[<A href="index.jsp">main으로</A>] &nbsp;
[<A href="subjectlist.jsp">학과입력화면으로</A>]
</body>
</html>