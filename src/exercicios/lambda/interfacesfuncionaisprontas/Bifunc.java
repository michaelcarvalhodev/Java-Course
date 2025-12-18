package exercicios.lambda.interfacesfuncionaisprontas;

import java.util.function.BiFunction;

public class Bifunc {

    public static void main(String[] args) {

        BiFunction <String, String, String> concate = (x, y) -> x + y;

        String string = concate.apply("Hello"," world");
        System.out.println(string);

        BiFunction <Integer, Integer, Integer> maior = (x, y) -> {

            if (x > y){
                return x;
            } else  {
                return y;
            }
        };

        int n = maior.apply(2,1);

        System.out.println(n);


        BiFunction <Integer, Integer, Integer> pot = (x ,y) -> {
            return (int) Math.pow(x,y);
        };

        Integer potencia = pot.apply(2,3);

        System.out.println(potencia);
    }

}
