package CollectionsAndStreams.Lists.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class ExercicioQueue {

    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        fila.add("Juliana");
        fila.add("Pedro");
        fila.add("Carlos");
        fila.add("Larissa");
        fila.add("João");
        for(String clientes: fila){
            System.out.println("-> " + clientes);
        }
        System.out.println("\n");

        System.out.println("Primeiro da fila: " + fila.peek());
        System.out.println("Fila: " + fila);
        System.out.println("\n");

        System.out.println("Primeiro da fila: " + fila.poll());
        System.out.println("Próximos: " + fila + "\n");

        fila.add("Daniel");
        System.out.println("Fila: " + fila);

        System.out.println("Tamanho da fila: " + fila.size() + " pessoas.");

        System.out.println("A fila está vazia: " + fila.isEmpty());

        System.out.println("Tem alguém com o nome Carlos na fila: " + fila.contains("Carlos"));



    }
}
