
public class Carro {

    private String marca;
    private boolean ligado;
    private int velocidade;
    private int marcha;

    public Carro(String marca) {
        this.marca = marca;
        this.ligado = false;
        this.velocidade = 0;
        this.marcha = 0;
    }

    public void ligar() {
        this.ligado = true;
        System.out.println("Carro ligado!");
    }

    public void desligar() {
        if (this.velocidade > 0) {
            System.out.println("Não é possível desligar o carro enquanto ele estiver em movimento. Pare o carro primeiro.");
        } else if (this.marcha != 0) {
            System.out.println("Não é possível desligar o carro enquanto ele estiver em marcha. Coloque o carro em ponto morto (marcha 0) antes de desligar.");
        } else {
            this.ligado = false;
            System.out.println("Carro desligado!");
        }
    }

    public void acelerar() {
        int novaVelocidade = this.velocidade + 1;
        if (this.ligado) {
            switch (marcha) {
                case 0:
                    System.out.println("Carro em ponto morto. Não é possível acelerar. Coloque o carro em marcha antes de acelerar.");
                    break;
                case 1:
                    if (novaVelocidade > 20) {
                        System.out.println("Velocidade máxima para a marcha 1 é 20 km/h. Troque para a próxima marcha.");
                        return;
                    } else {
                        velocidade = novaVelocidade;
                        System.out.println("Acelerando! Velocidade atual: " + this.velocidade + " km/h");
                    }
                    break;
                case 2:
                    if (novaVelocidade > 40) {
                        System.out.println("Velocidade máxima para a marcha 2 é 40 km/h. Troque para a próxima marcha.");
                        return;
                    } else {
                        velocidade = novaVelocidade;
                        System.out.println("Acelerando! Velocidade atual: " + this.velocidade + " km/h");
                    }
                    break;
                case 3:
                    if (novaVelocidade > 60) {
                        System.out.println("Velocidade máxima para a marcha 3 é 60 km/h. Troque para a próxima marcha.");
                        return;
                    } else {
                        velocidade = novaVelocidade;
                        System.out.println("Acelerando! Velocidade atual: " + this.velocidade + " km/h");
                    }
                    break;
                case 4:
                    if (novaVelocidade > 80) {
                        System.out.println("Velocidade máxima para a marcha 4 é 80 km/h. Troque para a próxima marcha.");
                        return;
                    } else {
                        velocidade = novaVelocidade;
                        System.out.println("Acelerando! Velocidade atual: " + this.velocidade + " km/h");
                    }
                    break;
                case 5:
                    if (novaVelocidade > 100) {
                        System.out.println("Velocidade máxima para a marcha 5 é 100 km/h. Troque para a próxima marcha.");
                        return;
                    } else {
                        velocidade = novaVelocidade;
                        System.out.println("Acelerando! Velocidade atual: " + this.velocidade + " km/h");
                    }
                    break;
                case 6:
                    if (novaVelocidade > 120) {
                        System.out.println("Velocidade máxima para a marcha 6 é 120 km/h. Não é possível acelerar mais.");
                        return;
                    } else {
                        velocidade = novaVelocidade;
                        System.out.println("Acelerando! Velocidade atual: " + this.velocidade + " km/h");
                    }
                    break;
                default:
                    throw new AssertionError();
            }
        } else {
            System.out.println("O carro está desligado. Ligue o carro antes de acelerar.");
        }
    }

    public void frear() {
        int novaVelocidade = this.velocidade - 1;

        if (this.ligado) {

            switch (marcha) {

                case 0:
                    System.out.println(
                            "Carro em ponto morto. Não é possível frear."
                    );
                    break;

                case 1:
                    if (novaVelocidade < 0) {
                        System.out.println("O carro já está parado.");
                    } else {
                        velocidade = novaVelocidade;
                        System.out.println(
                                "Reduzindo velocidade! Velocidade atual: "
                                + this.velocidade + " km/h"
                        );
                    }
                    break;

                case 2:
                    if (novaVelocidade < 21) {
                        System.out.println(
                                "A velocidade mínima para a marcha 2 é 21 km/h. "
                                + "Troque para a marcha 1 antes de continuar freando."
                        );
                    } else {
                        velocidade = novaVelocidade;
                        System.out.println(
                                "Reduzindo velocidade! Velocidade atual: "
                                + this.velocidade + " km/h"
                        );
                    }
                    break;

                case 3:
                    if (novaVelocidade < 41) {
                        System.out.println(
                                "A velocidade mínima para a marcha 3 é 41 km/h. "
                                + "Troque para a marcha 2 antes de continuar freando."
                        );
                    } else {
                        velocidade = novaVelocidade;
                        System.out.println(
                                "Reduzindo velocidade! Velocidade atual: "
                                + this.velocidade + " km/h"
                        );
                    }
                    break;

                case 4:
                    if (novaVelocidade < 61) {
                        System.out.println(
                                "A velocidade mínima para a marcha 4 é 61 km/h. "
                                + "Troque para a marcha 3 antes de continuar freando."
                        );
                    } else {
                        velocidade = novaVelocidade;
                        System.out.println(
                                "Reduzindo velocidade! Velocidade atual: "
                                + this.velocidade + " km/h"
                        );
                    }
                    break;

                case 5:
                    if (novaVelocidade < 81) {
                        System.out.println(
                                "A velocidade mínima para a marcha 5 é 81 km/h. "
                                + "Troque para a marcha 4 antes de continuar freando."
                        );
                    } else {
                        velocidade = novaVelocidade;
                        System.out.println(
                                "Reduzindo velocidade! Velocidade atual: "
                                + this.velocidade + " km/h"
                        );
                    }
                    break;

                case 6:
                    if (novaVelocidade < 101) {
                        System.out.println(
                                "A velocidade mínima para a marcha 6 é 101 km/h. "
                                + "Troque para a marcha 5 antes de continuar freando."
                        );
                    } else {
                        velocidade = novaVelocidade;
                        System.out.println(
                                "Reduzindo velocidade! Velocidade atual: "
                                + this.velocidade + " km/h"
                        );
                    }
                    break;

                default:
                    System.out.println("Marcha inválida.");
            }

        } else {
            System.out.println(
                    "O carro está desligado. Ligue o carro antes de frear."
            );
        }
    }

    public void verificarVelocidade() {
        System.out.println("Velocidade atual: " + this.velocidade + " km/h");
    }

    public void trocarMarcha(int novaMarcha) {

        if (novaMarcha < 0 || novaMarcha > 6) {
            System.out.println("Marcha inválida. As marchas válidas são de 0 a 6.");
        } else if (!(novaMarcha == this.marcha + 1 || novaMarcha == this.marcha - 1)) {
            System.out.println("Marcha só pode ser trocada diretamente para a próxima ou anterior. Troque para a marcha correta.");
        } else if (this.ligado) {
            this.marcha = novaMarcha;
            System.out.println("Marcha trocada para: " + this.marcha);
        } else {
            System.out.println("O carro está desligado. Ligue o carro antes de trocar a marcha.");
        }
    }

    public void virarEsquerda() {
        if (!this.ligado) {
            System.out.println("O carro está desligado. Ligue o carro antes de virar.");
        } else if (this.velocidade >= 1 && this.velocidade <= 40) {
            System.out.println("Virando para a esquerda!");
        } else {
            System.out.println(
                    "Não é possível virar. A velocidade deve estar entre 1 km/h e 40 km/h."
            );
        }
    }

    public void virarDireita() {
        if (!this.ligado) {
            System.out.println("O carro está desligado. Ligue o carro antes de virar.");
        } else if (this.velocidade >= 1 && this.velocidade <= 40) {
            System.out.println("Virando para a direita!");
        } else {
            System.out.println(
                    "Não é possível virar. A velocidade deve estar entre 1 km/h e 40 km/h."
            );
        }
    }
}
