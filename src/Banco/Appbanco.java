package Banco;
import java.util.Scanner;

public class Appbanco {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== ABERTURA DE CONTA ===");
        System.out.println("1 - Conta Corrente");
        System.out.println("2 - Conta Poupança");
        System.out.println("3 - Conta Salário");
        System.out.print("Escolha o tipo de conta: ");
        int escolha = scanner.nextInt();

        ContaBancaria conta;

        switch (escolha) {
            case 1:
                System.out.print("Digite o saldo inicial da Conta Corrente: ");
                double saldoCorrente = scanner.nextDouble();
                System.out.print("Digite o limite da Conta Corrente: ");
                double limite = scanner.nextDouble();
                conta = new ContaCorrente(saldoCorrente, limite);
                break;
            case 2:
                System.out.print("Digite o saldo inicial da Conta Poupança: ");
                double saldoPoupanca = scanner.nextDouble();
                System.out.print("Digite a taxa de juros da Conta Poupança (em decimal): ");
                double taxaJuros = scanner.nextDouble();
                conta = new ContaPoupanca(saldoPoupanca, taxaJuros);
                break;
            case 3:
                System.out.print("Digite o saldo inicial da Conta Salário: ");
                double saldoSalario = scanner.nextDouble();
                System.out.print("Digite o nome da empresa: ");
                String empresa = scanner.next();
                conta = new ContaSalario(saldoSalario, empresa);
                break;
            
            default:
                System.out.println("Opção inválida.");
                scanner.close();
                return;
        }

        // Exemplo de operações com a conta
        conta.exibirSaldo();
        System.out.print("Digite um valor para depositar: ");
        double valorDeposito = scanner.nextDouble();
        conta.depositar(valorDeposito);
        conta.exibirSaldo();

        System.out.print("Digite um valor para sacar: ");
        double valorSaque = scanner.nextDouble();
        if (conta.sacar(valorSaque)) {
            System.out.println("Saque realizado com sucesso.");
        } else {
            System.out.println("Falha ao realizar o saque.");
        }
        conta.exibirSaldo();

        // Se for uma Conta Poupança, aplicar juros
        if (conta instanceof ContaPoupanca) {
            ((ContaPoupanca) conta).aplicarJuros();
            System.out.println("Juros aplicados.");
            conta.exibirSaldo();
        }

        scanner.close();
    }
}

