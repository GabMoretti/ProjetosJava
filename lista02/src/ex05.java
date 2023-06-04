import java.util.Scanner;

public class ex05 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escolha o que deseja desenhar (1 -Losango) (2 -Triângulo): ");
        int opcao = teclado.nextInt();

        System.out.print("Digite o tamanho da figura (em linhas): ");
        int tamanho = teclado.nextInt();

        if (opcao == 1) {
            for (int i = 1; i <= tamanho; i++) {
                for (int j = tamanho - i; j >= 1; j--) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= i * 2 - 1; k++) {
                    System.out.print("%");
                }
                System.out.println();
            }
            for (int i = tamanho - 1; i >= 1; i--) {
                for (int j = tamanho - i; j >= 1; j--) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= i * 2 - 1; k++) {
                    System.out.print("%");
                }
                System.out.println();
            }
        } else if (opcao == 2) {
            for (int i = 1; i <= tamanho; i++) {
                for (int j = tamanho - i; j >= 1; j--) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= i; k++) {
                    System.out.print("% ");
                }
                System.out.println();
            }
        } else {
            System.out.printf("Opção inválida.");
        }
    }
}






