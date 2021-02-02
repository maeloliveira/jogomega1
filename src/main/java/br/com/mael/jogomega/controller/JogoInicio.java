package br.com.mael.jogomega.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class JogoInicio {
	@RequestMapping("inicioJogo")
	public String execute() {
		System.out.println("Inicio do Jogo");
		return "ok";
	}

}
