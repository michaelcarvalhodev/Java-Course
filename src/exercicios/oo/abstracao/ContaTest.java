package exercicios.oo.abstracao;

public class ContaTest {

    public static void main(String[] args) {

        ContaCorrente contaCorrente = new ContaCorrente("Joao", 001, 2598, 3000);

        ContaPoupanca contap = new ContaPoupanca("Funelson", 002,12000,1);

        System.out.println(contaCorrente.toString());

        System.out.println(contap.toString());

    }
}
