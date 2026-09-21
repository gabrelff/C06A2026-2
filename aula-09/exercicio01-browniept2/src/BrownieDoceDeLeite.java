public class BrownieDoceDeLeite extends Brownie {

    public BrownieDoceDeLeite(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    public void adicionarCafe(){
        System.out.println("Adicionado mais café...");
    }

    @Override
    public void addCarrinhoDeCompras(){
        System.out.println("Adicionado Brownie de Doce de Leite no carrinho");
    }
}
