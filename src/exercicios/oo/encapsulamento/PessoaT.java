package exercicios.oo.encapsulamento;

public class PessoaT {

    public static void main(String[] args) {


        Pessoa p1 = new Pessoa();

        p1.setNome(" Joao   ");
        p1.setIdade(12);
        p1.setCPF("50254334562");

        System.out.println(p1.getNome());
        System.out.println(p1.getIdade());
        System.out.println(p1.getCPF());
    }
}
