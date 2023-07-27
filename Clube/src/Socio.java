public abstract class Socio {
    private String nome;
    private int idade;
    private int quantidadeDependentes;
    private Double valorPadraoTitulo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getQuantidadeDependentes() {
        return quantidadeDependentes;
    }

    public void setQuantidadeDependentes(int quantidadeDependentes) {
        this.quantidadeDependentes = quantidadeDependentes;
    }

    public Double getValorPadraoTitulo() {
        return valorPadraoTitulo;
    }

    public void setValorPadraoTitulo(Double valorPadraoTitulo) {
        this.valorPadraoTitulo = valorPadraoTitulo;
    }
}
