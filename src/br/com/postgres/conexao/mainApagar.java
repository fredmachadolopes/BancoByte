package br.com.postgres.conexao;

public class mainApagar {

	public static void main(String[] args) {
		ConnectionFactory con = new ConnectionFactory();
		
		System.out.println(con.conectandoPostgres());

	}

}
