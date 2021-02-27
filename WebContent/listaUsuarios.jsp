<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ page import="com.cadastrousuario.model.*" %>
    <%@ page import="com.cadastrousuario.dao.*" %>
    <%@ page import = "java.util.ArrayList" %>
    
    <%
    ArrayList<Usuario> lista = (ArrayList<Usuario>)
    request.getAttribute("listaUsuarios");
    %>
    
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="utf-8">
<title>Lista de Usuarios</title>
<link rel="stylesheet" href = "resources/css/stylo.css">

</head>
<body>
<center>
<h1>Lista de Usuarios</h1>
	<form name="formUsuario" action="insert">
	<input type="button" value="Novo Usuario" class="" onclick="validarCadastro()" onclick="window.location.href='login.jsp';">
	</form>
	<table id="tabela">
		<thead>
			<tr>
				<th>ID</th>
				<th>NOME</th>
				<th>EMAIL</th>
				<th>Telfone</th>
				<th>AÇÕES</th>
				
			</tr>
		</thead>
		<tbody>
			<%for(int i = 0; i < lista.size(); i++){ %>
				<tr>
					<td><%=lista.get(i).getUsuarioId() %></td>
					<td><%=lista.get(i).getUsuarioNome() %></td>
					<td><%=lista.get(i).getUsuarioEmail() %></td>
					
					<td><input type="button" value="Telefones" onclick="window.location.href = 'listarTelefone.jsp';"></td>
					<td><a href="select?usuarioId=<%=lista.get(i).getUsuarioId()%>" ><button onclick ="window.location.href='editarUsuario.jsp';">Editar</button></a>      <a href="delete?usuarioId=<%=lista.get(i).getUsuarioId()%>" ><button onclick ="window.location.href='listarUsuario.jsp';">Excluir</button></a>
				</tr>
			<%} %>
		</tbody>
	</table>
	<script src="resources/js/validador.js"></script>
</center>

</body>
</html>