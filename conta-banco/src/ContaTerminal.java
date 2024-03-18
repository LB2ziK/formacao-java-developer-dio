import java.util.Scanner;

public class ContaTerminal {
    int numero;
    String agencia; 
    String nomeCliente; 
    double saldo;
    Scanner sc = new Scanner(System.in);

    public void entrada(){
        System.out.println("Digite o numero: ");
        numero = sc.nextInt();

        System.out.println("Digite sua Agencia: ");
        agencia = sc.next();

        System.out.println("Digite seu nome de cliente: ");
        nomeCliente = sc.next();

        System.out.println("Digite seu Saldo: ");
        saldo = sc.nextDouble();       
    }

    public void saida(){
        System.out.println("Olá "+nomeCliente+ ", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque");
    }
    public static void main(String[] args) {    
        ContaTerminal obj = new ContaTerminal();
        obj.entrada();
        obj.saida();
    }
}
