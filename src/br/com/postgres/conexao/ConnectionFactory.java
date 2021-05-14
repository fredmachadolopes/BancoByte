package br.com.postgres.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	private String url = "jdbc:postgresql://localhost:5432/BancoByte";
	private String usuario = "postgres";
	private String senha = "1F9r8e6d?";
	private Connection connection;
	
	
	public Connection conectandoPostgres() {
		
		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection(url, usuario, senha);
			
			System.out.println("Conexao realizada com sucesso!");
			return this.connection;
		} catch (ClassNotFoundException e) {
			System.out.println("Falha na conexao!");
			System.out.println(e);
			return null;
		} catch (SQLException e) {
			System.out.println("Falha na conexao!");
			System.out.println(e);
			return null;
		}
		
	}
}
