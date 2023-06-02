import br.senac.sp.model.Situacao;


public class Pago  extends Situacao{
    @Override
    public Setor abrirChamado(){
        return new Setor("Logística");
    } 
}
