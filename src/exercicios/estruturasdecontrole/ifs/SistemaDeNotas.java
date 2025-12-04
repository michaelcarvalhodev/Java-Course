package exercicios.estruturasdecontrole.ifs;

import java.util.Scanner;

public class SistemaDeNotas {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.print("Digite a nota de 0 a 100: ");
        int nota = input.nextInt();

        if (nota >= 90){
            System.out.print("Conceito A");

        } else if (nota >=80 && nota <=89) {
            System.out.print("Conceito B");

        } else if (nota >= 70 && nota <= 79 ) {
            System.out.print("Conceito C");

        } else if (nota >= 60 && nota <= 69) {
            System.out.print("Conceito D");

        } else {
            System.out.print("Conceito F");
            
        }
        input.close();

    }
}
