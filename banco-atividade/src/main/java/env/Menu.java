package env;

import java.util.Scanner;

public class Menu {
    public static void menu() {
        System.out.println("");
        System.out.println("        BEM VINDO AO BANCO DO PATINHO");
        System.out.println("        Escolha uma das opções abaixo:");
        System.out.println("    =====================================");
        System.out.println("    |   1 - Criar novas contas           |");
        System.out.println("    |   2 - Consultar saldo de conta     |");
        System.out.println("    |   3 - Realizar saque de conta      |");
        System.out.println("    |   4 - Realizar depósito de conta   |");
        System.out.println("    |   5 - Transferência entre contas   |");
        System.out.println("    |   0 - Sair do programa             |");
        System.out.println("    =====================================\n");

    }

    public static void main(String[] args) {
        Banco banco = new Banco();
        Scanner in = new Scanner(System.in);

        String numeroConta, numeroContaSaque, numeroContaDeposito;
        double valor;
        String nomeCliente;
        int chave;

        do {
            menu();
            chave = in.nextInt();
            in.nextLine();

            switch (chave) {
                case 1:
                    System.out.println("Digite o número da conta: ");
                    numeroConta = in.next();
                    in.nextLine();
                    System.out.println("Digite o nome do titular da conta: ");
                    nomeCliente = in.next();
                    in.nextLine();
                    banco.criarConta(numeroConta, nomeCliente);
                    break;
                case 2:
                    System.out.println("Digite o número da conta: ");
                    numeroConta = in.next();
                    in.nextLine();
                    banco.consultarSaldoEmConta(numeroConta);
                    break;
                case 3:
                    System.out.println("Digite o número da conta: ");
                    numeroConta = in.next();
                    in.nextLine();
                    System.out.println("Digite o valor do saque: ");
                    valor = in.nextDouble();
                    in.nextLine();
                    banco.realizarSaqueEmConta(valor, numeroConta);
                    System.out.println("Total: ");
                    banco.consultarSaldoEmConta(numeroConta);
                    break;
                case 4:
                    System.out.println("Digite o número da conta: ");
                    numeroConta = in.next();
                    in.nextLine();
                    System.out.println("Digite o valor do depósito: ");
                    valor = in.nextDouble();
                    in.nextLine();
                    banco.realizarDepositoEmConta(valor, numeroConta);
                    System.out.println("Total: ");
                    banco.consultarSaldoEmConta(numeroConta);
                    break;
                case 5:
                    System.out.println("Digite o número da conta que irá transferir: ");
                    numeroContaSaque = in.next();
                    in.nextLine();
                    System.out.println("Digite o número da conta que irá receber a transferência: ");
                    numeroContaDeposito = in.next();
                    in.nextLine();
                    System.out.println("Digite o valor da transferência: ");
                    valor = in.nextDouble();
                    in.nextLine();
                    banco.realizarSaqueEmConta(valor, numeroContaSaque);
                    System.out.print("Conta que tranferiu: ");
                    banco.consultarSaldoEmConta(numeroContaSaque);
                    System.out.print("Conta que recebeu: ");
                    banco.consultarSaldoEmConta(numeroContaDeposito);
                case 0:
                    break;
                default:
                    System.out.println("Digite uma opção inválida!!");
            }
        } while (chave != 0);
    }
}