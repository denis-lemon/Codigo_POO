import java.math.BigDecimal;

public class RegraFreteCurto extends RegraFrete{

    @Override
    public BigDecimal cal(Frete frete) {
        if (frete.getDistancia() < 100) 
            return frete.getValorProduto().multiply(new BigDecimal(0.1));
        return proximo.cal(frete);
    }
    
}
