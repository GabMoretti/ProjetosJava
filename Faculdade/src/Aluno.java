import java.util.Date;

public class Aluno extends Pessoa {

    public Aluno(int id, String nome, Integer rg, Date dataNascimento) {
        super(id, nome, rg, dataNascimento);
    }
    private int matricula;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}
