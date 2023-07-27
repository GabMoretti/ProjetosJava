public class Sistemas extends Curso{
    @Override
    public void CalcularMensalidade() {
        Double valor1 = (getValorPadrao() * 2);
        Double valor = (getValorPadrao() * 0.5);
        Double valorFinal = (valor1 + valor);
        System.out.println("Nome: " + super.getNome() + ", Curso: " + "Marketing" + ", Valor do Curso: " + valorFinal);
    }
}
