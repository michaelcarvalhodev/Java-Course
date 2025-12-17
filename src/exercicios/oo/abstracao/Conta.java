package exercicios.oo.abstracao;

public class Conta {

    private int numero;
    private double saldo;
    private String titular;

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {

        if (titular == null || titular.isBlank()) {
            throw new IllegalArgumentException("O nome do titular nao pode ser vazio");
        }

        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }


    @Override
    public String toString() {
        return "\nInformacoes da Conta: " +
                "\nnumero = " + numero +
                "\nsaldo = " + saldo +
                "\ntitular = '" + titular + '\''
                ;
    }
}
