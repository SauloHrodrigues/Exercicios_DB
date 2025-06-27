import entidade.Produto;
import java.util.ArrayList;
import java.util.List;

public class Programa {
    public static void main(String[] args) {
        Produto televisao = new Produto("Televisão Sansung",2250);
        Produto barbeador = new Produto("Barbeador philip",750);
        Produto bicicleta = new Produto("Bicicleta Caloi",1550);
        List<Produto> produtos = new ArrayList<>();
        produtos.add(televisao);
        produtos.add(barbeador);
        produtos.add(bicicleta);

        for(Produto p:produtos){
            System.out.printf("Produto: %s: R$ %.2f%n",p.getNome(),p.getPreco());
        }
    }
}
