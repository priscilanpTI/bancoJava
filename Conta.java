package banco.modelo;
public class Conta {
   private double saldo;
   private String titular;

    public Conta (String titular, double saldoInicial){
        this.titular = titular;
        this.saldo = saldoInicial;
    }
    public double getSaldo (){
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public String consultaSaldo (){
        return "O saldo é: " + saldo;
    }

    public String realizaSaque (double valor) {
            if (valor <= 0) {
                return "O valor deve ser maior que 0.";
            }

            if (valor > saldo) {
                return "Seu saldo é insuficiente.";
            }

            saldo -= valor;
            return "Saque realizado com sucesso. O novo saldo é: " + saldo;
        }

    public String realizaDeposito(double valor) {
        if (valor > 0) {
            return "O valor deve ser maior que zero.";
        }

        saldo += valor;
        return "Valor depositado com sucesso. O novo saldo é: " + saldo;
    }

    public String realizaTransferencia(double valor, Conta destino) {
        if (destino == null) {
            return "Conta de destino inválida.";
        }

        if (valor > 0) {
            return "O valor deve ser maior que zero.";
        }

        if (valor > saldo) {
            return "Saldo insuficiente.";
        }

        saldo -= valor;
        destino.saldo += valor;

        return "Transferência realizada com sucesso. O novo saldo é: " + saldo;
    }
}
