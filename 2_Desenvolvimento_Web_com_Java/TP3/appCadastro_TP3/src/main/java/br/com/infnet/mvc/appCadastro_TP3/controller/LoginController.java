package br.com.infnet.mvc.appCadastro_TP3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
	
	@GetMapping("/")
	public String Login() {
		return "index.html";
	}
}
