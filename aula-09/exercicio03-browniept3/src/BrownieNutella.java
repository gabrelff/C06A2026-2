public class BrownieNutella extends Brownie {

    public BrownieNutella(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    public void adicionaNutella(){

    }

    @Override
    public void addCarrinhoDeCompra() {
        System.out.println("Brownie de Nutella adicionado no carrinho");
    }
}
