<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="utf-8">
<title>Cadastro Usuario</title>
<link rel="stylesheet" href="">
</head>
<body>
<center>
	<h1>Criar novo Usuario</h1>
	<form name ="formUsuario" action="insert">
		<table>
		<tr>
			<td><input type="text" name ="nome" placeholder="nome" class=""></td>
		</tr>
		<tr>
			<td><input type="text" name ="email" placeholder="e-mail" class=""></td>
		</tr>
		<tr>
			<td><input type="password" name ="senha" placeholder="senha" class=""></td>
		</tr>
		</table>
		<br/>
		<input type="button" value="Adicionar" class="" onclick="validarCadastro()" onclick="window.location.href ='bemVindo.jsp';"> <input type="button" value="voltar" class="" onclick="window.location.href = 'bemVindo.jsp';">
	</form>
	<script src="resources/js/validador.js"></script>
	</center>
	
</body>
</html>