public class Main {

    public static void main(String[] args) {
        BrownieCafe bwCafe = new BrownieCafe("Brownie de Cafe", 10, "Café");
        BrownieDoceDeLeite bwDoceDeLeite = new BrownieDoceDeLeite("Brownie de Doce de Leite", 20, "Doce de Leite");
        BrownieNutella bwNutella = new BrownieNutella("Brownie de Nutella", 15, "Doce de Nutella");

        bwCafe.addCarrinhoDeCompras();
        bwDoceDeLeite.addCarrinhoDeCompras();
        bwNutella.addCarrinhoDeCompras();

        bwCafe.adicionarCafe();
        bwDoceDeLeite.adicionarDoceDeLeite();
        bwNutella.adicionarNutella();

        bwCafe.calcularValorTotalCompra();
        bwDoceDeLeite.calcularValorTotalCompra();
        bwNutella.calcularValorTotalCompra();
    }
}
