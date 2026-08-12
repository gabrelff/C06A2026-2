public class Main {

    public static void main(String[] args) {

        Personagem p1 = new Personagem();
        Personagem p2 = new Personagem();
        Arma a1 = new Arma();
        Arma a2 = new Arma();

        p1.nome = "Gabriel";
        p1.pontos = 60;

        p2.nome = "Mateus";
        p2.pontos = 30;

        a1.nome = "Espada";
        a1.poder = 10;
        a1.resistencia = 5;
        a1.descriscao = "Espada curta de corte afiado";

        a2.nome = "Arco-flecha";
        a2.poder = 15;
        a2.resistencia = 2;
        a2.descriscao = "Arco-flecha longo";

        p1.arma = a1;
        p2.arma = a2;

        System.out.println("Vida do " + p2.nome + " : " + p2.pontos);
        System.out.println(p2.nome + " levou dano");
        p2.tomarDano();
        System.out.println("Vida do " + p2.nome + " : " + p2.pontos);


        p1.arma.mostrarInfoArma();
        System.out.println(p1.nome + " usou arma.");
        p1.usarArma();
        p1.arma.mostrarInfoArma();

    }

}
