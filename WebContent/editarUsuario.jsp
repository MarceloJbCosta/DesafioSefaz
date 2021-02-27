<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">

<title>Aterar Usuário</title>
</head>
<body>
	
	<center>
	<h1>Alterando Usuário</h1>
		<form action='editar' name="formEditar">

			Nome : <input type="text" name="nome"
				value="<c:out value="${user.nome}" />" /> <br /> 
			Email : <input
				type="text" name="e=mail"
				value="<c:out value="${user.email}" />" /> <br /> 
			Senha : <input
				type="text" name="senha"
				value="<c:out value="${user.senha}" />" /> <br /> 
				<br /> 
				<input				
				type="button" value="Alterar" onclick="validarAlteracao()"
				onclick="window.location.href='listaUsuarios.jsp';" /> 	<input				
				type="button" value="voltar"
				onclick="window.location.href='login.jsp';" />
		</form>
		<script src="resources/js/validador.js"></script>
	</center>
</body>

</html>