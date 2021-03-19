package InterfacesFuncionais;

import java.util.function.Supplier;

public class Suppliers {
    public static void main(String[] args) {
//        Modelo Lambda
        Supplier<Pessoa> instanciaPessoaFisica = () -> new Pessoa();
//        Modelo Referencial
        Supplier<PessoaJuridica> instanciaPessoaJuridica = PessoaJuridica::new;

        System.out.println(instanciaPessoaFisica.get());
        System.out.println(instanciaPessoaJuridica.get());
    }
}

class Pessoa{
    private String nome;
    private Integer idade;

    public Pessoa(){
        nome = "Luís Fernando";
        idade = 20;
    }

    @Override
    public String toString(){
        return String.format("Nome: %s, Idade: %d", nome, idade);
    }
}

class PessoaJuridica{
    private String nome;
    private Integer fundacao;

    public PessoaJuridica(){
        nome = "LFAS Ltda";
        fundacao = 2000;
    }

    @Override
    public String toString(){
        return String.format("Nome Empresa: %s, Fundação: %d", nome, fundacao);
    }
}
