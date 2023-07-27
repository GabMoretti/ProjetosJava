import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Moto automovel1 = new Moto();
        System.out.println("Informe o nome da moto: ");
        automovel1.setNome(teclado.next());

        System.out.println("Informe a marca da moto");
        automovel1.setMarca(teclado.next());

        System.out.println("Informe a velociade média da moto: ");
        automovel1.setVelocidadeMedia(teclado.nextInt());


        Carro automovel2 = new Carro();
        System.out.println("Informe o nome do carro: ");
        automovel2.setNome(teclado.next());

        System.out.println("Informe a marca do carro");
        automovel2.setMarca(teclado.next());

        System.out.println("Informe a velociade média do carro: ");
        automovel2.setVelocidadeMedia(teclado.nextInt());


        Caminhao automovel3= new Caminhao();
        System.out.println("Informe o nome do caminhão: ");
        automovel3.setNome(teclado.next());

        System.out.println("Informe a marca do caminhão");
        automovel3.setMarca(teclado.next());

        System.out.println("Informe a velociade média do caminhão: ");
        automovel3.setVelocidadeMedia(teclado.nextInt());

        automovel1.Acelerar();
        automovel2.Acelerar();
        automovel3.Acelerar();
    }
}
