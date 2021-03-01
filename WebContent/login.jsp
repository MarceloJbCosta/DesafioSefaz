<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="utf-8">
<link rel="stylesheet" href="resources/css/style.css">
<title>login</title>
</head>
<body>
<center>
	<h1>Login</h1>
	<form name ="formlogin" action="login">
		<table>
		<tr>
			<td><input type="text" name ="email" placeholder="e-mail" class="CaixaTx"></td>
		</tr>
		<tr>
			<td><input type="password" name ="senha" placeholder="senha" class="CaixaTx"></td>
		</tr>
		</table>
		<br/>
		<input type="button" value="entrar" class="" onclick= "validarLogin()" onclick="window.location.href = 'listaUsuarios.jsp';"> <input type="button" value="voltar" class="" onclick="window.location.href = 'bemVindo.jsp';">
	</form>
	<script src="resources/js/validar.js"></script>
	</center>
</body>
</html>
