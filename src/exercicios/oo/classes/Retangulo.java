package exercicios.oo.classes;

public class Retangulo {

//    Crie uma classe `Retangulo` com:
//            - Atributos: largura, altura
//            - Método `calcularArea()`
//            - Método `calcularPerimetro()`
//            - Método `ehQuadrado()` - verifica se largura == altura
//            - Sobrecarga de construtores (um sem parâmetros e outro com)


    double largura;
    double altura;

    Retangulo() {
    }

    Retangulo(double largura, double altura) {
        this.altura = largura;
        this.altura = altura;
    }

    double calcularArea() {
        return altura * largura;
    }

    double calcularPerimetro() {
        return (altura + largura) * 2;
    }

    boolean ehQuadrado() {
        return altura == largura;
    }


}
