<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h3>Login Page</h3>
<form name = "login" action="login.do" method="post">
	<table>
		<tr>
			<td>ID</td>
			<td><input type="text" name="userid"></td>
		</tr>
		<tr>
			<td>��й�ȣ</td>
			<td><input type="password" name="userpw"></td>
		</tr>
		<tr>
		<td colspan=2>
		<input type=submit value ="�α���">
		</td>
		</tr>
	</table>
</form>
</body>
</html>