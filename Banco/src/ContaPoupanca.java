public class ContaPoupanca extends Conta{
    @Override
    public void CalcularSaldo() {
        Double saldo = (getSaldo() + (getSaldo() * 0.01));
        System.out.println("Titular " + getTitular());
        System.out.println("Nuúmero da conta: " + getNumeroConta());
        System.out.println("Seu saldo com rendimento de 2% é: R$" + saldo);
    }
}
