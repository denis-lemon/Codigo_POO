import java.math.BigDecimal;

public class LojaVirtual {
    public static void main(String[] args) throws Exception {
        
        var produto1 = new Produtos("Iphone", new BigDecimal(1000));
        var livro = new Livro("Eltin", new BigDecimal(150));
        var eletronico = new Eletronico("TV", new BigDecimal(1400), "PHILIPS", "A32");        
        System.out.println(produto1.toString());
    }
}