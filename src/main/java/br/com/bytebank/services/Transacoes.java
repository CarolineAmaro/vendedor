package br.com.bytebank.services;

import br.com.bytebank.domain.Conta;
import java.util.ArrayList;

public class Transacoes implements Operacoes{
    
    private Conta conta;
    
    public Transacoes(Conta conta){
        this.conta = conta;
    }

    @Override
    public void sacar(double valor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void depositar(double valor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Operacao> extrato() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
