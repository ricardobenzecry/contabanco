import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Por favor, insira seu nome primeiro nome: ");
        String primeiroNome = sc.next();

        System.out.println("Por favor, insira seu nome último nome: ");
        String ultimoNome = sc.next();

        System.out.println("Por favor, insira o número da sua agência: ");
        String numAgencia = sc.next();

        System.out.println("Por favor, insira o número da sua conta: ");
        int numConta = sc.nextInt();

        System.out.println("Por favor, digite seu saldo:");
        double saldo = sc.nextDouble();

        String nomeCliente = primeiroNome + " " + ultimoNome;

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numAgencia + 
        ", conta " + numConta + " e seu saldo " + saldo + " já está disponível para saque");
        
      }

    }
