package exercicios.arraysecollection;

public class Notas {

    public static void main(String[] args) {
        // Complete o código

        double[] notas = {7.5, 8.0, 6.5, 9.0, 7.0};
        double soma = 0;

        // Use foreach para somar todas as notas

        for (double nota : notas){
            soma += nota;
        }
        double media = soma / notas.length;

        System.out.println("Média: " + media);

    }
}
