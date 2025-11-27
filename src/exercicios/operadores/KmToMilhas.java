package exercicios.operadores;

import java.util.Scanner;

public class KmToMilhas {

//    **Escreva um programa que converta:**
//    - Quilômetros para milhas (1 km = 0.621371 milhas)
//    - Utilize Scanner para receber a entrada do usuário
//    - Use constantes para o fator de conversão
//    - Formate a saída adequadamente

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Quantas Milhas?: ");
        double km = input.nextDouble();

        final double mtok = 0.621371;

        double milhas = km / mtok;

        System.out.printf("%.2f milhas por hora seria equivalente a %.2f em quilômetros ", km, milhas);


        input.close();


    }
}
