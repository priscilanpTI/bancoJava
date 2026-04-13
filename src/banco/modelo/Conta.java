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

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void realizarSaque(double valor) {
        if (valor > 0) {
            if (valor <= saldo) {
                saldo -= valor;
                System.out.println("Saque realizado com sucesso. Novo saldo: " + saldo);
            } else {
                System.out.println("Saldo insuficiente.");
            }
        } else {
            System.out.println("Valor inválido.");
        }
    }

    public void realizarDeposito(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado. Novo saldo: " + saldo);
        } else {
            System.out.println("Valor inválido.");
        }
    }

    public void realizarTransferencia(double valor, int numeroBanco) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Transferência realizada para conta " + numeroBanco +
                    ". Novo saldo: " + saldo);
        } else {
            System.out.println("Erro na transferência.");
        }
    }

    public void consultarSaldo() {
        System.out.println("Saldo: " + saldo);
    }

    public void dadosConta() {
        System.out.println("Titular: " + titular + "\nSaldo: " + saldo);
    }
}