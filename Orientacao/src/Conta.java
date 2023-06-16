public class Conta {
    private Double saldo;
    private Double limite;
    private int numero;

    public void setSaldo(double saldo){

        this.saldo = saldo;
    }

    public double getSaldo(){

        return this.saldo;
    }

    public void setLimite(double limite){

        this.limite = limite;
    }

    public double getLimite(){
        return this.limite;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public double getNumero(){
        return this.numero;
    }

    public void adicionaSaldo(double saldoNovo){
        saldo = saldo + saldoNovo;
    }

    public void saque(double valor){
        this.saldo = saldo - valor;
    }
}
