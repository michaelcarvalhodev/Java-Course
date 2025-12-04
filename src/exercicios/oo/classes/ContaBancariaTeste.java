package exercicios.oo.classes;

public class ContaBancariaTeste {

    public static void main(String[] args) {

        ContaBancaria conta1 = new ContaBancaria("T", 123, 12.345);

        System.out.println(conta1.consultarSaldo());

        conta1.depositar(0.100);

        System.out.println(conta1.consultarSaldo());

        conta1.sacar(0.050);

        System.out.println(conta1.consultarSaldo());
    }


}
