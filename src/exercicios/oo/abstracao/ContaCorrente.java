package exercicios.oo.abstracao;

public class ContaCorrente extends Conta implements Sacaedeposito {

    double limite;

    ContaCorrente(String titular, int numero, double saldo ,double limite){
        this.setTitular(titular);
        this.setNumero(numero);
        this.setSaldo(saldo);
        this.limite = limite;

    }

    @Override
    public double sacar(double valorDoSaque) {

        if (valorDoSaque <= 0) {
            throw new IllegalArgumentException("Valor de saque inválido");
        }

        if (valorDoSaque > getSaldo()) {
            throw new IllegalArgumentException("Saldo insuficiente");
        }

        double novoSaldo = getSaldo() - valorDoSaque;
        setSaldo(novoSaldo);

        return novoSaldo;
    }

    @Override
    public double deposito(double valordeposito) {

        double novoSaldo = getSaldo() + valordeposito;
        setSaldo(novoSaldo);
        return novoSaldo;
    }

    @Override
    public String toString() {
        return String.format(super.toString() + "\nlimite = %.0f", limite);
    }
}
