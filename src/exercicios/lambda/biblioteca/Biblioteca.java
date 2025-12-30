package exercicios.lambda.biblioteca;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Biblioteca {

    private Map<String, Livro> livros = new HashMap<>();

    private ArrayList<Emprestimo> livrosEmprestas = new ArrayList<>();

    public Biblioteca() {
    }


    public void acervo(){
        Autor Dostoievsk = new Autor("Dostoievsk");
        Livro crimeeCastigo = new Livro(Dostoievsk, "1234","Crime e Castigo", "Romance", LocalDate.of(1866,12,14));

        adicionarLivro(crimeeCastigo);
    }

    public void adicionarLivro(Livro livro) {
        livros.put(livro.getISBN(), livro);
    }

    public void emprestarLivro(Leitor leitor, Livro livro) {

        if (isLivroDisponivel(livro)) {
            Emprestimo novoEmprestimo = new Emprestimo(leitor, livro, LocalDate.now());
            livrosEmprestas.add(novoEmprestimo);

        } else {
            throw new IllegalArgumentException("Livro indisponivel");
        }
    }

    public void devolverLivro(Livro livro) {

        Emprestimo emprestimoParaRemover = null;

        for (Emprestimo e : livrosEmprestas) {
            if (e.getLivroEmprestado() == livro) {
                emprestimoParaRemover = e;
                break;
            }
        }

        if (emprestimoParaRemover != null) {
            livrosEmprestas.remove(emprestimoParaRemover);
        } else {
            throw new IllegalArgumentException("Livro nao esta emprestado");
        }
    }

    private boolean isLivroDisponivel(Livro livro) {

//        for (Emprestimo livroEmprestado : livrosEmprestas) {
//
//            if (livroEmprestado.getLivroEmprestado() == livro) {
//                return false;
//            }
//        }

        return livrosEmprestas.stream().noneMatch(e -> e.getLivroEmprestado() == livro);
    }

    public Map<String, Livro> getLivros() {
        return livros;
    }

    public void setLivros(Map<String, Livro> livros) {
        this.livros = livros;
    }

    public ArrayList<Emprestimo> getLivrosEmprestas() {
        return livrosEmprestas;
    }

    public void setLivrosEmprestas(ArrayList<Emprestimo> livrosEmprestas) {
        this.livrosEmprestas = livrosEmprestas;
    }
}

