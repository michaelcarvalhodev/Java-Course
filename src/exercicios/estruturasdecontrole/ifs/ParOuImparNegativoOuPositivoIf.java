package exercicios.estruturasdecontrole.ifs;

import java.util.Scanner;

public class ParOuImparNegativoOuPositivoIf {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int n = input.nextInt();

        if (n % 2 == 1 && n > 0){
            System.out.print("Numero impar e positivo");

        } else if (n % 2 == 1 && n <= 0){
            System.out.println("Numero impar e negativo");

        } else if (n % 2 == 0 && n > 0) {
            System.out.print("Numero par e positivo");

        } else {
            System.out.print("Numero par e negativo");
        }


        input.close();
    }
}
