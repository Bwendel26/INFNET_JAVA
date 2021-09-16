package main.java.br.edu.infnet.appLoja.model.tests;

import main.java.br.edu.infnet.appLoja.model.domain.Pedido;
import main.java.br.edu.infnet.appLoja.model.domain.Solicitante;

public class PedidoTeste {
    public static void main(String[] args) {

        Solicitante solicitante2 = new Solicitante("Bruno", "bwendel26999@gmail.com");

        Pedido p2 = new Pedido();
        p2.setDescricao("Outro pedido");
        p2.setSolicitante(solicitante2);
        System.out.println("Pedido 1: " + p2);

        Pedido p1 = new Pedido("Pedido Bruno");
        p1.setSolicitante(solicitante2);
        System.out.println("Pedido 2: " + p1);
    }
}