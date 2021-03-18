package ParadigmaFuncionalJava;

import java.util.function.UnaryOperator;

public class Funcional {
    public static void main(String[] args) {

        UnaryOperator<Integer> calcularValorVezesTres = valor -> valor* 3; // Conceito do paradigma funcional
        int valor = 10;
        System.out.println("O resultado é :: " + calcularValorVezesTres.apply(10));


        //Dados uma regra ou uma declaração de como queremos que o algoritmo se comporte
    }
}
