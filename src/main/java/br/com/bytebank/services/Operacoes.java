package br.com.bytebank.services;

import java.util.ArrayList;

public interface Operacoes {
    
    public void sacar(double valor);
    public void depositar(double valor);
    public ArrayList<Operacao> extrato();
    
}
