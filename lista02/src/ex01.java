import java.util.Scanner;

public class ex01 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int numero = teclado.nextInt();

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.printf("\n" + numero + " * " + i + " = " + resultado);
        }

    }
}
