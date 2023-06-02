import br.senac.sp.model.Situacao;


public class Entregue extends Situacao{
    @Override
    public Setor abrirChamado(){
        return new Setor("");
    }
}