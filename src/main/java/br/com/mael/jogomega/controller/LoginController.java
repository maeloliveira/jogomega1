package br.com.mael.jogomega.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class LoginController {

	@RequestMapping("log/log")
	public String loginForm() {
	return "formulario-login";
	}
	
	@RequestMapping("efetuaLogin")
	public String efetuaLogin(Usuario usuario, HttpSession session) {
	if(new JdbcUsuarioDao().existeUsuario(usuario)) {
	session.setAttribute("usuarioLogado", usuario);
	return "menu";
	}
	return "redirect:loginForm";
	}
	
}
