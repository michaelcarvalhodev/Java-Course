package exercicios.arraysecollection;

import java.util.Objects;
import java.util.Scanner;

public class Buscar {

//    Busca em Array:
//    - Crie um array de Strings com nomes
//    - Receba um nome do usuário
//    - Busque esse nome no array
//    - Imprima se foi encontrado e em qual posição

    public static void main(String[] args) {

        String[] nomes = {"michael", "gabriel", "joao"};

        Scanner input = new Scanner(System.in);
        System.out.print("Qual nome voce deseja buscar?: ");
        String busca = input.nextLine();

        for (int i = 0; i < nomes.length; i++) {

            if (Objects.equals(busca, nomes[i])) {
                System.out.printf("O nome %s foi encontrado na posicao %d", busca, i);
                break;

            } else if (!Objects.equals(busca, nomes[i]) && i == nomes.length - 1) {
                System.out.printf("Nome %s nao encontrado", busca);
            }
        }

        input.close();

    }
}
