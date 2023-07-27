public class Literatura extends Livro{
    @Override
    public double CalcularMulta() {
        double valorMulta1 = (getValor() + (getValor() * 0.10));
        double valorMulta = (valorMulta1 +  (getDiasAtraso() / 2));
        System.out.println("Código: " + super.getCodigo() + ", nome: " + super.getNome() + ", dias atrasos " + super.getDiasAtraso() + ", valor final: " + valorMulta);
        return valorMulta;
    }
}
