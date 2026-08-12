public class Main {

    public static void main(String[] args){

        Zumbi z1 = new Zumbi();
        Zumbi z2 = new Zumbi();

        z2.nome = "Toretto";
        //Outros atributos

        z1.nome = "Gabriel";
        z1.vida = 100;
        z1.altura = 1.80;
        z1.peso = 82.23;
        z1.ataque = "Ataque Mortal";
        z1.defesa = "Defesa Fraca";

        z1.atacar();
        z1.defender();
    }

}