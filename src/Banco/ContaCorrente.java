package Banco;

public class ContaCorrente extends ContaBancaria {
    private double limite;

    public ContaCorrente(double saldo, double limite) {
        super(saldo);
        this.limite = limite;
    }

    @Override
    public boolean sacar(double valor) {
        if (getSaldo() + this.limite >= valor) {
            depositar(-valor); // Subtrai o valor do saldo
            return true;
        } else {
            System.out.println("Saldo insuficiente.");
            return false;
        }       
    }
}
