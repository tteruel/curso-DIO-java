package collections;

import java.util.LinkedList;
import java.util.Queue;

public class ExemploQueue {
    public static void main(String[] args) {
        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Patricia");
        filaBanco.add("Roberto");
        filaBanco.add("Flavio");
        filaBanco.add("Pamela");
        filaBanco.add("Anderson");


        System.out.println(filaBanco);
        System.out.println("Cliente a ser atendido primeiro: "+ filaBanco.poll()); // o elemento do topo sai da fila
        System.out.println("Primeiro Cliente: "+ filaBanco.peek()); // o elemnto não sai da fila

        System.out.println("Element: "+ filaBanco.element());
        //filaBanco.clear();
       // System.out.println("Element: "+ filaBanco.element()); erro





    }
}
