import java.math.BigDecimal;

public class RegraFreteMdeio extends RegraFrete{

    @Override
    public BigDecimal cal(Frete frete) {
        if (frete.getDistancia() < 500) 
            return frete.getValorProduto().multiply(new BigDecimal(0.2));
        return proximo.cal(frete);
    }

}
