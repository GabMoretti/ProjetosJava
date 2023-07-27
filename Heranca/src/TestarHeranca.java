import java.util.Scanner;

public class TestarHeranca {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("1 - CAMINHONETE, 2 - MOTOCICLETA");
        System.out.println("Qual o seu veiculo: ");
        int escolha = teclado.nextInt();

        if(escolha == 1){
            Caminhonete caminhonete = new Caminhonete();

            System.out.println("Qual o ano da sua caminhonete: ");
            caminhonete.setAno(teclado.nextInt());

            System.out.println("Qual o modelo da sua caminhonete: ");
            caminhonete.setModelo(teclado.next());

            System.out.println("Qual a cor da sua caminhonete: ");
            caminhonete.setCor(teclado.next());

            System.out.println("Qual o tamanho da sua caminhonete: ");
            caminhonete.setTamanho(teclado.nextDouble());

            System.out.println("Qual o valor da sua caminhonete: ");
            caminhonete.setValor(teclado.nextDouble());

            caminhonete.CalcularIpva();
            caminhonete.AdicionalVeiculo();
        }else{
            Motocicleta motocicleta = new Motocicleta();

            System.out.println("Qual o ano da sua motocicleta: ");
            motocicleta.setAno(teclado.nextInt());

            System.out.println("Qual o modelo da sua motocicleta: ");
            motocicleta.setModelo(teclado.next());

            System.out.println("Qual a cor da sua motocicleta: ");
            motocicleta.setCor(teclado.next());


            System.out.println("Qual o valor da sua motocicleta: ");
            motocicleta.setValor(teclado.nextDouble());

            motocicleta.CalcularIpva();
        }
    }
}
