package com.cadastrousuario.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcUtil {
	public class ConnectionFactory {
		// parametros e conexao
		
		private String driver = "com.mysql.cj.jdbc.Driver";
		private String url = "jdbc:mysql://localhost:3306/cadastroUsuario?useTimezone=true&serverTimezone=UTC";
		private String user = "root";
		private String password = "root";
		
		// metodo de conexao
		
		private Connection conectar() {
			Connection connection = null;
			try {
				Class.forName(driver);
				connection = DriverManager.getConnection(url, user, password);
				return connection;
			} catch (Exception e) {
				System.out.println(e);
				return null;
			}
		}
	}

}
