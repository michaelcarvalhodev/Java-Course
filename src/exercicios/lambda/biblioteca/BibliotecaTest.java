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
                    System.out.println("\nDigite o numero do livro que voce quer empretado: ");
                    System.out.println(biblioteca.livrosDetalhes());

                    System.out.print("Numero do livro: ");
                    int numeroLivroEmprestado = input.nextInt();


                    biblioteca.emprestarLivro(novoLeitor, biblioteca.getLivroPorNumero(numeroLivroEmprestado));

                    break;

                case 4:

//                    System.out.println();
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


//        System.out.print("\n\n Digite seu nome: ");
//        String leitornome = input.nextLine();
//
//        System.out.print("Digite seu CPF: ");
//        String leitorcpf = input.nextLine();
//
//        Leitor leitor01 = new Leitor(leitornome,leitorcpf);


        input.close();

    }
}
