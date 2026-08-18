public class Main {

    public static void main(String[] args) {
        Kart kart1 = new Kart();
        Kart kart2 = new Kart();

        Piloto piloto1 = new Piloto();
        Piloto piloto2 = new Piloto();

        kart1.nome = "Kart 1";
        kart1.motor.cilindradas = "50";
        kart1.motor.velocidadeMaxima = 90.20F;

        kart2.nome = "Kart 2";
        kart2.motor.cilindradas = "100";
        kart2.motor.velocidadeMaxima = 100.20F;

        piloto1.nome = "Gabriel";
        piloto1.vilao = true;

        piloto2.nome = "Mateus";
        piloto2.vilao = false;

        kart1.piloto = piloto1;
        kart2.piloto = piloto2;

        kart1.fazerDrift();
        kart2.fazerDrift();

        kart1.turbo();
        kart2.turbo();

        kart1.fazerDrift();
        kart2.fazerDrift();

        piloto1.soltarSuperPoder();
        piloto2.soltarSuperPoder();

        kart1.motor.mostraInfo();
        kart2.motor.mostraInfo();
    }
}
