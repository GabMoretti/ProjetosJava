public class Carro extends Automovel{
    @Override
    public void Acelerar() {
        int velocidadeAtual = ((super.getVelocidadeMedia() * 2) + 10);
        System.out.println("Nome do carro: " + super.getNome() + ", marca: " + super.getMarca() + ", velocidade: " + velocidadeAtual);
    }
}
