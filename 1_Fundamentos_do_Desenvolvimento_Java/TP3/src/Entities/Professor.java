package Entities;

import exceptions.TipoDeEntradaException;

public class Professor extends Pessoa{

    private String materia;

    public Professor(String nome, int idade) throws TipoDeEntradaException {
        super(nome, idade);
    }

    public Professor(String nome, int idade, String materia) throws TipoDeEntradaException {
        super(nome, idade);
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    @Override
    public String toString() {
        return "Sou o professor: " + getNome() + " tenho " + getIdade() + " anos e dou aula de " + this.materia;
    }
}