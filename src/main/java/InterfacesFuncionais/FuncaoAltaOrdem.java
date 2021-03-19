package InterfacesFuncionais;

public class FuncaoAltaOrdem {
    public static void main(String[] args) {
        Calculo soma = (a, b) -> a+b;
        Calculo subtrair = (a, b) -> a-b;
        Calculo divisao = (a, b) -> a/b;
        Calculo multiplicacao = (a, b) -> a*b;
        System.out.println("Resultado Soma = " + executarOperacao(soma,1,3));
        System.out.println("Resultado Subtração = " + executarOperacao(subtrair, 10,4));
        System.out.println("Resultado Divisão = " + executarOperacao(divisao,50,3));
        System.out.println("Resultado Multiplicação = " + executarOperacao(multiplicacao,8,6));
    }

    public static double executarOperacao(Calculo calculo, double a, double b){
        return calculo.calculo(a,b);
    }
}

@FunctionalInterface
interface Calculo {
    public double calculo(double a, double b);
}

// Por parametro recebe outra função
// Ou ela retorna uma outra função