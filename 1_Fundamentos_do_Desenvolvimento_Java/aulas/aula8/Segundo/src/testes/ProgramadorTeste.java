package testes;

import entities.Funcionario;
import entities.Programador;
import entities.auxiliar.Constante;

public class ProgramadorTeste {

    public static void main(String[] args) {

        Funcionario prog1 = new Programador();

        System.out.println(prog1);

        Programador progJava = new Programador();
        progJava.setNome("Bruno Fernandes");
        progJava.setIdade(23);
        progJava.setSalario(Constante.SALARIO);
        progJava.setLinguagem("Java");
        progJava.setFullstack(true);

        System.out.println(progJava);
    }
}
