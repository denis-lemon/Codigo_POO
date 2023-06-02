import java.math.BigDecimal;

public class FolhaDePagamento {
    private BigDecimal totalFolhaDePagamento = BigDecimal.ZERO;

    public BigDecimal getTotalFolhaDePagamento() {
        return totalFolhaDePagamento;
    }

    public void registrar(Funcionario funcionario){
        totalFolhaDePagamento = totalFolhaDePagamento.add(funcionario.calculaSalario());
    }
    public void login(Autenticavel autenticavel){
        autenticavel.autenticar();
    }
}