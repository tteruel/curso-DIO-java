package collections;
import java.util.List;
import java.util.Vector;



public class ExemploVector {

    public static void main(String[] args) {
        List<String> esportes = new Vector<>();

        esportes.add("Futebol");
        esportes.add("Futebol Americano");
        esportes.add("Basquetebol");
        esportes.add("Tenis de Mesa");
        esportes.add("Handebol");
        esportes.add("Peteca");

        System.out.println(esportes);

        esportes.set(3, "Ping Pong");

        System.out.println(esportes);
        esportes.remove(1);
        esportes.remove("Peteca");

        System.out.println(esportes);


        for (String nomeDoEsporte: esportes) {
            System.out.println("--> " + nomeDoEsporte);
        }

    }
}
