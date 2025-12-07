package exercicios.arraysecollection;

import java.util.Arrays;

public class EstatísticasArray {

//    Desafio: Estatísticas de Array:
//    - Crie um array com 15 números aleatórios (1-100)
//    - Calcule: média, maior, menor, quantidade de pares, quantidade de ímpares
//    - Crie um método para cada cálculo
//    - Imprima todas as estatísticas

    
    static double calcularMedia(int [] numeros){

        double media = 0;

        for (double n : numeros) {
            media += n;
        }
        media = media / numeros.length;
        return media;

    }

    static int calcularMaior(int [] numeros){
        int maior = numeros[0];

        for (int n : numeros) {

            if (n > maior) {
                maior = n;
            }
        }

        return maior;
    }

    static int calcularMenor(int [] numeros){
        int menor = numeros[0];

        for (int n : numeros) {

            if (n < menor) {
                menor = n;
            }
        }

        return menor;
    }

    static int calcularPares(int [] numeros){
        int pares = 0;
        for (int n : numeros){

            if (n % 2 == 0){
                pares++;
            }
        }
        return pares;
    }

    static int calcularImpares(int [] numeros){
        int impares = 0;
        for (int n : numeros){

            if (n % 2 == 1){
                impares++;
            }
        }
        return impares;
    }

    public static void main(String[] args) {

        int[] numeros = new int[15];

        for (int i = 0; i < numeros.length ; i++) {
            numeros[i] = (int) (Math.random() * 100) + 1;
        }

        System.out.println();

        System.out.printf("Array de 15 numeros aleatorios: %s" ,Arrays.toString(numeros));

        System.out.printf("\nA media do array: %.1f" ,calcularMedia(numeros));

        System.out.printf("\nMaior numero do array: %d" ,calcularMaior(numeros));

        System.out.printf("\nMenor numero do array: %d" ,calcularMenor(numeros));

        System.out.printf("\nNumero de Pares no array: %d" ,calcularPares(numeros));

        System.out.printf("\nNumero de Impares no array: %d" ,calcularImpares(numeros) );
    }
}
