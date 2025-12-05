package exercicios.arraysecollection;

import java.sql.Array;
import java.util.Arrays;

public class Estatísticas {

//    Desafio: Estatísticas de Array:
//    - Crie um array com 15 números aleatórios (1-100)
//    - Calcule: média, maior, menor, quantidade de pares, quantidade de ímpares
//    - Crie um método para cada cálculo
//    - Imprima todas as estatísticas

    
//    double calcularMedia(){
//        double media;
//
//    }

    public static void main(String[] args) {

        int[] numeros = new int[15];

        for (int i = 0; i < numeros.length ; i++) {
            numeros[i] = (int) (Math.random() * 100) + 1;

        }

        System.out.println(Arrays.toString(numeros));

    }
}
