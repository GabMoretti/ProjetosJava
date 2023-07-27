public class Caminhao extends Automovel{
    @Override
    public void Acelerar() {
        int velocidadeAtual = (((super.getVelocidadeMedia() * 2) + 10) + 3);
        System.out.println("Nome do caminhão: " + super.getNome() + ", marca: " + super.getMarca() + ", velocidade: " + velocidadeAtual);
    }
}
