package exercicios.oo.abstracao;

public class ContaPoupanca extends Conta implements Sacaedeposito {

    double taxaRendimento;

    ContaPoupanca(String titular, int numero, double saldo, double TaxaRendimento) {
        this.setTitular(titular);
        this.setNumero(numero);
        this.setSaldo(saldo);
        this.taxaRendimento = TaxaRendimento;

    }

    @Override
    public double sacar(double valordosaque) {

        if (valordosaque > getSaldo()) {
            throw new IllegalArgumentException("Saldo insuficiente");
        }

        if (valordosaque <= 0) {
            throw new IllegalArgumentException("Valor invalido");
        }

        double novoValor = getSaldo() - valordosaque;
        setSaldo(novoValor);
        return novoValor;

    }

    @Override
    public double deposito(double valordeposito) {

        double novoSaldo = getSaldo() + valordeposito;
        setSaldo(novoSaldo);
        return novoSaldo;
    }

    @Override
    public String toString() {
        return String.format(super.toString() + "\nrendimento = %.0f", taxaRendimento);
    }
}
