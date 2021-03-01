<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
	<%@page import ="com.cadastrousuario.model.*" %>
	<%
	Usuario user = (Usuario) request.getAttribute("usuarioId");
	%>
<html>
<head>
<meta charset="utf-8">
<link rel="stylesheet" href="resources/css/style.css">

<title>Aterar Usuário</title>
</head>
<body>
	
	<center style="margin-top: 50px">
	<table>
	<h1>Alterando Usuário</h1>
		<form action="editar" name="formEditar">
			<tr>
				<td><input type="hidden" value="<%=user.getUsuarioId()%>" name="usuarioId" ></td>
			</tr>
	<tr>	
		<td>Nome : <input type="text" class="CaixaTx"  name="nome" placeholder="nome" /></td>
	</tr>
	<tr>
		<td>Email : <input type="text" class="CaixaTx" name="email" placeholder="e-mail" /></td>
	</tr>
	<tr>
		<td>Senha : <input type="password" class="CaixaTx" name="senha" placeholder="senha" /></td> 
	<br/><br/>
	</tr>
	</table>
		<input type="button" class="botao1" onclick="validarAlteracao()" value="Alterar" onclick="window.location.href='listaUsuarios.jsp';" /> 	
		<input type="button" class="botao3" value="voltar"	onclick="window.location.href='login.jsp';" />
		</form>
		<script src="resources/js/validar.js"></script>
		
	</center>
</body>

</html>