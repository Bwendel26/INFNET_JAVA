import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

//      Painel:
        System.out.printf(
                "[1] Registrar as notas de um novo aluno." +
                "\n[2] Consultar boletim de um aluno." +
                "\n[3] Consultar notas da turma." +
                "\n[4] Sair.\n");

        int escolha = entrada.nextInt();


    }
}
