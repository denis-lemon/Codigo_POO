import java.math.BigDecimal;

public class FreteBuilder{
    private String nomeCliente;
    private BigDecimal valorProduto;
    private Double peso;
    private int distancia;

    public FreteBuilder nomeCliente(String nomeCliente){
        this.nomeCliente = nomeCliente;
        return this;
    }
    public FreteBuilder valorProduto(BigDecimal valorProduto){
        this.valorProduto = valorProduto;
        return this;
    }
    public FreteBuilder peso(Double peso){
        this.peso = peso;
        return this;
    }
    public FreteBuilder distancia(int distancia){
        this.distancia = distancia;
        return this;
    }
    public Frete build(){
        return new Frete(nomeCliente, valorProduto, peso, distancia);
    }   
}
