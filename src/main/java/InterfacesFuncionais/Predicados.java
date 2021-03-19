package InterfacesFuncionais;

import java.util.function.Predicate;

public class Predicados {
    public static void main(String[] args) {
        Predicate<String> estaVazio = valor -> valor.isEmpty();
//        Modelo de referência
//        Predicate<String> estaVazio = String::isEmpty;
        System.out.println("Teste 1: " + estaVazio.test(""));
        System.out.println("Teste 2: " + estaVazio.test("Luís"));
    }
}
