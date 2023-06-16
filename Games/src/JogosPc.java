public class JogosPc extends Jogos {
    public JogosPc(int codigo, String nome, double valor) {
        super(codigo, nome, valor);
    }

    private String processador;
    private String placaDeVideo;

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public String getPlacaDeVideo() {
        return placaDeVideo;
    }

    public void setPlacaDeVideo(String placaDeVideo) {
        this.placaDeVideo = placaDeVideo;
    }

}
