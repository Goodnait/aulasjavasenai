package atividades.atividade4;

public class SistemaCorrigido {

    public static void imprimirTexto(String texto, int repeticoes) {
        for (int i = 0; i < repeticoes; i++) {
            System.out.print(texto);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int valor = 10;
        int contador = 5;

        System.out.println("Bem Vindo ao Sistema Corrigido.");

        while (contador > 0) {
            System.out.println("Iniciando em: " + contador);
            contador--;
        }

        imprimirTexto("Carregando... ", 3);
    }
}
