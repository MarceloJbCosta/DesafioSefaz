package com.cadastrousuario.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcUtil {
		// parametros e conexao
		
		private String driver = "com.mysql.cj.jdbc.Driver";
		private String url = "jdbc:mysql://localhost:3306/cadastroUsuario?useTimezone=true&serverTimezone=UTC";
		private String user = "root";
		private String password = "root";
		
		public Connection conectar() {
			Connection connection = null;
			try {
				//vai ler o driver de conexao
				Class.forName(driver);
				connection = DriverManager.getConnection(url, user, password);
				return connection;
			} catch (Exception e) {
				System.out.println(e);
				return null;
			}
		}
	}


