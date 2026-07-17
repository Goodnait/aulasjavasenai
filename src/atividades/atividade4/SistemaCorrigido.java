package atividades.atividade4;

public class SistemaCorrigido {

    public static void main(String[] args) {

        int valor = 10;
        int contador = 5;

        System.out.println("Bem-vindo ao sistema");
        while (contador > 0) {
            System.out.println("Iniciando em: " + contador);

        }
    }

    public void exibirMensagens(String texto, int repeticoes) {
        for (int i = 0; i < repeticoes; i++) {
            System.out.println(texto);
        }
    }
}