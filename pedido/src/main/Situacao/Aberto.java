import br.senac.sp.model.Pedido;
import br.senac.sp.model.Situacao;

public class Aberto extends Situacao{
    @Override
    public Setor abrirChamado(){
        return new Setor("Financeiro");
    }
    @Override
    public Setor cancelar (Pedido pedido){
        pedido.setSituacao(new Cancelado());
    }
    @Override
    public Setor pago(Pedido pedido){
        pedido.setSituacao(new Entregue());
    }
    
}