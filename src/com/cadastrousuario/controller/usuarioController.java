package com.cadastrousuario.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cadastrousuario.dao.UsuarioDao;
import com.cadastrousuario.model.*;

@WebServlet(urlPatterns = { "/UsuarioController", "/main", "/insert" })

public class UsuarioController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Usuario user = new Usuario();
	UsuarioDao userDao = new UsuarioDao();

	public UsuarioController() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();

		if (action.equals("/main")) {
			usuarios(request, response);
		}else if(action.equals("/insert")) {
			novoUsuario(request, response);
		//colocar aqui dentro todas as requisiçoes
		}else {
			//se ele receber alguma requisção que ele nao conhece
			response.sendRedirect("index.jsp");
		}
			

	}

	// listar usuarios
	protected void usuarios(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.sendRedirect("usuario.jsp");
	}
	// adicionar usuarios
	protected void novoUsuario(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.sendRedirect("cadastroUsuario.jsp");
		user.setUsarioNome(request.getParameter("nome"));
		user.setUsuarioEmail(request.getParameter("email"));
		user.setUsuarioSenha(request.getParameter("senha"));
		
		//inserir o metodo inserirUsuario
		userDao.inserirUsuario(user);
		//mandando para o jsp
		response.sendRedirect("main");
		
		
	}

}
