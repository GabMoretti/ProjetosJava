public class ProdutoRevenda extends  Produto{
    public ProdutoRevenda(int codigo, String descricao, Double valor) {
        super(codigo, descricao, valor);
    }
    private Double ValorICMS;
    private Double percentualIcms;

    public Double getValorICMS() {
        return ValorICMS;
    }

    public void setValorICMS(Double valorICMS) {
        ValorICMS = valorICMS;
    }

    public Double getPercentualIcms() {
        return percentualIcms;
    }

    public void setPercentualIcms(Double percentualIcms) {
        this.percentualIcms = percentualIcms;
    }

    public Double ValorIcms(){
        Double valor = getValor() * percentualIcms;
        Double valorAlterado = getValor() + valor;
        return valorAlterado;
    }
}
