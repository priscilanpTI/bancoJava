package teste;

import banco.modelo.ContaCorente;
import banco.modelo.ContaPoupanca;

public class TesteConta {
    public static void main(String[] args) {
        ContaCorente conta1 = new ContaCorente("Priscila", 1000);
        System.out.println("Dados da conta corrente: \nTitular: "+conta1.getTitular() + "\nSaldo: " + conta1.getSaldo());
        System.out.println(conta1.realizaSaque(500));
        System.out.println(conta1.realizaDeposito(200));
        System.out.println(conta1.consultaSaldo());
        System.out.println(conta1.realizaTransferencia(5));

        ContaPoupanca cont2 = new ContaPoupanca("Priscila", 1000) {
        };
        System.out.println("Dados da conta Poupança: \nTitular: "+conta1.getTitular() + "\nSaldo: " + conta1.getSaldo());
        System.out.println(cont2.realizaSaque(50));
        System.out.println(cont2.realizaDeposito(20));
        System.out.println(cont2.consultaSaldo());
        System.out.println(conta1.realizaTransferencia(5));
    }
}
