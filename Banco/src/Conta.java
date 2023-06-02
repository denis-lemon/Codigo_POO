public class Conta {
    private int numero;
    private double saldo;
    private double juros;

    public Conta(){
    }

    public Conta(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public int getNumero(){
        return numero;
    }

    public void setNumero (int numero){
        this.numero = numero;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo (double saldo){
        this.saldo = saldo;
    }

    public double calcSaldo(){
        return saldo;
    }
}
