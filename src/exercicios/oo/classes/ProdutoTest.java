package exercicios.oo.classes;

public class ProdutoTest {

    public static void main(String[] args) {

        // Crie 3 produtos diferentes
        // Aplique descontos diferentes
        // Imprima as informações de cada um

        Produto p1 = new Produto("Mouse", 1299, 10);
        Produto p2 = new Produto();
        p2.nome = "iphone";
        p2.preco = 1.456;
        p2.desconto = 10;

        System.out.println(p2.imprimirInfo());
        System.out.println(p1.imprimirInfo());

    }
}
