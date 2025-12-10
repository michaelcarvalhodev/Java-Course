package exercicios.oo.heranca;


public class Funcionario {

    String nome;
    double salario;



    public Funcionario() {
    }


    double calcularSalarioTotal(double bonus) {
        return salario + bonus;
    }

    String FuncionarioInfos() {
        return "\nNome: " + nome + "\nSalario: " + salario + "\nCargo: " + this.getClass().getSimpleName();
    }

}
