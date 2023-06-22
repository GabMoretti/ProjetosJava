import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        SerVivo serVivo1 = new Homem();
        System.out.println("Informe o nome do homem: ");
        serVivo1.setNome(teclado.next());

        System.out.println("Informe a idade do homem: ");
        serVivo1.setIdade(teclado.nextInt());


        SerVivo serVivo2 = new Cachorro();
        System.out.println("\nInforme o nome do cachorro: ");
        serVivo2.setNome(teclado.next());

        System.out.println("Informe a idade do cachorro: ");
        serVivo2.setIdade(teclado.nextInt());


        SerVivo serVivo3 = new Gato();
        System.out.println("\nInforme o nome do gato: ");
        serVivo2.setNome(teclado.next());

        System.out.println("Informe a idade do gato: ");
        serVivo3.setIdade(teclado.nextInt());


        serVivo1.falar();
        serVivo2.falar();
        serVivo3.falar();
    }
}
