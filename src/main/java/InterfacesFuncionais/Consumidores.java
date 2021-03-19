package InterfacesFuncionais;

import org.w3c.dom.ls.LSOutput;

import java.util.function.Consumer;

public class Consumidores {
    public static void main(String[] args) {

        Consumer<String> imprimirUmaFrase = System.out::println;

//        Consumer<String> imprimirUmaFrase = frase -> System.out.println(frase);
        imprimirUmaFrase.accept("Luís Fernando");

    }
}
