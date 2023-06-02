public class ContaCorrente extends Conta{
    private double tarifa;

    public ContaCorrente(int numero, double saldo, double tarifa){
        super(numero, saldo);
    }

    public double getTarifa(){
        return tarifa;
    }
}