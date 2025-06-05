package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lista1 {


    public static void main(String[] args) {

        // declaração de uma lista de strings
        List<String> lista = new ArrayList<String>(); // ArrayList permite duplicada e fica em ordem de inserção

        lista.add("pão de forma");
        lista.add("ovos");

        String ItemFruta1 = "Frutas";
        String ItemFruta2 = "Frutas";

        lista.add("frutas");
        lista.add("frutas"); // não é uma duplicata porque há dois objetos String com contéúdo igual
        String itemDaLista = "café";
        lista.add(itemDaLista);
        lista.add(itemDaLista); // isto é uma du  licada

        for (int i = 0; i< lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        System.out.println("gay");

        // iteração usando for each
        for(String item : lista) {
            System.out.println(item);

        }

        System.out.println("outro gay");


        // iteraçao usando for each com expressão Lambda
        lista.forEach( item -> System.out.println(item));

        // iteração usando um Iterator
        Iterator<String> iterator = lista.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }




    }
}
