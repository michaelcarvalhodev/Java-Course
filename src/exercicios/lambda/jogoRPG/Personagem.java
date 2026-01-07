package exercicios.lambda.jogoRPG;

public abstract class Personagem {

    private String nome;
    private int vida;
    private int forca;


    Personagem(String nome, int vida, int forca){
        this.nome = nome;
        this.vida = vida;
        this.forca = forca;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
