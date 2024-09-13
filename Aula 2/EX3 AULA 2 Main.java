//Definir a classe Pessoal
class Pessoa {
  // atributos da classe
  String nome;
  int idade;

  // Constructor para inicializar os atributos
  public Pessoa(String nome, int idade) {
    this.nome = nome;
    this.idade = idade;
  }

  // Metodo para exibir as informações da pessoa
  public void exibirInformacoes() {
    System.out.println("Nome: " + nome);
    System.out.println("Idade: " + idade);
  }
}

public class Main {
  public static void main(String[] args) {
    // Criar um objeto Pessoa
    Pessoa pessoa1 = new Pessoa("Francisco ", 17);
    Pessoa pessoa2 = new Pessoa("Enzo ", 18);
    Pessoa pessoa3 = new Pessoa("Jonathan ", 17);
    pessoa1.exibirInformacoes();
    pessoa2.exibirInformacoes();
    pessoa3.exibirInformacoes();
  }
}
