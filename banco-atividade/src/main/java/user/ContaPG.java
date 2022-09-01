package user;

public class ContaPG extends Conta {

    public ContaPG(String accountNumber, String clientName) {
        super(accountNumber, clientName);
    }

    public void withdraw(String nConta, double valor) {
        withdraw(valor - (valor * 0.01));

    }

    public void deposit(double valor, String nConta) {
        deposit(valor - (valor * 0.01));
    }
}
