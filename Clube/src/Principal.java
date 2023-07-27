import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        SocioOuro socioOuro = new SocioOuro();
        SocioPrata socioPrata = new SocioPrata();
        SocioBronze socioBronze = new SocioBronze();

        double valorTitulo = 1000.00;

        System.out.println("1 - OURO");
        System.out.println("2 - PRATA");
        System.out.println("3 - BRONZE");
        System.out.println("Qual pacote deseja escolher: ");
        int pacoteEscolhido = teclado.nextInt();

        System.out.println("Informe seu nome: ");
        String nome = teclado.next();

        System.out.println("Informe sua idade: ");
        int idade = teclado.nextInt();

        System.out.println("Informe a quantidade de dependentes: ");
        int numDependentes = teclado.nextInt();


        if (pacoteEscolhido == 1){
            socioOuro.setNome(nome);
            socioOuro.setIdade(idade);
            socioOuro.setQuantidadeDependentes(numDependentes);
            socioOuro.setValorPadraoTitulo(valorTitulo);
            Double valor = socioOuro.CalculaValorTitulo();
            System.out.println("Nome: " + socioOuro.getNome() + ", idade: " + socioOuro.getIdade() + ", quantidade de dependentes: " + socioOuro.getQuantidadeDependentes() + ", valor que vai ficar o título: " + valor);
        } else if (pacoteEscolhido == 2) {
            socioPrata.setNome(nome);
            socioPrata.setIdade(idade);
            socioPrata.setQuantidadeDependentes(numDependentes);
            socioPrata.setValorPadraoTitulo(valorTitulo);
            Double valor = socioPrata.CalculaValorTitulo();
            System.out.println("Nome: " + socioPrata.getNome() + ", idade: " + socioPrata.getIdade() + ", quantidade de dependentes: " + socioPrata.getQuantidadeDependentes() + ", valor que vai ficar o título: " + valor);
        }else{
            socioBronze.setNome(nome);
            socioBronze.setIdade(idade);
            socioBronze.setQuantidadeDependentes(numDependentes);
            socioBronze.setValorPadraoTitulo(valorTitulo);
            Double valor = socioBronze.CalculaValorTitulo();
            System.out.println("Nome: " + socioBronze.getNome() + ", idade: " + socioBronze.getIdade() + ", quantidade de dependentes: " + socioBronze.getQuantidadeDependentes() + ", valor que vai ficar o título: " + valor);
        }

    }
}
