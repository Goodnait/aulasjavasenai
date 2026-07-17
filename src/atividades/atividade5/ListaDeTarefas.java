package atividades.atividade5;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeTarefas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tarefas = new ArrayList<>();

        System.out.println("Digite suas tarefas:");
        while (true){
            System.out.print("Nova tarefa: ");
            tarefas.add(scanner.nextLine());

            System.out.println("Quer adicionar mais alguma tarefa? (digite 'fim' para finalizar o programa)");
            String opcao = scanner.nextLine();

            if (opcao.equals("fim")){
                break;
            }
        }
        System.out.println("Tarefas salvas:");
        for (int i = 0; i < tarefas.size(); i++) {
            System.out.println("Tarefa nº"+(i+1)+" "+tarefas.get(i));
        }
    }
}