import java.util.Calendar;

public class Primeiro {
    //wrapper:
    //char -> String
    //int -> Integer
    //float -> Float
    //boolean -> Boolean
    public static void main(String[] args) {

        if(args.length == 5) {

            String nome = args[0];
            String sobrenome = args[1];
            int idade = Integer.valueOf(args[2]);
            int anoNascimento = Calendar.getInstance().get(Calendar.YEAR) - idade;
            float salario = Float.valueOf(args[3]);
            // boolean ehJava = false;
            // if("S".equalsIgnoreCase(args[4])) {
            //     ehJava = true;
            // }
            boolean ehJava = "S".equalsIgnoreCase(args[4]) ? true : false; // operador ternário.
            int qtdMesesTrabalho = Integer.valueOf(args[5]);
            float salarioTotal = salario * qtdMesesTrabalho;

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