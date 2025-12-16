package exercicios.oo.polimorfismo;

public class Circulo implements Forma {

    double raio;

    Circulo(double raio) {
        this.raio = raio;
    }


    @Override
    public double calcularArea() {
        return 3.14159 * (raio * raio);
    }

    @Override
    public double calcularPerimetro() {
        return (2 * 3.14159) * raio;
    }


}


