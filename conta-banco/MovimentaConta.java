import java.util.Locale;
import java.util.Scanner;

public class MovimentaConta {
  public static void main(String[] args) {
    
    /* 
    .useLocale(Locale.US) diz que estamos trabalhando com sistema decimal dos EUA
    Esse parâmetro é importante no caso de realizar operações com double
    */

    // Scanner lê o input do usuário
    Scanner scan = new Scanner(System.in).useLocale(Locale.US);

    double saque;
    double deposito;
    int movimentação;
    double saldo = 1000.00;
    double limite = 200.00;
    double limiteUtilizado;
    double limiteEstourado;

    // selecionar opção: saque, depósito ou ver saldo
    System.out.print("Selecione a opção desejada: Saque [1], Depósito [2] ou Saldo [3]: ");
    movimentação = scan.nextInt();

    switch (movimentação) {
      case 1:
      System.out.print("Digite o valor de saque desejado: ");
      saque = scan.nextDouble();
        if (saque <= saldo) {
          saldo = saldo - saque;
          System.out.print("Seu novo saldo é de R$" + saldo);

        } else if (saque > saldo && saque < saldo + limite) {
          limiteUtilizado = limite + (saldo - saque);
          limite = limite - limiteUtilizado;
          System.out.println("Você está utilizando R$" + limiteUtilizado + " do seu limite, seu limite atual é de R$" + limite);
        
        } else if (saque > saldo + limite) {
          limiteEstourado = saque - (saldo + limite);
          System.out.println("Você estourou seu limite em R$" + limiteEstourado);
        }
      break;

      case 2:
      System.out.print("Digite o valor do depósito desejado: ");
      deposito = scan.nextDouble();
      saldo = saldo + deposito;
      System.out.print("Seu novo saldo é de R$" + saldo);
      break;

      case 3:
      System.out.print("Seu saldo é de R$" + saldo + 
      ". Você possui limite disponível de R$" + limite);
      break;

      default:
      System.out.println("Digite uma opção válida");

    }
  }
}      
      
    /*
    Usando as condições 'if' e 'else if' para as opções de entrada
    Nessa caso, a variável 'movimentação' deve ser uma String

    if (movimentação.equals("Saque")) {
      System.out.print("Digite o valor de saque desejado: ");
      saque = scan.nextDouble();
      saldo = saldo - saque;
      System.out.print("Seu novo saldo é de R$" + saldo);

    } else if (movimentação.equals("Depósito")) {
      System.out.print("Digite o valor do depósito desejado: ");
      deposito = scan.nextDouble();
      saldo = saldo + deposito;
      System.out.print("Seu novo saldo é de R$" + saldo);

    } else if (movimentação.equals("Saldo")) {
      System.out.print("Seu saldo é de R$" + saldo + 
      ". Você possui limite disponível de R$" + limite);
    
    } else {
      System.out.println("Digite uma opção válida.");
    }  
*/
