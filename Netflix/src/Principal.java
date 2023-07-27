import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        System.out.println("PLANO 1 - VALOR [19.99]");
        System.out.println("PLANO 1 - VALOR [39.99]");
        System.out.println("Informe o plano que deseja: ");
        int escolha = teclado.nextInt();

        if (escolha == 1) {
            Plano1 plano1 = new Plano1();
            plano1.setValor(19.99);
            System.out.println("Informe seu nome: ");
            plano1.setNome(teclado.next());

            System.out.println("Informe o código de usuário: ");
            plano1.setCodigo(teclado.nextInt());

            plano1.CalcularMensalidade();
        }else {
            Plano2 plano2 = new Plano2();
            plano2.setValor(39.99);
            System.out.println("Informe seu nome: ");
            plano2.setNome(teclado.next());

            System.out.println("Informe o código de usuário: ");
            plano2.setCodigo(teclado.nextInt());

            plano2.CalcularMensalidade();
        }

    }
}
