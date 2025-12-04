package exercicios.oo.classes;

    // Complete as classes abaixo

    public class Produto {
        // Atributos: nome, preco, desconto

        // Construtor

        // Método precoComDesconto() - calcula o preço final

        // Método imprimirInfo()

        String nome;
        double preco;
        double desconto;

        Produto(){
        }

        Produto(String nome, double preco, double desconto){
            this.nome = nome;
            this.preco = preco;
            this.desconto = desconto;
        }

        double precoComDesconto(){
            return (preco * desconto) / 100;
        }

        String imprimirInfo(){
            return "Preco original: " + preco + "\npreco com desconto de " + desconto + "\npreco final com desconto: " + precoComDesconto();
        }
    }

