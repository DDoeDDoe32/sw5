<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학과추가 폼</title>
<script language="JavaScript">
   function In_Check(){
      if(document.deptinput.dept_id.value == ""){
         alert("학과코드를 입력하세요!!");
         return;
      }
      if(document.deptinput.dept_name.value == ""){
         alert("학과명을 입력하세요!!")
         return;
      }
      document.deptinput.submit();
   }
</script>
</head>
<body>
<center><h3>학과정보 입력화면</h3>
<form action="dept_insert.jsp" name="deptinput" method="post">
<table border="1" cellspacing="1">
<tr>
<td>학과코드 : </td>
<td><input type="text" name="dept_id"></td>
</tr>
<tr>
<td>학과명 : </td>
<td><input type="text" name="dept_name"></td>
</tr>
<tr>
<td>전화번호 : </td>
<td><input type="text" name="phone"></td>
</tr>
<tr align="center">
<td colspan=2>
<input type="button" name="confirm" value="등록" OnClick="In_Check()">
<input type="reset" name="reset" value="취소">
</td>
</table></form></center>

</body>
</html>