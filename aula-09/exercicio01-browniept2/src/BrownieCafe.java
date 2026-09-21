public class BrownieCafe extends Brownie{

    public BrownieCafe(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    public void adicionarDoceDeLeite(){
        System.out.println("Adicionado mais Doce de Leite...");
    }

    @Override
    public void addCarrinhoDeCompras(){
        System.out.println("Adicionado Brownie de Café no carrinho");
    }
}
