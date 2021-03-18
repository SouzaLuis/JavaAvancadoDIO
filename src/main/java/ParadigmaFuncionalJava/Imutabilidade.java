package ParadigmaFuncionalJava;

import java.util.function.UnaryOperator;

public class Imutabilidade {
    public static void main(String[] args) {
        int valor = 60;
        UnaryOperator<Integer> retornarDobro = v-> v *2;
        System.out.println(retornarDobro.apply(valor)); // Tem que retoranar o dobro do valor
        System.out.println(valor);//valor não será alterado
    }
}
