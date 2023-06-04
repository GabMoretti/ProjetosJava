import java.util.Scanner;

public class ex5 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int i = 1;

        while (i <= 10) {
            System.out.print("\nInforme o nome do aluno: ");
            String aluno = teclado.nextLine();

            System.out.print("Informe o nota 1 do aluno: ");
            double nota = Double.parseDouble(teclado.nextLine());

            System.out.print("Informe o nota 2 do aluno: ");
            double nota2 = Double.parseDouble(teclado.nextLine());

            System.out.print("Informe o nota 3 do aluno: ");
            double nota3 = Double.parseDouble(teclado.nextLine());

            double media = (nota + nota2 + nota3) / 3;

            if (media < 6) {
                System.out.printf(aluno +" - "+ media +", Reprovado");
            } else if (media < 7) {
                System.out.printf(aluno +" - "+ media +", Em Recuperação");
            } else {
                System.out.printf(aluno +" - "+ media +", Aprovado");
            }
            i++;
        }
    }
}
