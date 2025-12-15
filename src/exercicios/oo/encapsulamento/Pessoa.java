package exercicios.oo.encapsulamento;

public class Pessoa {

    private String nome;
    private int idade;
    private String CPF;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {

        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("O nome nao pode ser vazio");
        }


        this.nome = nome.trim();
    }



    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade >= 0 && idade < 150) {
            this.idade = idade;
        }
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        if (CPF == null || CPF.()) {
            throw new IllegalArgumentException("O CPF esta errado");
        }
        this.CPF = CPF;
    }
}
