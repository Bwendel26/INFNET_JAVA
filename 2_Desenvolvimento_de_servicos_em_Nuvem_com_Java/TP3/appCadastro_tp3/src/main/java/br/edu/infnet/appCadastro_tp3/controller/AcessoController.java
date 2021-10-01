package br.edu.infnet.appCadastro_tp3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AcessoController {

    @GetMapping("/index")
    public String tela() {
        return "index";
    }
}
