package InterfacesFuncionais;

import java.util.function.Function;

public class Funcoes {
    public static void main(String[] args) {

        Function<String, String> retornarNomeAoContrario = texto -> new StringBuilder(texto).reverse().toString();
//        Fazer o mesmo método abaixo, mas utilizando referência tem excluir a multiplicação
//        Function<String, Integer> converterStringParaInteiroEDuplicar = Integer::valueOf;
        Function<String, Integer> converterStringParaInteiroEDuplicar = string -> Integer.valueOf(string) * 2;

        System.out.println("Conversão de String para Inteiro = " + converterStringParaInteiroEDuplicar.apply("20"));

        System.out.println("Nome ao contrário = " + retornarNomeAoContrario.apply("Luis Fernando"));
    }


}
