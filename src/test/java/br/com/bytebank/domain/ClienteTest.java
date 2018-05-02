package br.com.bytebank.domain;

import org.junit.Test;
import static org.junit.Assert.*;


public class ClienteTest {
   
    @Test
    public void testCriandoCliente(){
        Cliente cliente = new Cliente("Fabricio Oliveira", "417.481.378-75");
        
        assertEquals("Fabricio Oliveira", cliente.getNome());
        assertEquals("417.481.378-75", cliente.getCpf());

    }
}
