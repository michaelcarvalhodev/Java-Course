package exercicios.lambda.biblioteca;

import java.time.LocalDate;
import java.util.Scanner;

public class BibliotecaTest {

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        Scanner input = new Scanner(System.in);

        System.out.print("\n----------------------------");
        System.out.print("\nBem vinde a nossa biblioteca");
        System.out.print("\n----------------------------");

        System.out.print("\n\n Digite seu nome: ");
        String leitornome = input.nextLine();

        System.out.print("Digite seu CPF: ");
        String leitorcpf = input.nextLine();

        Leitor leitor01 = new Leitor(leitornome,leitorcpf);


        input.close();
//        Leitor michael = new Leitor("Michael", "12345678911");
//
//        Autor dodo = new Autor("Dostoievsk");
//
//        Livro crimeeCastigo = new Livro(dodo, "1234","Crime e Castigo", "Romance", LocalDate.of(1866,12,14));
//
//        biblioteca.emprestarLivro(michael, crimeeCastigo);
//
//        biblioteca.devolverLivro(crimeeCastigo);
//
//        biblioteca.emprestarLivro(michael, crimeeCastigo);

    }
}
