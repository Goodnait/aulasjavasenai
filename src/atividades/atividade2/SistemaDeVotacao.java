package atividades.atividade2;

import java.util.Scanner;

public class SistemaDeVotacao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        {
            int idade;

            System.out.print("Digite a idade da pessoa: ");
            if (!scanner.hasNextInt()) {
                System.out.println("Entrada inválida. Digite um número inteiro.");
                return;
            }
            idade = scanner.nextInt();

            if (idade < 0) {
                System.out.println("Idade inválida. Não pode ser negativa.");
                return;
            }

            if (idade < 16) {
                System.out.println("Situação: Não eleitor.");
            } else if (idade <= 18 || idade > 65) {
                System.out.println("Situação: Eleitor facultativo.");
            } else {
                System.out.println("Situação: Eleitor obrigatório.");
            }

        }  {
            scanner.close();
        }
    }
}
