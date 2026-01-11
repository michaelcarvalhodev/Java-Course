package exercicios.lambda.jogoRPG;

public abstract class Personagem {

    private String nome;
    private int vida;
    private int forca;
    private int nivel;
    private int alcanceDeAtaque;

    public abstract int atacar(int alvoDistancia);


    Personagem(String nome, int vida, int forca, int alcanceDeAtaque){
        this.nome = nome;
        this.alcanceDeAtaque = alcanceDeAtaque;
        this.vida = vida;
        this.forca = forca;
        this.nivel = 1;
    }

    public int getAlcanceDeAtaque(){
        return alcanceDeAtaque;
    }

    public void SetAlcance(int alcance){
        this.alcanceDeAtaque = alcance;
    }


    public int getNivel(){
        return nivel;
    }

    public void setNivel(int nivel){
        this.nivel = nivel;
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
