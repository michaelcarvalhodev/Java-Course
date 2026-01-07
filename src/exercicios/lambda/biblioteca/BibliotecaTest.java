package exercicios.lambda.biblioteca;

import java.time.LocalDate;
import java.util.Scanner;

public class BibliotecaTest {

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        biblioteca.acervo();

        Scanner input = new Scanner(System.in);

        System.out.print("\n----------------------------");
        System.out.print("\nBem vinde a nossa biblioteca");
        System.out.print("\n----------------------------");


        System.out.print("\nQual seu nome: ");
        String leitorNome = input.nextLine();

        System.out.print("\nQual seu CPF: ");
        String leitorCPF = input.nextLine();

        Leitor novoLeitor = new Leitor(leitorNome, leitorCPF);
        System.out.println("Ola " + novoLeitor.getNome());


        int opcao;

        do {

            System.out.println("\nMenu \ndigite:");
            System.out.println("1 - Para ver os livros disponiveis");
            System.out.println("2 - Para pegar um livro emprestado um livro");
            System.out.println("3 - Para devolver um livro");
            System.out.println("4 - Para cadastrar um novo livro");
            System.out.println("0 - Para finalizar o progama");
            System.out.print("Escolha uma opcao: ");

            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    biblioteca.listarLivros();
                    break;

                case 2:
                    System.out.println("\n--- Emprestimo ---");
                    System.out.println(biblioteca.livrosDetalhes());

                    System.out.print("Digite o numero do livro que você quer: ");
                    int numeroEscolhido = input.nextInt();
                    input.nextLine();

                    Livro livroSelecionado = biblioteca.getLivroPorNumero(numeroEscolhido);

                    if (livroSelecionado != null) {

                        try {
                            biblioteca.emprestarLivro(novoLeitor, livroSelecionado);
                            System.out.println(" Voce pegou: " + livroSelecionado.getTitulo());
                        } catch (Exception e) {
                            System.out.println("Erro ao emprestar: " + e.getMessage());
                        }
                    } else {
                        System.out.println("Numero de livro invalido!");
                    }
                    break;


                case 3:

                    Emprestimo emprestimoExistente = biblioteca.buscarEmprestimo(novoLeitor);

                    if (emprestimoExistente != null) {

                        System.out.println("Voce tem um livro emprestado: " + emprestimoExistente.getLivroEmprestado().getTitulo());
                        System.out.print("Deseja devolver este livro agora? (1-Sim / 2-Não): ");
                        int soun = input.nextInt();
                        if (soun == 1) {
                            System.out.println("o livro " + emprestimoExistente.getLivroEmprestado().getTitulo() + " foi devolvido");
                            biblioteca.devolverLivro(emprestimoExistente.getLivroEmprestado());
                        } else  {

                            System.out.println("Ok, voce ainda tem a posse do livro " + emprestimoExistente.getLivroEmprestado().getTitulo());
                        }

                    } else {
                        System.out.println("Voce nao tem livros no momento");
                    }
                    break;


                case 4:

                    input.nextLine();
                    System.out.print("Qual o autor do livro?: ");
                    String nomeAutor = input.nextLine();

                    System.out.print("Qual o ISBN do livro?: ");
                    String ISBNlivro = input.nextLine();

                    System.out.print("Qual o titulo do livro?: ");
                    String tituloLivro = input.nextLine();

                    System.out.print("Qual o genero do livro?: ");
                    String generoLivro = input.nextLine();

                    System.out.print("Qual a data de lancamento do livro? (formato AAAA-MM-DD): ");
                    String dataTexto = input.nextLine();
                    LocalDate dataLancamento = LocalDate.parse(dataTexto);

                    Autor novoAutor = new Autor(nomeAutor);
                    Livro novoLivro = new Livro(novoAutor, ISBNlivro, tituloLivro, generoLivro, dataLancamento);

                    biblioteca.adicionarLivro(novoLivro);

                    System.out.println("Livro cadastrado");


                    break;


            }


        } while (opcao != 0);

        System.out.println("Finalizando o progama ...");


        input.close();

    }
}
