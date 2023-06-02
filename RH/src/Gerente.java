import java.math.BigDecimal;

public class Gerente extends Funcionario implements Autenticavel{
    
    protected Departamento departament;
    protected BigDecimal bonus;
    private String area;

    public Gerente(String name, int codigo, BigDecimal salario, Departamento departament, BigDecimal bonus) {
        super(name, codigo, salario);
        this.bonus = bonus;
    }
    public String getArea() {
        return area;
    }
    public void setArea(String area) {
        this.area = area;
    }
    public BigDecimal getBonus() {
        return bonus;
    }
    public void setBonus(BigDecimal bonus) {
        this.bonus = bonus;
    }
    @Override
    public BigDecimal calculaSalario() {
        return this.salario.multiply(bonus);
    }
    @Override
    public void autenticar() {
        System.out.println("Gerente Logado");
    }
}