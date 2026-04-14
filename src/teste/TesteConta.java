package teste;

import banco.modelo.Conta;
import banco.modelo.ContaCorrente;
import banco.modelo.ContaPoupanca;

public class TesteConta {
    public static void main(String[] args) {

        Conta contaCorrente = new ContaCorrente("Priscila", 1000);
        Conta contaPoupanca = new ContaPoupanca("Maria", 500);

        System.out.println("=== Conta Corrente ===");
        contaCorrente.dadosConta();

        System.out.println("\n=== Conta Poupança ===");
        contaPoupanca.dadosConta();

        // Depósito
        contaCorrente.realizarDeposito(200);

        // Saque
        contaCorrente.realizarSaque(150);

        // Transferência
        contaCorrente.realizarTransferencia(300, contaPoupanca);

        System.out.println("\n=== Após operações ===");
        contaCorrente.consultarSaldo();
        contaPoupanca.consultarSaldo();
    }
}