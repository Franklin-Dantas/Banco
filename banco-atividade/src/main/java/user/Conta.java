package user;

public class Conta {
  //Atributos
  private String accountNumber;
  private double balance;
  private String clientName;
  private TipoDeConta tipoDeConta;

  //Construtor
  public Conta (String accountNumber, String clientName, TipoDeConta tipoDeConta){
    this.accountNumber = accountNumber;
    this.balance = 0;
    this.clientName = clientName;
    this.tipoDeConta = tipoDeConta;
  }
  public void deposit( double value){
    balance += value;
  }
  public void withdraw (double value){
    if (balance >= value){
      balance -= value;
    }
  }

  //Getters
  public double getBalance(){
    return this.balance;
  }

  public String getAccountNumber(){
    return this.accountNumber;
  }
}
