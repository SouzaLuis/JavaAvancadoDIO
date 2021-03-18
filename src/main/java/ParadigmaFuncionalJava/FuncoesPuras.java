package ParadigmaFuncionalJava;

import java.util.function.BiPredicate;

public class FuncoesPuras {

    public static void main(String[] args) {
        BiPredicate<Integer, Integer> verificarSeMaior = (parametro, valorComparacao) -> parametro > valorComparacao;

        System.out.println(verificarSeMaior.test(13,12));
        System.out.println(verificarSeMaior.test(13,12));

        // Nas funções puras, toda vez que exutar ela, tem que retornar o mesmo valor de acordo com o contexto.

    }
}
