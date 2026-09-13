package br.inatel.pcmania.produtos;

import br.inatel.pcmania.produtos.componentes.HardwareBasico;
import br.inatel.pcmania.produtos.componentes.MemoriaUSB;
import br.inatel.pcmania.produtos.componentes.SistemaOperacional;

public class Computador {

    private String marca;
    private float preco;
    private HardwareBasico[] hardware;
    private SistemaOperacional so;
    private MemoriaUSB memUSB;

    public Computador(String marca, float preco, String soNome, int soTipo, HardwareBasico cpu, HardwareBasico ram, HardwareBasico hd ){
        this.marca = marca;
        this.preco = preco;
        this.so = new SistemaOperacional(soNome, soTipo);
        this.hardware = new HardwareBasico[3];
        this.hardware[0] = cpu;
        this.hardware[1] = ram;
        this.hardware[2] = hd;
    }

    public void mostraPCConfigs() {
        System.out.println("--- PC " + marca + " ---");
        System.out.println("Preço: R$ " + preco);
        System.out.println("SO: " + so.getNome() + " (" + so.getTipo() + " bits)");
        for (HardwareBasico hw : hardware) {
            if (hw != null) {
                System.out.println("Hardware: " + hw.getNome() + " - " + hw.getCapacidade());
            }
        }
        if (memUSB != null) {
            System.out.println("Acompanha: " + memUSB.getNome() + " de " + memUSB.getCapacidade() + "Gb");
        }
    }

    public void addMemoriaUSB(MemoriaUSB memUSB){
        this.memUSB = memUSB;
    }

    public float getPreco() {
        return preco;
    }
}
