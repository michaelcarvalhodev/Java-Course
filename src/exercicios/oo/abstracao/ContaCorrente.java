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
    public double sacar(double valordosaque) {

        if (valordosaque <= getSaldo()){
            return getSaldo() = getSaldo() - valordosaque;


        } else {
            throw new IllegalArgumentException("Saque maior do que o dinheiro na conta");
        }
    }

    @Override
    public double deposito(double valordeposito) {
        return saldo = valordeposito + saldo;
    }
}
