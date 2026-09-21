public class Main {

    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Fila", 100);
        Lontra lontra = new Lontra("Lontra-Azul", 100);
        Boi boi = new Boi("Boi da Roça", 100);

        cachorro.emitirSom();
        lontra.emitirSom();
        boi.emitirSom();
    }

}
