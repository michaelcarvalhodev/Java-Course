package exercicios.listas.biblioteca;

import java.util.*;

public class SistemadeBibliotecaDigital {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int comando = 5;

        System.out.println("\n----------------------------------------------");
        System.out.println("       Bem-vinde a nossa biblioteca  ");
        System.out.println("----------------------------------------------");

        ArrayList<Livro> Biblioteca = new ArrayList<>();
        Queue<Livro> Devolucao = new LinkedList<>();
        Map<String, Livro> Busca = new HashMap<>();

        Livro l1 = new Livro("Memorias postumas de Bras Cubas", "Machado de Assis", 1263);
        Livro l2 = new Livro("O apanhador no campo de centeio", "J.D. Salinger", 4326);
        Livro l3 = new Livro("Crime e Castigo", "Dostoievski", 7899);
        Livro l4 = new Livro("ABC", "Edson Arantes Do Nacismento", 1000);
        Livro l5 = new Livro("Orgulho e Preconceito", "Jane Austen", 4395);

        Biblioteca.add(l1);
        Biblioteca.add(l2);
        Biblioteca.add(l3);
        Biblioteca.add(l4);
        Biblioteca.add(l5);

        while (comando != 0) {

            System.out.print("\n Digite:\n 1\uFE0F⃣ para Ver livros disponíveis\n 2\uFE0F⃣ para Pegar um livro emprestado\n 3\uFE0F⃣ para Devolver um livro \n 4\uFE0F⃣ para Buscar um livro pelo título \n 0\uFE0F⃣ para sair do sistema: ");
            comando = input.nextInt();
            input.nextLine();


            Collections.sort(Biblioteca);

            if (comando == 1) {
                System.out.print("\nTemos " + Biblioteca.size() + " livros disponiveis, aqui estao eles em ordem alfabetica: ");
                for (Livro livro : Biblioteca) {
                    System.out.print(livro);
                }
                continue;

            }
            Busca.put(l1.getTituloDoLivro().toLowerCase(), l1);
            Busca.put(l2.getTituloDoLivro().toLowerCase(), l2);
            Busca.put(l3.getTituloDoLivro().toLowerCase(), l3);
            Busca.put(l4.getTituloDoLivro().toLowerCase(), l4);
            Busca.put(l5.getTituloDoLivro().toLowerCase(), l5);

            if (comando == 2) {


                System.out.print(" Digite o livro que deseja pegar emprestado : ");
                String emprestado = input.nextLine().toLowerCase();

                Livro livroParaRemover = null;

                for (Livro livro : Biblioteca) {
                    if (livro.getTituloDoLivro().toLowerCase().equals(emprestado)) {
                        livroParaRemover = livro;
                        break;
                    }
                }

                if (livroParaRemover != null && Devolucao.size() == 0) {
                    System.out.println("Livro encontrado: " + livroParaRemover.getTituloDoLivro() + " \uD83D\uDCDA Você pode pegá-lo emprestado. Boa leitura");
                    Biblioteca.remove(livroParaRemover);
                    Devolucao.offer(livroParaRemover);

                } else if (livroParaRemover != null && Devolucao.size() >= 1) {
                    System.out.println("\nvoce ja tem um livro emprestado no momento, primeiro devolva para poder pegar outro livro");

                } else {
                    System.out.println("\nLivro nao encontrado");
                }

                continue;
            }

            if (comando == 3) {

                if (Devolucao.size() >= 1) {

                    Livro livroDevolvido = Devolucao.peek();

                    String soun = null;

                    System.out.println("\nO livro que voce tem emprestado eh: " + Devolucao.toString());
                    System.out.println("tem certeza que deseja devolver esse livro? S/N " +
                            "\ndigite S para devolver ou N para cancelar essa acao");
                    soun = input.nextLine();

                    switch (soun) {
                        case "s":
                            livroDevolvido = Devolucao.poll();
                            Biblioteca.add(livroDevolvido);

                            System.out.println("O livro " + livroDevolvido + " foi devolvido a nossa biblioteca");
                            break;

                        case "n":
                            System.out.println("Ação cancelada. Você ainda possui o livro emprestado.");
                            break;

                        default:
                            System.out.println("Opcao invalida. Operacao cancelada");
                    }

                } else {
                    System.out.println("\nVoce nao tem nenhum livro emprestado no momento");
                }

            }

            if (comando == 4) {

                String procurar = null;

                System.out.print("\nDigite o titulo do livro que voce esta procurando: ");
                procurar = input.nextLine().toLowerCase();

                boolean encontrado = false;

                for (Livro livro : Biblioteca) {
                    if (livro.getTituloDoLivro().toLowerCase().equals(procurar)) {
                        System.out.println("\n\uD83D\uDCD6O livro '" + livro.getTituloDoLivro() + "' esta disponivel na nossa biblioteca ");
                        encontrado = true;
                        break;
                    }

                }

                if (!encontrado) {
                    System.out.println("\n Livro' " + procurar + "' não encontrado na nossa biblioteca.");
                }
            }
        }

        System.out.println("\nProgama finalizado, ate a proxima \uD83D\uDC4B \uD83D\uDCDA");
        input.close();


    }
}
