import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Locale local = Locale.of("pt", "BR");
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;
        StringBuilder mensagem = new StringBuilder();

        System.out.print("Por favor, digite o número da agência: ");
        agencia = scanner.next();

        System.out.print("Por favor, digite o número da sua conta: ");
        numero = scanner.nextInt();

        System.out.print("Por favor, digite seu nome: ");
        nomeCliente = scanner.next();

        System.out.print("Por favor, digite o valor do depósito: ");
        saldo = scanner.nextDouble();
        
        mensagem.append("Olá ")
            .append(nomeCliente)
            .append(", obrigado por criar uma conta em nosso banco, sua agência é ")
            .append(agencia)
            .append(", conta ")
            .append(numero)
            .append(" e seu saldo R$")
            .append(String.format("%.2f", saldo))
            .append(" já está disponível para saque.");

        System.out.println(mensagem.toString());

        scanner.close();
    }
}
