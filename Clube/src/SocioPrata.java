public class SocioPrata extends Socio{
    public Double CalculaValorTitulo(){
        Double calculoPrata = this.getValorPadraoTitulo() + CalculaPrata();
        return calculoPrata;
    }

    public Double CalculaPrata(){
        Double valor = (50.00 * this.getQuantidadeDependentes() + 75.00);
        return valor;
    }
}
