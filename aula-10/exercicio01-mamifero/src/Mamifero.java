public abstract class Mamifero {

    String nome;
    double vida;

    public Mamifero (String nome, double vida){
        this.nome = nome;
        this.vida = vida;
    }

    public abstract void emitirSom();

    public void mostrarInfo(){

    }

}
