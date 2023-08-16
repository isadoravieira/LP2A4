import java.util.ArrayList;
import java.util.Scanner;

public class Tarefa{

    private String titulo;
    private String descricao;
    private String data;
    private String repete;

    public Tarefa(String titulo, String descricao, String data, String repete) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.data = data;
        this.repete = repete;
    }

    public String getRepete() {
        return repete;
    }

    public void setRepete(String repete) {
        this.repete = repete;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }


    public static String adicionar() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("--- ADICIONAR LEMBRETE ---");

        System.out.println("Digite o título da tarefa: ");
        String titulo = entrada.nextLine();
        System.out.println("Digite a descrição da tarefa: ");
        String descricao = entrada.nextLine();
        System.out.println("Digite a data da tarefa: ");
        String data = entrada.nextLine();
        System.out.println("A tarefa se repete? ");
        String repete = entrada.nextLine();

        Tarefa novaTarefa = new Tarefa(titulo,descricao,data,repete);
        tarefas.add(novaTarefa);
        System.out.println("Tarefa adicionada com sucesso!");
        return null;
    }


    public static String excluir() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("--- EXCLUIR TAREFA ---");

        if(tarefas.isEmpty()){
            System.out.println("A lista de tarefas está vazia.");
        }
        else {
            System.out.println("Digite o título do lembrete que você deseja excluir: ");
            String procurarTarefa = entrada.nextLine();
            boolean achou = false;

            for (int i = 0; i < tarefas.size(); i++){
                if (tarefas.get(i).getTitulo().contains(procurarTarefa)){
                    tarefas.remove(i);
                    System.out.println("Tarefa excluída com sucesso!");
                    achou = true;
                }
                if (!achou){
                    System.out.println("Tarefa não encontrada. Verifique se o título foi escrito corretamente.\n");
                }
            }
        }
        return null;
    }


    public static String editar() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("--- EDITAR TAREFA ---");

        if(tarefas.isEmpty()){
            System.out.println("A lista de tarefas está vazia.");
        }
        else{
            System.out.println("Digite o título da tarefa que você deseja editar: ");
            String procurarEvento = entrada.nextLine();
            boolean achou = false;

            for (int i = 0; i < tarefas.size(); i ++){
                if (tarefas.get(i).getTitulo().contains(procurarEvento)){
                    tarefas.remove(i);
                    System.out.println("Digite os novos dados da tarefa: \n");
                    System.out.println("Digite o título da tarefa: ");
                    String titulo = entrada.nextLine();
                    System.out.println("Digite a descrição da tarefa: ");
                    String descricao = entrada.nextLine();
                    System.out.println("Digite a data da tarefa: ");
                    String data = entrada.nextLine();
                    System.out.println("A tarefa se repete? ");
                    String repete = entrada.nextLine();

                    Tarefa novaTarefa = new Tarefa(titulo,descricao,data,repete);
                    tarefas.add(novaTarefa);
                    System.out.println("Tarefa atualizada com sucesso!");
                    achou = true;
                }
            }
        }
        return null;
    }


    public static String procurarTitulo() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("--- PROCURAR TAREFA ---");

        if(tarefas.isEmpty()){
            System.out.println("A lista de tarefas está vazia.");
        }
        else{
            System.out.println("Digite o título da tarefa:");
            String procurarTarefa = entrada.nextLine();
            boolean achou = false;

            for (int i = 0; i < tarefas.size(); i++){
                if (tarefas.get(i).getData().contains(procurarTarefa)){

                    System.out.println("\n- Titulo: " + tarefas.get(i).getTitulo() +
                            "\n- Descrição: " + tarefas.get(i).getDescricao() +
                            "\n- Data: " + tarefas.get(i).getData() +
                            "\n- Repete: " + tarefas.get(i).getRepete() + "\n");
                    achou = true;
                }
                if (!achou){
                    System.out.println("Tarefa não encontrada. Verifique se o título foi escrita corretamente.\n");
                }
            }
        }
        return null;
    }


    public static String procurarData() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("--- PROCURAR TAREFA ---");

        if(tarefas.isEmpty()){
            System.out.println("A lista de tarefas está vazia.");
        }
        else{
            System.out.println("Digite a data da tarefa:");
            String procurarTarefa = entrada.nextLine();
            boolean achou = false;

            for (int i = 0; i < tarefas.size(); i++){
                if (tarefas.get(i).getData().contains(procurarTarefa)){

                    System.out.println("\n- Titulo: " + tarefas.get(i).getTitulo() +
                            "\n- Descrição: " + tarefas.get(i).getDescricao() +
                            "\n- Data: " + tarefas.get(i).getData() +
                            "\n- Repete: " + tarefas.get(i).getRepete() + "\n");
                    achou = true;
                }
                if (!achou){
                    System.out.println("Tarefa não encontrada. Verifique se a data foi escrita corretamente.\n");
                }
            }
        }
        return null;
    }

    static ArrayList<Tarefa> tarefas = new ArrayList<>();

    public static String listarTodos() {
        if(tarefas.isEmpty()){
            System.out.println("A lista de tarefas está vazia.");
        }
        else{
            System.out.println("\n----- TAREFAS -----");
            for (Tarefa tarefa : tarefas) {
                System.out.println("\n -Titulo: " + tarefa.getTitulo() +
                                "\n- Descrição: " + tarefa.getDescricao() +
                                "\n- Data: " + tarefa.getData() +
                                "\n- Repete: " + tarefa.getRepete() + "\n");
            }
        }

        return null;
    }
}
