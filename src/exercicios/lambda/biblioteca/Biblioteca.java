package exercicios.lambda.biblioteca;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Biblioteca {

    private Map<String, Livro> livros = new HashMap<>();

    private ArrayList<Emprestimo> livrosEmprestas = new ArrayList<>();

    public Biblioteca() {
    }


    public void acervo() {
        Autor Dostoievsk = new Autor("Dostoievsk");
        Livro CrimeeCastigo = new Livro(Dostoievsk, "1234", "Crime e Castigo", "Romance", LocalDate.of(1866, 12, 14));

        Autor Agustinho = new Autor("Agustinho");
        Livro Confissoes = new Livro(Agustinho, "2234", "Confissões", "Autobiográfico ", LocalDate.of(397, 12, 15));

        adicionarLivro(CrimeeCastigo);
        adicionarLivro(Confissoes);
    }

    public void adicionarLivro(Livro livro) {
        livros.put(livro.getISBN(), livro);
    }


    public void listarLivros() {

        livros.values().forEach(l -> System.out.println(l.getTitulo()));
    }

    public String livrosDetalhes() {
        StringBuilder texto = new StringBuilder();
        int cont = 1;

        for (Livro l : livros.values()) {

            texto.append("\nLivro ").append(cont).append("\n");
            texto.append("Titulo: ").append(l.getTitulo()).append("\n");
            texto.append("Autor: ").append(l.getAutor().getNome()).append("\n");
            texto.append("Genero: ").append(l.getGenero()).append("\n");
            texto.append("Data de Lancamento: ").append(l.getdataLancamento()).append("\n");


            cont++;
        }

        return texto.toString();
    }


    public void emprestarLivro(Leitor leitor, Livro livro) {

        if (isLivroDisponivel(livro) && buscarEmprestimo(leitor) == null) {
            Emprestimo novoEmprestimo = new Emprestimo(leitor, livro, LocalDate.now());
            livrosEmprestas.add(novoEmprestimo);

        } else if (buscarEmprestimo(leitor) != null) {
            throw new IllegalArgumentException("Ja possui um livro emprestado");
        }
        else {
            throw new IllegalArgumentException("Livro indisponivel");
        }
    }


    public Livro getLivroPorNumero(int numero) {
        List<Livro> listaTemp = new ArrayList<>(livros.values());

        int indiceReal = numero - 1;

        if (indiceReal >= 0 && indiceReal < listaTemp.size()) {
            return listaTemp.get(indiceReal);
        } else {
            return null;
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

    public Emprestimo buscarEmprestimo(Leitor leitor) {

        for (Emprestimo e : livrosEmprestas) {
            if (e.getQuamPegou().equals(leitor)) {
                return e;
            }
        }
        return null;
    }

    private boolean isLivroDisponivel(Livro livro) {

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

