package main.java.br.edu.infnet.appLoja.model.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Pedido {

    private int id; //resolver dps
    private String descricao;
    private LocalDateTime data;
    private Solicitante solicitante;//1:1

    public Pedido() {
        data = LocalDateTime.now();
    }

    public Pedido(String descricao) {
        this();
        this.descricao = descricao;
    }

    public Pedido(String descricao, Solicitante solicitante) {
        this();
        this.descricao = descricao;
        this.solicitante = solicitante;
    }

    public String pegaPedido() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.descricao);
        sb.append(";");
        sb.append(this.data);
        sb.append(";");
        sb.append(this.solicitante);
        sb.append("\r\n");

        return sb.toString();
    }

    @Override
    public String toString() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        return String.format("%s;%s;%s", this.descricao, this.data.format(formato), this.solicitante.toString());
    }

    public Solicitante getSolicitante() {
        return solicitante;
    }
    public void setSolicitante(Solicitante solicitante) {
        this.solicitante = solicitante;
    }
    public String getDescricao() {
        return descricao;
    }
    public int getId() {
        return id;
    }
    public LocalDateTime getData() {
        return data;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}