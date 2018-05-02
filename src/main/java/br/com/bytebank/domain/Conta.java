package br.com.bytebank.domain;

public class Conta {

    private Cliente cliente;
    private int agencia;
    private int conta;
    private double saldo;

    public Conta(Cliente cliente, int agencia, int conta) {
        this.cliente = cliente;
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = 0;
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

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public boolean depositar(double valor){
        this.setSaldo(this.getSaldo() + valor);
        return true;
    }

    public boolean realizaSaque(double valor){
        this.setSaldo(this.getSaldo() - valor);
        
        return true;
    }
}
