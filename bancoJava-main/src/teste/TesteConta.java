package teste;

import banco.modelo.ContaCorente;
import banco.modelo.ContaPoupanca;

public class TesteConta {
    public static void main(String[] args) {
        ContaCorente conta1 = new ContaCorente("Priscila", 1000);
        ContaPoupanca cont2 = new ContaPoupanca("Priscila", 1000) {
            @Override
            public String getSaldo() {
                return super.getSaldo();
            }
        };

    }
}
