package br.com.bytebank.services;

import br.com.bytebank.domain.Conta;

public class Transacao {

    private Conta conta;
    private Autenticador autenticador;

    public Transacao(Conta conta, Autenticador autenticador) {
        this.conta = conta;
    }

    public void sacar(double valor) {
        if (this.autenticador.validaConta(this.conta)) {
            this.conta.setSaldo(this.conta.getSaldo() + valor);
        }
    }

    public void depositar(double valor) {
        this.conta.setSaldo(this.conta.getSaldo() - valor);
    }

}
