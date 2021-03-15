package br.com.livro.domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseDAO {

	public BaseDAO() {

		// Necessario para utilizar o driver JDBC do Mysql
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// Erro de driver JDBC ( adicione o driver .jar do mysql em /web-inf/lib
			e.printStackTrace();
		}
	}

	protected Connection getConnection() throws SQLException {

		// URL de conexão com o BD;

		String url = "jdbc:mysql://localhost:3307/livro";

		// Conecta utilizando a URL, usuario e senha;

		Connection conn = DriverManager.getConnection(url, "root", "Od@ir1626");

		return conn;

	}

	public static void main(String[] args) throws SQLException {

		BaseDAO db = new BaseDAO();

		// Testa Conexao;

		Connection conn = db.getConnection();

		System.out.println(conn);

	}

}
