package exercicios.oo.heranca;


import java.util.ArrayList;

public class EmpresaT {

    public static void main(String[] args) {

        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        Gerente gerente = new Gerente("Bentson", 15000, 2000);
        funcionarios.add(gerente);


//        System.out.println(gerente.FuncionarioInfos());
        gerente.calcularSalarioTotal(2000);


        Desenvolvedor desenvolvedor = new Desenvolvedor("Joao", 2600);
        funcionarios.add(desenvolvedor);

//        System.out.println(desenvolvedor.FuncionarioInfos());

        for (Funcionario f : funcionarios) {
            System.out.println(f.FuncionarioInfos());
            System.out.println("---");
        }


    }
}
