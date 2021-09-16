package main.java.br.edu.infnet.appLoja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import main.java.br.edu.infnet.appLoja.model.domain.Solicitante;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SolicitanteController {
	
	@GetMapping(value="/solicitante")
	public String tela() {
		System.out.println("GET METHOD");
		return "solicitante/cadastro";
	}
	
	@PostMapping(value="/solicitante/incluir")
	public String incluir(Solicitante solicitante) {
		System.out.println(solicitante);
		return "solicitante/cadastro";
	}
}