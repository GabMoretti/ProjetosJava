public class Gato extends SerVivo{
    @Override
    public void falar() {
        System.out.println("O gato Mia! seu nome é: " + super.getNome() + ", idade: " + super.getIdade());
    }
}
