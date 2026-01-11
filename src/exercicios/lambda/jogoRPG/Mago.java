package exercicios.lambda.jogoRPG;

public class Mago extends Personagem{

    int nivelDeMagia;

    Mago(String nome, int vida, int forca, int nivelDeMagia,int alcanceDeAtaque){
        super( nome,  vida, forca, alcanceDeAtaque);
        this.nivelDeMagia = nivelDeMagia;
    }

    @Override
    public int atacar(int alvoDistancia) {

        if (getAlcanceDeAtaque() < alvoDistancia){
            return 0;
        }
        return getForca() + getNivel() + nivelDeMagia;
    }

}
