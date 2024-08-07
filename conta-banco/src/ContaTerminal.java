import java.util.Scanner;



public class ContaTerminal {



    public static void main(String[] args) {
        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor digite o número da Conta! ");
        numeroConta = scan.nextInt();
        System.out.println("Digite o número da Agência ! ");
        // Limpando buffer
        if (scan.hasNextLine()) {
            scan.nextLine();
        };
        agencia = scan.nextLine();
        System.out.println("Digite o nome do Cliente! ");
        nomeCliente = scan.nextLine();
        System.out.println("Qual seria o saldo? ");
        saldo = scan.nextDouble();

        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numeroConta+" e seu saldo R$"+saldo+" já está disponível para saque.");
    }
}