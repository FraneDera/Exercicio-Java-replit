public class Main {
  public static void main(String[] args) {
    int interacoes = 10;
    double pi = 0.0;

    //Iniciando aproximação
    for(int i = 0; i < interacoes; i++){
      if(i % 2 == 0){
        pi += 1.0 / (2 * i + 1);
        System.out.println("Interações " + i + ": " + pi);
      } else {
        pi -= 1.0 / (2 * i + 1);
        System.out.println("Interações " + i + ": " + pi);
      }
    }
    //Multiplicando o resultado por 4
    pi *= 4;
    System.out.println("O número aproximado é: " + pi);
  }
}