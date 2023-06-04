import java.util.Scanner;

public class ex1 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int numero = 1;
        int soma = 0;

        while (numero != 0) {
            soma += numero;

            System.out.print("Informe um numero(digite 0 para sair): ");
            numero = teclado.nextInt();
        }
        System.out.printf("a soma é: "+ (soma - 1));
    }
}
