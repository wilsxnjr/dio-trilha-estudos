import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int numero;
        String agencia, nome;
        double saldo;

        System.out.println("Por favor, insira o número de conta: ");
        numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, insira o número da agência: ");
        agencia = scanner.nextLine();
        
        System.out.println("Por favor, insira o nome do cliente: ");
        nome = scanner.nextLine();

        System.out.println("Por favor, insira o saldo do cliente: ");
        saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();

    }
}
