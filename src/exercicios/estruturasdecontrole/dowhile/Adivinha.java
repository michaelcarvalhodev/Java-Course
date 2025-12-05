package exercicios.estruturasdecontrole.dowhile;

import java.util.Scanner;

public class Adivinha {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int novamente = 0;
        do {

            int numeroSorteado = (int) (Math.random() * 50) + 1;

            System.out.print("\nSorteando um numero de 1 a 50 ... ");

            int chute = 0;
            int tentativas = 7;

            do {

                System.out.printf("\n\nVoce tem %d tentativas para acertar o numero ", tentativas);
                System.out.print("\nQual o numero sorteado?: ");
                chute = input.nextInt();

                if (tentativas <= 1 && chute != numeroSorteado) {
                    System.out.println("\nSuas tentativas acabaram");
                    break;
                }


                if (chute > numeroSorteado) {
                    System.out.printf("Errou,o numero sorteado eh MENOR do que %d ", chute);

                } else if (chute < numeroSorteado) {
                    System.out.printf("Errou,o numero sorteado eh MAIOR do que %d ", chute);
                }

                tentativas--;


            } while (chute != numeroSorteado);


            if (numeroSorteado == chute) {
                System.out.println("acertou");

            } else {
                System.out.printf("Nao acertou, o numero era %d", numeroSorteado);
            }


            System.out.print("\nVoce gostaria de jogar novamente?\n 1 para jogar novamente\n 2 para finalizar o progama: ");
            novamente = input.nextInt();

        } while (novamente != 2);

        input.close();


    }

}
