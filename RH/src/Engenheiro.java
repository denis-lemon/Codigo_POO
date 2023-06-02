import java.math.BigDecimal;

public class Engenheiro extends Funcionario{
    
    protected Departamento departament;
    protected int crea;

    public Engenheiro(String name, int codigo, Departamento departament, int crea, BigDecimal salario) {
        super(name, codigo, salario);
        this.departament = departament;
        this.crea = crea;
    }
    public Departamento getDepartament() {
        return departament;
    }
    public void setDepartament(Departamento departament) {
        this.departament = departament;
    }
    public int getCrea() {
        return crea;
    }
    public void setCrea(int crea) {
        this.crea = crea;
    }
    @Override
    public BigDecimal calculaSalario() {
        return this.salario.multiply(new BigDecimal(0.50));
    }
}