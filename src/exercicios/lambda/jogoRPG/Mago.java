package exercicios.lambda.jogoRPG;

public class Mago extends Personagem{

    int nivelDeMagia;

    Mago(String nome, int vida, int forca,int nivel, int nivelDeMagia){
        super( nome,  vida, forca, nivel);
        this.nivelDeMagia = nivelDeMagia;
    }

    @Override
    public int atacar(int alvoDistancia) {
        return getForca() + getNivel() + nivelDeMagia;
    }
}
