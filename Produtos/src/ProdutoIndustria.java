public class ProdutoIndustria extends Produto{
    public ProdutoIndustria(int codigo, String descricao, Double valor) {
        super(codigo, descricao, valor);
    }
    private Double valorIpi;
    private Double percentualIpi;

    public Double getValorIpi() {
        return valorIpi;
    }

    public void setValorIpi(Double valorIpi) {
        this.valorIpi = valorIpi;
    }

    public Double getPercentualIpi() {
        return percentualIpi;
    }

    public void setPercentualIpi(Double percentualIpi) {
        this.percentualIpi = percentualIpi;
    }

    public Double ValorDoIpi(){
        double valorIpi = (getValor() * percentualIpi);
        Double valorAlterado = (getValor() + valorIpi);
        return valorAlterado;
    }
}
