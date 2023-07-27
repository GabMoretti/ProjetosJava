import java.util.Scanner;

public class TestarPolimorfismo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escolha o livro");
        System.out.println("1 Romance, 2 Literatura");
        int escolha = teclado.nextInt();

        if (escolha == 1){
            Romance romance =  new Romance();

            System.out.println("Qual o código do seu livro: ");
            romance.setCodigo(teclado.nextInt());

            System.out.println("Qual o nome do seu livro: ");
            romance.setNome(teclado.next());

            System.out.println("Qual o valor do seu livro: ");
            romance.setValor(teclado.nextDouble());

            System.out.println("Quantos dias de atraso: ");
            romance.setDiasAtraso(teclado.nextInt());

            romance.CalcularMulta();
        }else {
            Literatura literatura =  new Literatura();

            System.out.println("Qual o código do seu livro: ");
            literatura.setCodigo(teclado.nextInt());

            System.out.println("Qual o nome do seu livro: ");
            literatura.setNome(teclado.next());

            System.out.println("Qual o valor do seu livro: ");
            literatura.setValor(teclado.nextDouble());

            System.out.println("Quantos dias de atraso: ");
            literatura.setDiasAtraso(teclado.nextInt());

            literatura.CalcularMulta();
        }
    }
}
