/**
 * 
 */
function validarCadastro() {

	let nome = formUsuario.nome.value
	let email = formUsuario.email.value
	let senha = formUsuario.senha.value

	if (nome === "") {
		alert("Preencha o campo Nome")
		formUsuario.nome.focus()
		return false
	} else if (email === "") {
		alert("Preencha o campo Email")
		formUsuario.email.focus()
		return false
	} else if (senha === "") {
		alert("Preencha o campo Senha")
		formUsuario.senha.focus()
		return false
	} else {
		document.forms["formUsuario"].submit()
		alert("Usuario Cadastrado com sucesso!")
	}
}

function validarLogin() {
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
		alert("Bem Vindo! ")
	}

}
function validarAlteracao(){
	let nome = formEditar.nome.value
	let email = formEditar.email.value
	let senha = formEditar.senha.value

	if (nome === "") {
		alert("Preencha o campo Nome")
		formEditar.nome.focus()
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
		alert("Usuario alterado com sucesso!")
	}

}