import banco.Banco;
import banco.Cliente;
import banco.Conta;
import banco.ContaCorrente;

public class App {
  public static void main(String[] args) {
    Banco javaBank = new Banco("JavaBank");
    Cliente cliente1 = new Cliente("Lucas de Melo Silva");
    Cliente cliente2 = new Cliente("Luana d'Mello");

    Conta contaLucas = new ContaCorrente(cliente1);
    Conta contaLuana = new ContaCorrente(cliente2);

    contaLucas.saldo();
    contaLucas.depositar(1000);
    contaLucas.saldo();
    contaLucas.sacar(200);
    contaLucas.saldo();
    contaLucas.transferir(500, contaLuana);
    contaLuana.saldo();
    contaLucas.saldo();
  }  
}
