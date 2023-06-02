import java.math.BigDecimal;

public class RegraFreteLongo extends RegraFrete{

    @Override
    public BigDecimal cal(Frete frete) {
        return frete.getValorProduto().multiply(new BigDecimal(0.5));
    }

}
