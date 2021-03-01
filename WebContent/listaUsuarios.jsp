<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ page import="com.cadastrousuario.model.*" %>
    <%@ page import="com.cadastrousuario.dao.*" %>
    <%@ page import = "java.util.ArrayList" %>
    
    
    <%
    UsuarioDao user = new UsuarioDao();
    ArrayList<Usuario> lista = user.listarUsuarios(); 
    %>

    
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="utf-8">
<title>Lista de Usuarios</title>
<link rel="stylesheet" href = "resources/css/style.css">

</head>
<body>
<center>
<h1>Lista de Usuarios</h1>

	<table id="tabela">
		<thead>
			<tr>
				<th>ID</th>
				<th>NOME</th>
				<th>EMAIL</th>
				<th>TELEFONES</th>
				<th>AÇÕES</th>
				
			</tr>
		</thead>
		<tbody>
			<%for(int i = 0; i < lista.size(); i++){ %>
				<tr>
					<td><%=lista.get(i).getUsuarioId() %></td>
					<td><%=lista.get(i).getUsuarioNome() %></td>
					<td><%=lista.get(i).getUsuarioEmail() %></td>
					
					<td><input type="button" class="botao3" value="Telefones" onclick="window.location.href='listarTelefone.jsp';"></td>
					<td><a href="select?usuarioId=<%=lista.get(i).getUsuarioId()%>" ><button class="botao1" onclick ="window.location.href='editarUsuario.jsp';">Editar</button></a>      <a href="delete?usuarioId=<%=lista.get(i).getUsuarioId()%>"><button class ="botao2" onclick ="window.location.href='listarUsuarios.jsp';">Excluir</button></a>
				</tr>
			<%} %>
		</tbody>
	</table>
	<input type="button" value="voltar" class="botao1" onclick="window.location.href = 'bemVindo.jsp';">
</center>

</body>
</html>