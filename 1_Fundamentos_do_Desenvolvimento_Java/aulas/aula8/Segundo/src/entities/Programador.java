package entities;

import entities.auxiliar.Constante;

public class Programador extends Funcionario{

    private String nome;
    private boolean fullstack = false;
    private String linguagem = "Nenhuma";

    public Programador() {
        this.nome = "Programador Fantasma";
    }

    public Programador(String nome) {
        super(nome);
    }

    public Programador(String nome, int idade, float salario) {
        super(nome, idade, salario);
    }

    public Programador(String nome, int idade, float salario, boolean fullstack, String linguagem) {
        super(nome, idade, salario);
        this.fullstack = fullstack;
        this.linguagem = linguagem;
    }

    private float calcularSalarioFullstack() {
        return fullstack ? 1500 : 500;
    }

    private float calcularSalarioLinguagem() {
        return "java".equalsIgnoreCase(linguagem) ? Constante.SALARIOPJAVA : 1000; //Sempre colocar dessa forma para evitar NullPointerException
    }

    private float calcularSalario() {

        return getSalario() + calcularSalarioFullstack() + calcularSalarioLinguagem();
    }

    private String getSituacao() {
        if(getSalario() >= 10000) {
            return "rico";
        } else if(getSalario() < 2500) {
            return "pobre";
        } else {
            return "classe média";
        }
    }



    public boolean isFullstack() {
        return fullstack;
    }

    public void setFullstack(boolean fullstack) {
        this.fullstack = fullstack;
    }

    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }

    @Override
    public String toString() {
        return "O programador: " + this.nome + ", desenvolve em: " + this.linguagem + ", e recebe: R$: "
                + calcularSalario() + " || " + "(" + getSituacao() + ").";
    }
}
