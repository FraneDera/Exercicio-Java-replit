import java.util.Arrays;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    // 1 - criação de um array
    int[] numbers = { 2, 1, 4, 3, 0, 5 };
    System.out.println("Meu array de números: " + Arrays.toString(numbers));

    // 2 - acessando um elemento pelo index[]
    System.out.println("o elemento da posição 2 é: " + numbers[2]);

    // 3- modificando um valor especifico no array
    numbers[3] = 0;
    System.out.println("O elemento da posição 3 é : " + Arrays.toString(numbers));

    // 4 - criando um array de strings
    String[] frutas = { "Pera", "Uva", "Maçã", "Morango", "Uva" };
    // exibindo a lista de frutas
    for (int i = 0; i < frutas.length; i++) {
      System.out.println("Fruta" + (i + 1) + ": " + frutas[i]);
    }
    // 5 - Instanciando um array de strings
    String[] carros = new String[4];

    // adicionando valores ao array
    carros[0] = "Fusca";
    carros[1] = "Golf";
    carros[2] = "Corsa";
    carros[3] = "Palio";
    System.out.println("-------------");
    for (int i = 0; i < carros.length; i++) {
      System.out.println("Carro" + (i + 1) + ": " + carros[i]);
    }

    // 6- ordenando um array ordem crescente
    Arrays.sort(numbers);
    System.out.println("Array ordenado: " + Arrays.toString(numbers));

    Integer[] numeros = { 2, 1, 4, 3, 0, 5 };
    Arrays.sort(numeros, Collections.reverseOrder());
    System.out.println("Array em ordem decrescente: " + Arrays.toString(numeros));

    // 7- Buscando um elemento no array pelo metodo binarySearch
    int index = Arrays.binarySearch(numbers, 5);
    if (index >= 5) {
      System.out.println("Valor encontrado na posição: " + index);
    } else {
      System.out.println("Valor não encontrado");
    }

    // 8- preencher um array com um determinado valor
    int[] lista = new int[5];
    Arrays.fill(lista, 0);
    System.out.println("Lista preenchida : " + Arrays.toString(lista));
  }
}