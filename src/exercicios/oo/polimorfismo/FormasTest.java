package exercicios.oo.polimorfismo;

public class FormasTest {

    public static void main(String[] args) {

        Forma[] formas = new Forma[3];

        Circulo c1 = new Circulo(5.4);
        Retangulo r1 = new Retangulo(11, 3);
        Circulo c2 = new Circulo(2.4);

        System.out.printf("Area de um circulo com o raio de %.1f = %.2f\n",c1.raio, c1.calcularArea());
        System.out.printf("Area de um retangulo com a largura de %.0f e altura de %.0f = %.2f\n",r1.largura, r1.altura, r1.calcularArea());
        System.out.printf("Perimetro de uma circulo com o raio de %.1f = %.2f\n", c2.raio, c2.calcularPerimetro());

        formas[0] = c1;
        formas[1] = r1;
        formas[2] = c2;

        for (Forma calc : formas){
            System.out.printf("%.2f\n", calc.calcularArea());

        }
    }
}
