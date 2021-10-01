package main.java.br.edu.infnet.appLoja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsuarioController {

    @GetMapping("/usuario")
    public String telaCadastro() {
        return "usuario/cadastro";
    }

    @GetMapping("/usuario/lista")
    public String tela() {
        return "usuario/lista";
    }
}
