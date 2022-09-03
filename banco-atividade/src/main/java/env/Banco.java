package env;

import java.util.ArrayList;
import user.*;

public class Banco {
  private ArrayList<Conta> contas;

  public Banco() {
    this.contas = new ArrayList();
  }

  private boolean contaExistente(String numeroConta) {
    if (getConta(numeroConta) == null) {
      return false;
    }
    return true;
  }

  public void realizarDepositoEmConta(double valor, String nConta) {
    Conta conta = getConta(nConta);
    if (conta != null) {
      conta.deposit(valor);
    }
  }

  private Conta getConta(String nConta) {
    for (Conta conta : contas) {
      if (conta.getNumeroConta() == nConta) {
        return conta;
      }
    }
    return null;
  }

  public void realizarSaqueEmConta (double valor, String nConta){
    Conta conta = getConta(nConta);
    if (conta != null){
      conta.saque(valor);
    } else {
      System.out.println("Conta inexistente");
    }
  }


  public void criarConta(String accountNumber, String userName) {
    if (!contaExistente(accountNumber)) {
      Conta conta = new Conta(accountNumber, userName);
      contas.add(conta);
    }
  }

  public int getNumeroContas() {
    return contas.size();
  }

  public double consultarSaldoEmConta(String nConta) {
    double saldo = 0;
    for (Conta conta : contas) {
      saldo += conta.getSaldo();
    }
    return saldo;
  }

  public boolean removerConta(String numeroConta) {
    Conta conta = getConta(numeroConta);
    if (conta != null) {
      contas.remove(conta);
      return true;
    }
    return false;
  }
}
