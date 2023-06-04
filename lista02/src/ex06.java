public class ex06 {
    public static void main(String args[]) {
        double soma = 0;
        double quantidade = 0;
        int i;

        for (i = 13; i <= 73;) {
            soma += i;
            quantidade++;
            i++;
        }

        double media = soma / quantidade;

        System.out.printf("A média aritmética é %.2f", media);
    }
}