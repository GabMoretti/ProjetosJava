import java.text.Format;
import java.util.Scanner;

public class ex2 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o nome: ");
        String nome = teclado.nextLine();

        System.out.print("Informe o CPF: ");
        String cpf = teclado.nextLine();

        System.out.print("Informe o telefone: ");
        String telefone = teclado.nextLine();

        System.out.printf(nome +" - "+ cpf +" - "+ telefone);
    }
}
