import java.math.BigDecimal;

public class Produtos extends Object{

    private String nome;
    private BigDecimal preco;
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public Produtos(String nome, BigDecimal preco) {
        this.nome = nome;
        this.preco = preco;
    }
    @Override
    public String toString (){
        return nome + " " + preco; 
    }    
}