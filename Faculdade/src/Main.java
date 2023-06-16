import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String nome;
        Integer rg;
        Date dataNascimento;

        System.out.println("Informe o nome do aluno:");
        nome = in.next();

        System.out.println("Digite o seu Rg: ");
        rg = in.nextInt();

        System.out.println("Informe sua data de nascimento: ");
        dataNascimento = formataData(in.next());

        Aluno aluno = new Aluno(1, nome, rg, dataNascimento);

        System.out.println("Informe o número da matrícula: ");
        aluno.setMatricula(in.nextInt());


        System.out.println("Informe o nome do professor: ");
        nome = in.next();

        System.out.println("Informe o rg do professor: ");
        rg = in.nextInt();

        System.out.println("Informe a data de nascimento do professor: ");
        dataNascimento = formataData(in.next());


        Professor professor = new Professor(1, nome, rg, dataNascimento);

        System.out.println("Informe o salário do professor: ");
        professor.setSalario(in.nextDouble());

        System.out.println("Informe a disciplina que o professor leciona: ");
        professor.setDisciplina(in.next());


        System.out.println("** Informações do Professor **");
        System.out.println("código: " + professor.getId() + ", Nome: " + professor.getNome() + ", RG: " + professor.getRg()+ ", Disciplina: " + professor.getDisciplina() + ", Salário: "+ professor.getSalario());


        System.out.println("\n** Informações do Aluno **");
        System.out.println("código: " + aluno.getId() + ", Nome: " + aluno.getNome() + ", RG: " + aluno.getRg()+ ", Matrícula: " + aluno.getMatricula());


    }

    public static Date formataData(String data){

        Date dataRetorno = new Date();
        try{
            DateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
            dataRetorno = dataFormatada.parse(data);
        }catch (Exception ex){
            ex.printStackTrace();
        }

        return dataRetorno;
    }

}
