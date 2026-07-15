package atividades.atividade3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalcularDobro {

    public static int calcularDobro(int numero) {
        return numero * 2;
    }

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite um número inteiro: ");
            int numero = scanner.nextInt();

            int resultado = calcularDobro(numero);

            System.out.println("O dobro do número é: " + resultado);

        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
        }
    }
}
