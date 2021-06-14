package Entities;

import exceptions.TipoDeEntradaException;

public class Aluno extends Pessoa {

//    private int matricula;
    private int qtdNotas = 2;
    private float notas[] = new float[qtdNotas];

    public Aluno() {}
    public Aluno(String nome, int idade) throws TipoDeEntradaException {
        super(nome, idade);
    }
    public Aluno (String nome, int idade, int qtdNotas) throws TipoDeEntradaException {
        super(nome, idade);
        this.qtdNotas = qtdNotas;
    }

    public int getQtdNotas() {
        return qtdNotas;
    }

    public void setQtdNotas(int qtdNotas) {
        this.qtdNotas = qtdNotas;
    }

    public float getNotas(int indexNota) {
        return notas[indexNota];
    }

    public void setNota(float nota, int pos) {
        this.notas[pos] = nota;
    }

    @Override
    public String toString() {
        String txt = "Meu nome é: " + getNome() + " e tenho " + getIdade() + " anos.";

        return txt;
    }
}