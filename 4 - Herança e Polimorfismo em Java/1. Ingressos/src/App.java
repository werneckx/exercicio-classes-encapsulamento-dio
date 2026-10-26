
public class App {
    public static void main(String[] args) {

        Ingresso ingresso = new Ingresso(50, "Interestelar", false);

        System.out.println("=== INGRESSO NORMAL ===");
        System.out.println("Filme: " + ingresso.getNomeFilme());
        System.out.println("Dublado: " + ingresso.getDublado());
        System.out.println("Valor: R$ " + ingresso.getValor());

        MeiaEntrada meiaEntrada = new MeiaEntrada(50, "Interestelar", false);

        System.out.println("\n=== MEIA-ENTRADA ===");
        System.out.println("Filme: " + meiaEntrada.getNomeFilme());
        System.out.println("Dublado: " + meiaEntrada.getDublado());
        System.out.println("Valor: R$ " + meiaEntrada.getValor());

        IngressoFamilia familia3 = new IngressoFamilia(
                50, "Interestelar", false, 3);

        System.out.println("\n=== INGRESSO FAMÍLIA - 3 PESSOAS ===");
        System.out.println("Filme: " + familia3.getNomeFilme());
        System.out.println("Pessoas: 3");
        System.out.println("Valor total: R$ " + familia3.getValor());

        IngressoFamilia familia4 = new IngressoFamilia(
                50, "Interestelar", false, 4);

        System.out.println("\n=== INGRESSO FAMÍLIA - 4 PESSOAS ===");
        System.out.println("Filme: " + familia4.getNomeFilme());
        System.out.println("Pessoas: 4");
        System.out.println("Valor total com desconto: R$ " + familia4.getValor());
    }
}
