public class Zumbi {

    double vida;
    String nomes;

    double mostraVida(){
        return vida;
    }

    void transfereVida(Zumbi zumbiAlvo, double quantia){
        zumbiAlvo.vida += quantia;
        vida -= quantia;
    }

}
