package exercicios.oo.composicao;

public class Item {

    Produto produto;
    int quantidade;

    Item (Produto produto, int quantidade){
        this.produto = produto;
        this.quantidade = quantidade;

    }

    double calcularTotal(){
        return produto.preco * quantidade;
    }
}
