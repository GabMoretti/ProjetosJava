import java.util.Scanner;

public class ex02 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int numero = teclado.nextInt();

        System.out.print("Informe o inicio: ");
        int inicio = teclado.nextInt();

        System.out.print("Informe o fim: ");
        int fim = teclado.nextInt();

        for (int i = inicio; i <= fim; i++) {
            int resultado = numero * i;
            System.out.printf("\n" + numero + " * " + i + " = " + resultado);
        }

    }
}