package exercicios.oo.polimorfismo;

public class Retangulo implements Forma{

    double largura;
    double altura;


    @Override
    public double calcularArea() {
        return largura * altura;
    }

    @Override
    public double calcularPerimetro() {
        return (largura + altura) * 2;
    }

    Retangulo(double largura, double altura){
        this.altura = altura;
        this.largura = largura;
    }
}
