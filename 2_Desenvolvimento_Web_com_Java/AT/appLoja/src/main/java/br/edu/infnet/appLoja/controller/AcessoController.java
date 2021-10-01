package main.java.br.edu.infnet.appLoja.controller;

import main.java.br.edu.infnet.appLoja.model.domain.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import javax.servlet.http.HttpSession;

@SessionAttributes("user")
@Controller
public class AcessoController {

    @RequestMapping("/")
    public String telaHome() {
        return "index";
    }

    @RequestMapping(value = "/login")
    public String telaLogin() {
        return "login";
    }

    @PostMapping("/login")
    public String login(Model model, @RequestParam String email, @RequestParam String senha) {
        Usuario usuario = null;
        if(email.equals(senha)) {
            usuario = new Usuario("Bruno", email);
            return "index";
        } else {
            model.addAttribute("msg", "Invalid Authentication to "+ email +"!");
            return "login";
        }
    }

    @GetMapping(value = "/logout")
    public String logout(HttpSession session, SessionStatus status) {
        status.setComplete();

        session.removeAttribute("user");

        return "redirect:/";
    }
}
