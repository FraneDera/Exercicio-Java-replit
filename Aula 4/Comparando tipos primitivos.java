import java.util.Scanner;

//comparando passos primitivos que serao informados pelo usuario 

public class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    // solicitando um dado de entrada
    System.out.println("Digite alguma coisa");
    String dadoDigitado = entrada.nextLine();

    // tentando converter o valor digitado em um número inteiro
    try {
      int numero = Integer.parseInt(dadoDigitado);
      System.out.println("Você digitou um número inteiro");
    } catch (NumberFormatException e) {
      System.out.println("Você digitou uma string");
    }
    entrada.close();
  }
}