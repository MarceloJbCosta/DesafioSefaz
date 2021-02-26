<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>login</title>
</head>
<body>
<center>
	<h1>Login</h1>
	<form name ="formlogin" action="login">
		<table>
		<tr>
			<td><input type="text" name ="email" placeholder="e-mail" class=""></td>
		</tr>
		<tr>
			<td><input type="password" name ="senha" placeholder="senha" class=""></td>
		</tr>
		</table>
		<br/>
		<input type="button" value="entrar" class="" onclick= "validarLogin()" onclick="window.location.href = 'listaUsuarios.jsp';"> <input type="button" value="voltar" class="" onclick="window.location.href = 'bemVindo.jsp';">
	</form>
	<script src="resources/js/validador.js"></script>
	</center>
</body>
</html>
