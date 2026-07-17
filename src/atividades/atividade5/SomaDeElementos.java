package atividades.atividade5;

import java.util.Scanner;

public class SomaDeElementos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[5];
        int resultado = 0;

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = scanner.nextInt();
        }

        for (int i = 0; i < vetor.length; i++) {
            resultado = resultado + vetor[i];
        }
        System.out.println("Valores preenchidos: "+vetor);
        System.out.println("Soma de todos os valores digitados: "+resultado);
    }
}