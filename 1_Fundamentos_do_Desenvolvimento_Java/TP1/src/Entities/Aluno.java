package Entities;

import java.util.List;

public class Aluno {
    String nome;
    Notas notas;
    private double media;
    private String situacao;

    public Aluno(String nome) {
        this.nome = nome;
        this.situacao = "Indeterminada";
    }

    public Aluno(String nome, Notas notas) {
        this.nome = nome;
        this.notas = notas;
        this.media = calcMedia();
        this.situacao = verificaSituacao();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Notas getNotas() {
        return notas;
    }

    public void setNotas(Notas notas) {
        this.notas = notas;
    }

    public double getMedia() {
        return media;
    }

    public String getSituacao() {
        return situacao;
    }

    //    FIX HERE
    public double calcMedia() {
        return 0.0;
    }
//    FIX HERE
    public String verificaSituacao() {
        return "";
    }
}
