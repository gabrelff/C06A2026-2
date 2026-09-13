package br.inatel.pcmania.clientes;

import br.inatel.pcmania.produtos.Computador;

public class Cliente {

    private String nome;
    private String cpf;
    private Computador[] computador;

    public Cliente(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
        this.computador = new Computador[5];
    }

    public void adicionarComputador(Computador novoComputador){
        for(int i = 0; i < computador.length; i++){
            if(computador[i] == null){
                computador[i] = novoComputador;
                break;
            }
        }
    }
    public float calculaTotalCompra(){
        float totalCompra = 0.0F;

        for (int i = 0; i < computador.length; i++){
            if(computador[i] != null){
                totalCompra += computador[i].getPreco();
            }
        }
        return totalCompra;
    }

    public void exibirInformacoes() {
        System.out.println("Cliente: " + nome + " | CPF: " + cpf);
        for (Computador c : computador) {
            if (c != null) {
                c.mostraPCConfigs();
            }
        }
        System.out.println("Total da Compra: R$ " + calculaTotalCompra());
    }

    public Computador[] getComputador() {
        return computador;
    }
}
