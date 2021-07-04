package br.edu.infnet.appLoja.model.tests;

import br.edu.infnet.appLoja.model.domain.Computador;
import br.edu.infnet.appLoja.model.domain.PecaHardware;

public class ProdutoTeste {
    public static void main(String[] args) {

        Computador c1 = new Computador("XPS15", "Dell", "Notebook","Dell XPS i7", 10000, 1);
        System.out.println("PC: " + c1);

        PecaHardware h1 = new PecaHardware( "XPGPredator","XPG", "memorias","RAM 16Gb", 450, 2);
        System.out.println("Hardware: " + h1);
    }


    //AULA 23-06 min 1:10:27.
}