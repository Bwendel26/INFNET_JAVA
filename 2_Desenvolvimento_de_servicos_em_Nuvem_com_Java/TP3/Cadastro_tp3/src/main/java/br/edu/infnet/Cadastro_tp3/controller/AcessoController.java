package br.edu.infnet.Cadastro_tp3.controller;

import br.edu.infnet.Cadastro_tp3.domain.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class AcessoController {

    @GetMapping("/")
    public String TelaIncial() {
        return "index";
    }

    @GetMapping("/login")
    public String telaLogin() {
        return "index";
    }

    @GetMapping("/cadastro")
    public String telaCadastro() {
        return "cadastro";
    }

    @PostMapping("/cadastro")
    public String cadastrar(Model model, HttpServletRequest request, HttpServletResponse response) {

        Usuario usuario = new Usuario();
        String nome = (String) model.getAttribute("nome");
        String email = (String) model.getAttribute("email");
        String senha = (String) model.getAttribute("senha");
        try {
            if ((!"".equals(nome) || nome != null) && (!"".equals(email) || email != null) && (!"".equals(senha) || senha != null)) {
                usuario.setNome((String) model.getAttribute("nome"));
                usuario.setEmail((String) model.getAttribute("email"));
                usuario.setSenha((String) model.getAttribute("senha"));
                usuario.setTelefone((String) model.getAttribute("fone"));
                usuario.setCep((String) model.getAttribute("cep"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}