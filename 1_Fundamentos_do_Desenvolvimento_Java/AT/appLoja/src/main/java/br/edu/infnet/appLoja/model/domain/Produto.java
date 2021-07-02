package br.edu.infnet.appLoja.model.domain;

public abstract class Produto {

    private String marca;
    public String categoria;
    private String descricao;
    private float valor;

    public Produto(String marca, String categoria, String descricao, float valor) {
        this.marca = marca;
        this.categoria = categoria;
        this.descricao = descricao;
        this.valor = valor;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(this.marca);
        sb.append(";");
        sb.append(this.categoria);
        sb.append(";");
        sb.append(this.descricao);
        sb.append(";");
        sb.append(this.valor);

        return sb.toString();
    }

    public abstract float calcularValorBruto();

    public String getMarca() {
        return marca;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public float getValor() {
        return valor;
    }
}
