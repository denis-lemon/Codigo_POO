import java.math.BigDecimal;

public abstract class  RegraFrete {
    protected RegraFrete proximo;
    public abstract BigDecimal cal(Frete frete);
    public RegraFrete depois(RegraFrete regra){
        this.proximo = proximo;
        return this;
    }
}