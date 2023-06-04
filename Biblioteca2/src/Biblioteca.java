import java.util.Scanner;

public class Biblioteca {
    public static void main(String[] args) {
        /****************************************
         * Crição dos objetos e cadastrar livros
         ***************************************/
            Scanner teclado = new Scanner(System.in);

            Livro livro1 = cadastrarLivro(new Livro(), 1);
            Livro livro2 = cadastrarLivro(new Livro(), 2);
            Livro livro3 = cadastrarLivro(new Livro(), 3);
            Livro livro4 = cadastrarLivro(new Livro(), 4);
            Livro livro5 = cadastrarLivro(new Livro(), 5);
            Livro livro6 = cadastrarLivro(new Livro(), 6);


        /****************
         Emprestar livros*
         ***************/
            for (int i=1; i <= 4; i++){
                System.out.println("Empréstimo "+ i);
                System.out.println("-----------------------------");
                System.out.println(livro1.getIdlivro() + " - "+ livro1.getTitulo());
                System.out.println(livro2.getIdlivro() + " - "+ livro2.getTitulo());
                System.out.println(livro3.getIdlivro() + " - "+ livro3.getTitulo());
                System.out.println(livro4.getIdlivro() + " - "+ livro4.getTitulo());
                System.out.println(livro5.getIdlivro() + " - "+ livro5.getTitulo());
                System.out.println(livro6.getIdlivro() + " - "+ livro6.getTitulo());

                int escolha;
                int y = 1;

                while (y < 3){
                    System.out.println("Livro "+ y);
                    escolha = teclado.nextInt();

                    if (escolha == 1){
                        emprestaLivro(livro1);
                    } else if (escolha == 2) {
                        emprestaLivro(livro2);
                    } else if (escolha == 3) {
                        emprestaLivro(livro3);
                    } else if (escolha == 4) {
                        emprestaLivro(livro4);
                    } else if (escolha == 5) {
                        emprestaLivro(livro5);
                    } else if (escolha == 6) {
                        emprestaLivro(livro6);
                    }else{
                        System.out.println("Escolha inválida!");
                    }
                    y++;
                }
            }

        /********************
         Relatório dos livros
         *******************/
            System.out.println("***********************");
            relatorioLivro(livro1);
            relatorioLivro(livro2);
            relatorioLivro(livro3);
            relatorioLivro(livro4);
            relatorioLivro(livro5);
            relatorioLivro(livro6);
    }

    public static Livro cadastrarLivro(Livro livro, int idLivro){
        Scanner teclado = new Scanner(System.in);

        livro.setIdlivro(idLivro);
        livro.setStatus("Disponivel");
        livro.setQuantidadeEmprestimos(0);

        System.out.println("Cadastre o livro "+ idLivro);
        livro.setTitulo(teclado.nextLine());

        return livro;
    }

    public static void emprestaLivro(Livro livro){
        livro.emprestar();
    }

    public static void relatorioLivro(Livro livro){
        System.out.print("\nCódigo "+ livro.getIdlivro());
        System.out.print("\nTitulo: "+ livro.getTitulo());
        System.out.print("\nStatus: "+ livro.getStatus());
        System.out.print("\nQuantidade de empréstimos: "+ livro.getQuantidadeEmprestimos());
    }
}