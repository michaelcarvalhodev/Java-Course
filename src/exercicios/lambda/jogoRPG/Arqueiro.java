package exercicios.lambda.jogoRPG;

public class Arqueiro extends Personagem{


    Arqueiro(String nome, int vida, int forca, int alcanceDeAtaque, int x, int y){
        super(nome, vida, forca, alcanceDeAtaque, x, y);

    }


    @Override
    public int getDanoTotal() {
        return getForca() + getNivel();
    }

}
