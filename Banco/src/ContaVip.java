public class ContaVip extends Conta {
    private double limite;
    protected double saldo;

    public ContaVip(int numero, double saldo, double limite){
        super(numero, saldo);
        this.limite = limite;
    }

    public double getLimite(){
        return limite;
    }

    public double calcSaldo(){
        return saldo + limite;
    }
}
