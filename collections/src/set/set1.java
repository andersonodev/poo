package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class set1 {
    public static void main(String[] args) {

        // declaração de um set de strings
        Set<String> lista = new HashSet <String>(); // HashSet nao permite duplicada e fica em ordem de inserção

        lista.add("pão de forma");
        lista.add("ovos");

        String ItemFruta1 = "Frutas";
        String ItemFruta2 = "Frutas";

        lista.add("frutas");
        lista.add("frutas"); // não é uma duplicata porque há dois objetos String com contéúdo igual
        String itemDaLista = "café";
        lista.add(itemDaLista);
        lista.add(itemDaLista); // isto é uma duplicada

        System.out.println("===============");

        // iteração usando for each
        for (String item : lista) {
            System.out.println(item);

        }

        System.out.println("===============");


        // iteraçao usando for each com expressão Lambda
        lista.forEach(item -> System.out.println(item));

        System.out.println("===============");

        // iteração usando um Iterator
        Iterator<String> iterator = lista.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }

        System.out.println("===============");
    }
}
