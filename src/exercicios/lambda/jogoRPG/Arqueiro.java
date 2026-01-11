package exercicios.lambda.jogoRPG;

public class Arqueiro extends Personagem{


    Arqueiro(String nome, int vida, int forca, int alcanceDeAtaque){
        super(nome, vida, forca, alcanceDeAtaque);

    }

    @Override
    public int atacar(int alvoDistancia) {

        if (getAlcanceDeAtaque() < alvoDistancia){
            return 0;
        }

        return getForca() + getNivel();

    }

}
