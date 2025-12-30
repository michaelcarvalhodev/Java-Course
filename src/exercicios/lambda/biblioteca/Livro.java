package exercicios.lambda.biblioteca;

import java.time.LocalDate;

public class Livro {

    private Autor autor;
    private String ISBN;
    private String titulo;
    private String genero;
    private LocalDate dataLancamento;

    public Livro(Autor autor,String ISBN, String titulo, String genero, LocalDate dataLancamento){
        this.autor = autor;
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.genero = genero;
        this.dataLancamento = dataLancamento;
    }

    public void setISBN(String ISBN){this.ISBN = ISBN;}

    public String getISBN(){return ISBN;}

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }


    public void setDataLancamento (LocalDate dataLancamento){
        this.dataLancamento = dataLancamento;
    }

    public LocalDate getdataLancamento(){
        return dataLancamento;
    }
}
