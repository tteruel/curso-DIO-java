package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExemploHashSet {
    public static void main(String[] args) {
        Set<Double> notasAlunos = new HashSet<>();
        notasAlunos.add(6.2);
        notasAlunos.add(10.0);
        notasAlunos.add(3.4);
        notasAlunos.add(4.1);
        notasAlunos.add(8.6);
        notasAlunos.add(6.0);
        notasAlunos.add(7.3);
        notasAlunos.add(8.2);
        notasAlunos.add(4.3);
        notasAlunos.add(9.3);

        //Não garante a ordem para fácil inserção, remoção e consulta dos dados
        System.out.println(notasAlunos);
        notasAlunos.remove(6.2);
        System.out.println(notasAlunos);

        System.out.println(notasAlunos.size());

        Iterator<Double> notas = notasAlunos.iterator();
        while(notas.hasNext()){
            System.out.println(notas.next());
        }

        for (Double nota: notasAlunos) {
            System.out.println(nota);
        }
    }
}
