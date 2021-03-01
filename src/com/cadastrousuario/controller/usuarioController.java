package com.cadastrousuario.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cadastrousuario.dao.TelefoneDao;
import com.cadastrousuario.dao.UsuarioDao;
import com.cadastrousuario.model.*;



@WebServlet(urlPatterns = { "/UsuarioController",
							"/main", "/insert", "/login",
							"/select", "/delete", "/editar", "/addfone"})

public class UsuarioController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Usuario user = new Usuario();
	UsuarioDao userDao = new UsuarioDao();
	Telefone telefone = new Telefone();
	TelefoneDao telefoneDao = new TelefoneDao();

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
			login(request, response);
		}else if(action.equals("/select")){
			editarUsuario(request, response);
		}else if(action.equals("/delete")) {
			excluirUsuario(request, response);
		}else if(action.equals("/editar")) {
			editarUsuario(request, response);
		}else if(action.equals("/addfone")) {
			adicionarTelefone(request, response);
		}else {
			response.sendRedirect("index.jsp");
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
	
	//addtelefone
	protected void adicionarTelefone(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		int idusuario = Integer.parseInt(request.getParameter("usuario_id"));
		telefone.setTelefoneDdd(Integer.parseInt(request.getParameter("ddd")));
		telefone.setTelefoneNumero(request.getParameter("numero"));
		telefone.setTelefoneTipo(request.getParameter("telefone"));
		telefoneDao.inserirTelefone(idusuario, telefone);
		
		
		response.sendRedirect("login.jsp");
		
		
	}
	protected void login(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
			RequestDispatcher rd = request.getRequestDispatcher("listaUsuarios.jsp");
			rd.forward(request, response);
		
			response.sendRedirect("index.jsp");
		

	}


}
