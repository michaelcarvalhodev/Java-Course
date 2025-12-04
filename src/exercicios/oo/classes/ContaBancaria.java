package exercicios.oo.classes;

public class ContaBancaria {

    String titular;
    int numero;
    double saldo;

    ContaBancaria(String titular, int numero, double saldo){
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;

    }

    double depositar(double valor){
         this.saldo = saldo + valor;
         return this.saldo;
    }

    String sacar (double valor){

        if (saldo >= valor){
            this.saldo = saldo - valor;
            return " Saque feito ";

        } else
            return " Saldo insuficiente ";
    }

    double consultarSaldo(){
        return this.saldo;
    }
}
