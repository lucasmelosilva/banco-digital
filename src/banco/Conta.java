package banco;
public abstract class Conta implements IConta {
  protected int agencia;
  protected int numero;
  protected double saldo;
  private Cliente cliente;
  
  public Conta(Cliente cliente) {
    this.cliente = cliente;
  }

  @Override
  public void sacar(double valor) {
    if (valor > this.saldo) {
      System.out.println("saldo insuficiente");
      return;
    }
    this.saldo -= valor;
  }

  @Override
  public void depositar(double valor) {
    if (valor <= 0) {
      System.out.println("valor nao pode ser menor ou igual a zero");
      return;
    }
    this.saldo += valor;
  }

  @Override
  public void transferir(double valor, Conta contaDestino) {
    if (valor > this.saldo) {
      System.out.println("saldo insuficiente");
      return;
    }
    contaDestino.depositar(valor);
    this.saldo -= valor;
  }

  @Override
  public void saldo() {
    System.out.printf("Ola %s seu saldo é R$ %.2f\n", this.cliente.getNome(), this.saldo);
  }
}
