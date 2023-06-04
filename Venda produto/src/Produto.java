class Produto {
    private String nome;
    private String codigo;
    private double preco;
    private int estoque;
    private int totalVendido;

    public Produto(String nome, String codigo, double preco, int estoque) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.estoque = estoque;
        this.totalVendido = 0;
    }

    public String getNome() {
        return nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getPreco() {
        return preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public int getTotalVendido() {
        return totalVendido;
    }

    public void alterarPreco(double novoPreco) {
        preco = novoPreco;
    }

    public void vender(int quantidade) {
        if (quantidade <= estoque) {
            estoque -= quantidade;
            totalVendido += quantidade;
        } else {
            System.out.println("Estoque insuficiente " + quantidade + " unidades do produto " + nome);
        }
    }
}