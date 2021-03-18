package CollectionsAndStreams.Lists.Queue;

import java.util.Iterator;
import java.util.Queue;
import java.util.LinkedList;

public class ExemploLinkedList {

    public static void main(String[] args) {

        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Pamela");
        filaBanco.add("Patrícia");
        filaBanco.add("Roberto");
        filaBanco.add("Flávio");
        filaBanco.add("Anderson");

        System.out.println(filaBanco);

        String clienteASerAtendido = filaBanco.poll();

        System.out.println("\nPróximo cliente a ser atendido: " + clienteASerAtendido + "\n");

        System.out.println(filaBanco);

        //Ver quem é o primeior da fila
        String primeiroCliente = filaBanco.peek();
        System.out.println("Próximo cliente a ser atendido: " + primeiroCliente);
        System.out.println(filaBanco);

        //Retorna o primeiro da fila ou gera um erro através de uma exception
        String primeiroClienteOuErro = filaBanco.element();
        System.out.println(primeiroClienteOuErro);
        System.out.println(filaBanco);

        for(String cliente: filaBanco){
            System.out.println("\n\n" + cliente);
        }

        Iterator<String> iteratorFilaBanco = filaBanco.iterator();

        while (iteratorFilaBanco.hasNext()){
            System.out.println("-->" + iteratorFilaBanco.next());
        }

        System.out.println(filaBanco.size());
        filaBanco.clear();
        System.out.println(filaBanco.isEmpty());

        filaBanco.add("Wesley");

        System.out.println(filaBanco);


    }
}
