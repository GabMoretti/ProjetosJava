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


        System.out.println("Homem: " + serVivo1.getNome() + ", Idade: " + serVivo1.getIdade());
        serVivo1.falar();

        System.out.println("\nCachorro: " + serVivo2.getNome() + ", Idade: " + serVivo2.getIdade());
        serVivo2.falar();

        System.out.println("\nGato: " + serVivo3.getNome() + ", Idade: " + serVivo3.getIdade());
        serVivo3.falar();
    }
}
