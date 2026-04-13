package org.example;

import org.example.ContaCorente;
import org.example.ContaPoupanca;

public class TesteConta {
    public static void main(String[] args) {
        ContaCorente conta1 = new ContaCorente("Priscila", 1000);
        System.out.println("Dados da conta corrente: \nTitular: "+conta1.getTitular() + "\nSaldo: " + conta1.getSaldo());

        ContaCorente conta2 = new ContaCorente("Priscila", 1000);
        System.out.println("Dados da conta corrente: \nTitular: "+conta2.getTitular() + "\nSaldo: " + conta2.getSaldo());

    }
}
