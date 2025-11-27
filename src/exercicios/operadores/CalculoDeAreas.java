package exercicios.operadores;

import java.util.Scanner;

public class CalculoDeAreas {

//    **Crie um programa que:**
//   - Declare constantes para PI (3.14159) e o raio de um círculo
//   - Calcule a área do círculo (π × r²)
//   - Calcule o perímetro do círculo (2 × π × r)
//   - Imprima os resultados formatados com 2 casas decimais

    public static void main(String[] args) {

        final double pi = 3.14159;

        Scanner input = new Scanner(System.in);

        System.out.print("Qual o raio do circulo?: ");
        double r = input.nextDouble();

        System.out.println("Calculando a area do circulo pelo raio");

        double a = (r * r) * pi;

        System.out.printf("Area do circulo = %.2f",a);


        System.out.println("\n\nCalculando o perímetro do circulo pelo raio");
        double p = 2 * pi * r;
        System.out.printf("Perimetro do circulo = %.2f",p);



        input.close();


    }
}
