package br.com.mael.jogomega.controller;

import org.springframework.boot.autoconfigure.integration.IntegrationProperties.Jdbc;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.mael.jogomega.DAO.JdbcJogoDao;

public class AdicionaController {
	private JdbcJogoDao dao;
	
	public NogoJogo() {
		this.dao = new JdbcJogoDao();
		
	@RequestMapping("jogo")
	public String form() {
	return "jogo/jogoAdicionado";
	}
	@RequestMapping("jogoAdicionado")
	public String adiciona(@Valid NovoJogo Adicionado) {
	JdbcJogoDao dao = new JdbcJogoDao();
	dao.JogoAdicionado(JogoInicio);
	return "tarefa/adicionada";
	}
	
}