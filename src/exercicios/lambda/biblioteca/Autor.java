package exercicios.lambda.biblioteca;

import java.util.ArrayList;

public class Autor {

    private String nome;

    Autor(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    ArrayList<Livro> livros = new ArrayList<>();

}
