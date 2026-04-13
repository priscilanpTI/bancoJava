package teste;

import banco.modelo.ContaCorrente;
import banco.modelo.ContaPoupanca;

public class TesteConta {
    public static void main(String[] args) {
        ContaPoupanca conta1 = new ContaPoupanca("Priscila", 1000) {
        };
        System.out.println("Dados da conta poupança: \nTitular: "+conta1.getTitular() + "\nSaldo: " + conta1.getSaldo());
        conta1.realizaDeposito(100);
        conta1.consultaSaldo();
        conta1.realizaSaque(100);
        conta1.consultaSaldo();
        conta1.realizaTransferencia(40);
        conta1.consultaSaldo();


        ContaCorrente conta2 = new ContaCorrente("Miguel", 1000);
        System.out.println("Dados da conta corrente: \nTitular: "+conta2.getTitular() + "\nSaldo: " + conta2.getSaldo());
        conta2.realizaDeposito(100);
        conta2.consultaSaldo();
        conta2.realizaSaque(100);
        conta2.consultaSaldo();
        conta2.realizaTransferencia(40);
        conta2.consultaSaldo();


    }
}
