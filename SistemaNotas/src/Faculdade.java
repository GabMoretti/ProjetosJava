import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Faculdade {
    public static void main(String[] args) {

        ArrayList<Aluno> listAlunos = informarNotas();
    }

    public static ArrayList<Aluno> informarNotas(){
        ArrayList<Aluno> listAlunos = new ArrayList<Aluno>();
        Scanner teclado = new Scanner(System.in);
         Aluno aluno = new Aluno();

         int opcao = 1;

         while (opcao < 5){
             System.out.println("\nOque deseja fazer");
             System.out.println("1 - Cadastrar aluno");
             System.out.println("2 - Colocar notas");
             System.out.println("3 - Mostrar médias");
             System.out.println("4 - Remover aluno");
             System.out.println("5 - Sair");
             opcao = teclado.nextInt();

             if (opcao == 1){
                    aluno = cadastrar(listAlunos.size() + 1);
                    listAlunos.add(aluno);
             }else if (opcao == 2) {
                 String i = "N";
                 while (i.equals("N")) {
                     System.out.println("Informe a nota: ");
                     aluno.media(teclado.nextDouble());
                     teclado.nextLine();
                     System.out.println("--Deseja sair? [S/N]--");
                     i = teclado.nextLine().toUpperCase();
                 }
             }else if (opcao == 3){
                medias(listAlunos);
             }else if ( opcao == 4){
                removerAluno(listAlunos);
             }else{
                 break;
             }
         }

        return listAlunos;
    }

    public static Aluno cadastrar(int codigo){
        Aluno aluno = new Aluno();
        Scanner tecladoAluno = new Scanner(System.in);

        aluno.setCodigo(codigo);

        System.out.println("Informe o nome do aluno: ");
        aluno.setNome(tecladoAluno.nextLine());


        return aluno;
    }

    public static void medias(List<Aluno> listAlunos){
        Aluno aluno = new Aluno();
        int i = 0;

        while(listAlunos.size() > i){
            aluno = listAlunos.get(i);
            System.out.println("\nCódigo  "+ aluno.getCodigo());
            System.out.println("Nome " + aluno.getNome());
            System.out.println("Média "+ aluno.getNota());
            i++;
        }
    }

    public static void removerAluno(List<Aluno> listAlunos){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o código do aluno a ser removido");
        int remover = teclado.nextInt();
        int i = 0;
        boolean alunoEncontrado = false;

        while ( listAlunos.size() > i){
            if (listAlunos.get(i).getCodigo() == remover){
                listAlunos.remove(i);
                alunoEncontrado = true;
            }
            if (alunoEncontrado){
                System.out.println("Aluno removido com sucesso.");
                break;
            }else{
                System.out.println("Código do aluno não encontrado.");
            }
            i++;
        }
    }
}
