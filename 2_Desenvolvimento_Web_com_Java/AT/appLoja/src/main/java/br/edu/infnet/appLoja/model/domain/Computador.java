package main.java.br.edu.infnet.appLoja.model.domain;

import br.edu.infnet.appLoja.model.exceptions.TipoNullException;

public class Computador extends Produto {

    private String tipo;

    public Computador(String nome, String marca, String categoria, String descricao, float valor, int qtd) {
        super(nome, marca, categoria, descricao, valor, qtd);
    }
    public Computador(String nome, String marca, String categoria, String tipo, String descricao, float valor, int qtd) {
        super(nome, marca, categoria, descricao, valor, qtd);
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(";");
        sb.append(this.getTipo());

        return sb.toString();
    }

    @Override
    public float calcularValorBruto() throws TipoNullException {
        if(this.tipo == null) {
            throw new TipoNullException("O tipo do computador não está preechido!");
        }

        return getValor() * getQuantidate();
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}