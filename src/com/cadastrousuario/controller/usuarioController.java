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

@WebServlet(urlPatterns = { "/UsuarioController", "/main", "/insert", "/login"})

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


		if(action.equals("/insert")) {
			testeLogin(request, response);
		}else if(action.equals("/login")){
			usuarioLista(request, response);
		}else {
			response.sendRedirect("index.html");
		}
			
	}

	// listar usuarios
	protected void usuarioLista(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//criando um obje que recebe os uauarios da DAO
		ArrayList<Usuario> lista = userDao.listarUsuarios();
		
		for(int i =0; i < lista.size(); i++) {
			System.out.println(lista.get(i).getUsuarioId());
			System.out.println(lista.get(i).getUsuarioNome());
			System.out.println(lista.get(i).getUsuarioEmail());
			
		}
		
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
		
		//inserir o metodo inserirUsuario
		userDao.inserirUsuario(user);
		//mandando para o jsp
		response.sendRedirect("insert");
		
	}
	protected void testeLogin(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		//criando um obje que recebe os uauarios da DAO
//		ArrayList<Usuario> lista = userDao.listarUsuarios();
//		for(int i =0; i < lista.size(); i++) {
//			System.out.println(lista.get(i).getUsuarioId());
//			System.out.println(lista.get(i).getUsuarioNome());
//			System.out.println(lista.get(i).getUsuarioEmail());
//			
//		}
//		//encamihar a lista para o jsp
//		request.setAttribute("listaUsuarios", lista);
//		RequestDispatcher rd = request.getRequestDispatcher("listaUsuarios.jsp");
//		rd.forward(request, response);	
//		
	}

}
