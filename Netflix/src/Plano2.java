public class Plano2 extends Plano{

    @Override
    public void CalcularMensalidade() {
        Double valor = (getValor() * 0.15);
        Double valorFinal = (getValor() + valor);
        System.out.println("Plano 2 escolhido");
        System.out.println("Código de usuário: " + super.getCodigo() + ", Nome: " + super.getNome() + ", valor do plano: " + valorFinal);
    }
}
