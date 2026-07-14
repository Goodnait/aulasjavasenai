package aulas;

import java.util.Scanner;

public class PrimeiraAula {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o seu nome?");
        String nome = scanner.nextLine();

        System.out.println("Qual a sua idade?");
        int idade = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Qual a sua altura?");
        double altura = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Qual o seu cargo?");
        String cargo = scanner.nextLine();

        System.out.println("Qual o período você estuda no SENAI?");
        String periodo = scanner.nextLine();

        scanner.close();

        System.out.println(
                "\nSuas informações:\n" +
                        "Nome: " + nome + "\n" +
                        "Idade: " + idade + " anos\n" +
                        "Altura: " + altura + "\n" +
                        "Cargo: " + cargo + "\n" +
                        "Período: " + periodo
        );
    }
}