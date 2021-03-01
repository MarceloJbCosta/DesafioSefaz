<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="utf-8">
<title>Cadastro Usuario</title>
<link rel="stylesheet" href="resources/css/style.css">
</head>
<body>
<center>
	<h1>Cadastro de Usuário</h1>
	
	<form name ="formUsuario" action="insert">
		<table>
		<tr>
			<td>Nome <input type="text" name ="nome" placeholder="nome" class="CaixaTx"></td>
		</tr>
		<tr>
			<td>Email <input type="text" name ="email" placeholder="e-mail" class="CaixaTx"></td>
		</tr>
		<tr>
			<td>Senha <input type="password" name ="senha" placeholder="senha" class="CaixaTx"></td>
		</tr>
		<tr>
			<td>DDD <input type="text" name="ddd" maxlength="3" placeholder="DDD" required name="ddd" class=DDD></td>
		</tr>
		<tr>
		<td>Numero <input type="text" name="numero" maxlength="9" placeholder="Número de telefone" required name="numero" class="CaixaTx"></td>
		</tr>
		</table>
		<tr>
			<td>
			
			<form name="telefone" class="Select">
				<INPUT TYPE="RADIO" NAME="Fixo" VALUE="Fixo"> Fixo
				<INPUT TYPE="RADIO" NAME="Celular" VALUE="Celular"> Celular
				<INPUT TYPE="checkbox" NAME="whatap" VALUE="whatap"> Whatsapp
			</form>
			</td>
			</tr>
		
		<br/>
		<input type="button" value="Adicionar" class="" onclick="validarCadastro()" onclick="window.location.href ='bemVindo.jsp';"> <input type="button" value="voltar" class="" onclick="window.location.href = 'bemVindo.jsp';">
	</form>
	<script src="resources/js/validar.js"></script>
	</center>
	
</body>
</html>