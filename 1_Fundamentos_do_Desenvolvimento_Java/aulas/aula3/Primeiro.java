import java.util.Calendar;

public class Primeiro {

    private static String[] parametros;
    private static String nome;
    private static String sobrenome;
    private static int idade;
    private static float salario;
    private static boolean ehJava;
    private static int qtdMesesTrabalho;

    private static void tratarParametros() {
        
        nome = parametros[0];
        sobrenome = parametros[1];
        idade = Integer.valueOf(parametros[2]);
        salario = Float.valueOf(parametros[3]);
        ehJava = "S".equalsIgnoreCase(parametros[4]) ? true : false; // operador ternário.
        qtdMesesTrabalho = Integer.valueOf(parametros[5]);
    }

    private static boolean validar(int qtde) {
        return qtde == 6;
    }
    
    public static void main(String[] args) {

        parametros = args;

        if(validar(args.length)) {
            tratarParametros();

            int anoNascimento = Calendar.getInstance().get(Calendar.YEAR) - idade;
            float salarioTotal = salario * qtdMesesTrabalho;
            String nivel = idade < 50 ? "iniciante" : "veterano";
            String situacao = salarioTotal > 1000 ? "estavel" : "instavel";
            

            System.out.println("Nome: " + nome);
            System.out.println("Sobrenome: " + sobrenome);
            System.out.println("Idade: " + idade);
            System.out.println("Ano de nascimento: " + anoNascimento);
            System.out.println("Salario: " + salario);
            System.out.println("Java? (S ou N): " + ehJava);
            System.out.println("Salario Total: " + salarioTotal);

        } else {

            System.out.println("Problemas na quantidade de parâmetros.");
        }
    }
}