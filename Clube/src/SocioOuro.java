public class SocioOuro extends Socio{

    public Double CalculaValorTitulo(){
        Double calculo = this.getValorPadraoTitulo() + CalculaOuro();
        return calculo;
    }

    public Double CalculaOuro(){
        Double valor = (100.00 * this.getQuantidadeDependentes() + 100.00);
        return valor;
    }

}
