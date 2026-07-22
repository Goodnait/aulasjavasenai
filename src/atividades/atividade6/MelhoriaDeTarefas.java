package atividades.atividade6;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MelhoriaDeTarefas {


    static class Tarefa {
        String nome;
        LocalDate dataValidade;
        boolean concluida;

        public Tarefa(String nome, LocalDate dataValidade) {
            this.nome = nome;
            this.dataValidade = dataValidade;
            this.concluida = false;
        }

        @Override
        public String toString() {
            DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            String status = concluida ? "[Concluída]" : "[Pendente]";
            return nome + " (Validade: " + dataValidade.format(formatador) + ") " + status;
        }
    }

    static ArrayList<Tarefa> tarefas = new ArrayList<>();
    static ArrayList<Tarefa> tarefasConcluidas = new ArrayList<>();
    static DateTimeFormatter formatadorData = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean executando = true;

        while (executando) {
            System.out.println("\n--- Escolha uma opção ---");
            System.out.println("1. Adicionar tarefa");
            System.out.println("2. Imprimir todas tarefas (Ordem Alfabética)");
            System.out.println("3. Concluir/Remover por FIFO (Primeira que entrou)");
            System.out.println("4. Concluir/Remover por LIFO (Última que entrou)");
            System.out.println("5. Concluir/Remover por FEFO (Mais próxima de vencer)");
            System.out.println("6. Remover por nome específico");
            System.out.println("7. Visualizar tarefas concluídas");
            System.out.println("8. Finalizar programa");
            System.out.print("Opção: ");

            int opcaoSwitch = entrada.nextInt();
            entrada.nextLine();

            switch (opcaoSwitch) {
                case 1:
                    System.out.print("Digite o nome da tarefa: ");
                    String nome = entrada.nextLine();
                    System.out.print("Digite a data de validade (dd/MM/yyyy): ");
                    String dataStr = entrada.nextLine();
                    try {
                        LocalDate validade = LocalDate.parse(dataStr, formatadorData);
                        tarefas.add(new Tarefa(nome, validade));
                        System.out.println("Tarefa adicionada com sucesso!");
                    } catch (Exception e) {
                        System.out.println("Data inválida! Use o formato dd/MM/yyyy. Tarefa não salva.");
                    }
                    break;

                case 2:
                    if (verificarListaVazia()) break;
                    System.out.println("\nTotal de tarefas registradas: " + tarefas.size());

                    tarefas.sort(Comparator.comparing(t -> t.nome.toLowerCase()));
                    imprimirTarefas();
                    break;

                case 3:
                    if (verificarListaVazia()) break;

                    moverParaConcluidas(0);
                    System.out.println("Tarefa removida via FIFO!");
                    break;

                case 4:
                    if (verificarListaVazia()) break;

                    moverParaConcluidas(tarefas.size() - 1);
                    System.out.println("Tarefa removida via LIFO!");
                    break;

                case 5:
                    if (verificarListaVazia()) break;
                    int indiceMaisProximo = 0;
                    for (int i = 1; i < tarefas.size(); i++) {
                        if (tarefas.get(i).dataValidade.isBefore(tarefas.get(indiceMaisProximo).dataValidade)) {
                            indiceMaisProximo = i;
                        }
                    }
                    moverParaConcluidas(indiceMaisProximo);
                    System.out.println("Tarefa removida via FEFO (Menor validade)!");
                    break;

                case 6:
                    if (verificarListaVazia()) break;
                    System.out.print("Digite o nome exato da tarefa que deseja remover: ");
                    String nomeParaRemover = entrada.nextLine();
                    boolean removido = false;
                    for (int i = 0; i < tarefas.size(); i++) {
                        if (tarefas.get(i).nome.equalsIgnoreCase(nomeParaRemover)) {
                            moverParaConcluidas(i);
                            removido = true;
                            System.out.println("Tarefa removida com sucesso!");
                            break;
                        }
                    }
                    if (!removido) System.out.println("Tarefa não encontrada.");
                    break;

                case 7:
                    if (tarefasConcluidas.isEmpty()) {
                        System.out.println("Nenhuma tarefa concluída ainda.");
                    } else {
                        System.out.println("\n--- Histórico de Tarefas Concluídas ---");
                        for (Tarefa t : tarefasConcluidas) {
                            System.out.println("- " + t.nome);
                        }
                    }
                    break;

                case 8:
                    executando = false;
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opção incorreta...");
                    break;
            }
        }
        entrada.close();
    }


    private static void moverParaConcluidas(int indice) {
        Tarefa tarefa = tarefas.remove(indice);
        tarefa.concluida = true;
        tarefasConcluidas.add(tarefa);
    }


    private static boolean verificarListaVazia() {
        if (tarefas.isEmpty()) {
            System.out.println("A lista de tarefas está vazia.");
            return true;
        }
        return false;
    }


    private static void imprimirTarefas() {
        for (int i = 0; i < tarefas.size(); i++) {
            System.out.println((i + 1) + ". " + tarefas.get(i));
        }
    }
}
