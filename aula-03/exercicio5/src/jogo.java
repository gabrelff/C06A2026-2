import java.util.Random;
import java.util.Scanner;

public class jogo {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Random aleatorio = new Random();
        int x = aleatorio.nextInt(10) + 1;
        int y;


        do{
            System.out.print("Adivinhe o número: ");
            y = entrada.nextInt();

        } while (x != y);
        System.out.println("Número encontrado!!");
        entrada.close();
    }

}
