import java.util.Scanner;

public class exercicio1_2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Número de lanches 1: ");
        int lanche1 = entrada.nextInt();
        System.out.print("Número de lanches 2: ");
        int lanche2 = entrada.nextInt();
        System.out.print("Número de lanches 3: ");
        int lanche3 = entrada.nextInt();

        int soma = lanche1 + lanche2 + lanche3;
        float media = (float) soma/3;

        System.out.println("Total de lanches: " +soma);
        System.out.println("Média de lanches: " +media);

        entrada.close();
    }

}
