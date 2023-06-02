import java.math.BigDecimal;

public class FreteService {
    public RegraFrete calValor(Frete frete){
        // até 100 km, frete irá 10% do valor
        // até 500 km, frete irá 20% do valor
        // mais 500 km, frete irá 50% do valor
        return new RegraFreteCurto()
            .depois(new RegraFreteMdeio())
            .depois(new RegraFreteLongo())
            .cal(frete);

        BigDecimal custo = BigDecimal.ZERO;   
    }
}
