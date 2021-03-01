<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ page import="com.cadastrousuario.model.*"%>
<%@ page import="com.cadastrousuario.dao.*"%>
<%@ page import="java.util.*"%>

<!DOCTYPE html>
<%
UsuarioDao usuarioDao = new UsuarioDao();
ArrayList<Usuario> lista = usuarioDao.listarUsuarios();
%>
<html lang="pt-br">
<head>
<meta charset="utf-8">
<link rel="stylesheet" href="resources/css/style.css">
<title>Adicionar Telefone</title>
</head>

<body>
<center>
<h1>Adicionar Telefone</h1>
	
		<table>
			<%
				for (int i = 0; i < lista.size(); i++) {
				%>
			<tr>
				<td><input type="hidden" value="<%=lista.get(i).getUsuarioId()%>" name="usuario_id"></td>
			</tr>
			<%}	%>
				<form name="formFone" action="addfone">
			<tr>
				<td>DDD <input type="text" name="ddd" maxlength="3"
					placeholder="DDD" required name="ddd" class="DDD">
					</td>
			</tr>
			<tr>
				<td>NUMERO<input type="text" name="numero" maxlength="9"
					placeholder="x-xxxx-xxxx " required name="numero" class="CaixaTx">
				</td>
			</tr>
			</table>
			
			</form>
			<form name="telefone" class="select">
				<INPUT TYPE="RADIO" NAME="Fixo" VALUE="Fixo"> Fixo
				<INPUT TYPE="RADIO" NAME="Celular" VALUE="Celular"> Celular
				<INPUT TYPE="checkbox" NAME="whatap" VALUE="whatap"> Whatsapp
			</form>
			
		
		<input type="button" onclick="validarFone();"value="Adicionar" class=""> <input type="button"
			value="Voltar" onclick="window.location.href='listaUsuarios.jsp';"
			class="">
</body>
</center>
<script src="resources/js/validar.js"></script>
</html>





