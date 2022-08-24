package env;

import java.util.ArrayList;
import user.*;

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

  public static void main(String[] args) {
    Banco banco = new Banco();
    banco.criarConta("1234","Geraldao");

    Conta geraldao = new Conta("1234","Geraldao", TipoDeConta.Corrente);
    System.out.println(geraldao.getSaldo());
    geraldao.deposito(10000);
    System.out.println(geraldao.getSaldo());
    geraldao.saque(500);
    System.out.println(geraldao.getSaldo());
  }

}
