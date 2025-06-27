import entidade.Carro;
import entidade.Motor;

public class Programa {
    public static void main(String[] args) {
        Motor motor = new Motor(1400);
        Carro  carro = new Carro("Honda Fit",motor);
        carro.exibirDetalhes();
    }
}
