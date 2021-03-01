package com.cadastrousuario.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.cadastrousuario.model.Telefone;
import com.cadastrousuario.util.JdbcUtil;

public class TelefoneDao {
	
	private JdbcUtil connection = new JdbcUtil();
	
	//inserir
	public void inserirTelefone(int usuarioId, Telefone telefone) {
		String inserir = "insert into telefones(ddd, numero, tipo, usuario_id) values (?,?,?,?)";
		try {
			Connection con = connection.conectar();
			PreparedStatement pstm = con.prepareStatement(inserir);
			
				pstm.setInt(1, telefone.getTelefoneDdd());
				pstm.setString(2, telefone.getTelefoneNumero());
				pstm.setString(3, telefone.getTelefoneTipo());
				pstm.setInt(4, usuarioId);
				
				pstm.executeUpdate();
				con.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	
	//listar
	public ArrayList<Telefone> listaTelefones() {
		ArrayList<Telefone> listaTelefones = new ArrayList<>();
		
		String telefones = "select * from telefones order by id";
		try {
			Connection con = connection.conectar();
			PreparedStatement pstm = con.prepareStatement(telefones);
			ResultSet rs = pstm.executeQuery();
			
			while (rs.next()) {
				int id = rs.getInt("id");
				int ddd = rs.getInt("ddd");
				String numero = rs.getString("numero");
				String tipo = rs.getString("tipo");
				int userId = rs.getInt("usuario_id");
				listaTelefones.add(new Telefone(id, ddd, numero, tipo, userId));
			}
			con.close();
			return listaTelefones;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	//listar telefone com usuario	
	public ArrayList<Telefone> listaTelefonesById(int id) {
		ArrayList<Telefone> listaTelefones = new ArrayList<>();
		
		String sql = "select * from telefones where usuario_id = ?";
		try {
			Connection con = connection.conectar();
			PreparedStatement pstm = con.prepareStatement(sql);
			pstm.setInt(1, id);
			ResultSet rs = pstm.executeQuery();
			while (rs.next()) {
				int idtelefone = rs.getInt("id");
				int ddd = rs.getInt("ddd");
				String numero = rs.getString("numero");
				String tipo = rs.getString("tipo");
				int idusuario = rs.getInt("usuario_id");
				listaTelefones.add(new Telefone(idtelefone, ddd, numero, tipo, idusuario));
			}
			con.close();
			return listaTelefones;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	//excluir
	public void deletarTelefone(int id) {
		String deletar = "delete from telefones where id = ?";
		try {
			Connection con = connection.conectar();
			PreparedStatement pstm = con.prepareStatement(deletar);
			
			pstm.setInt(1, id);
			pstm.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
