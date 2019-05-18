<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" charset="UTF-8">
<title>학과코드 수정 폼</title>
<script language="JavaScript">
   function In_Check(){
      if(document.idform.dept_id.value == ""){
         alert("원하는 학과코드를 입력하세요.");
         return;
      }
      document.idform.submit();
   }
   function deleteform(){
      document.delform.submit();
   }
</script>
</head>
<body>
<center>
<h4>수정할 학과코드를 입력하세요.</h4>
<form action="dept_modify.jsp" name="idform" method="post">
<table width="200" border="1" cellspacing="0" cellpadding="5">
<tr>
<td align="center">학과코드: </td>
<td><input type="text" name="dept_id" size="2"></td>
</tr>

<tr align="center">
<td colspan=2>
<input type="submit" name="modify" value="수 정" OnClick="In_Check()">
<input type="reset" value="취 소">
</td>
</tr>
</table>
</form>
<h3>
   학과코드 삭제하기
</h3>
<form method="post" action="deptdelete.jsp" name="delform">
<table border="1" cellspacing="1">
<tr>
<td>학과코드 : </td>
<td><input type="text" name="dept_id" size="10"></td>
</tr>
<tr align="center">
<td colspan=2>
<input type="button" name="confirm" value="삭 제" OnClick="deleteform()">
<input type="reset" value="취 소">
</td>
</tr>
</table>
</form>
</center>
</body>
</html>