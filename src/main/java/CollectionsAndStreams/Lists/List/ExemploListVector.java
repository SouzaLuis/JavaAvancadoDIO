package CollectionsAndStreams.Lists.List;

import java.util.List;
import java.util.Vector;

public class ExemploListVector {
    public static void main(String[] args) {
        List<String> esportes = new Vector<>();

        //Adicionando esportes no vetor
        esportes.add("Futebol");
        esportes.add("Basquete");
        esportes.add("Handeball");
        esportes.add("Atletismo");
        System.out.println("Lista de Esportes: " + esportes);

        System.out.println("\n");
        //Alterando valor de acordo com a posição desejada no vetor
        esportes.set(2, "Tenis de Mesa");
        System.out.println("Lista de Esportes: " + esportes);

        System.out.println("\n");
        // Remove o esporte da posição desejada no vetor
        esportes.remove(1);
        System.out.println("Lista de Esportes: " + esportes);

        System.out.println("\n");
        //Remove o esporte informado do vetor
        esportes.remove("Futebol");
        System.out.println("Lista de Esportes: " + esportes);

        System.out.println("\n");
        //Retorna o primeiro item do vetor
        System.out.println(esportes.get(0));

        System.out.println("\n");
        //Navega no vetor dos esportes
        for(String esporte: esportes){
            System.out.println(esporte);
        }



    }
}
