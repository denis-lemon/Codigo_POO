package br.senac.sp;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import br.senac.sp.model.Pedido;
import br.senac.sp.model.Situacao;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void semDesc(){
        Pedido pedido = new Pedido(5, Situacao.ABERTO);
        double desconto = pedido.desconto();
        assertTrue(desconto == 0);
    }
    @Test
    public void retornar5Porcento(){
        Pedido pedido = new Pedido(802, Situacao.ABERTO);
        double desconto = pedido.desconto();
        assertTrue(desconto == 0.05);
    }
    @Test
    public void retornar15Porcento(){
        Pedido pedido = new Pedido(402, Situacao.pago);
        double desconto = pedido.desconto();
        assertTrue(desconto == 0.15);
    }
    @Test
    public void retornar25Porcento(){
        Pedido pedido = new Pedido(101, Situacao.pago);
        double desconto = pedido.desconto();
        assertTrue(desconto == 0.25);
    }
    
    @Test
    public void abrirChamadLogistica(){
        Pedido pedido = new Pedido(101, Situacao.reabrir);
        Setor setor = abrir.abrirChamado();
        assertTrue(setor.getNome().equals("Comercial"));
    }
    @Test
    public void abrirChamadPosVend(){
        Pedido pedido = new Pedido(101, Situacao.entrega);
        Setor setor = abrir.abrirChamado();
        assertTrue(setor.getNome().equals("Financeiro"));
    }
}