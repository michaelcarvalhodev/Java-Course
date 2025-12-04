package exercicios.oo.classes;

public class Aluno {

    String nome;
    int matricula;
    double nota1;
    double nota2;
    double nota3;

    Aluno(String nome, int matricula, double nota1, double nota2, double nota3){
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    double calcularMedia(){
        return (this.nota1 + this.nota2 + this.nota3) / 3;
    }

    boolean estaAprovado(){
        return calcularMedia() >= 7;
    }

    String imprimirBoletim(){
        if (estaAprovado()) {
            return "O aluno " + nome + " foi aprovado com uma media de " + calcularMedia();
        } else {
            return "O aluno " + nome + " foi reprovado com uma media de " + calcularMedia();
        }
    }

}
