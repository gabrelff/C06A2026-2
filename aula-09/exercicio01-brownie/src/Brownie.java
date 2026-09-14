public class Brownie {

    protected String nome;
    protected double preco;
    protected String sabor;

    public Brownie (String nome, double preco, String sabor){
        this.nome = nome;
        this.preco = preco;
        this.sabor = sabor;
    }

    public void addCarrinhoDeCompras(){
        System.out.println("Adicionado no carrinho um: " + nome);
    }
    public void calcularValorTotalCompra(){
        System.out.println("Calculando Valor total da compra: " + preco);

    }
    public void mostrarInfo(){

    }

}
