package br.edu.infnet.appLogin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @GetMapping({"/", "/login"})
    public String Login() {
        return "index";
    }
}
