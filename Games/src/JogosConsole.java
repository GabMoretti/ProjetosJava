public class JogosConsole extends Jogos{
    public JogosConsole(int codigo, String nome, double valor) {
        super(codigo, nome, valor);
    }

    private String marca;
    private String modelo;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

}
