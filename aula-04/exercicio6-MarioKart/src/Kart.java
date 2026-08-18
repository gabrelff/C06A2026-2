public class Kart {
    String nome;
    Piloto piloto;
    Motor motor;

    public Kart() {
       motor = new Motor();
    }

    void pular(){
        System.out.println(nome + " pulando!!");
    }
    void turbo(){
        System.out.println(nome + " usando turbo!!\n");
    }
    void fazerDrift(){
        System.out.println(nome + " fazendo drift!!");
    }
}
