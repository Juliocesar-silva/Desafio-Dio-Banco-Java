import java.util.Scanner;
public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String espaco = scanner.nextLine();

        System.out.println("Digite seu nome: ");
        String nomecliente = scanner.next();
        System.out.println(espaco);

        System.out.println("Digite o número da Conta: ");
        int numerodaconta = scanner.nextInt();
        System.out.println(espaco);

        System.out.println("Digite o número da Agência: ");
        String agencia = scanner.next();
        System.out.println(espaco);
        
        System.out.println("Digite seu saldo: ");
        Double saldo = scanner.nextDouble();
        
        String MostrarDados = "Olá "+nomecliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numerodaconta+" e seu saldo "+saldo+" já está disponível para saque!";
        System.out.println(MostrarDados);

        scanner.close();

    }
}