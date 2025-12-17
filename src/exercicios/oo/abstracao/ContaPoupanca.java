package exercicios.oo.abstracao;

public class ContaPoupanca extends Conta implements Sacaedeposito{

    double taxaRendimento;

    @Override
    public double sacar(double valordosaque) {

        if (valordosaque <= saldo){
         return saldo = saldo - valordosaque;
        } else {
            return saldo = 0;
        }
    }

    @Override
    public double deposito(double valordeposito) {
        return saldo = valordeposito + saldo;
    }

    ContaPoupanca(String titular, int numero, double saldo ,double TaxaRendimento){
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;
        this.taxaRendimento = TaxaRendimento;

    }
}
