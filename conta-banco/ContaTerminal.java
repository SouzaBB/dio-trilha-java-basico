import java.util.Scanner;

public class ContaTerminal {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int numeroConta;
    String agencia;
    String nomeCliente;

    double saldo = 237.48;

    System.out.print("Digite seu nome: ");
    nomeCliente = scanner.next();

    System.out.print("Digite sua agência: ");
    agencia = scanner.next();

    System.out.print("Digite o numero de sua conta: ");
    numeroConta = scanner.nextInt();

    System.out.print("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo de " + saldo + " já está disponível para saque");
  
  }
}