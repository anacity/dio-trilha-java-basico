import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bem-vindo! Responda à algumas perguntas referentes aos seus dados.");

        System.out.println("Qual é o seu nome completo?");
        String nomeCliente = sc.next();

        System.out.println("Qual é o número da sua conta?");
        int numero = sc.nextInt();

        System.out.println("Qual é o número da sua agência?");
        int agencia = sc.nextInt();

        System.out.println("Qual é o valor do seu saldo?");
        double saldo = sc.nextDouble();

        System.out.print("Olá " + nomeCliente +
                ", obrigado por criar uma conta em nosso banco, " +
                        "sua agência é " + agencia + ", conta " + numero +
                " e seu saldo " + saldo + "já está disponível para saque");
    }
}