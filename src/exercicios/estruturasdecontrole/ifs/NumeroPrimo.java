package exercicios.estruturasdecontrole.ifs;

import java.util.Scanner;

public class NumeroPrimo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int n = input.nextInt();
        int cont = 0;

        for (int i = 1; i < Integer.MAX_VALUE; i++) {

            if (n % i == 0){
                cont++;
            }

        }

        if (cont == 2){
            System.out.printf("%d eh primo, pois ele so eh divisivel apenas por 1 e ele mesmo", n);
        } else {
            System.out.printf("%d nao eh primo, pois ele eh divisivel por %d numeros", n, cont);
        }
        input.close();

    }
}
