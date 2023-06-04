import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Venda {
    private List<Produto> produtos;

    public Venda() {
        produtos = new ArrayList<>();
        // Adicione aqui os produtos disponíveis para venda
        produtos.add(new Produto("Produto 1", "1", 10.0, 10));
        produtos.add(new Produto("Produto 2", "2", 11.0, 20));
        produtos.add(new Produto("Produto 3", "3", 12.0, 15));
        produtos.add(new Produto("Produto 4", "4", 13.0, 5));
    }

    public void realizarVendas(int quantidadeVendas) {


        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < quantidadeVendas; i++) {
            System.out.println("Venda " + (i + 1));

            System.out.println("Produtos disponíveis:");
            for (int j = 0; j < produtos.size(); j++) {
                Produto produto = produtos.get(j);
                System.out.println((j + 1) + ". " + produto.getNome() + " - Preço: R$" + produto.getPreco());
            }

            System.out.print("Digite o número do produto: ");
            int numeroProduto = scanner.nextInt();

            if (numeroProduto >= 1 && numeroProduto <= produtos.size()) {
                Produto produtoSelecionado = produtos.get(numeroProduto - 1);
                System.out.print("Digite a quantidade a ser vendida: ");
                int quantidadeVendida = scanner.nextInt();
                produtoSelecionado.vender(quantidadeVendida);
                System.out.println("Venda realizada com sucesso!");
            } else {
                System.out.println("Número de produto inválido. Por favor, escolha um número válido.");
            }
        }
    }

    public void exibirProdutos() {
        System.out.println("Lista de Produtos:");

        for (Produto produto : produtos) {
            System.out.println("Nome: " + produto.getNome());
            System.out.println("Código: " + produto.getCodigo());
            System.out.println("Preço: R$" + produto.getPreco());
            System.out.println("Estoque: " + produto.getEstoque());
            System.out.println("Total estoque Vendido: " + produto.getTotalVendido());
            System.out.println();
        }
    }

    public double calculaFaturamento() {
        double faturamentoTotal = 0.0;

        for (Produto produto : produtos) {
            double faturamentoProduto = produto.getPreco() * produto.getTotalVendido();
            faturamentoTotal += faturamentoProduto;
        }

        return faturamentoTotal;
    }
}