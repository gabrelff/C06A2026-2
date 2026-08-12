public class Main {

    public static void main(String[] args) {

        Zumbi z1 = new Zumbi();
        Zumbi z2 = new Zumbi();

        z1.vida = 100;
        z2.vida = 70;

        z1.transfereVida(z2, 50);
        System.out.println(z2.mostraVida());

    }

}
