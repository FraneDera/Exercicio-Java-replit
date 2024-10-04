import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Menu de opcoes
    System.out.println("Escolha uma opção:");
    System.out.println("1. Calcular a area do quadrado");
    System.out.println("2. Calcular a area do circulo");
    int escolha = scanner.nextInt();

    switch (escolha) {
      case 1:

        System.out.println("Digite o lado do quadrado:");
        double lado = scanner.nextDouble();
        double areaQuadrado = lado * lado;
        System.out.println("A area do quadrado é: %.2f%n" + areaQuadrado);
        break;

      case 2:

        System.out.println("Digite o raio do circulo:");
        double raio = scanner.nextDouble();
        double areaCirculo = Math.PI * raio * raio;
        System.out.println("A area do circulo é: %.2f%n" + areaCirculo);
        break;

      default:
        System.out.println("Opção invalida , tente novamente!");

        scanner.close();
    }
  }
}