package banco;

public class Banco {
  protected String nome;

  public Banco() {
  }

  public Banco(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }
}
