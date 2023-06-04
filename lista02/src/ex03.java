import java.util.Scanner;

public class ex03 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double numero = 1;
        double soma = 0;

        while (numero != 0) {
            if (numero == 0){
                break;
            }else{
                soma += numero;
            }
            System.out.print("Digite um número (ou 0 para sair): ");
            numero = teclado.nextDouble();

        }
        System.out.printf("A soma total é: "+ (soma - 1));
    }
}
