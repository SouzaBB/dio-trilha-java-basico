import java.util.Scanner;

public class Contador {
  public static void main(String[] args) throws ParametrosInvalidosException {
      Scanner scanner = new Scanner(System.in);
      
      System.out.println("Digite o primeiro número");
      int numeroUm = scanner.nextInt();
  
      System.out.println("Digite o segundo número");
      int numeroDois = scanner.nextInt();
      scanner.close();

      if (numeroUm >= numeroDois) {
        throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
    }
    
    for (int i = numeroUm; i <= numeroDois; i++) {
        System.out.println("Imprimindo o número " + i);
    }     
  }
}
