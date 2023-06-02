import java.math.BigDecimal;

public abstract class Funcionario {

    protected String name;
    protected int codigo;
    protected BigDecimal salario;

    public Funcionario(String name, int codigo, BigDecimal salario) {
        this.name = name;
        this.codigo = codigo;
        this.salario = salario;
    }

    public abstract BigDecimal calculaSalario();

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public BigDecimal getSalario() {
        return salario;
    }
    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }
}