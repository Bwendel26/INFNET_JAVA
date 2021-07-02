package br.edu.infnet.appLoja.model.tests;

import br.edu.infnet.appLoja.model.domain.Pedido;

public class PedidoTeste {
    public static void main(String[] args) {

        Pedido p1 = new Pedido("Pedido Bruno");
        System.out.println("Pedido: " + p1);
    }
}
