package teste;

import banco.modelo.ContaCorente;
import banco.modelo.ContaPoupanca;

public class TesteConta {
    public static void main(String[] args) {
        Conta conta1 = new ContaCorente("Priscila", 1000);
        System.out.println("Dados da conta corrente: \nTitular: "+conta1.getTitular() + "\nSaldo: " + conta1.getSaldo());

        ContaPoupanca cont2 = new ContaCorente("Priscila", 1000);
        System.out.println("Dados da conta corrente: \nTitular: "+conta1.getTitular() + "\nSaldo: " + conta1.getSaldo());

    }
}
