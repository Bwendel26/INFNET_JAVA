import java.util.Locale;
import java.util.Scanner;

public class Main {

    private static final int QTDE = 100;

    static String[] nomes = new String[QTDE];
    static float[] av1s = new float[QTDE];
    static float[] av2s = new float[QTDE];
    static String menu = "\n[1] Registrar as notas de um novo aluno." +
            "\n[2] Consultar boletim de um aluno." +
            "\n[3] Consultar notas da turma." +
            "\n[4] Sair.\n" +
            "\nEscolha uma opção: ";


    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        String entrada = null;

        int contador = 0;
        do {
            System.out.print(menu);
            entrada = scan.nextLine();

            switch (String.valueOf(entrada)) {
                case "1":
                    System.out.print("Nome do aluno: ");
                    nomes[contador] = scan.nextLine();
                    System.out.print("Nota da AV1 do aluno: ");
                    av1s[contador] = scan.nextFloat();
                    System.out.print("Nota da AV2 do aluno: ");
                    av2s[contador] = scan.nextFloat();
                    System.out.println("Notas e aluno Registrados!\n");
                    contador++;
                    break;

                case "2":
                    System.out.print("\nEntre com o nome a ser pesquisado: ");
                    String nomePesquisado = scan.nextLine();
                    String boletim = "";
                    for (int index = 0; index < nomes.length; index++) {
                        if (nomes[index] != null) { //evitando nullpointer exception
                            if (nomes[index].equalsIgnoreCase(nomePesquisado)) {
                                boletim = "Aluno: " + nomes[index] + "\nAV1: " + av1s[index] +
                                        "\nAV2: " + av2s[index] + "\nMédia: " + ((av1s[index] + av2s[index]) / 2);
                            }
                        }
                    }
                    System.out.println(boletim);
                    break;

                case "3":
                    boletimTurma();
                    break;


                case "4":
                    System.out.println("Finalizou!!!");
                    break;

                default:
                    System.out.println("Entrada inválida!!!");
                    break;
            }

        } while (!entrada.equals("4"));

        scan.close();
    }

    private static void boletimTurma() {
        for (int index = 0; index < nomes.length; index++) {
            if (nomes[index] != null) {
                float media = av1s[index] + av2s[index] / 2;
                System.out.printf("\nAluno: %s\n AV1: %.2f\n AV2: %.2f\n Media: %.2f\n", nomes[index], av1s[index], av2s[index], media);
            }
        }
        System.out.println("");
    }

}