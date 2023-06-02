import java.math.BigDecimal;

public class Livro extends Produtos{

    private String autor;

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public Livro(String nome, BigDecimal preco) {
        super(nome, preco);
    }
    @Override
    public String toString() {
        return super.toString() + " " + autor;
    }
}