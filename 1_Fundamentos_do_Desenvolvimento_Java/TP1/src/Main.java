import Entities.Aluno;
import exceptions.TipoDeEntradaException;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    private static final int QTDE = 100;

    static Aluno[] alunos = new Aluno[QTDE];
    static int qtdNotas = 2;

    static StringBuilder menu = new StringBuilder();

    public static void main(String[] args) throws TipoDeEntradaException {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        //Menu
        menu.append("\n[1] Registrar as notas de um novo aluno.");
        menu.append("\n[2] Consultar boletim de um aluno.");
        menu.append("\n[3] Consultar notas da turma.");
        menu.append("\n[4] Sair.\n");
        menu.append("\nEscolha uma opção: ");

        String entrada = null;

        int contador = 0; // controle de fluxo

        do {
            System.out.print(menu.toString());
            entrada = scan.nextLine();

            switch (String.valueOf(entrada)) {
                case "1":
                    String nome;
                    Integer idade;
                    Aluno alunoAtual = new Aluno();

                    while(qtdNotas == 0) {
                        System.out.print("Quantas avaliações a turma teve? ");
                        try {
                            qtdNotas = scan.nextInt(); //tratar entrada de string
                        } catch (InputMismatchException ex) {
                            ex.printStackTrace();

                            System.out.print("Entrada inválida!!!\nDigite novamente: ");
                            qtdNotas = scan.nextInt();
                        }
                    }

                    alunoAtual = new Aluno();
                    alunoAtual.setQtdNotas(qtdNotas);

                    System.out.print("Nome do aluno: ");
                    nome = scan.next();
                    try { //Tratando entrada do nome
                        alunoAtual.setNome(nome);
                    } catch (TipoDeEntradaException ex) {
                        ex.printStackTrace();
                        while (nome.getClass().getSimpleName() != "String") {
                            System.out.print("Nome do aluno: ");
                            nome = scan.next();
                        }
                    }

                    System.out.print("Idade do aluno: ");
                    idade = scan.nextInt();
                    try {
                        alunoAtual.setIdade(idade);
                    } catch (InputMismatchException ex) {
                        ex.printStackTrace();
                        System.out.print("Idade do aluno: ");
                        idade = scan.nextInt();
                    }

                    for(int i = 0; i < qtdNotas; i ++) {
                        float nota;
                        System.out.printf("Nota da AV%d do aluno: ", i + 1);
                        nota = scan.nextFloat();
                        alunoAtual.setNota(nota, i);
                    }
                    alunos[contador] = alunoAtual;
                    System.out.println("Aluno Registrado!\n");
                    contador++;
                    break;

                case "2":
                    System.out.print("\nEntre com o nome a ser pesquisado: ");
                    String nomePesquisado = scan.nextLine();
                    float total = 0;
                    for (int index = 0; index < alunos.length; index++) {
                        if (alunos[index] != null) { //evitando nullpointer exception
                            if (alunos[index].getNome().equalsIgnoreCase(nomePesquisado)) {
                                System.out.println("Aluno: " + alunos[index].getNome());
                                for(int indexNota = 0; indexNota < qtdNotas; indexNota++) {
                                    float nota = alunos[index].getNotas(indexNota);
                                    System.out.println("AV" + (indexNota+1) + ": " + nota );
                                    total += nota;
                                }
                            }
                        }
                    }
                    float mediaAluno = total / qtdNotas;
                    System.out.println("Media do aluno: " + mediaAluno);
                    break;

                case "3":
                    boletimTurma();
                    break;


                case "4":
                    System.out.println("Finalizou!!!");
                    break;
            }

        } while (!"4".equalsIgnoreCase(entrada));

        scan.close();
    }

    private static void boletimTurma() {

        float mediaGeral;
        float somaMedias = 0;
        int contador = 0;

        for (int index = 0; index < alunos.length; index++) {

            Aluno alunoAtual = alunos[index];

            if (alunoAtual != null) {
                contador += 1;
                float total = 0;

                System.out.println("Aluno: " + alunoAtual.getNome());

                for(int index2 = 0; index2 < qtdNotas; index2++) {
                    float nota = alunoAtual.getNotas(index2);
                    System.out.println("AV" + (index2+1) + ": " + nota );
                    total += nota;
                }
                float media = total / qtdNotas;
                somaMedias += media;
            }
        }
        mediaGeral = somaMedias / contador;
        System.out.println("Média Geral da turma: " + mediaGeral);
    }

}