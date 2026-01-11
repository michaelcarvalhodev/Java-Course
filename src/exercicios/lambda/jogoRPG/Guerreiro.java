package exercicios.lambda.jogoRPG;

public class Guerreiro extends Personagem {

    boolean escudo;

    Guerreiro(String nome, int vida, int forca, int alcanceDeAtaque, boolean escudo) {
        super(nome, vida, forca, alcanceDeAtaque);
        this.escudo = escudo;
    }

    @Override
    public int atacar(int alvoDistancia) {

        if (getAlcanceDeAtaque() < alvoDistancia) {
            return 0;
        }
        return getForca() + getNivel();

    }
}
