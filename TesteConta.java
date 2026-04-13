package teste;

import banco.modelo.Conta;
import banco.modelo.ContaCorente;
import banco.modelo.ContaPoupanca;

public class TesteConta {
    public static void main(String[] args) {
        Conta conta1 = new Conta("Priscila", 1000);
        System.out.println("Dados da conta corrente: \nTitular: "+conta1.getTitular() + "\nSaldo: " + conta1.getSaldo());

        ContaPoupanca cont2 = new ContaPoupanca("Priscila", 1000);
        System.out.println("Dados da conta poupança : \nTitular: "+conta1.getTitular() + "\nSaldo: " + conta1.getSaldo());

    }
}
