package collections;
//import java.util.Collection;
import java.util.*;


public class ExemploList {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("Robson");
        nomes.add("Julio");
        nomes.add("Karine");
        nomes.add("Tiago");
        nomes.add("Wesley");
        nomes.add("Cleber");
        System.out.println(nomes);

        Collections.sort(nomes);
        nomes.set(1, "Juliana");
        System.out.println("Sorted A-Z");
        System.out.println(nomes);

        nomes.remove(1);
        System.out.println(nomes);
        nomes.remove("Cleber");
        System.out.println(nomes);

        System.out.println(nomes.get(2));
        System.out.println(nomes.size());

        System.out.println(nomes.contains("Fernando")); //false

        //nomes.clear(); //limpa toda a lista

        System.out.println(nomes.isEmpty()); //false

        System.out.println(nomes.indexOf("Tiago")); // Se não encontrar ele retorna -1

        for (String nomeDoItem: nomes) {
            System.out.println("Nome: "+ nomeDoItem);
        }

        Iterator<String> iterator = nomes.iterator();
        while (iterator.hasNext()){
            System.out.println("iterator: "+ iterator.next());
        }



    }
}
