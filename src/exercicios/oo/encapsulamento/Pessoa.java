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
        if (idade <= 0 || idade > 150) {
            throw new IllegalArgumentException("A idade esta errada ");
        }
            this.idade = idade;
    }

    public String getCPF() {
        return CPF;
    }

    public String getCPFformatado() {
        return CPF.substring(0, 3) + "." +
                CPF.substring(3, 6) + "." +
                CPF.substring(6, 9) + "-" +
                CPF.substring(9, 11);
    }

    public void setCPF(String CPF) {

        if (CPF == null) {
            throw new IllegalArgumentException("O CPF esta errado");
        }

        CPF = CPF.replace(".", "");
        CPF = CPF.replace("-", "");
        CPF = CPF.trim();

        if (CPF.length() != 11) {
            throw new IllegalArgumentException("O CPF esta errado");
        }


        for (char n : CPF.toCharArray()){

            if (!Character.isDigit(n)){
                throw new IllegalArgumentException("O CPF esta errado");
            }

        }

        this.CPF = CPF;
    }

    public String imprimirDados(){
        return "Nome: " + getNome() + "\nCPF: " + getCPFformatado() + "\nIdade: " + getIdade();
    }
}
