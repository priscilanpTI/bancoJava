package teste;

import banco.modelo.ContaCorrente;
import banco.modelo.ContaPoupanca;

public class TesteConta {
    public static void main(String[] args) {

        ContaCorrente contaCorrente1 = new ContaCorrente("Mathias", 3.06);
        contaCorrente1.dadosConta();
        contaCorrente1.realizarDeposito(100);
        contaCorrente1.consultarSaldo();
        contaCorrente1.realizarSaque(57);
        contaCorrente1.consultarSaldo();

        System.out.println("----------------------");

        ContaPoupanca contaPoupanca1 = new ContaPoupanca("Miguel", 27.50);
        contaPoupanca1.dadosConta();
        contaPoupanca1.realizarTransferencia(10, 32150070);
        contaPoupanca1.consultarSaldo();
    }
}