public class IngressoFamilia extends Ingresso {
    private final double desconto = 0.05;
    private int numeroDePessoas;

    public IngressoFamilia(double valor, String nomeFilme, boolean dublado, int numeroDePessoas) {
        super(valor, nomeFilme, dublado);
        this.numeroDePessoas = numeroDePessoas;
    }

    @Override
    public double getValor() {
        double valorTotal = super.getValor() * this.numeroDePessoas;
        if (this.numeroDePessoas > 3) {
            return valorTotal * (1 - desconto);
        } else {
            return valorTotal;
        }
    }
}
