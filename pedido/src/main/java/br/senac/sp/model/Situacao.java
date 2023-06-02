package br.senac.sp.model;

public abstract class Situacao {
    public abstract Setor abrirChamado();
    public void pagar(Pedido pedido){
        throw new RuntimeException("Não pode mudar para situação pago");
    }
    public void entrega(Pedido pedido){
        throw new RuntimeException("Não pode mudar para situação entrega");
    }
    public void cancelar(Pedido pedido){
        throw new RuntimeException("Não pode mudar para situação cancelar");
    }
    public void reabrir(Pedido pedido){
        throw new RuntimeException("Não pode mudar para situação reabrir");
    }
}
