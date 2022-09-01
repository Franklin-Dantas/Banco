package user;

public class Poupanca extends Conta{

  public Poupanca (String accountNumber, String clientName){
    super(accountNumber, clientName);
  }

  public void renderJuros(){
    this.balance += 0.01 * this.balance;
  }

}
