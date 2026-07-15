package atividades.atividade3;
import java.util.Scanner;


public class Calculadora {
    private double valor;

    public Calculadora(double valorInicial) {
        this.valor = valorInicial;
    }

    public Calculadora add(double numero) {
        this.valor += numero;
        return this; // Retorna a própria instância para encadear
    }

    public Calculadora subtract(double numero) {
        this.valor -= numero;
        return this;
    }

    public Calculadora multiply(double numero) {
        this.valor *= numero;
        return this;
    }

    public Calculadora divide(double numero) {
        if (numero == 0) {
            System.out.println("Erro: divisão por zero ignorada.");
            return this;
        }
        this.valor /= numero;
        return this;
    }

    public double result() {
        return this.valor;
    }

    public Calculadora reset(double novoValor) {
        this.valor = novoValor;
        return this;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


            System.out.print("Digite o valor inicial: ");
            double inicial = sc.nextDouble();

            Calculadora calc = new Calculadora(inicial);

            double resultado = calc
                    .add(5)
                    .multiply(2)
                    .subtract(3)
                    .divide(4)
                    .result();

            System.out.println("Resultado final: " + resultado);

         {
            System.out.println("Entrada inválida. Digite apenas números.");
            sc.close();
        }
    }
}
