public class Caminhonete extends Veiculo{

    private Double tamanho;
    private Double valor;

    public Double getTamanho() {
        return tamanho;
    }

    public void setTamanho(Double tamanho) {
        this.tamanho = tamanho;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public void CalcularIpva(){
        int anoAtual = 2023;
        int anoCaminhonete = anoAtual - getAno();
        if (anoCaminhonete > 10) {
            Double valorFinal = (getValor() + (getValor() * 0.05));
            System.out.println("Ano: " + getAno() + ", Modelo: " + getModelo() + ", Cor: " + getCor() + ", valor com o IPVA calculado: " + valorFinal);

        }else{
            Double valorFinal = (getValor() + (getValor() * 0.10));
            System.out.println("Ano: " + getAno() + ", Modelo: " + getModelo() + ", Cor: " + getCor() + "Valor com o IPVA calculado: " + valorFinal);
        }

    }

    public void AdicionalVeiculo(){
        if(tamanho < 4){
            double valorAdcional = (getValor() + (getValor() + 0.02));
            System.out.println("Adicional: " + valorAdcional);
        }
    }
}
