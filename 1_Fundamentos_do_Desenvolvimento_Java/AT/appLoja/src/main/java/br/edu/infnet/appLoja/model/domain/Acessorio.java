package br.edu.infnet.appLoja.model.domain;

public class Acessorio extends Produto{



    public Acessorio(String marca, String categoria, String descricao, float valor) {
        super(marca, categoria, descricao, valor);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(";");
        sb.append(this.calcularValorBruto());

        return sb.toString();
    }

    @Override
    public float calcularValorBruto() {
        return 0;
    }

}
