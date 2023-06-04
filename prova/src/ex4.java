import java.util.Scanner;

public class ex4 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        System.out.printf("Prato 1- Arroz, Feijão e Carne.");
        System.out.printf("\nPrato 2- Macarrão, Carne de Frango e Mandioca.");
        System.out.printf("\nPrato 3- Arroz, Maionese e Carne Assada.");
        System.out.print("\nEscolha um prato: ");
        int prato = teclado.nextInt();

        System.out.printf("\nBebida 1- Coca-Cola.");
        System.out.printf("\nBebida 2- Suco de Laranja.");
        System.out.printf("\nBebida 3- Àgua tônica.");
        System.out.print("\nEscolha uma bebida: ");
        int bebida = teclado.nextInt();

        if(prato == 1){
            System.out.printf("Prato - Arroz, Feijão e Carne.");
        } else if (prato == 2) {
            System.out.printf("Prato - Macarrão, Carne de Frango e Mandioca.");
        }else{
            System.out.printf("Prato - Arroz, Maionese e Carne Assada.");
        }

        if(bebida == 1){
            System.out.printf("\nBebida - Coca-Cola.");
        }else if(bebida == 2){
            System.out.printf("\nBebida - Suco de Laranja.");
        }else{
            System.out.printf("\nBebida - Àgua tônica.");
        }

    }
}
