public class BrownieDoceDeLeite extends Brownie {

    public BrownieDoceDeLeite(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    public void adicionaDoceDeLeite(){

    }

    @Override
    public void addCarrinhoDeCompra() {
        System.out.println("Brownie de Doce de Leite adicionado no carrinho");
    }
}
