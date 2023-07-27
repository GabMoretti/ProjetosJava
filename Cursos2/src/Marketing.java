public class Marketing extends Curso{
    @Override
    public void CalcularMensalidade() {
        Double valor = getValorPadrao() * 1.5;
        System.out.println("Nome: " + super.getNome() + ", Curso: " + "Marketing" + ", Valor do Curso: " + valor);
    }
}
