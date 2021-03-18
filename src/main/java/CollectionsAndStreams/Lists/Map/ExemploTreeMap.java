package CollectionsAndStreams.Lists.Map;

import java.util.TreeMap;

public class ExemploTreeMap {
    public static void main(String[] args) {

        TreeMap<String, String> treeCapitais = new TreeMap<>();

        //Monta árvore com as capitais
        treeCapitais.put("RS", "Porto Alegre");
        treeCapitais.put("SC", "Florianópolis");
        treeCapitais.put("PR", "Curitiba");
        treeCapitais.put("SP", "São Paulo");
        treeCapitais.put("RJ", "Rio de Janeiro");
        treeCapitais.put("MG", "Belo Horizonte");
        System.out.println(treeCapitais);

        //Retorna a capital do topo da árvore
        System.out.println(treeCapitais.firstKey());

        //Retorna a capital no final da árvore
        System.out.println(treeCapitais.lastKey());

        //Retorna a primeira capital abaixo na árvore de acordo com parámetro
        System.out.println(treeCapitais.lowerKey("SC"));

        //Retorna a capital acima de acordo com parámetro
        System.out.println(treeCapitais.higherKey("SC"));



    }

}
