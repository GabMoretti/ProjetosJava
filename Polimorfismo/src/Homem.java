public class Homem extends SerVivo{

    @Override
    public void falar() {
        System.out.println("O homem fala! seu nome é: " + super.getNome() + "idade: " + super.getIdade());
    }
}
