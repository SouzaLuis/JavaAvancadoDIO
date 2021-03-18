package CollectionsAndStreams.Lists.StreamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploaStreamAPI {
    public static void main(String[] args) {

        List<String> estudantes = new ArrayList<>();

        //Adiciona 4 estudantes para a coleção
        estudantes.add("Pedro");
        estudantes.add("Thayse");
        estudantes.add("Marcelo");
        estudantes.add("Carla");
        estudantes.add("Juliana");
        estudantes.add("Thiago");
        estudantes.add("Rafael");

        // Retorna a contagem de elementos do stream
        System.out.println("Contagem: " + estudantes.stream().count());

        // Retorna o elemento com maior número de letras
        System.out.println("Maior número de letras: " + estudantes.stream().max(Comparator.comparingInt(String::length)));

        // Retorna o elemento com o menor número de letras
        System.out.println("Menor número de letras: " + estudantes.stream().min(Comparator.comparingInt(String::length)));

        //Retorna os elementros que tem a letra R no nome
        System.out.println("Com a letra R no nome: " + estudantes.stream().filter((estudante) ->
        estudante.toLowerCase().contains("r")).collect(Collectors.toList()));

        // Retorna uma nova coleção, com os nomes concatenados a quantidade de letra de cada nome
        System.out.println("Retorna uma nova coleção com a quantidade de letras: " + estudantes.stream().map(estudante ->
                estudante.concat(" - ").concat(String.valueOf(estudante.length()))).collect(Collectors.toList()));

        //Retorna somente os 3 primeiros elementos da coleção
        System.out.println("Retorna os 3 primeiros elemntos: " + estudantes.stream().limit(3).collect(Collectors.toList()));

        //Exibe cada elemento no console, e depois retorna a mesma coleção
        System.out.println("Retorna os elementos: " + estudantes.stream().peek(System.out::println).collect(Collectors.toList()));

        //Exibe cada elemento no console sem retornar outra coleção
        System.out.println("Retorna os elementos novamente: ");
        estudantes.stream().forEach(System.out::println);

        //Retorna true se todos os elementos possuem a letra W no nome
        System.out.println("Todos os elementos tem o W no nome? " + estudantes.stream().allMatch((elemento) -> elemento.contains("W")));

        //Retorna true se algum dos elementos possuem a letra a minúscula no nome
        System.out.println("Tem algum elemento com a letra a minúsculo no nome: " + estudantes.stream().anyMatch((elemento) -> elemento.contains("w")));

        //Retorna o primeiro elemento da coleção, se existir exibe no console
        System.out.println("Retorna o primeiro elemento da coleção: ");
        estudantes.stream().findFirst().ifPresent(System.out::println);

        //Exemplo de operação encadeada
        System.out.println("Operação encadeada: ");
        System.out.println(estudantes.stream().peek(System.out::println).map(estudante -> estudante.concat(" - ").concat(String.valueOf(estudante.length())))
        .peek(System.out::println).filter((estudante) -> estudante.toLowerCase().contains("r"))
                //.collect(Collectors.toList()));
        .collect(Collectors.joining(", ")));
        //.collect(Collectors.toSet()));
        //.collect(Collectors.groupingBy(estudante -> estudante.substring(estudante.indexOf("-") + 1))));

    }
}
