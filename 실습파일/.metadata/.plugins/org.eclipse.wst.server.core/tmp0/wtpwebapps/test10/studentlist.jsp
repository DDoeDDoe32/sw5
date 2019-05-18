<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.*"%>
<%
	int i = 0;

String sql ="select sid, sname, subname, substr(jumin,1,8) jumin, decode(substr(jumin,8,1),'1','남','2','여') gubun, phone, email from student A, subject b where a.subcode = substr(b.subcode,3,2)";

try
{
	String url = "jdbc:oracle:thin:@localhost:1521:XE";
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con = DriverManager.getConnection(url, "system", "1234");
	Statement stmt = con.createStatement();
	ResultSet rs = stmt.executeQuery(sql);
%>
<!DOCTYPE html>
<html>
<head>
<script>
function fInsert(sid)
{
	stulist.action = "jumsuInsertView.jsp?SID=?"+sid;
	document.stulist.submit();
}
</script>

<meta charset="UTF-8">
<title>학생목록조회</title>
</head>
<body>
<form name="stulist" method="post">
<center>

<h4> 학생목록조회 </h4>
<table border="1" cellspacing="1">
<tr>
<th>학번</th>
<th>성명</th>
<th>학과</th>
<th>생년월일</th>
<th>성별</th>
<th>전화번호</th>
<th>이메일</th>
</tr>
<%
while(rs.next()) {
	String sid = rs.getString("SID");
%>
	<tr>
	<td><a href="javascript:fInsert(<%=sid %>);"><%=sid %></a> </td>
	<td><%= rs.getString("SNAME") %> </td>
	<td><%= rs.getString("SUBNAME") %> </td>
	<td><%= rs.getString("JUMIN") %> </td>
	<td><%= rs.getString("GUBUN") %> </td>
	<td><%= rs.getString("PHONE") %> </td>
	<td><%= rs.getString("EMAIL") %> </td>
	</tr>
<% } %>
</table>
<%
rs.close();
stmt.close();
con.close();
%>
<%
} catch (SQLException e) {
	e.printStackTrace();
}
%>
</center>
</form>
</body>
</html>