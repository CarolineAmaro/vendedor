package br.com.bytebank.domain;

import org.junit.Test;
import static org.junit.Assert.*;


public class ContaTest {
    
    @Test
    public void testCriandoConta(){
        Cliente cliente = new Cliente("Fabricio Oliveira", "417.481.378.75");
        Conta conta = new Conta(cliente, 2322, 331213);
        
        assertEquals(cliente, conta.getCliente());
        assertEquals(2322, conta.getAgencia());
        assertEquals(331213, conta.getConta());
    }
    
    
    @Test
    public void testRealizandoDeposito(){
        Cliente cliente = new Cliente("Fabricio Oliveira", "417.481.378.75");
        Conta conta = new Conta(cliente, 2322, 331213);
        
        conta.depositar(1000.00);
        
        assertEquals(1000.00, conta.getSaldo(), 0.001);
    }
}
