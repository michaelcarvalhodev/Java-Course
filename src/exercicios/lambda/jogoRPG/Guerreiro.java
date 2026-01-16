package exercicios.lambda.jogoRPG;

public class Guerreiro extends Personagem {

    boolean escudo;

    Guerreiro(String nome, int vida, int forca, int alcanceDeAtaque, int x, int y, boolean escudo) {
        super(nome, vida, forca, alcanceDeAtaque, x, y);
        this.escudo = escudo;
    }

    @Override
    public int getDanoTotal() {
        return getForca() + getNivel();
    }

}
