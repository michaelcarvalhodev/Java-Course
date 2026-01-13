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

    Personagem(String nome, int vida, int forca, int alcanceDeAtaque) {
        this.nome = nome;
        this.alcanceDeAtaque = alcanceDeAtaque;
        this.vida = vida;
        this.forca = forca;
        this.nivel = 1;
        this.dinheiro = 0;
    }

    public void comprarItem(Item item) {

        if (item.getPreco() <= dinheiro) {
            itens.add(item);
            this.dinheiro = dinheiro - item.getPreco();
        }
    }

    public abstract int atacar(int alvoDistancia);

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
