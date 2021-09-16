package main.java.br.edu.infnet.appLoja.model.domain;

import br.edu.infnet.appLoja.model.exceptions.QuantidadeZeradaException;
import br.edu.infnet.appLoja.model.exceptions.TipoNullException;

public abstract class Produto {

    private String nome;
    private String marca;
    public String categoria;
    private String descricao;
    private float valor;
    private int quantidate;

    public Produto(String nome, String marca, String categoria, String descricao, float valor, int quantidate) {
        this.nome = nome;
        this.marca = marca;
        this.categoria = categoria;
        this.descricao = descricao;
        this.valor = valor;
        this.quantidate = quantidate;
    }

    public void imprime() {
        System.out.println(this);
    }

    public String pegaProduto() throws TipoNullException {
        StringBuilder sb = new StringBuilder();
        sb.append(this.nome);
        sb.append(";");
        sb.append(this.marca);
        sb.append(";");
        sb.append(this.categoria);
        sb.append(";");
        sb.append(this.descricao);
        sb.append(";");
        sb.append(this.calcularValorBruto());
        sb.append(";");
        sb.append(this.quantidate);
        sb.append("\r\n");

        return sb.toString();
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(this.nome);
        sb.append(";");
        sb.append(this.marca);
        sb.append(";");
        sb.append(this.categoria);
        sb.append(";");
        sb.append(this.descricao);
        sb.append(";");
        sb.append(this.valor);

        return sb.toString();
    }

    public abstract float calcularValorBruto() throws TipoNullException;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidate() {
        return quantidate;
    }

    public void setQuantidate(int quantidate) {
        this.quantidate = quantidate;
    }

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
