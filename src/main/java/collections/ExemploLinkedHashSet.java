package collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExemploLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>();
        sequenciaNumerica.add(1);
        sequenciaNumerica.add(3);
        sequenciaNumerica.add(6);
        sequenciaNumerica.add(8);
        sequenciaNumerica.add(10);
        sequenciaNumerica.add(14);

        System.out.println(sequenciaNumerica);

        sequenciaNumerica.remove(10);
        System.out.println(sequenciaNumerica);

        System.out.println(sequenciaNumerica.size());

        Iterator<Integer> numeros = sequenciaNumerica.iterator();
        while(numeros.hasNext()){
            System.out.println(numeros.next());
        }

        for(Integer numero: sequenciaNumerica){
            System.out.println("--> "+ numero);
        }

        sequenciaNumerica.clear();
        System.out.println(sequenciaNumerica.isEmpty());

    }
}
