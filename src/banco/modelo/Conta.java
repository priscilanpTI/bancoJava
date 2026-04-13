package org.example;
public abstract class Conta {
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

    public String realizaSaque(double valor) {
        if (valor > 0) {
            if (valor<=saldo) {
                saldo -= valor;
                return "Saque realizado com sucesso. O novo saldo é: " + saldo;
            } else {
                return "Seu saldo é insuficiente.";
            }}
        else {
            return "O valor não pode ser negativo.";
        }
    }

    public String realizaDeposito(double valor) {
        if (valor > 0) {
            saldo += valor;
            return "Valor depositado com sucesso. O novo saldo é: " + saldo;
        } else {
            return "O valor não pode ser negativo.";
        }
    }

    public String realizaTransferencia(double valor) {
        if (valor > 0) {
            if (valor <=saldo){
                saldo -= valor;
                return "Valor transferido com sucesso. O novo saldo é: " + saldo;
            } else {
                return "Saldo insuficiente.";
            }
        }
        else {
            return "O valor não pode ser negativo.";
        }

    }
}
