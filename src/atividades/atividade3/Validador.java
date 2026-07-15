package atividades.atividade3;

public class Validador {

    public static boolean ehMaiorDeIdade(int idade, boolean possuiAutorizacao) {
        if (idade >= 18 || possuiAutorizacao) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int idadePessoa1 = 20;
        boolean autorizacaoPessoa1 = false;

        int idadePessoa2 = 16;
        boolean autorizacaoPessoa2 = true;

        System.out.println("Pessoa 1 é maior de idade? " + ehMaiorDeIdade(idadePessoa1, autorizacaoPessoa1));
        System.out.println("Pessoa 2 é maior de idade? " + ehMaiorDeIdade(idadePessoa2, autorizacaoPessoa2));
    }
}