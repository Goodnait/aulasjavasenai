package atividades.atividade2;

public class CaixaLoja {
    public static void main(String[] args) {
        double valorCompra = 350.00;
        double percentualDesconto = 0.0;

        if (valorCompra >= 300.00) {
            percentualDesconto = 0.20; // 20%
        } else if (valorCompra >= 100.00) {
            percentualDesconto = 0.10; // 10%
        }

        double valorPoupado = valorCompra * percentualDesconto;
        double valorFinal = valorCompra - valorPoupado;

        System.out.printf("Valor original: R$ %.2f\n", valorCompra);
        System.out.printf("Valor poupado: R$ %.2f\n", valorPoupado);
        System.out.printf("Montante final a pagar: R$ %.2f\n", valorFinal);
    }
}