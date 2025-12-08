package exercicios.oo.composicao;

public class ProdutoT {

    public static void main(String[] args) {

        Compra compra = new Compra();

        Produto play = new Produto("Play 4", 3400);
        Produto livro = new Produto("Bras Cubas", 30);
        Produto bala = new Produto("Sete Belo", 0.50);

        compra.adicionarItem(new Item(play, 1));
        compra.adicionarItem(new Item(livro, 1));
        compra.adicionarItem(new Item(bala, 10));

        System.out.println(compra.imprimirNota());


    }

}
