package exercicios.listas.biblioteca;

public class Livro implements Comparable<Livro> {
    public String tituloDoLivro;
    public String autorDoLivro;
    public int idLivro;

    public Livro(String tituloDoLivro, String autorDoLivro, int idLivro) {
        this.tituloDoLivro = tituloDoLivro;
        this.autorDoLivro = autorDoLivro;
        this.idLivro = idLivro;
    }

    public String getTituloDoLivro() {
        return tituloDoLivro;
    }

    public int getiDLivro() {
        return getiDLivro();
    }


    @Override
    public int compareTo(Livro outroLivro) {
        return this.tituloDoLivro.compareToIgnoreCase(outroLivro.getTituloDoLivro());
    }

    @Override
    public String toString() {
        return String.format("\n Título: %s\n️ Autor: %s\n ID: %d\n", tituloDoLivro, autorDoLivro, idLivro);
    }

}

