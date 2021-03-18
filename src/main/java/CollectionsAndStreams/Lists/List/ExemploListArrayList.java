package CollectionsAndStreams.Lists.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploListArrayList {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();

        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Luis Fernando");
        nomes.add("Wagner");
        nomes.add("Maria");
        nomes.add("Joao");
        nomes.add("Anderson");

        System.out.println("Desordenado: " + nomes);
        nomes.set(2, "Larissa");

        Collections.sort(nomes);
        nomes.set(2, "Bento");
        nomes.remove(4);
        System.out.println("Ordenado: " +nomes);

        nomes.remove("Wagner");
        System.out.println(nomes);

        String nome = nomes.get(4);

        int tamanho = nomes.size();

        System.out.println(nome);

        System.out.println(tamanho);

        nomes.remove("Larissa");

        tamanho = nomes.size();

        System.out.println(tamanho);

        int posicao = nomes.indexOf("Carlos");

        System.out.println(posicao);

        boolean temAnderson = nomes.contains("Anderson");

        System.out.println(temAnderson);
        boolean listaVazia = nomes.isEmpty();

        System.out.println("A lista está vazia? " + listaVazia + "\n\n\n");

        for(String nomeDoItem: nomes){
            System.out.println("For ->" + nomeDoItem);
        }

        System.out.println("\n");

        Iterator<String> iterator = nomes.iterator();

        while(iterator.hasNext()){
            System.out.println("While ->" + iterator.next());
        }

        nomes.clear();

       listaVazia = nomes.isEmpty();

        System.out.println("\n\nA lista está vazia? " + listaVazia);



    }
}
