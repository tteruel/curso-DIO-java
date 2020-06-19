package collections;

import java.util.Iterator;
import java.util.TreeSet;

public class ExemploTreeSet {
    public static void main(String[] args) {
        TreeSet<String> familia = new TreeSet<>();
        familia.add("Francisco");
        familia.add("Anamelia");
        familia.add("Paulo Rogério");
        familia.add("Rafael");
        familia.add("Tiago");
        familia.add("João Paulo");
        familia.add("Maite");

        System.out.println(familia);
        System.out.println(familia.first()); // primeiro nome
        System.out.println(familia.last()); // Ultimo nome
        System.out.println(familia.lower("Tiago")); // abaixo do parametro
        System.out.println(familia.higher("Tiago")); // acima do parametro - nesse caso Null
        System.out.println(familia);

        System.out.println(familia.pollFirst()); // primeiro nome e depois remove ele
        System.out.println(familia.pollLast()); // último nome e depois remove ele

        System.out.println(familia);

        Iterator<String> nomes = familia.iterator();
        while (nomes.hasNext()){
            System.out.println("iterator --> " + nomes.next());
        }

        for(String nome: familia){
            System.out.println("for --> "+ nome);
        }


    }
}
