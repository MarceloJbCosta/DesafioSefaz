<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<%@ page import ="com.cadastrousuario.dao.*" %>
<%@ page import ="com.cadastrousuario.model.*" %>
<%@ page import ="java.util.*" %>

<%
TelefoneDao telefoneDao = new TelefoneDao();
ArrayList<Telefone> lista = telefoneDao.listaTelefones();
%>
<html lang="pt-br">
<head>
<link rel="stylesheet" href="resources/css/style.css"">
<meta charset="utf-8">
<title>Listar Telefone</title>
</head>
<body>

<center style="margin-top: 50px">
	<h1 class="">Lista de telefones</h1>
	<table id="tabela">
			<thead>
				<tr>
					<th>Ddd</th>
					<th>Numero</th>
					<th>Tipo</th>
					<th>Ações</th>
				</tr>
			</thead>
			<tbody>
				<%
				for (int i = 0; i < lista.size(); i++) {
				%>
				<tr>
					<td><%=lista.get(i).getTelefoneDdd()%></td>
					<td><%=lista.get(i).getTelefoneNumero()%></td>
					<td><%=lista.get(i).getTelefoneTipo()%></td>
					<td><a href="excluirfone?id=<%=lista.get(i).getUsuarioId() %>"
						onclick="window.location.href = 'listarUsuarios.jsp';"><button class="botao2">Excluir</button></a></td>
				</tr>
				<%
				}
				%>
			</tbody>
		</table>
		<input type="button" value="voltar" class="botao1" onclick="window.location.href = 'bemVindo.jsp';">
		<imput type="button" onclick="window.location.href = 'cadastrarTelefone.jsp';"><button class="botao3">Adicionar Telefone</button>
					
</body>
</html>


