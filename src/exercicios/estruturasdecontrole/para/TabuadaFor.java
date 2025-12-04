package exercicios.estruturasdecontrole.para;

import java.util.Scanner;

public class TabuadaFor {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Digite um numero para ver a tabuada: ");
        int n = input.nextInt();

        System.out.printf("Tabuada do %d: ", n);

        for (int i = 1; i < 11; i++) {
            System.out.printf("\n%d x %d = %d", n, i, (n * i));

        }

        input.close();
    }
}
