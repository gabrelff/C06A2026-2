public class Main {
    public static void main(String[] args) {
        BrownieCafe bwCafe = new BrownieCafe("Brownie de Cafe", 10, "Café");
        BrownieDoceDeLeite bwDoceDeLeite = new BrownieDoceDeLeite("Brownie de Doce de Leite", 20, "Doce de Leite");
        BrownieNutella bwNutella = new BrownieNutella("Brownie de Nutella", 15, "Doce de Nutella");
        Comprador cp1 = new Comprador("Gabriel Fonseca", 1000);

        cp1.efetuaCompra(bwCafe);
        cp1.efetuaCompra(bwDoceDeLeite);
        cp1.efetuaCompra(bwNutella);

    }
}
