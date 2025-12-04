package controle.estruturas;

import java.util.Scanner;

public class DiaDaSemana {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o dia da semana: ");

        String dia = entrada.nextLine();

        if ( !dia.equals("Domingo") && !dia.equals("Segunda") && !dia.equals("Terça") &&
                !dia.equals("Quarta") && !dia.equals("Quinta") && !dia.equals("Sexta") &&
                !dia.equals("Sábado") ) {
            System.out.println("Dia Invalido");
        }


        boolean resultado = ("Domingo".equals(dia.trim()));

        if (resultado)
            System.out.println(" Domingo dia 1");

        boolean resultado1 = ("Segunda".equals(dia.trim()));

        if (resultado1) {
            System.out.println("Segunda dia 2");

        }

        boolean resultado2 = ("Terça".equals(dia.trim()));

        if (resultado2) {
            System.out.println("Terça dia 3");

        }

        boolean resultado3 = ("Quarta".equals(dia.trim()));

        if (resultado3) {
            System.out.println("Quarta dia 4");

        }

        boolean resultado4 = ("Quinta".equals(dia.trim()));

        if (resultado4) {
            System.out.println("Quinta dia 5");

        }

        boolean resultado5 = ("Sexta".equals(dia.trim()));

        if (resultado5) {
            System.out.println("Sexta dia 6");

        }

        boolean resultado6 = ("Sabado".equals(dia.trim()));

        if (resultado6) {
            System.out.println("Sabado dia 7");

        }

        entrada.close();

    }
}
