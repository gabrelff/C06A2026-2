public class BrownieCafe extends Brownie {

    public BrownieCafe(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    public void adicionaCafe(){

    }

    @Override
    public void addCarrinhoDeCompra() {
        System.out.println("Brownie de Cafe adicionado no carrinho");
    }
}
