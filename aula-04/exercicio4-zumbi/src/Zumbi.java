public class Zumbi {

    double vida;
    String nomes;

    double mostraVida(){
        return vida;
    }

    boolean transfereVida(Zumbi zumbiAlvo, double quantia){

        if(vida > quantia){
            zumbiAlvo.vida += quantia;
            vida -= quantia;
            return true;
        } else {
            System.out.println("Não é possível transferir a quantidade: " + quantia + " pois minha vida é: " + vida);
            return false;
        }
    }

}
