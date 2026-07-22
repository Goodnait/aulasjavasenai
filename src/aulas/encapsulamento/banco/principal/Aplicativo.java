package aulas.encapsulamento.banco.principal;

import aulas.encapsulamento.banco.modelo.ContaBancaria;

import java.util.Scanner;

public class Aplicativo {
    public static void main(String[] args) {
        ContaBancaria minhaConta = new ContaBancaria("João de Menezes");
        Scanner entrada = new Scanner(System.in);
        System.out.println("INICIANDO APLICATIVO DO BANCO");

        while (true) {
            System.out.println("Escolha uma opção:\n1. Depositar\n2. Sacar\n3.Sair");
            int opcaoAplicativo = entrada.nextInt();
            entrada.nextLine();
            switch (opcaoAplicativo){
                case 1://DEPOSITAR
                    minhaConta.deposistar(100);
                    break;
                case 2://SACAR
                    minhaConta.sacar(10);
                    break;
                case 3://SAIR
                    return;
                default:
                    System.out.println("Escolha outra opção");
                    break;
            }
        }
    }
}