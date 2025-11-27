package exercicios.estruturasdecontrole.ifs;

import java.util.Scanner;

public class iiiiiifffffff {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int a = input.nextInt();

        if (a > 6); {
            System.out.println("SIM");
        }

        input.close();

        for(int i = 0; i < 5; i++) {
            if(i == 2) continue;
            System.out.println("Java");
        }
    }

}
