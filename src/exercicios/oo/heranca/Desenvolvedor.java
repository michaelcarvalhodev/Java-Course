package exercicios.oo.heranca;

public class Desenvolvedor extends Funcionario {

    String linguagem = "Java";

    public Desenvolvedor(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    @Override
    double calcularSalarioTotal(double bonus) {
        return super.calcularSalarioTotal(bonus);
    }

    @Override
    String FuncionarioInfos() {
        return super.FuncionarioInfos() + "\nLinguagem: " + linguagem;
    }


}
