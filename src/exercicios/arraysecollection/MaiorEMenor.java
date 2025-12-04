package exercicios.arraysecollection;

public class MaiorEMenor {

    public static void main(String[] args) {

//        **Encontre o Maior e Menor:**
//        - Crie um array com 10 números inteiros
//        - Encontre o maior valor
//        - Encontre o menor valor
//        - Imprima ambos

        int[] numeros = {234, 432, 534, 756, 9786, 9876, 6435, 253, 2365, 112};

        int maior = 0;
        int menor = Integer.MAX_VALUE;

        for (int n : numeros) {
            if (n > maior) {
                maior = n;
            }

            if (n < menor) {
                menor = n;
            }
        }

        System.out.printf("maior numero: %d", maior);
        System.out.printf("\nMenor numero: %d", menor);
    }
}
