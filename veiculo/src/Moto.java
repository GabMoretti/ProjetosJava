public class Moto extends Automovel{

    @Override
    public void Acelerar() {
        int velocidadeAtual = super.getVelocidadeMedia() * 2;
        System.out.println("Nome da moto: " + super.getNome() + ", marca: " + super.getMarca() + ", velocidade: " + velocidadeAtual);
    }
}
