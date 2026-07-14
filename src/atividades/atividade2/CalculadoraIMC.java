package atividades.atividade2;

public class CalculadoraIMC {
    public static void main(String[] args) {
        double peso = 75.0;
        double altura = 1.75;

        double imc = peso / (altura * altura);

        System.out.printf("IMC Calculado: %.2f\n", imc);

        if (imc < 18.5) {
            System.out.println("Abaixo do peso.");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Peso normal.");
        } else if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("Sobrepeso.");
        } else { // imc >= 30.0
            System.out.println("Obesidade.");
        }
    }
}