package banco.modelo;

public abstract class Conta {
    private double saldo;
    private String titular;

    public Conta(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // SAQUE
    public void realizarSaque(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado. Novo saldo: " + saldo);
        } else {
            System.out.println("Erro no saque.");
        }
    }

    // DEPÓSITO
    public void realizarDeposito(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado. Novo saldo: " + saldo);
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    // TRANSFERÊNCIA
    public void realizarTransferencia(double valor, Conta destino) {
        if (valor > 0 && valor <= saldo) {
            this.saldo -= valor;
            destino.saldo += valor;
            System.out.println("Transferência realizada.");
        } else {
            System.out.println("Erro na transferência.");
        }
    }

    // CONSULTAR SALDO
    public void consultarSaldo() {
        System.out.println("Saldo: " + saldo);
    }

    public void dadosConta() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
    }
}