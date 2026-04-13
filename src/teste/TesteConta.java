package teste;

import banco.modelo.Conta;
import banco.modelo.ContaCorente;
import banco.modelo.ContaPoupanca;

public class TesteConta {
    public static void main(String[] args) {
        Conta conta1 = new ContaCorente("Priscila", 1000);
        System.out.println("Dados da conta corrente: \nTitular: "+conta1.getTitular() + "\nSaldo: " + conta1.getSaldo());

        ContaPoupanca conta2 = new ContaPoupanca("Priscila", 1000);
        System.out.println("Dados da conta corrente: \nTitular: "+conta1.getTitular() + "\nSaldo: " + conta1.getSaldo());

        System.out.println(conta1.realizaSaque(100));
        System.out.println(conta1.consultaSaldo());

        System.out.println(conta1.realizaDeposito(100));
        System.out.println(conta1.consultaSaldo());

        System.out.println(conta1.realizaTransferencia(200));
        System.out.println(conta1.consultaSaldo());
    }
}
