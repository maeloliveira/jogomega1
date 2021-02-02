package br.com.mael.jogomega.controller;

public class JdbcJogoDao {
	
	private final Connection connection;
	public JdbcTarefaDao() {
	try {
	this.connection = new ConnectionFactory().getConnection();
	} catch (SQLException e) {
	throw new RuntimeException(e);
	}
}

}
