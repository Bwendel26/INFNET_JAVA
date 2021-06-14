package Entities;

import exceptions.TipoDeEntradaException;

import java.lang.reflect.Type;

public abstract class Pessoa {
    private String nome;
    private Integer idade;

    public Pessoa() {}
    public Pessoa(String nome, int idade) throws TipoDeEntradaException {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws TipoDeEntradaException{

        if ("String".equals(nome.getClass().getSimpleName())) {
            this.nome = nome;
        } else {
            throw new TipoDeEntradaException("Nome deveria ser uma String!");
        }
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Meu nome é: " + this.nome + " e tenho " + this.idade + " anos.";
    }
}