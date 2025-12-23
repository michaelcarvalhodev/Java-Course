package exercicios.lambda.biblioteca;

import java.time.LocalDate;

public class Emprestimo {

    private Leitor quamPegou;
    private Livro livroEmprestado;
    private LocalDate dataRetirada;
    private LocalDate dataDevolucao;

    public Emprestimo(Leitor quamPegou, Livro livroEmprestado, LocalDate dataRetirada) {
        this.quamPegou = quamPegou;
        this.livroEmprestado = livroEmprestado;
        this.dataRetirada = dataRetirada;
        this.dataDevolucao = dataRetirada.plusDays(10);
    }

    public Leitor getQuamPegou() {
        return quamPegou;
    }

    public void setQuamPegou(Leitor quamPegou) {
        this.quamPegou = quamPegou;
    }

    public Livro getLivroEmprestado() {
        return livroEmprestado;
    }

    public void setLivroEmprestado(Livro livroEmprestado) {
        this.livroEmprestado = livroEmprestado;
    }

    public LocalDate getDataRetirada() {
        return dataRetirada;
    }

    public void setDataRetirada(LocalDate dataRetirada) {
        this.dataRetirada = dataRetirada;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
}
