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
import com.cadastrousuario.model.Telefone;
import com.cadastrousuario.model.Usuario;


@WebServlet(urlPatterns = { "/TelefoneController", "/telefone", "/addFone", "/excluirFone" })
public class TelefoneController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Usuario usuario = new Usuario();
	UsuarioDao usuarioDao = new UsuarioDao();
	Telefone telefone = new Telefone();
	TelefoneDao telefoneDao = new TelefoneDao();

	public TelefoneController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();
		if(action.equals("/telefone")) {
			listarTelefones(request, response);
		}else if(action.equals("/addFone")) {
			adicionarTelefone(request, response);
		}else if(action.equals("excluirFone")) {
			excluirTelefone(request, response);
		}else {	
			response.sendRedirect("index.jsp");
		}
	}

	protected void listarTelefones(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("usuario_id"));
		ArrayList<Telefone> listaTelefones = telefoneDao.listaTelefonesById(id);
		request.setAttribute("listaTelefones", listaTelefones);
		RequestDispatcher rd = request.getRequestDispatcher("listaTelefone.jsp");
		rd.forward(request, response);
	}

	protected void adicionarTelefone(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		int idusuario = Integer.parseInt(request.getParameter("usuario_id"));
		
		int ddd = Integer.parseInt(request.getParameter("ddd"));
		String numero = request.getParameter("numero");
		String tipo = request.getParameter("tipo");
		telefoneDao.inserirTelefone(idusuario, ddd, numero, tipo );
		
		response.sendRedirect("login.jsp");
	}

	protected void excluirTelefone(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
			int id = Integer.parseInt(request.getParameter("id"));
			telefoneDao.deletarTelefone(id);
			response.sendRedirect("cadastarTelefone.jsp");
		}
	}
