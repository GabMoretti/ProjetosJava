public class Motocicleta extends Veiculo{
    private Double valor;

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public void CalcularIpva(){

        if (getAno() > 2009) {
            Double valorFinal = (getValor() + (getValor() * 0.10));
            System.out.println("Ano: " + getAno() + ", Modelo: " + getModelo() + ", Cor: " + getCor() + ", valor com o IPVA calculado: " + valorFinal);

        }else{
            Double valorFinal = (getValor() + (getValor() * 0.05));
            System.out.println("Ano: " + getAno() + ", Modelo: " + getModelo() + ", Cor: " + getCor() + "Valor com o IPVA calculado: " + valorFinal);
        }

    }
}
