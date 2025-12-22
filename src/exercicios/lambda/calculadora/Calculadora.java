package exercicios.lambda.calculadora;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class Calculadora {

    private final Map<String, BiFunction<Double, Double, Double>> calc = new HashMap<>();

    public Calculadora() {

        calc.put("+", (a, b) -> a + b);
        calc.put("-", (a, b) -> a - b);
        calc.put("*", (a, b) -> a * b);
        calc.put("/", (a, b) -> {

            if (b == 0) {
                throw new IllegalArgumentException("Numeros nao podem ser divididos por 0");
            } else {
                return (a / b);
            }

        });

    }

    public Double calcular(String operacao, Double a, Double b) {

        BiFunction<Double, Double, Double> funcao = calc.get(operacao);

        if (funcao == null) {
            throw new IllegalArgumentException("Operação inválida: " + operacao);
        }

        return funcao.apply(a,b);

    }
}
