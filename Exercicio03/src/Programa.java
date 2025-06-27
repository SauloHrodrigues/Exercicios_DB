import entidades.Cachorro;
import entidades.Gato;

public class Programa {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();

        cachorro.emitirSom();
        gato.emitirSom();
    }
}
