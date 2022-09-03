package user;

public class Conta {
  //Atributos
  protected String numeroConta;
  protected double saldo;
  protected String nomeCliente;
  protected TipoDeConta tipoDeConta;

  //Construtor
  public Conta (String accountNumber, String clientName){
    this.numeroConta = accountNumber;
    this.saldo = 0;
    this.nomeCliente = clientName;
  }
  public void deposit( double value){
    saldo += value;
  }
  public void withdraw (double value){
    if (saldo >= value){
      saldo -= value;
    }
  }

  //Getters
  public double getSaldo(){
    return this.saldo;
  }
  
  public String getNomeCliente() {
    return this.nomeCliente;
  }
  
  public TipoDeConta getTipoDeConta() {
    return this.tipoDeConta;
  }

  public String getNumeroConta(){
    return this.numeroConta;
  }
  public void saque(double valor) {
  }
  
}