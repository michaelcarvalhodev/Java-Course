package exercicios.lambda.jogoRPG;

public class Mago extends Personagem{

    int nivelDeMagia;

    Mago(String nome, int vida, int forca, int nivelDeMagia){
        super( nome,  vida, forca);
        this.nivelDeMagia = nivelDeMagia;
    }
}
