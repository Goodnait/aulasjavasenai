package atividades.atividade5;

import java.util.Scanner;

public class AnalisadorTemperaturas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] temperaturasVetor = new double[6];

        int repeticoes = 0;
        while (repeticoes < temperaturasVetor.length){
            System.out.println("Digite uma temperatura: ");
            temperaturasVetor[repeticoes] = scanner.nextDouble();
            repeticoes++;
        }

        double maior = temperaturasVetor[0];
        double menor = temperaturasVetor[0];

        // Procurar o maior e o menor
        for (int i = 1; i < 6; i++) {
            if (temperaturasVetor[i] > maior) {
                maior = temperaturasVetor[i];
            }
            if (temperaturasVetor[i] < menor) {
                menor = temperaturasVetor[i];
            }
        }

        System.out.println("Todas as temperaturas"+temperaturasVetor);
        System.out.println("Maior temperatura: "+maior);
        System.out.println("Menor temperatura: "+menor);
    }
}