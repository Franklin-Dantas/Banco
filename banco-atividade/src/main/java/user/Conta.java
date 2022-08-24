package user;

public class Conta {
  //Atributos
  private String numeroDaConta;
  private double saldo;
  private String clienteNome;
  private TipoDeConta tipoDeConta;

  //Construtor
  public Conta (String numeroDaConta, String clienteNome, TipoDeConta tipoDeConta){
    this.numeroDaConta = numeroDaConta;
    this.saldo = 0;
    this.clienteNome = clienteNome;
    this.tipoDeConta = tipoDeConta;
  }
  public void deposito( double valor){
    saldo += valor;
  }
  public void saque (double valor){
    if (saldo >= valor){
      saldo -= valor;
    }
  }

  //Getters
  public double getSaldo(){
    return this.saldo;
  }

  public String getNumeroDaConta(){
    return this.numeroDaConta;
  }
}
