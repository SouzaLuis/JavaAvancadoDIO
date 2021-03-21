package Inferencia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.stream.Collectors;

public class  InferenciaExemplo {

    public static void main(String[] args) throws IOException {
        printarNomeCompleto("Luís","Souza");

        printarSoma(265,800);
    }

    private static void connectAndPrintURLJavaOracle() throws IOException {
        URL url = new URL("https://docs.oracle.com/javase/10/language/");
        URLConnection urlConnection = url.openConnection();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
        System.out.println(bufferedReader.lines().collect(Collectors.joining()).replaceAll(">",">\n"));
    }

    public static void printarNomeCompleto(String nome, String sobrenome){
        String nomeCompleto = String.format("%s %s",nome,sobrenome);
        System.out.println(nomeCompleto);

    }
    public static void printarSoma(int... numeros){
        int soma;
        if(numeros.length>0){
            soma =0;
            for(int numero :numeros){
                soma+=numero;
            }
            System.out.println("A soma é: " + soma);
        }
    }


//        var conseguimos utilizar no for se julgar necessário
//        var conseguimos utilizar em variáveis locais iniciliazadas
//        var conseguimos utilizar com try with resource


//        var não pode ser utilizado em nível de classe
//        var não pode ser utilizado como parametro
//        var não pode ser inicializado em variáveis locais não inicializadas
//        https://docs.oracle.com/javase/10/language/

}
