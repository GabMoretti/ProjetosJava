public class Plano1 extends Plano{

    @Override
    public void CalcularMensalidade() {
        Double valor = (getValor() * 0.05);
        Double valorFinal = (getValor() + valor);
        System.out.println("Plano 1 escolhido");
        System.out.println("Código de usuário: " + super.getCodigo() + ", Nome: " + super.getNome() + ", valor do plano: " + valorFinal);
    }
}
