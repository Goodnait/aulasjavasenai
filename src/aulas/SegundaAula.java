package aulas;

import java.util.Scanner;

public class SegundaAula {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();

        System.out.println("Utilizando a comparação do IF e ELSE");
        if (value == 1) {
            System.out.println("Escolheu 1");
        } else if (value == 2) {
            System.out.println("Escolheu 2");
        } else {
            System.out.println("Não escolheu uma das opções");
        }

        System.out.println("\n\nUtilizando a comparação do SWITCH CASE");
        switch (value){
            case 1:
                System.out.println("Escolheu 1");
                break;
            case 2:
                System.out.println("Escolheu 2");
                break;
            default:
                System.out.println("Não escolheu uma das opções");
                break;
        }
    }
}