package entidades;

public class Cachorro extends Animal{
    public Cachorro() {
        super();
    }

    @Override
    public void emitirSom() {
        System.out.println("Au au!");
    }

}
