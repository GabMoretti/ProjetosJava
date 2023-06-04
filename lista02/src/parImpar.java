//Escreva um programa que peça ao usuário para inserir um número inteiro e, em seguida,
// verifique se o número é par ou ímpar.

import java.util.Scanner;

public class parImpar {
    public static void main(String args[]){
        Scanner teclado= new Scanner(System.in);

        System.out.print("Informe um número: ");
        int numero = teclado.nextInt();

        if (numero %2 == 0){
            System.out.printf("O número digitado é par!");
        }else{
            System.out.printf("O número digitado é impar!");
        }
    }
}
