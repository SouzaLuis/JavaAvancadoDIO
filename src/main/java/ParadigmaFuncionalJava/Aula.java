package ParadigmaFuncionalJava;

public class Aula {
    public static void main(String[] args) {
        Funcao1 gerarUmaSaida = valor -> {
            return valor;
        };
        System.out.println(gerarUmaSaida.gerar("Luís"));;

    }

    @FunctionalInterface
    interface Funcao1 {
        String gerar(String valor);
    }
}

// Como declarar uma lambda:
//InterfaceFuncional nomeVariavel - parametro -> lógica
// Quando a Lambda tem apenas uma instrução no corpo da lógica não é necessaário o uso de chaves