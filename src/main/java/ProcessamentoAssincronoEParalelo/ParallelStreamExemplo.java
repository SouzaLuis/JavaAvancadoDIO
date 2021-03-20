package ProcessamentoAssincronoEParalelo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ParallelStreamExemplo {
    public static void main(String[] args) {

        long inicio = System.currentTimeMillis();
        IntStream.range(1,100000).forEach(num ->fatorial(num)); //Serial Stream
        long fim = System.currentTimeMillis();
        System.out.println("Tempo de execução Serial: " + (fim-inicio));

        inicio = System.currentTimeMillis();
        IntStream.range(1,1000000).parallel().forEach(num ->fatorial(num)); //Parallel
         fim = System.currentTimeMillis();
        System.out.println("Tempo de execução Parallel: " + (fim-inicio));

        List<String> nomes = Arrays.asList("Luís", "Fernando", "Alves", "Souza");
        nomes.parallelStream().forEach(System.out::println);

    }

    public static long fatorial(long num){
        long fat = 1;
        for(long i = 2; i <=num; i++){
            fat*=i;
        }
        return fat;
    }
}
