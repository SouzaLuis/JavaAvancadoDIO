package ParadigmaFuncionalJava;

import java.util.Arrays;

public class ComposicaoDeFuncoes {
    public static void main(String[] args) {
        //Exemplo utilizando paradigma funcional
        int[] valores = {1,2,3,4};
        Arrays.stream(valores).filter(numero -> numero % 2 ==0).map(numero -> numero * 2).forEach(numero -> System.out.println(numero));

        System.out.println("\n\n");

        //Mesmo exemplo só que em paradigma imperativo
//        for(int i = 0; i< valores.length; i++){
//            int valor =0;
//            if(valores[i] %2 ==0){
//              valor = valores[i] * 2;
//              if(valor != 0){
//                  System.out.println(valor);
//              }
//            }
//        }
   }
        //parei o vídeo nos 8 minutos
}
