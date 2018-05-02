package br.com.bytebank.services;

import br.com.bytebank.domain.Conta;

public interface Autenticador {
    
    public boolean validaConta(Conta conta);
    
}
