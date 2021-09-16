package main.java.br.edu.infnet.appLoja.model.tests;

import main.java.br.edu.infnet.appLoja.model.domain.Solicitante;

public class SolicitanteTeste {

    public static void main(String[] args) {

        Solicitante s1 = new Solicitante("Bruno", "bwendel26999@gmail.com");
        System.out.println("Solicitante: " + s1);
    }
}
