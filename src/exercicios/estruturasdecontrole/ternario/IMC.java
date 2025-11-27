package exercicios.estruturasdecontrole.ternario;

import java.util.Scanner;

public class IMC {

    public static void main(String[] args) {

//**Desafio: Calculadora de IMC Completa**
//        - Crie um programa que calcule o IMC (peso / altura²)
//        - Use operador ternário para classificar:
//        - Abaixo de 18.5: "Abaixo do peso"
//                - 18.5 a 24.9: "Peso normal"
//                - 25.0 a 29.9: "Sobrepeso"
//                - Acima de 30.0: "Obesidade"
//                - Imprima tanto o IMC quanto a classificação

        System.out.println("\nCalculadora de IMC");
        Scanner input = new Scanner(System.in);
        System.out.print("Qual o peso?: ");
        double peso = input.nextDouble();

        System.out.print("Qual a altura?: ");
        double altura = input.nextDouble();

        double IMC = peso / (altura * altura);

        System.out.printf("\nIMC = %.2f", IMC);

        String status = IMC <= 18.5 ? "Abaixo do peso" :
                IMC <= 24.9 ? "Peso normal" :
                        IMC <= 29.9 ? "Sobrepeso" :
                                "Obesidade";

        System.out.printf("\nStatus atual do seu peso: %s", status);


        input.close();

    }

}