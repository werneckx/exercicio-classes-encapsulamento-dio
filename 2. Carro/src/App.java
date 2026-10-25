public class App {
    public static void main(String[] args) throws Exception {
        Carro carro = new Carro("Toyota");
        carro.ligar();
        carro.trocarMarcha(1);
        carro.acelerar();
        carro.virarDireita();
        carro.virarEsquerda();
        carro.frear();
        carro.verificarVelocidade();
        carro.trocarMarcha(0);
        carro.desligar();
    }
}