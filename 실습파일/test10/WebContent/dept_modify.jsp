<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.*"%>
<%
request.setCharacterEncoding("UTF-8");
%>
<%
String Dept_ID = request.getParameter("dept_id");
String url =  "jdbc:oracle:thin:@localhost:1521:XE";
String sql = "select * from major where dept_id = ?";
try {
    Class.forName("oracle.jdbc.driver.OracleDriver");
    Connection con = DriverManager.getConnection(url, "system", "1234");
    PreparedStatement pstmt = con.prepareStatement(sql);
    pstmt.setString(1, Dept_ID);
    ResultSet rs = pstmt.executeQuery();
    if(rs.next()){
       String dept_name = rs.getNString(2);
       String phone = rs.getNString(3);
       pstmt.close();
       con.close();
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<body>
<center> <h4>학과명 수정화면</h4>
<form action="dept_modify2.jsp" name="deptform" method="post">
<table border="1" cellspacing="1">
   <tr>
<td>학과코드: </td>
<td><input type="hidden" name="dept_id" value=<%=Dept_ID %>></td>
</tr>
<tr>
<td>학과명: </td>
<td><input type="text" name="dept_name" value=<%=dept_name %>></td>
</tr>
<tr>
<td>전화번호: </td>
<td><input type="text" name="phone" value=<%=phone %>></td>
</tr>
<tr align="center">
<td colspan=2>
<input type="submit" name="confirm" value="수 정">
<input type="reset" name="reset" value="취 소">
</table>
</form>
</center>

</body>
</html>
<%}else{
   out.println("<h3>학과코드가 존재하지 않습니다.</h3>");
}
   }catch(SQLException e){
      out.println("<h3>sql에러</h3>");;
   }
%>