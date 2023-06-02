import java.math.BigDecimal;

public class App {
    public static void main(String[] args) throws Exception {

        var frete = Frete.builder().nomeCliente("Joao").valorProduto(new BigDecimal(100)).build();
        System.out.println(frete);
        System.out.println(service.calValor(frete));
    }
}