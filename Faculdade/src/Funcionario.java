import java.util.Date;
public class Funcionario extends Pessoa{
    private Double salario;
    private String cargo;

    public Funcionario(int id, String nome, Integer rg, Date dataNascimento) {
        super(id, nome, rg, dataNascimento);
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
