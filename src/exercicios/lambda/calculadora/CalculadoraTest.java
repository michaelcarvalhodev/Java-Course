package exercicios.lambda.calculadora;

import java.util.Objects;
import java.util.Scanner;

public class CalculadoraTest {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        Scanner input = new Scanner(System.in);

        String continuar = "s";

        do {


            System.out.println("\nQuais numeros voce quer usar na operacao?: ");
            System.out.print("Digite o primeiro numero: ");
            double n1 = input.nextDouble();

            System.out.printf("Numero 1 = %f", n1);
            System.out.print("\n\nDigite o segundo numero: ");
            double n2 = input.nextDouble();

            System.out.printf("Numero 2 = %f", n2);


            System.out.println("\n\nQual operacao voce deseja fazer?");
            System.out.print("Digite:" + "\n'+' para somar " + "\n'-' para subtrair" + "\n'*' para multiplicar" + "\nou '/' para dividir: ");
            String sinal = input.next();

            System.out.println("\n---------");
            System.out.printf("Resultado de %f %s %f = %f: " ,n1, sinal ,n2, calculadora.calcular(sinal, n1, n2));
            System.out.println("\n---------");


            System.out.print("\nVoce deseja realizar mais uma operacao?" +
                    "\nDigite 'sim' para fazer outra operacao " +
                    "\nou digite outra coias para finalizar o progama: ");
            continuar = input.next();

        } while (Objects.equals(continuar, "sim"));

        input.close();
    }
}
