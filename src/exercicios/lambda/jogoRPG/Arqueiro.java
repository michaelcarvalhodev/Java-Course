package exercicios.lambda.jogoRPG;

public class Arqueiro extends Personagem{

    int alcance;

    Arqueiro(String nome, int vida, int forca, int alcance){
        super(nome, vida, forca);
        this.alcance = alcance;
    }
}
