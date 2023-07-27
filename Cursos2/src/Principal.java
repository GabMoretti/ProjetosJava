import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("1 - Marketing");
        System.out.println("2 - Direito");
        System.out.println("3 - Sistemas");
        System.out.println("Informe o curso que deseja entrar: ");
        int escolha = teclado.nextInt();

        if (escolha == 1){
            Marketing marketing = new Marketing();
            marketing.setValorPadrao(100.00);

            System.out.println("Informe seu nome: ");
            marketing.setNome(teclado.next());

            marketing.CalcularMensalidade();
        } else if (escolha == 2) {
            Direito direito = new Direito();
            direito.setValorPadrao(500.00);

            System.out.println("Informe seu nome: ");
            direito.setNome(teclado.next());

            direito.CalcularMensalidade();
        }else{
            Sistemas sistemas = new Sistemas();
            sistemas.setValorPadrao(1200.00);

            System.out.println("Informe seu nome: ");
            sistemas.setNome(teclado.next());

            sistemas.CalcularMensalidade();
        }
    }
}
