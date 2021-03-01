/**
 * 
 */
function validarCadastro(){
	let nome = formUsuario.nome.value
	let email = formUsuario.email.value
	let senha = formUsuario.senha.value
	
	if(nome === ""){
		alert("Campo NOME não pode ser vazio.")
		formUsuario.nome.focus()
		return false
	}else if(email ===""){
		alert("Campo EMAIL não pode ser vazio.")
		formUsuario.email.focus()
		return false
	}else if(senha ===""){
		alert("Campo SENHA não pode ser vazio.")
		formUsuario.senha.focus()
		return false	
	}else{
		document.forms["formUsuario"].submit()
		alert("Cadastro realizado com sucesso")
	}
}


function validarLogin(){
		let email = formlogin.email.value
	let senha = formlogin.senha.value

	if (email === "") {
		alert("Preencha o campo Email")
		formlogin.email.focus()
		return false
	} else if (senha === "") {
		alert("Preencha o campo Senha")
		formlogin.senha.focus()
		return false
	} else {
		document.forms["formlogin"].submit()
		alert("Bem Vindo!" )
	}
}
function validarFone(){
	let ddd = formFone.ddd.value
	let numero = formFone.numero.value
	
	if(ddd ===""){
	alertalert("Preencha o campo ddd")
		formFone.ddd.focus()
		return false
	}else if(numero === ""){
		alertalert("Preencha o campo numero")
		formFone.numero.focus()
		return false
	}else{
		document.forms["formFone"].submit()
		alert("telefone Cadastrado" )
	}

}

function validarAlteracao(){
	let nome = formEditar.nome.value
	let email = formEditar.email.value
	let senha = formEditar.senha.value

	if (nome === "") {
		alert("Preencha o campo Email")
		formEditar.email.focus()
		return false
	} else if (email === "") {
		alert("Preencha o campo Email")
		formEditar.email.focus()
		return false
	} else if (senha === "") {
		alert("Preencha o campo Senha")
		formEditar.senha.focus()
		return false
	} else {
		document.forms["formEditar"].submit()
		alert("Cadastro alterado!")
	}
}