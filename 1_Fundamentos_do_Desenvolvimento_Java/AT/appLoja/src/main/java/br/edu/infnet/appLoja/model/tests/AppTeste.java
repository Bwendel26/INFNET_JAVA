package br.edu.infnet.appLoja.model.tests;

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

                while (linha != null) {
                    String[] campos = linha.split(";");

                    if(campos.length == 3) {
                        System.out.println("Pedido/Solicitante");
                    } else {
                        switch (campos[0].toUpperCase()) {
                            case "C":
                                System.out.println("Pc");
                                break;
                            case "H":
                                System.out.println("Hardware");
                                break;
                            case "A":
                                System.out.println("Acessório");
                                break;
                            default:
                                System.out.println("Entrada inválida!!!");
                                break;
                        }
                    }

                    linha = leitura.readLine();
                }
                file.close();
                leitura.close();
                escrita.close();
                fileW.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } finally {
            System.out.println("Processamento finalizado!");
        }
    }
}
