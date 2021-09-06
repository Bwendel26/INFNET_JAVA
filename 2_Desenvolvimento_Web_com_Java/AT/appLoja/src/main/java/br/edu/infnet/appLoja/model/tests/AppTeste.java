package br.edu.infnet.appLoja.model.tests;

import br.edu.infnet.appLoja.model.domain.Solicitante;
import br.edu.infnet.appLoja.model.domain.Acessorio;
import br.edu.infnet.appLoja.model.domain.Computador;
import br.edu.infnet.appLoja.model.domain.PecaHardware;
import br.edu.infnet.appLoja.model.domain.Pedido;
import br.edu.infnet.appLoja.model.domain.Produto;

import br.edu.infnet.appLoja.model.exceptions.TipoNullException;

import java.io.*;

public class AppTeste {
    public static void main(String[] args) {
        try {
            String dir = "/home/bwendel26/dev/infnet/java/INFNET_JAVA/1_Fundamentos_do_Desenvolvimento_Java/AT/appLoja/src/main/";
            String arq = "pedidos.txt";

            try {
                FileWriter fileW = new FileWriter(dir+"out_"+arq);
                BufferedWriter escrita = new BufferedWriter(fileW);

                FileReader file = new FileReader(dir+arq);
                BufferedReader leitura = new BufferedReader(file);

                String linha = leitura.readLine();

                float total = 0;
                while (linha != null) {
                    String[] campos = linha.split(";");

                    if(campos.length == 3) {
                        System.out.println("Pedido/Solicitante");
                    } else {
                        switch (campos[0].toUpperCase()) {
                            case "0":
                                Solicitante solicitante1 = new Solicitante(campos[2], campos[3]);
                                Pedido p1 = new Pedido(campos[1], solicitante1);
                                escrita.write(p1.pegaPedido());
                                break;
                            case "C":
                                Computador c1 = new Computador(campos[1], campos[2], campos[3], campos[4], campos[5], Float.valueOf(campos[6]), Integer.valueOf(campos[7]));
                                escrita.write(c1.pegaProduto());
                                total += Float.valueOf(campos[6]);
                                break;
                            case "H":
                                PecaHardware h1 = new PecaHardware(campos[1], campos[2], campos[3], campos[4], Float.valueOf(campos[5]), Integer.valueOf(campos[6]));
                                escrita.write(h1.pegaProduto());
                                total += Float.valueOf(campos[5]);
                                break;
                            case "A":
                                Acessorio a1 = new Acessorio(campos[1], campos[2], campos[3], campos[4], Float.valueOf(campos[5]), Integer.valueOf(campos[6]));
                                escrita.write(a1.pegaProduto());
                                total += Float.valueOf(campos[5]);
                                break;
                            default:
                                System.out.println("Entrada inválida!!!");
                                break;
                        }
                    }
                    escrita.write("Total: " + total);
                    linha = leitura.readLine();
                }
                file.close();
                leitura.close();
                escrita.close();
                fileW.close();
            } catch (TipoNullException | IOException e) {
                System.out.println(e.getMessage());
            }
        } finally {
            System.out.println("Processamento finalizado!");
        }
    }
}