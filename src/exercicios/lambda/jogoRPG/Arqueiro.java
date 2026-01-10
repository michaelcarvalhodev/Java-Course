package exercicios.lambda.jogoRPG;

public class Arqueiro extends Personagem{

    int alcance;

    Arqueiro(String nome, int vida, int forca, int nivel, int alcance){
        super(nome, vida, forca, nivel);
        this.alcance = alcance;
    }

    @Override
    public int atacar(int alvoDistancia) {
        return getForca() + getNivel();
    }
}
