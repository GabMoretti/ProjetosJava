public class Direito extends Curso{
    @Override
    public void CalcularMensalidade() {
        Double valor = getValorPadrao() * 2;
        System.out.println("Nome: " + super.getNome() + ", Curso: " + "Marketing" + ", Valor do Curso: " + valor);
    }
}
