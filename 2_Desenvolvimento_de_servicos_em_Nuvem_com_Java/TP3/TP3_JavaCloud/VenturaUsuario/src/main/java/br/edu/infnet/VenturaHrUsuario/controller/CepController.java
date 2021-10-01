package br.edu.infnet.VenturaHrUsuario.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Controller
public class CepController {

    @PostMapping("/cep")
    public String pegaCep(Model model, HttpRequest request, HttpResponse response) {

//        String cep = request.uri("http://localhost:8080/cep");

        return "";
    }

}
