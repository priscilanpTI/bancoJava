package banco.modelo;

public class ContaCorente extends Conta {
    private double saldo;
    private String titular;

    public ContaCorente(String titular, double saldo) {
        super(titular, saldo);
        this.saldo = saldo;
        this.titular = titular;
    }

    @Override
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
}
