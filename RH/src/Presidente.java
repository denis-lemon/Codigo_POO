import java.math.BigDecimal;

public final class Presidente extends Funcionario implements Autenticavel {
 
    protected BigDecimal valorcotaAcoces;

    
    public Presidente(String name, int codigo, BigDecimal salario, BigDecimal valorcotaAcoces, Departamento producao) {
        super(name, codigo, salario);
        this.valorcotaAcoces = valorcotaAcoces;
    }
    @Override
    public BigDecimal calculaSalario() {
        return this.salario.add(valorcotaAcoces);
    }
    @Override
    public void autenticar(){
        System.out.println("Presidente Logado");
    }
}