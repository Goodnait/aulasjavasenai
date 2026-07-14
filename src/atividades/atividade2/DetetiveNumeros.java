package atividades.atividade2;

public class DetetiveNumeros {
    public static void main(String[] args) {
        int numero = -4;

        System.out.println("Analisando o número: " + numero);

        if (numero % 2 == 0) {
            System.out.println("O número é Par.");
        } else {
            System.out.println("O número é Ímpar.");
        }

        if (numero > 0) {
            System.out.println("O número é Positivo.");
        } else if (numero < 0) {
            System.out.println("O número é Negativo.");
        } else {
            System.out.println("O número é Zero.");
        }
    }
}