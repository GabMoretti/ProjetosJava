public class Romance extends Livro{
    @Override
    public double CalcularMulta() {
        double valorMulta = (getValor() + (getValor() * 0.05) + getDiasAtraso());
        System.out.println("Código: " + super.getCodigo() + ", nome: " + super.getNome() + ", dias atrasos " + super.getDiasAtraso() + ", valor final: " + valorMulta);
        return valorMulta;
    }
}
