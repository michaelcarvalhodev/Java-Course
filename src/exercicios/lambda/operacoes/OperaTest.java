package exercicios.lambda.operacoes;

public class OperaTest {

    public static void main(String[] args) {

        System.out.println("A = 10 B = 3");

        Operacao soma = (x, y) -> x + y;
        System.out.println("Adicao = " + soma.executar(10,3));

        Operacao sub = (x,y) -> x - y;
        System.out.println("Subtracao = " + sub.executar(10,3));

        Operacao mult = (x,y) -> x * y;
        System.out.println("Multiplicacao = " + mult.executar(10,3));

        Operacao div = (x,y) -> x / y;
        System.out.println("Divisao = " + div.executar(10,3));

    }

}
