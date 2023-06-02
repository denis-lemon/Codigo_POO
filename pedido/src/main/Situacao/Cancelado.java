public class Cancelado extends Situacao{
    @Override
    public Setor abrirChamado(){
        return new Setor("Comercial");
    }
    @Override
    public Setor reabrir(Pedido pedido){
        pedido.setSituacao(new Aberto());
    }
}