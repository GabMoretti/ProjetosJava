import java.util.Scanner;

public class Pincipal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nome;
        double valor;

        System.out.println("Informe o nome do jogo: ");
        nome = teclado.next();

        System.out.println("Informe o valor do jogo: ");
        valor = teclado.nextInt();

        JogosConsole jogosConsole = new JogosConsole(1, nome, valor);

        System.out.println("Informe a marca do console: ");
        jogosConsole.setMarca(teclado.next());

        System.out.println("Informe o modelo do console: ");
        jogosConsole.setModelo(teclado.next());


        System.out.println("Informe o nome do PC: ");
        nome = teclado.next();

        System.out.println("Informe o valor do PC: ");
        valor = teclado.nextInt();

        JogosPc jogosPc = new JogosPc(1, nome, valor);
        System.out.println("Informe o processador do PC: ");
        jogosPc.setProcessador(teclado.next());

        System.out.println("Informe a placa de vídeo do PC: ");
        jogosPc.setPlacaDeVideo(teclado.next());

        System.out.println("**** Informações CONSOLE ****");
        System.out.println("Código: "+ jogosConsole.getCodigo() + ", Nome: " + jogosConsole.getNome() + ", Valor: R$" + jogosConsole.getValor() + ", Marca: " + jogosConsole.getMarca() + ", Modelo: " + jogosConsole.getModelo());

        System.out.println("\n**** Informações PC ****");
        System.out.println("Código: "+ jogosPc.getCodigo() + ", Nome: " + jogosPc.getNome() + ", Valor: R$" + jogosPc.getValor() + ", Processador: " + jogosPc.getProcessador() + ", Placa de vídeo: " + jogosPc.getPlacaDeVideo());
    }
}
