package ParadigmaFuncionalJava;

public class
FatorialTailCall {
    public static void main(String[] args) {
        System.out.println("Fatorial com Tail Call: " + fatorialA(6));
    }

    public static double fatorialA(double valor){
        return fatorialComTailCall(valor, 1);
    }
    public static double fatorialComTailCall(double valor, double numero){
        if(valor ==0){
            return numero;
        }
        return fatorialComTailCall(valor-1,numero*valor);
    }
}
