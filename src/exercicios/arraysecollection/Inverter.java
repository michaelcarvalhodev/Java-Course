package exercicios.arraysecollection;

import java.util.Arrays;

public class Inverter {

//    **Inverter Array:**
//    - Crie um array com 5 números
//    - Inverta a ordem dos elementos (sem criar novo array)
//    - Imprima o array invertido

    public static void main(String[] args) {

        int[] numeros = {4, 5, 6, 7, 8};

        System.out.println(Arrays.toString(numeros));

        for (int i = 0; i < numeros.length / 2; i++) {
            int temp = numeros[i];
            numeros[i] = numeros[numeros.length - 1 - i];
            numeros[numeros.length - 1 - i] = temp;
        }

        System.out.println(Arrays.toString(numeros));
    }

}
