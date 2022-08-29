import java.util.ArrayList;


public class Banco {
  private ArrayList<Conta> conta;

  public Banco() {
    this.conta = new ArrayList();
  }

  private boolean contaExistente(String numeroDaConta){
    if(getConta(numeroDaConta) == null){
      return false;
    }
    return true;
  }

  public void realizarDepositoEmConta(double valor, String nConta){
    Conta conta = getConta(nConta);
    if (conta != null){
      conta.deposito(valor);
    }
  }

  private Conta getConta(String nConta) {
    for(Conta conta: conta){
      if(conta.getNumeroDaConta() == nConta){
        return conta;
      }
    }
    return null;
  }

  public void realizarSaqueEmConta (double valor, String nConta){
    Conta conta = getConta(nConta);
    if (conta != null){
      conta.saque(valor);
    }
  }

  public void criarConta(String numeroDaConta, String clienteNome){
    if (!contaExistente(numeroDaConta)){
      conta.add(new Conta(numeroDaConta, clienteNome, TipoDeConta.Corrente));
    }
  }

}
