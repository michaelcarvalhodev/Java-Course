package exercicios.oo.heranca;

public class Gerente extends Funcionario {


    double bonus;

    public Gerente(String nome, double salario , double bonus) {
        this.nome = nome;
        this.salario = salario;
        this.bonus = bonus;
    }


    @Override
    double calcularSalarioTotal(double bonus) {
        return super.calcularSalarioTotal(bonus);
    }

    @Override
    String FuncionarioInfos() {
        return super.FuncionarioInfos() + "\nSalario + Bonus: " + super.calcularSalarioTotal(bonus);
    }
}
