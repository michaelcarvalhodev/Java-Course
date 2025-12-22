package exercicios.lambda.interfacesfuncionaisprontas;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateeFilter {

    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<>();

        for (int i = 1; i < 21; i++) {
            lista.add((int) (Math.random() * 60));

        }

        System.out.println(lista);

        int div3 = 0;
        int mdez = 0;
        int npares = 0;


        Predicate<Integer> quantidadedepares = (n1) -> n1 % 2 == 0;

        Predicate<Integer> quantidademaiorquedez = (n1) -> n1 > 10;

        Predicate<Integer> quantidadivisiveispor3 = (n1) -> n1 % 3 == 0;


        for (Integer n : lista){
            boolean pares = quantidadedepares.test(n);

            if (pares){
                npares ++;
            }

            boolean maiorquedez = quantidademaiorquedez.test(n);

            if (maiorquedez){
                mdez++;
            }

            boolean divisivelpor3 = quantidadivisiveispor3.test(n);

            if (divisivelpor3){
                div3++;
            }
        }

        System.out.printf("Quantidade de numeros pares na lista: %d", npares);
        System.out.printf("%nQuantidade de numeros maiores do que 10 na lista: %d", mdez);
        System.out.printf("%nQuantidade de numeros divisiveis por 3 na lista: %d", div3);

    }


}
