package exercicios.estruturasdecontrole.switchcase;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número de 1 a 7: ");
        int dia = entrada.nextInt();

        switch (dia) {

            case 1:
                System.out.print("Dia 1 = Domingo\n Final de semana");
                break;
            case 2:
                System.out.print("Dia 2 = Segunda Feira\n Dia util");
                break;
            case 3:
                System.out.print("Dia 3 = Terca Feira\n Dia util");
                break;
            case 4:
                System.out.print("Dia 4 = Quarta Feira\n Dia util");
                break;
            case 5:
                System.out.print("Dia 5 = Quinta Feira\n Dia util");
                break;
            case 6:
                System.out.print("Dia 6 = Sexta Feira\n Dia util");
                break;
            case 7:
                System.out.print("Dia 7 = Sabado \n Final de semana");
                break;
            default:
                System.out.println("número inválidoo");
        }


    }
}
