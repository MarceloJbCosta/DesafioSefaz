package com.cadastrousuario.model;

public class Usuario {
	
	private Integer usuarioId;
	private String usuarioEmail;
	private String usuarioSenha;
	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Usuario(Integer usuarioId, String usuarioEmail, String usuarioSenha) {
		super();
		this.usuarioId = usuarioId;
		this.usuarioEmail = usuarioEmail;
		this.usuarioSenha = usuarioSenha;
	}
	public Integer getUsuarioId() {
		return usuarioId;
	}
	public void setUsuarioId(Integer usuarioId) {
		this.usuarioId = usuarioId;
	}
	public String getUsuarioEmail() {
		return usuarioEmail;
	}
	public void setUsuarioEmail(String usuarioEmail) {
		this.usuarioEmail = usuarioEmail;
	}
	public String getUsuarioSenha() {
		return usuarioSenha;
	}
	public void setUsuarioSenha(String usuarioSenha) {
		this.usuarioSenha = usuarioSenha;
	}
	
}
