package br.inatel.pcmania.produtos.componentes;

public class HardwareBasico {

    private String nome;
    private float capacidade;

    public HardwareBasico(String nome, float capacidade){
        this.nome = nome;
        this.capacidade = capacidade;
    }

    public float getCapacidade() {
        return capacidade;
    }
    public String getNome() {
        return nome;
    }
}
