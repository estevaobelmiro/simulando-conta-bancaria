import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        int numero;
        double saldo;
        String agencia;
        String cliente;
        
        System.out.print("Por favor, digite o número da Agência !: ");
        numero = sc.nextInt();
        System.out.print("Por favor, digite a Agência !: ");
        agencia = sc.next();
        sc.nextLine();
        System.out.print("Por favor, digite o seu saldo!: ");
        saldo = sc.nextDouble();
        System.out.print("Por favor, digite o seu nome!: ");
        cliente = sc.next();
        sc.nextLine();

        System.out.println("Olá " + cliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");

        sc.close();

    }
}
