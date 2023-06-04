public class Aluno {
    private int codigo;
    private String nome;
    private double nota;

    public Aluno(){
        this.codigo = 0;
        this.nome = ("");
        this.nota = 0;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public void media(double nota){
        this.nota = this.nota + nota / 2;

    }
}