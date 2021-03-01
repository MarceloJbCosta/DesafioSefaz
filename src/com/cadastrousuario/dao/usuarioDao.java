package com.cadastrousuario.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.cadastrousuario.model.Usuario;
import com.cadastrousuario.util.JdbcUtil;

public class UsuarioDao {

	private JdbcUtil connection = new JdbcUtil();

	// inserir
	public void inserirUsuario(Usuario user) {
		String inserir = "insert into usuario(nome,email,senha) values (?,?,?)";
		try {
			Connection con = connection.conectar();
			PreparedStatement pstm = con.prepareStatement(inserir);
			pstm.setString(1, user.getUsuarioNome());
			pstm.setString(2, user.getUsuarioEmail());
			pstm.setString(3, user.getUsuarioSenha());

			pstm.executeUpdate();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// listar usuarios
	public ArrayList<Usuario> listarUsuarios() {
		ArrayList<Usuario> listaUsuarios = new ArrayList<>();
		String usuarios = "select * from usuario order by id";
		try {
			Connection con = connection.conectar();
			PreparedStatement pstm = con.prepareStatement(usuarios);
			ResultSet rs = pstm.executeQuery();
			while (rs.next()) {
				Integer usuarioId = rs.getInt(1);
				String usuarioNome = rs.getString(2);
				String usuarioEmail = rs.getString(3);
				String usuarioSenha = rs.getString(4);
				listaUsuarios.add(new Usuario(usuarioId, usuarioNome, usuarioEmail, usuarioSenha));
			}
			con.close();
			return listaUsuarios;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}

	// excluir
	public void excluirUsuario(int id) {
		String deletar = "delete from usuario where id=?";
		try {
			Connection con = connection.conectar();
			PreparedStatement pstm = con.prepareStatement(deletar);
			pstm.setInt(1, id);
			pstm.executeUpdate();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// alterar
	public void alterarUsuario(Usuario usuario) {
		String alterar = "update usuario set nome=?, email=?, senha=? where id=?";
		try {
			Connection con = connection.conectar();
			PreparedStatement pstm = con.prepareStatement(alterar);

			pstm.setString(1, usuario.getUsuarioNome());
			pstm.setString(2, usuario.getUsuarioEmail());
			pstm.setString(3, usuario.getUsuarioSenha());
			pstm.setInt(4, usuario.getUsuarioId());

			pstm.executeUpdate();
			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	// pegar usuario por id
	public Usuario usuarioPorId(Integer id) {
		Usuario usuario = new Usuario();
		String usuarioId = "select * from usuario where id=?";
		try {
			Connection con = connection.conectar();
			PreparedStatement pstm = con.prepareStatement(usuarioId);
			pstm.setInt(1, id);
			ResultSet rs = pstm.executeQuery();
			while (rs.next()) {
				usuario.setUsuarioId(rs.getInt("id"));
				usuario.setUsuarioNome(rs.getString("nome"));
				usuario.setUsuarioEmail(rs.getString("email"));
				usuario.setUsuarioSenha(rs.getString("senha"));
			}
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}

		return usuario;
	}

}
