import java.util.Scanner;

public class Menu {
 
    public static void main (String [] args){
        Scanner in = new Scanner (System.in);
        Banco banco = new Banco();
        String numeroDaConta, clienteNome;
        int op,valor;
        System.out.println("Selecione uma das seguintes opções");
        System.out.println("1. Criar Conta");
        System.out.println("2. Consultar saldo");   
        System.out.println("3. Realizar saque");
        System.out.println("4. Realizar depósito");
        System.out.println("");
        op = in.nextInt();
        System.out.println("Você escolheu a opção: " + op);
        if(op == 1){
            System.out.println("Informe o número da conta: ");
            numeroDaConta = in.nextLine();
            System.out.println("Seu número da conta é: " + numeroDaConta);
            System.out.println("Informe o nome do Cliente: ");
            clienteNome = in.nextLine();
            System.out.println("Seu nome é: " + clienteNome);
            banco.criarConta(numeroDaConta, clienteNome);
        }else if (op == 2){
            System.out.println("Informe o número da conta: ");
            numeroDaConta = in.nextLine();
            System.out.println(numeroDaConta.getSaldo());

        }else if (op == 3){
            System.out.println("Informe o número da conta: ");
            numeroDaConta = in.nextLine();
            System.out.println("Informe o valor a ser depositado: ");
            valor = in.nextInt();
            numeroDaConta.realizarDepositoEmConta(valor);
        }else if (op == 4){
            System.out.println("Informe o número da conta: ");
            numeroDaConta = in.nextLine();
            System.out.println("Informe o valor a ser sacado: ");
            valor = in.nextInt();
            numeroDaConta.realizarSaqueEmConta(valor);
        }
        else {
            System.out.println("Informe um numero valido");
        }
    }
}