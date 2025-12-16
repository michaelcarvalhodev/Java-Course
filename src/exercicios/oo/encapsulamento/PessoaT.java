package exercicios.oo.encapsulamento;

public class PessoaT {

    public static void main(String[] args) {


        Pessoa p1 = new Pessoa();

        p1.setNome("   a ");
        p1.setIdade(150);
        p1.setCPF("50254234562");

        System.out.println(p1.imprimirDados());
    }
}
