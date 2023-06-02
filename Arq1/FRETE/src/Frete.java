import java.math.BigDecimal;

public class Frete { //model beans POJO

    private String nomeCliente;
    private BigDecimal valorProduto;
    private Double peso;
    private int distancia;
    public String getNomeCliente() {
        return nomeCliente;
    }
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    public BigDecimal getValorProduto() {
        return valorProduto;
    }
    public void setValorProduto(BigDecimal valorProduto) {
        this.valorProduto = valorProduto;
    }
    public Double getPeso() {
        return peso;
    }
    public void setPeso(Double peso) {
        this.peso = peso;
    }
    public int getDistancia() {
        return distancia;
    }
    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }
    public Frete(String nomeCliente, BigDecimal valorProduto, Double peso, int distancia) {
        this.nomeCliente = nomeCliente;
        this.valorProduto = valorProduto;
        this.peso = peso;
        this.distancia = distancia;
    }

    public static FreteBuilder builder(){
        return new FreteBuilder();
    }
    @Override
    public String toString() {
        return "Frete [nomeCliente=" + nomeCliente + ", valorProduto=" + valorProduto + ", peso=" + peso + ", distancia=" + distancia + "]";
    }
}