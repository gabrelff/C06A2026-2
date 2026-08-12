public class Zumbis {

    double vida;
    String nomes;

    double mostraVida(){
        return vida;
    }

    void transfereVida(Zumbis zumbiAlvo, double quantia){
        zumbiAlvo.vida += quantia;
        vida -= quantia;
    }

    public void vida() {
    }

}
