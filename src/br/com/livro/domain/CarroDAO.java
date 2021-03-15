package br.com.livro.domain;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CarroDAO extends BaseDAO {

	// método que retorna um carro através de seu ID "getCarroById";
	public Carro getCarroById(Long id) throws SQLException {

		Connection conn = null;
		PreparedStatement stmt = null;

		try {
			conn = getConnection();
			stmt = conn.prepareStatement("select * from carro where id=?");
			stmt.setLong(1, id);
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				Carro c = createCarro(rs);
				rs.close();
				return c;
			}
		} finally {
			if (stmt != null) {
				stmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		}

		return null;

	}

	// método que retorna uma lista de carros pelo nome ;
	public List<Carro> findByName (String nome) throws SQLException{
		
		List<Carro> carros = new ArrayList<>();
		Connection conn = null;
		PreparedStatement stmt = null;
		
		conn = getConnection();
		
		
	}
