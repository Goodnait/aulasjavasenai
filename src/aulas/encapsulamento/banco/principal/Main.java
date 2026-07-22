package aulas.encapsulamento.banco.principal;

import aulas.encapsulamento.banco.modelo.ContaBancaria;

/**
 * ATIVIDADE
 *
 * 1. Quando instanciar a classe, o usuário deve somente inserir seu nome
 * 2. O usuário não poderá mais modificar o próprio nome depois de instancia-lo na classe principal (cria o nome, não pode alterar)
 * 3. Toda vez que uma instância dessa classe for criada, ou seja, quando criar um objeto com o new, o número de conta deve ser diferente da instância anterior.
 *    OBS: essa lógica deve ser inserida na classe de ContaBancaria
 */
public class Main {
    public static void main(String[] args) {
        ContaBancaria pessoa1 = new ContaBancaria("Joao");
        ContaBancaria pessoa2 = new ContaBancaria("Maria");
        ContaBancaria pessoa3 = new ContaBancaria("Fulano");

        pessoa1.deposistar(100);
        pessoa2.deposistar(10000);
        pessoa3.deposistar(100);
        pessoa3.sacar(10);

        System.out.println("A pessoa "+pessoa1.getTitular()+" depositou");
        pessoa1.deposistar(100);

        System.out.println(pessoa1);
        System.out.println(pessoa2);
        System.out.println(pessoa3);
    }
}