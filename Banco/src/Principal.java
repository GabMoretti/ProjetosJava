import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escolha qual conta deseja criar");
        System.out.println("1 - Conta Corrente -- RENDIMENTO [1%]");
        System.out.println("2 - Conta Poupança -- RENDIMENTO [2%]");
        int escolha = teclado.nextInt();

        if(escolha == 1){
            ContaCorrente contaCorrente = new ContaCorrente();
            System.out.println("Opção 1 escolhida, RENDIMENTO [1%]");

            System.out.println("Informe seu nome: ");
            contaCorrente.setTitular(teclado.next());

            System.out.println("Informe um número para sua conta: ");
            contaCorrente.setNumeroConta(teclado.nextInt());

            System.out.println("Informe seu saldo atual: ");
            contaCorrente.setSaldo(teclado.nextDouble());

            contaCorrente.CalcularSaldo();
        }else{
            ContaPoupanca contaPoupanca = new ContaPoupanca();
            System.out.println("Opção 2 escolhida, RENDIMENTO [2%]");

            System.out.println("Informe seu nome: ");
            contaPoupanca.setTitular(teclado.next());

            System.out.println("Informe um número para sua conta: ");
            contaPoupanca.setNumeroConta(teclado.nextInt());

            System.out.println("Informe seu saldo atual: ");
            contaPoupanca.setSaldo(teclado.nextDouble());

            contaPoupanca.CalcularSaldo();
        }

    }
}
