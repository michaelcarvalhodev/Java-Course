package exercicios.lambda.jogoRPG;

public class Arma extends Item {

    private int danoAdicional;

    Arma(String nome, String tipo, int preco, int danoAdicional) {
        super(nome, tipo, preco);
        this.danoAdicional = danoAdicional;
    }

    public int getDanoAdicional() {
        return danoAdicional;
    }

    public void setDanoAdicional(int danoAdicional) {
        this.danoAdicional = danoAdicional;
    }
}
