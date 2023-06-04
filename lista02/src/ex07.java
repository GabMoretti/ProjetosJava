import java.util.Scanner;

public class ex07 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int i = 1;

        while (i <= 10) {
            System.out.print("\nInforme o nome do aluno: ");
            String aluno = teclado.nextLine();

            System.out.print("Informe o nota do aluno: ");
            double nota = Double.parseDouble(teclado.nextLine());

            if (nota < 6) {
                System.out.printf(aluno + "Reprovado");
            } else if (nota < 7) {
                System.out.printf(aluno + "Em Recuperação");
            } else {
                System.out.printf(aluno + "Aprovado");
            }
            i++;
        }
    }
}