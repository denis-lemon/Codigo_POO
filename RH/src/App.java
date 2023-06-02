import java.math.BigDecimal;

public class App {
    public static void main(String[] args) throws Exception {
        
        Engenheiro jonas = new Engenheiro("Pedro", 15, Departamento.PRODUCAO, 123456, null);

        Presidente joao = new Presidente("João", 23, new BigDecimal(3000), new BigDecimal(0.8), Departamento.PRODUCAO);
        
        Presidente ruan = new Presidente("Ruan", 56, new BigDecimal(3200), new BigDecimal(0.8), Departamento.COMERCIAL);

        Gerente maria = new Gerente("Maria", 489, new BigDecimal(1900), Departamento.COMERCIAL, new BigDecimal(5));

        var folhaDePagamento = new FolhaDePagamento();
        folhaDePagamento.registrar(joao);
        folhaDePagamento.registrar(ruan);
        folhaDePagamento.registrar(jonas);

        folhaDePagamento.login(joao);
        folhaDePagamento.login(new Auditor());
        folhaDePagamento.login(maria);

        System.out.println(folhaDePagamento.getTotalFolhaDePagamento());
    }
}