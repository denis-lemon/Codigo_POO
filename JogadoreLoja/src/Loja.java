public class Loja {
    public String produtos;
    public Double preco;
    public String nome;

    public Loja(){
        
    }

    public Loja(String produtos) {
        this.produtos = produtos;
    }
    
    public String getNome() {
        return nome;
    }
    
    public Double getPreco() {
        return preco;
    }
}
