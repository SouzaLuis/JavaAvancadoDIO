package CollectionsAndStreams.Lists.List;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class ExercicioList {
    public static void main(String[] args) {
        List<String> names = new Vector<>();

        //Adicione 5 nomes
        names.add("Juliana");
        names.add("Pedro");
        names.add("Carlos");
        names.add("Larisa");
        names.add("João");

        //Navegue na list
        for(String name: names) {
            System.out.println("-> " + name);
        }

        System.out.println("\nTrocando nome por Roberto: ");
        //Substituir nome
        names.set(2, "Roberto");
        System.out.println(names);

        System.out.println("\n");
        //Posição 1
        System.out.println("Posição 1: " + names.get(1));

        System.out.println("\nRemovendo posição 4: ");
        //Remove posição 4
        names.remove(4);
        System.out.println(names);

        System.out.println("\nRemovendo o nome João: ");
        //Remova nome João
        names.remove("João");
        System.out.println(names);

        System.out.println("\nQuantidade de Itens:");
        //Quantidade de itens
        System.out.println(names.size());

        System.out.println("\nVerificando se existe Juliana na lista: ");
        //Verificação de nomes
        boolean temJuliana = names.contains("Juliana");
        System.out.println(temJuliana);

        System.out.println("\n\nCriando nova lista: ");
        //Criação list nova
        List<String> otherNames = new Vector<>();
        otherNames.add("Ismael");
        otherNames.add("Rodrigo");
        otherNames.addAll(names);
        System.out.println(otherNames);

        System.out.println("\nOrganizando por ordem alfabética: ");
        //Organizando por ordem alfabética
        Collections.sort(otherNames);
        System.out.println(otherNames);

        System.out.println("\nVerificação se a lista está vázia: ");
        //Verificação
        boolean listaVazia = otherNames.isEmpty();
        System.out.println(listaVazia);








    }
}
