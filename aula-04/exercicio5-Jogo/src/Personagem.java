public class Personagem {

    String nome;
    int pontos;
    Arma arma;

    //Metodos
    void usarArma(){
        arma.resistencia -= 2;
    }

    void tomarDano(){
        pontos -= 5;
    }
}
