import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Double percentualIPI = 0.2;
        Double percentualICMS = 0.2;


        System.out.println("Informe qual será seu uso");
        System.out.println("1 - INDUSTRIA      +++++     2 - REVENDA");
        int escolha = teclado.nextInt();

        System.out.println("Informe a descrição do produto: ");
        String descricao = teclado.next();

        System.out.println("Informe o valor do produto: ");
        Double valor = teclado.nextDouble();

        if (escolha == 1){
            ProdutoIndustria produtoIndustria = new ProdutoIndustria(1, descricao, valor);
            produtoIndustria.setPercentualIpi(percentualIPI);
            Double valorFinal = produtoIndustria.ValorDoIpi();
            System.out.println("Código: " + produtoIndustria.getCodigo() + ", seu uso será : " + escolha + ", descrição: " + produtoIndustria.getDescricao() + ", valor: " + valorFinal);
        }else {
            ProdutoRevenda produtoRevenda = new ProdutoRevenda(2, descricao, valor);
            produtoRevenda.setPercentualIcms(percentualICMS);
            Double valorFinal = produtoRevenda.ValorIcms();
            System.out.println("Código: " + produtoRevenda.getCodigo() + ", seu uso será : " + escolha + ", descrição: " + produtoRevenda.getDescricao() + ", valor: " + valorFinal);
        }
    }
}
