package exercicios.lambda.jogoRPG;

public class Guerreiro extends Personagem {

    boolean escudo;

    Guerreiro(String nome, int vida, int forca, boolean escudo){
        super( nome,  vida, forca);
        this.escudo = escudo;
    }
}
