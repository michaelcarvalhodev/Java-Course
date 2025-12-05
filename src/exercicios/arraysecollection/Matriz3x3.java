package exercicios.arraysecollection;

public class Matriz3x3 {

//    Matriz 3x3:
//    - Crie uma matriz 3x3 de inteiros
//    - Preencha com valores de 1 a 9
//    - Imprima a matriz formatada
//    - Calcule a soma de cada linha

    public static void main(String[] args) {

        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]);
            }

            int soma = 0;

            for (int j = 0; j < matriz.length; j++) {

                soma += matriz[i][j];

            }

            System.out.printf(" Soma dessa linha = %d \n", soma);

        }
    }
}
