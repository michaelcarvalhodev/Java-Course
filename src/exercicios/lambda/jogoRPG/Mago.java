package exercicios.lambda.jogoRPG;

public class Mago extends Personagem{

    int nivelDeMagia;

    Mago(String nome, int vida, int forca, int nivelDeMagia,int alcanceDeAtaque, int x, int y){
        super(nome, vida, forca, alcanceDeAtaque, x, y);
        this.nivelDeMagia = nivelDeMagia;
    }

    @Override
    public int getDanoTotal() {
        return getForca() + getNivel() + nivelDeMagia;
    }

}
