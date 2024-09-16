public class Main {
  public static void main(String[] args) {

    // Instanciando o objeto Pessoa
    Pessoa pessoa1 = new Pessoa("João", 25);
    Pessoa pessoa2 = new Pessoa("Ana", 5);
    Pessoa pessoa3 = new Pessoa("Vitor", 21);

    System.out.println(pessoa1.exibirInfo());
    System.out.println(pessoa1.getNome());
    System.out.println(pessoa1.getIdade());
  }
}