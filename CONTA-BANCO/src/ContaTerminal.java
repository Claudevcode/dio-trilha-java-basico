import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
      
        Scanner escanear = new Scanner(System.in);
        
        System.out.println("Por favor, digite o número da conta!");
        int numero = escanear.nextInt();
        escanear.nextLine();  
        
        System.out.println("Por favor, digite o número da Agência!");
        String agencia = escanear.nextLine();

        System.out.println("Por favor, digite o nome da usuario!");
        String nomeUsuario = escanear.nextLine();

        System.out.println("Por favor, digite o saldo!");
        Double saldo  = escanear.nextDouble();

       System.out.println("Olá " + nomeUsuario + ", obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + ", conta: " + numero + ", e seu saldo: " + saldo + " já está disponível para saque");

       escanear.close();

    }
}
