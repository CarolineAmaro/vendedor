package br.com.bytebank.domain;

import br.com.bytebank.services.Autenticador;
import br.com.bytebank.services.Transacao;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class ContaTest {

    @Test
    public void testCriandoConta() {
        Cliente cliente = new Cliente("Fabricio Oliveira", "417.481.378.75");
        Conta conta = new Conta(cliente, 2322, 331213);

        assertEquals(cliente, conta.getCliente());
        assertEquals(2322, conta.getAgencia());
        assertEquals(331213, conta.getConta());
    }

    @Test
    public void testTransacaoDepositar() {
        Cliente cliente = new Cliente("Fabricio", "417.481.378.75");
        Conta conta = new Conta(cliente, 2322, 4323342);
        Autenticador autenticadorMock = mock(Autenticador.class);
        Transacao transacao = new Transacao(conta, autenticadorMock);

        transacao.depositar(100);

        assertEquals(100, conta.getSaldo(), 0.001);
    }

    @Test
    public void testTransacaoSacar() {
        Cliente cliente = new Cliente("Fabricio", "417.481.378.75");
        Conta conta = new Conta(cliente, 2322, 4323342);
        Autenticador autenticadorMock = mock(Autenticador.class);
        Transacao transacao = new Transacao(conta, autenticadorMock);

        when(autenticadorMock.validaConta(conta)).thenReturn(Boolean.TRUE);
        transacao.sacar(50);

        assertEquals(-50, conta.getSaldo(), 0.001);
    }
    
    
    @Test
    public void testTransacaoSaqueInvalido() {
        Cliente cliente = new Cliente("Fabricio", "417.481.378.75");
        Conta conta = new Conta(cliente, 2322, 4323342);
        Autenticador autenticadorMock = mock(Autenticador.class);
        Transacao transacao = new Transacao(conta, autenticadorMock);

        when(autenticadorMock.validaConta(conta)).thenReturn(Boolean.FALSE);
        transacao.sacar(50);

        assertEquals(0, conta.getSaldo(), 0.001);
    }
}
