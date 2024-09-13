import java.util.Scanner;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    // criando uma instancia de Scanner
    Scanner scanner = new Scanner(System.in);

    // solicitando o tamanho do Array
    System.out.println("Quantos números voce deseja inserir ?");
    int tamanho = scanner.nextInt();

    // criando o Array
    int[] numeros = new int[tamanho];

    // inserindo os números no Array
    for (int i = 0; i < numeros.length; i++) {
      System.out.println("Digite o número " + (i + 1) + ": ");
      numeros[i] = scanner.nextInt();
    }
    // ordenando o Array com o sort
    Arrays.sort(numeros);

    // exibindo todos os numeros do array
    for (int i = 0; i < tamanho; i++) {
      System.out.println(numeros[i]);
    }
    // fechando o scanner
    scanner.close();
  }

}