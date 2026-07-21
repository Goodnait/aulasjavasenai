package aulas;

import aulas.objeto.Pessoa;

public class Testes {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Fulano", 2004, 'M', "Branco", "Professor");

        pessoa1.setNome("Joao");
        System.out.println(pessoa1.getNome());

    }
}