package atividades.atividade3;

import java.util.Scanner;

public class Saudacao {

    public static void imprimirSaudacao(String nome) {
        System.out.println("Olá, " + nome + "! Bem-vindo(a) à nossa aula de métodos.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();

        imprimirSaudacao(nome);

        scanner.close();
    }
}
