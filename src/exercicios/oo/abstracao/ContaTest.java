package exercicios.oo.abstracao;

public class ContaTest {

    public static void main(String[] args) {

        ContaCorrente contaCorrente = new ContaCorrente("Joao", 001, 2598, 3000);


        System.out.println(contaCorrente.saldo);
        contaCorrente.deposito(300);
        System.out.println(contaCorrente.saldo);
        contaCorrente.sacar(200);
        System.out.println(contaCorrente.saldo);


        ContaPoupanca contap = new ContaPoupanca("Funelson", 002,12000,1);

        System.out.println(contap.saldo);
        contap.deposito(1000);
        System.out.println(contap.saldo);
        contap.sacar(3000);
        System.out.println(contap.saldo);
    }
}
