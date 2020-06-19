package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercicio001List {
    public static void main(String[] args) {
        List<String> aprovados = new ArrayList<>();
        List<String> reprovados = new ArrayList<>();

        aprovados.add("Tiago");
        aprovados.add("Maria");
        reprovados.add("Mayara");
        reprovados.add("Mariana");
        aprovados.add("Maite");
        reprovados.add("Gian");


        System.out.println("Aprovados: " + aprovados);
        System.out.println("Reprovados: " + reprovados);

        List<String> todos = new ArrayList<>();

        todos.addAll(aprovados);
        todos.addAll(reprovados);

        Collections.sort(todos);

        System.out.println("Todos os alunos: " + todos);


    }
}
