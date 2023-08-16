import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        int opcaoEscolhida = 0, opcaoAcao = 0;

        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("\n\n----- AGENDA -----\n");
            System.out.println("Escolha uma opção:");
            System.out.println("1)Evento.");
            System.out.println("2)Tarefa.");
            System.out.println("3)Lembrete.");
            System.out.println("0)Sair.");

            opcaoEscolhida = Integer.parseInt(entrada.nextLine());

            switch (opcaoEscolhida) {
                case 1:
                    do {
                        System.out.println("\n----- EVENTO -----");
                        System.out.println("O que você deseja fazer:");
                        System.out.println("1)Criar novo evento.");
                        System.out.println("2)Excluir um evento.");
                        System.out.println("3)Editar um evento.");
                        System.out.println("4)Pesquisar por titulo.");
                        System.out.println("5)Pesquisar por data.");
                        System.out.println("6)Listar eventos.");
                        System.out.println("0)Voltar.");

                        opcaoAcao = Integer.parseInt(entrada.nextLine());

                        switch (opcaoAcao) {
                            case 1:
                                Evento.adicionar();
                                break;
                            case 2:
                                Evento.excluir();
                                break;
                            case 3:
                                Evento.editar();
                                break;
                            case 4:
                                Evento.procurarTitulo();
                                break;
                            case 5:
                                Evento.procurarData();
                                break;
                            case 6:
                                Evento.listarTodos();
                                break;
                            default:
                                if (opcaoAcao != 1 && opcaoAcao != 2 && opcaoAcao != 3 && opcaoAcao != 4 && opcaoAcao != 5 && opcaoAcao != 6)
                                    System.out.println("Digite uma opçao valida.");
                                break;
                        }
                    } while (opcaoAcao != 0); //talvez aqui de erro
                    break;


                case 2:
                    do {
                        System.out.println("\n----- TAREFA -----");
                        System.out.println("O que você deseja fazer:");
                        System.out.println("1)Criar nova tarefa.");
                        System.out.println("2)Excluir uma tarefa.");
                        System.out.println("3)Editar uma tarefa.");
                        System.out.println("4)Pesquisar por titulo.");
                        System.out.println("5)Pesquisar por data.");
                        System.out.println("6)Listar tarefas.");
                        System.out.println("0)Voltar.");

                        opcaoAcao = Integer.parseInt(entrada.nextLine());

                        switch (opcaoAcao) {
                            case 1:
                                Tarefa.adicionar();
                                break;
                            case 2:
                                Tarefa.excluir();
                                break;
                            case 3:
                                Tarefa.editar();
                                break;
                            case 4:
                                Tarefa.procurarTitulo();
                                break;
                            case 5:
                                Tarefa.procurarData();
                                break;
                            case 6:
                                Tarefa.listarTodos();
                                break;
                            default:
                                if (opcaoAcao != 1 && opcaoAcao != 2 && opcaoAcao != 3 && opcaoAcao != 4 && opcaoAcao != 5 && opcaoAcao != 6)
                                    System.out.println("Digite uma opçao valida.");
                                break;
                        }
                    } while (opcaoAcao != 0); //talvez de erro
                    break;

                case 3:
                    do {
                        System.out.println("\n ----- LEMBRETE -----");
                        System.out.println("O que você deseja fazer:");
                        System.out.println("1)Criar novo lembrete.");
                        System.out.println("2)Editar um lembrete.");
                        System.out.println("3)Excluir um lembrete.");
                        System.out.println("4)Pesquisar por titulo.");
                        System.out.println("5)Pesquisar por data.");
                        System.out.println("6)Listar lembretes.");
                        System.out.println("0)Voltar.");

                        opcaoAcao = Integer.parseInt(entrada.nextLine());

                        switch (opcaoAcao) {
                            case 1:
                                Lembrete.adicionar();
                                break;
                            case 2:
                                Lembrete.editar();
                                break;
                            case 3:
                                Lembrete.excluir();
                                break;
                            case 4:
                                Lembrete.procurarTitulo();
                                break;
                            case 5:
                                Lembrete.procurarData();
                                break;
                            case 6:
                                Lembrete.listarTodos();
                                break;
                            default:
                                if (opcaoAcao != 1 && opcaoAcao != 2 && opcaoAcao != 3 && opcaoAcao != 4 && opcaoAcao != 5 && opcaoAcao != 6)
                                    System.out.println("Digite uma opçao valida.");
                                break;
                        }
                    } while (opcaoAcao != 0); //talvez de erro
                    break;
                default:
                    if (opcaoEscolhida != 0)
                        System.out.println("Digite uma opçao valida.\n");
                    else
                        System.out.println("Programa encerrado.");
                    break;
            }
        } while (opcaoEscolhida != 0);

        entrada.close();

    }
}