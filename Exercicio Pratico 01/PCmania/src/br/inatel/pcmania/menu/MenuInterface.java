package br.inatel.pcmania.menu;

import java.util.Scanner;
import br.inatel.pcmania.clientes.Cliente;
import br.inatel.pcmania.executores.ProcessarPedido;
import br.inatel.pcmania.produtos.Computador;
import br.inatel.pcmania.produtos.componentes.HardwareBasico;
import br.inatel.pcmania.produtos.componentes.MemoriaUSB;

public class MenuInterface {

    public void exibirMenu(){
        Scanner entrada = new Scanner(System.in);

        int opcao;
        float matricula = 2193;
        System.out.println("PCMania - Componentes & Computadores");
        System.out.print("Ditie seu nome: ");
        String nome = entrada.nextLine();
        System.out.print("Digite seu CPF: ");
        String cpf = entrada.nextLine();

        Cliente cliente = new Cliente(nome, cpf);

        do {
            System.out.println("\nPromoções Disponíveis:");
            System.out.println("1 - Promoção 1 (Apple)");
            System.out.println("2 - Promoção 2 (Samsung)");
            System.out.println("3 - Promoção 3 (Dell)");
            System.out.println("0 - Finalizar compra");
            System.out.print("Escolha uma opção: ");
            opcao = entrada.nextInt();

            switch (opcao){
                case 1:
                    HardwareBasico cpu1 = new HardwareBasico("Pentium Core i5", 2200);
                    HardwareBasico ram1 = new HardwareBasico("Memória RAM", 8);
                    HardwareBasico hd1 = new HardwareBasico("HD", 500);
                    Computador pc1 = new Computador ("Apple", matricula, "macOS Sequoia", 64, cpu1, ram1, hd1);
                    MemoriaUSB pendrive1 = new MemoriaUSB("Pen-drive", 16);
                    pc1.addMemoriaUSB(pendrive1);
                    cliente.adicionarComputador(pc1);
                    System.out.println("PC Apple adicionado");
                    break;
                case 2:
                    System.out.println("Promoção 2 (Samsung)");
                    HardwareBasico cpu2 = new HardwareBasico("Pentium Core i7", 3370);
                    HardwareBasico ram2 = new HardwareBasico("Memória RAM", 16);
                    HardwareBasico hd2 = new HardwareBasico("HD", 1000);
                    Computador pc2 = new Computador ("Samsung", matricula + 1, "Windows 8", 64, cpu2, ram2, hd2);
                    MemoriaUSB pendrive2 = new MemoriaUSB("Pen-drive", 32);
                    pc2.addMemoriaUSB(pendrive2);
                    cliente.adicionarComputador(pc2);
                    System.out.println("PC Samsung adicionado");
                    break;
                case 3:
                    System.out.println("Promoção 2 (Dell)");
                    HardwareBasico cpu3 = new HardwareBasico("Pentium Core i7", 4500);
                    HardwareBasico ram3 = new HardwareBasico("Memória RAM", 32);
                    HardwareBasico hd3 = new HardwareBasico("HD", 2000);
                    Computador pc3 = new Computador ("Dell", matricula + 2, "Windows 10", 64, cpu3, ram3, hd3);
                    MemoriaUSB pendrive3 = new MemoriaUSB("HD Externo", 1000);
                    pc3.addMemoriaUSB(pendrive3);
                    cliente.adicionarComputador(pc3);
                    System.out.println("PC Dell adicionado");
                    break;
                case 0:
                    System.out.println("\nFinalizando compra...\n");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }while (opcao != 0);

        ProcessarPedido.envioComfirmar(cliente.getComputador());
        cliente.exibirInformacoes();
        entrada.close();
    }


}
