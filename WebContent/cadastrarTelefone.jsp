<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ page import="com.cadastrousuario.model.*"%>
<%@ page import="com.cadastrousuario.dao.*"%>
<%@ page import="java.util.*"%>

<!DOCTYPE html>
<%
TelefoneDao telefoneDao = new TelefoneDao();
ArrayList<Telefone> lista = telefoneDao.listaTelefones();

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
		<form name="formFone" action="addfone">
		<table>
			<%
				for (int i = 0; i < lista.size(); i++) {
				%>
			<tr>
				<td><input type="hidden" value="<%=lista.get(i).getUsuarioId()%>" name="usuario_id"></td>
			</tr>
			<%}	%>
				
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
			
				<INPUT TYPE="RADIO" NAME="tipo" VALUE="Fixo"> Fixo
				<INPUT TYPE="RADIO" NAME="tipo" VALUE="Celular"> Celular
				<INPUT TYPE="RADIO" NAME="tipo" VALUE="whatsapp"> whatsapp
			
			</form>

		<input type="button" onclick="window.location.href='listaUsuarios.jsp';" onclick="validarFone();"value="Adicionar" class="botao1"> <input type="button"
			value="Voltar" onclick="window.location.href='listaUsuarios.jsp';"
			class="botao3">
</body>
</center>
<script src="resources/js/validar.js"></script>
</html>





