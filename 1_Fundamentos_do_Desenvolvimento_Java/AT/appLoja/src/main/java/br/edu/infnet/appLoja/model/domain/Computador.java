package br.edu.infnet.appLoja.model.domain;

public class Computador extends Produto {

    private String tipo;

    public Computador(String marca, String categoria, String descricao, float valor) {
        super(marca, categoria, descricao, valor);
    }
    public Computador(String marca, String categoria, String tipo, String descricao, float valor) {
        super(marca, categoria, descricao, valor);
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(";");
        sb.append(this.getTipo());
        sb.append(";");
        sb.append(this.calcularValorBruto());
        return sb.toString();
    }

    @Override
    public float calcularValorBruto() {
        return 1500;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}