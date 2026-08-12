import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class sala_de_aula {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Qual a quantidade de alunos? ");
        int alunos;
        alunos = entrada.nextInt();

        switch (alunos){

            case 10:
            case 20:
                System.out.println("Sala I-16");
            break;
            case 30:
                System.out.println("Sala I-22");
            break;
            default:
                System.out.println("Nenhuma sala disponínvel");
            break;
        }

        entrada.close();
    }

}
