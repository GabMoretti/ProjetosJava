public class SocioBronze extends Socio{
    public Double CalculaValorTitulo(){
        Double calculo = this.getValorPadraoTitulo() + CalculaBronze();
        return calculo;
    }

    public Double CalculaBronze(){
        Double valor = (25.00 * this.getQuantidadeDependentes() + 55.00);
        return valor;
    }
}
