import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero;
        int numeroNegativo = 0;
        int i = 1;

        while (i <= 5) {
            System.out.print("Informe o " + i + " número: ");
            numero = teclado.nextInt();

            if (numero < 0){
                numeroNegativo++;
            }
            i++;
        }
        System.out.println("Teve " + numeroNegativo + " números negativos.");
    }
}

