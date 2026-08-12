public class Main {

    public static void main(String[] args) {

        Zumbis z1 = new Zumbis();
        Zumbis z2 = new Zumbis();

        z1.vida = 100;
        z2.vida = 60;

        z1 = z2;

        z1.vida = 92;
        z2.vida = 78;

        System.out.println(z1.mostraVida());
        System.out.println(z2.mostraVida());

    }

}
