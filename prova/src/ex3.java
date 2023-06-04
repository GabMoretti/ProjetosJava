import java.util.Scanner;

public class ex3 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe um número(1 a 10): ");
        int numero = teclado.nextInt();

        if (numero == 1){
            System.out.printf("Um");
        } else if (numero == 2) {
            System.out.printf("Dois");
        } else if (numero == 3) {
            System.out.printf("Três");
        } else if (numero == 4) {
            System.out.printf("Quatro");
        } else if (numero == 5) {
            System.out.printf("Cinco");
        } else if (numero == 6) {
            System.out.printf("Seis");
        } else if (numero == 7) {
            System.out.printf("Sete");
        } else if (numero == 8) {
            System.out.printf("Oito");
        } else if (numero == 9) {
            System.out.printf("Nove");
        } else if (numero == 10) {
            System.out.printf("Dez");
        }
    }
}
