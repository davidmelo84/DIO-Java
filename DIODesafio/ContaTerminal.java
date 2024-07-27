import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        // Criação do Scanner para ler dados do terminal
        Scanner scanner = new Scanner(System.in);

        // Solicitação e leitura dos dados da conta bancária
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();

        // Limpar o buffer do scanner
        scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo inicial:");
        double saldo = scanner.nextDouble();

        // Mensagem final utilizando concatenação de strings
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " 
                          + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";

        // Exibir mensagem
        System.out.println(mensagem);

        // Fechar o scanner
        scanner.close();
    }
}

