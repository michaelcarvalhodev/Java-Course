package exercicios.oo.composicao;

import java.util.ArrayList;

public class Compra {

    ArrayList<Item> itens = new ArrayList<>();

    // Método adicionarItem()
    // Método calcularTotal()
    // Método imprimirNota()

    void adicionarItem(Item item) {
        itens.add(item);
    }

    double calcularTotal() {
        double total = 0;
        for (Item item : itens) {
            total += item.quantidade * item.produto.preco;
        }
        return total;
    }


    String imprimirItens() {

        String lista = " ";

        for (Item item : itens) {
            lista += "\n" + item.produto.nome + " " + item.quantidade + "x ";
        }

        return lista;
    }


    String imprimirNota() {

        return " Cliente comprou: " + imprimirItens() + " \ntotalizando um valor de R$" + calcularTotal();
    }

}









