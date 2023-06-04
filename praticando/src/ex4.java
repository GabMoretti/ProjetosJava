//Escreva um programa que solicite ao usuário para inserir um número e,
// em seguida, imprima todos os números de 1 a esse número.


import java.util.Scanner;

public class ex4 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe um numero: ");
        int numero = teclado.nextInt();

        for (int i = 1; i <= numero; i++){
            System.out.printf("\n"+ i);
        }
    }
}
