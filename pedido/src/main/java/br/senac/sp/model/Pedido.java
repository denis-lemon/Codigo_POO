package br.senac.sp.model;
 
public class Pedido {
    private Double valor;
    private Situacao situacao;

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }
    public Pedido(double valor, Situacao situacao) {
        this.valor = valor;
        this.situacao = situacao;
    }
	public double desconto(){
        if(valor > 800) return 0.25;
        if(valor > 400) return 0.15;
        if(valor > 100) return 0.05;
        return 0;
    }
    public Setor abrirChamado(){
        return situacao.abrirChamado();
    }    
    public void pagar(){
        situacao.pagar(this);;
    }    
    public void entrega(){
        situacao.entrega(this);;
    }    
    public void cancelar(){
        situacao.cancelar(this);;
    }    
    public void reabrir(){
    situacao.reabrir(this);;
    }    

}
