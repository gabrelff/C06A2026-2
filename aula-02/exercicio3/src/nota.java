import java.util.Scanner;

public class nota {

    public static void main (String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a nota da NPA: ");
        float NPA, NP3, NFA;
        NPA = entrada.nextFloat();

        if(NPA <= 30){

            System.out.print("Reprovado");

        } else if (NPA > 30 && NPA < 60) {

            System.out.print("Qual a nota da NP3: ");
            NP3 = entrada.nextFloat();
            NFA = (NPA + NP3) /2;

            if(NFA < 50){
                System.out.println("Reprovado");
            }else {
                System.out.println("Aprovado");
            }

        } else if (NPA >= 60) {
            System.out.println("Aprovado");
        }

        entrada.close();
    }
}