public class ContaCorrente extends Conta{

    @Override
    public void CalcularSaldo() {
        Double saldo = (getSaldo() + (getSaldo() * 0.01));
        System.out.println("Titular " + getTitular());
        System.out.println("Nuúmero da conta: " + getNumeroConta());
        System.out.println("Seu saldo com rendimento de 1% é: R$" + saldo);

    }
}
