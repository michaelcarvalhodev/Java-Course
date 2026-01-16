package exercicios.lambda.jogoRPG;

import java.util.ArrayList;

public abstract class Personagem {


    ArrayList<Item> itens = new ArrayList<>();
    private String nome;
    private int vida;
    private int forca;
    private int nivel;
    private int alcanceDeAtaque;
    private int dinheiro;
    private int experiencia;
    private int x;
    private int y;

    Personagem(String nome, int vida, int forca, int alcanceDeAtaque, int x, int y) {
        this.nome = nome;
        this.alcanceDeAtaque = alcanceDeAtaque;
        this.vida = vida;
        this.forca = forca;
        this.nivel = 1;
        this.dinheiro = 0;
        this.experiencia = 0;
        this.x = x;
        this.y = y;

    }

    public int atacar(Personagem alvo) {

        int posX = this.x - alvo.x;

        int posY = this.y - alvo.y;

        int distanciaX = Math.abs(posX);
        int distanciaY = Math.abs(posY);

        if (distanciaX <= this.alcanceDeAtaque && distanciaY <= this.alcanceDeAtaque) {
            alvo.setVida(alvo.getVida() - getDanoTotal());
            return this.forca;
        }

        return 0;
    }

    public abstract int getDanoTotal();

    @Override
    public String toString() {
        return "\nStatus do boneco" +

                "\nNome: " + this.getNome() +
                "\nForca: " + this.getForca() +
                "\nVida: " + this.getVida() +
                "\nAlcance de ataque: " + this.getAlcanceDeAtaque() +
                "\nNivel: " + this.getNivel() +
                "\nExperiencia: " + this.getExperiencia() +
                "\nDinheiro: " + this.getDinheiro();
//                this.nome = nome;
//        this.alcanceDeAtaque = alcanceDeAtaque;
//        this.vida = vida;
//        this.forca = forca;
//        this.nivel = 1;
//        this.dinheiro = 0;
//        this.experiencia = 0;
//        this.x = x;
//        this.y = y;
//                "Forca: " + this.getForca() +
//                "Vida: " + this.getVida();
//                ": " + this.getVida();
    }

    public void comprarItem(Item item) {

        if (item.getPreco() <= dinheiro) {
            itens.add(item);
            this.dinheiro = dinheiro - item.getPreco();
        }
    }

    public void ganharXP(int pontosDeXP) {
        experiencia += pontosDeXP;

        while (experiencia >= 100) {
            experiencia -= 100;
            this.nivel++;
        }
    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }


    public int getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(int dinheiro) {
        this.dinheiro = dinheiro;
    }

    public int getAlcanceDeAtaque() {
        return alcanceDeAtaque;
    }

    public void SetAlcance(int alcance) {
        this.alcanceDeAtaque = alcance;
    }


    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
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
