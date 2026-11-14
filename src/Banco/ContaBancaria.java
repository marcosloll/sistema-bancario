package Banco;

public class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public boolean sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            System.out.println("Saldo insuficiente.");
            return false;
        }
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void exibirSaldo() {
        System.out.printf("Saldo atual: R$ %.2f%n", this.saldo);
    }
}