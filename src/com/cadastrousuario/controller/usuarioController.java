package com.cadastrousuario.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cadastrousuario.dao.UsuarioDao;
import com.cadastrousuario.model.*;



@WebServlet(urlPatterns = { "/UsuarioController",
							"/main", "/insert", "/login",
							"/select", "/delete", "/editar"})

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
		System.out.println(action);

		if(action.equals("/insert")) {
			novoUsuario(request, response);
		}else if(action.equals("/login")){
			usuarioLista(request, response);
		}else if(action.equals("/select")){
			editarUsuario(request, response);
		}else if(action.equals("/delete")) {
			excluirUsuario(request, response);
		}else if(action.equals("/editar")) {
			editarUsuario(request, response);
		}else {
			response.sendRedirect("index.html");
		}
			
	}

	// listar usuarios
	protected void usuarioLista(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//criando um obje que recebe os uauarios da DAO
		ArrayList<Usuario> lista = userDao.listarUsuarios();
		//encamihar a lista para o jsp
		request.setAttribute("listaUsuarios", lista);
		RequestDispatcher rd = request.getRequestDispatcher("listaUsuarios.jsp");
		rd.forward(request, response);
	}
	
	// adicionar usuarios
	protected void novoUsuario(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.sendRedirect("cadastroUsuario.jsp");
		user.setUsuarioNome(request.getParameter("nome"));
		user.setUsuarioEmail(request.getParameter("email"));
		user.setUsuarioSenha(request.getParameter("senha"));
		
		userDao.inserirUsuario(user);
		//response.sendRedirect("login.jsp");
		
	}
	protected void testeLogin(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	}

	//editar usuarios
	protected void editarUsuario(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("usuarioId"));
		user = userDao.usuarioPorId(id);
		System.out.println(user);
		
		userDao.alterarUsuario(user);
        request.setAttribute("usuarioId", user);
        RequestDispatcher rd = request.getRequestDispatcher("editarUsuario.jsp");
        rd.forward(request, response);
        
       
	}
	
	//excluir usuario
	protected void excluirUsuario(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		

		  int userId = Integer.parseInt(request.getParameter("usuarioId"));
		  userDao.excluirUsuario(userId);
		  System.out.println(userId);
         
		  response.sendRedirect("listaUsuarios.jsp");
		  
          //request.setAttribute("listaUsuarios", userDao.listarUsuarios());
       
          
          
			
	}

}
