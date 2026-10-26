public class Ingresso {
    private double valor;
    private String nomeFilme;
    private boolean dublado; 

    public Ingresso(double valor, String nomeFilme, boolean dublado){
        this.valor = valor;
        this.nomeFilme = nomeFilme;
        this.dublado = dublado;
    }

    public double getValor(){
        return this.valor;
    }
    public String getNomeFilme(){
        return this.nomeFilme;
    }
    public boolean getDublado(){
        return this.dublado;
    }
}
