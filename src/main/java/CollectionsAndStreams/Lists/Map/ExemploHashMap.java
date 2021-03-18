package CollectionsAndStreams.Lists.Map;

import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {
    public static void main(String[] args) {
        Map<String, Integer> campeoesFifa = new HashMap<>();

        //Adiciona os campeões mundiais da Fifa, parecido com o add mas usa-se put
        campeoesFifa.put("Brasil", 5);
        campeoesFifa.put("Alemanha", 4);
        campeoesFifa.put("Itália", 4);
        campeoesFifa.put("Uruguai", 2);
        campeoesFifa.put("França", 2);
        campeoesFifa.put("Ingraterra", 1);
        campeoesFifa.put("Espanha", 1);
        System.out.println(campeoesFifa);

        //Atualizando valor para Brasil
        campeoesFifa.put("Brasil", 6);
        System.out.println("\n" + campeoesFifa);

        System.out.println("\n");
        //Retorna Argentina
        System.out.println(campeoesFifa.get("Argentina"));

        //Retorna se existe ou não um campeão mundial com nome de França
        System.out.println("\n" + campeoesFifa.containsKey("França"));

        // Remove o campeão França
        campeoesFifa.remove("França");

        //Retorna se existe ou não um campeão mundial com nome de França
        System.out.println("\n" + campeoesFifa.containsKey("França"));

        //Retorna se tem algum hexacampeão
        System.out.println("\n" + campeoesFifa.containsValue(6));

        //Retorna o tamanho do mapa
        System.out.println("\n" + campeoesFifa.size());
        System.out.println("\n" + campeoesFifa);

        System.out.println("\n");
        //Navega nos registros do map
        for(Map.Entry<String, Integer> entry: campeoesFifa.entrySet()){
            System.out.println(entry.getKey() + "--" + entry.getValue());
        }

        System.out.println("\n");
        //Navega nos registros do mapa
        for(String key: campeoesFifa.keySet()){
            System.out.println(key + "--" + campeoesFifa.get(key));
        }

        System.out.println("\n");
        System.out.println(campeoesFifa);

        System.out.println("\n");
        System.out.println(campeoesFifa.size());
        System.out.println("\n");
        campeoesFifa.clear();
        System.out.println(campeoesFifa.size());

    }
}
