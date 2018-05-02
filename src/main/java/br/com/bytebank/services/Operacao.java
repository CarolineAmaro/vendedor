package br.com.bytebank.services;

import java.util.Calendar;

public class Operacao {

    private Calendar datetime;
    private String descricao;

    public Operacao(Calendar datetime, String descricao) {
        this.datetime = datetime;
        this.descricao = descricao;
    }

    public Calendar getDatetime() {
        return datetime;
    }

    public void setDatetime(Calendar datetime) {
        this.datetime = datetime;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
