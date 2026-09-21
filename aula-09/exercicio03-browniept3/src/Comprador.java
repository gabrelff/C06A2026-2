public class Comprador {
    String nome;
    double saldo;

    public Comprador (String nome, double saldo){
        this.nome = nome;
        this.saldo = saldo;
    }

    public void efetuaCompra(Brownie brownie){
        brownie.addCarrinhoDeCompra();
        brownie.calculaValorTotalCompra();
    }
}
