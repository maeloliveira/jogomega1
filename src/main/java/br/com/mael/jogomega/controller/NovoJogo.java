package br.com.mael.jogomega.controller;

import java.util.Calendar;

public class NovoJogo {
	private Long id;
	@Size(min=7)
	private String numeroJogo;
	private String email;
	private boolean validaJogo;
	private Calendar dataValidade;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNumeroJogo() {
		return numeroJogo;
	}
	public void setNumeroJogo(String numeroJogo) {
		this.numeroJogo = numeroJogo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isValidaJogo() {
		return validaJogo;
	}
	public void setValidaJogo(boolean validaJogo) {
		this.validaJogo = validaJogo;
	}
	public Calendar getDataValidade() {
		return dataValidade;
	}
	public void setDataValidade(Calendar dataValidade) {
		this.dataValidade = dataValidade;
	}

}
