package atividades.atividade5;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class GerenciadorNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        ArrayList<Double> notas = new ArrayList<>();

        System.out.println("Insira as notas (introduza um valor negativo para terminar):");

        while (true) {
            double nota = scanner.nextDouble();
            if (nota < 0) {
                break;
            }
            notas.add(nota);
        }

        if (notas.isEmpty()) {
            System.out.println("Nenhuma nota foi inserida.");
            scanner.close();
            return;
        }

        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        double media = soma / notas.size();
        System.out.printf(Locale.US, "Média das notas: %.2f%n", media);

        for (int i = notas.size() - 1; i >= 0; i--) {
            if (notas.get(i) < 5.0) {
                notas.remove(i);
            }
        }

        System.out.println("Notas aprovadas (>= 5.0): " + notas);

        scanner.close();
    }
}
