package br.edu.infnet.appLoja.model.domain;

public class Acessorio extends Produto{

    public Acessorio(String nome, String marca, String categoria, String descricao, float valor, int qtd) {
        super(nome, marca, categoria, descricao, valor, qtd);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());

        return sb.toString();
    }

    @Override
    public float calcularValorBruto() {
        return getValor() * getQuantidate();
    }

}
