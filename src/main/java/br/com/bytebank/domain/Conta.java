package br.com.bytebank.domain;


public class Conta {
    
    private Cliente cliente;
    private int agencia;
    private int conta;

    public Conta(Cliente cliente, int agencia, int conta) {
        this.cliente = cliente;
        this.agencia = agencia;
        this.conta = conta;
    }
    

    public int getAgencia() {
        return agencia;
    }

    public int getConta() {
        return conta;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
        
    
    
}
