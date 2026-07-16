package atividades.atividade4;

import java.util.Scanner;

public class SistemaCofreDigital {
    public static void abrirCofre(){
        Scanner entrada = new Scanner(System.in);

        int senhaDigitada;
        int senha = 9999;
        int tentativas = 5;

        while (tentativas > 0) {
            System.out.println("Digite sua senha: ");
            senhaDigitada = entrada.nextInt();
            if (senhaDigitada == senha){
                System.out.println("Cofre aberto!");
                break;
            } else {
                tentativas--;
                System.out.println("Codigo errado!");
                System.out.println("Restam apenas "+tentativas+" tentativas!");
            }
        }

        System.out.println("Cofre bloqueado.");
    }

    public static void main(String[] args) {
        abrirCofre();
    }
}