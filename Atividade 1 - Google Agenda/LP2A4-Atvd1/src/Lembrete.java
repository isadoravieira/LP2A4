import java.util.ArrayList;
import java.util.Scanner;

public class Lembrete{

    private String titulo;
    private String data;
    private String repete;

    public Lembrete(String titulo, String data, String  repete) {
        this.titulo = titulo;
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

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }




    public static String adicionar() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("--- ADICIONAR LEMBRETE ---");

        System.out.println("Digite o título do lembrete: ");
        String titulo = entrada.nextLine();
        System.out.println("Digite a data do lembrete: ");
        String data = entrada.nextLine();
        System.out.println("O lembrete se repete? ");
        String repete = entrada.nextLine();

        Lembrete novoLembrete = new Lembrete(titulo,data,repete);
        lembretes.add(novoLembrete);
        System.out.println("Lembrete adicionado com sucesso!");

        return null;
    }


    public static String excluir() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("--- EXCLUIR LEMBRETE ---");

        if(lembretes.isEmpty()){
            System.out.println("A lista de lembretes está vazia.");
        }
        else {
            System.out.println("Digite o título do lembrete que você deseja excluir: ");
            String procurarLembrete = entrada.nextLine();
            boolean achou = false;

            for (int i = 0; i < lembretes.size(); i++){
                if (lembretes.get(i).getTitulo().contains(procurarLembrete)){
                    lembretes.remove(i);
                    System.out.println("Lembrete excluído com sucesso!");
                    achou = true;
                }
                if (!achou){
                    System.out.println("Lembrete não encontrado. Verifique se o título foi escrito corretamente.\n");
                }
            }
        }

        return null;
    }

    public static String editar() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("--- EDITAR LEMBRETE ---");

        if(lembretes.isEmpty()){
            System.out.println("A lista de lembretes está vazia.");
        }
        else{
            System.out.println("Digite o título do lembrete que você deseja editar: ");
            String procurarEvento = entrada.nextLine();
            boolean achou = false;

            for (int i = 0; i < lembretes.size(); i ++){
                if (lembretes.get(i).getTitulo().contains(procurarEvento)){
                    lembretes.remove(i);
                    System.out.println("Digite os novos dados do lembrete: \n");
                    System.out.println("Digite o título do lembrete: ");
                    String titulo = entrada.nextLine();
                    System.out.println("Digite a data do lembrete: ");
                    String data = entrada.nextLine();
                    System.out.println("O lembrete se repete? ");
                    String repete = entrada.nextLine();

                    Lembrete novoLembrete = new Lembrete(titulo,data,repete);
                    lembretes.add(novoLembrete);
                    System.out.println("Lembrete atualizado com sucesso!");
                    achou = true;
                }
            }
        }

        return null;
    }

    static ArrayList<Lembrete> lembretes = new ArrayList<>();

    public static String procurarTitulo() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("--- PROCURAR LEMBRETE ---");

        if(lembretes.isEmpty()){
            System.out.println("A lista de lembretes está vazia.");
        }
        else{
            System.out.println("Digite o titulo do lembrete:");
            String procurarLembrete = entrada.nextLine();
            boolean achou = false;

            for (int i = 0; i < lembretes.size(); i++){
                if (lembretes.get(i).getTitulo().contains(procurarLembrete)){
//                    System.out.println("\n----- LEMBRETE -----");
                    System.out.println("\n- Titulo: " + lembretes.get(i).getTitulo() +
                            "\n- Data: " + lembretes.get(i).getData() +
                            "\n- Repete: " + lembretes.get(i).getRepete() + "\n");
                    achou = true;
                }
                if (!achou){
                    System.out.println("Lembrete não encontrado. Verifique se o título foi escrito corretamente.\n");
                }
            }
        }
        return null;
    }


    public static String procurarData() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("--- PROCURAR LEMBRETE ---");

        if(lembretes.isEmpty()){
            System.out.println("A lista de lembretes está vazia.");
        }
        else{
            System.out.println("Digite a data do lembrete:");
            String procurarLembrete = entrada.nextLine();
            boolean achou = false;

            for (int i = 0; i < lembretes.size(); i++){
                if (lembretes.get(i).getData().contains(procurarLembrete)){
//                    System.out.println("\n----- LEMBRETE -----");
                    System.out.println("\n- Titulo: " + lembretes.get(i).getTitulo() +
                            "\n- Data: " + lembretes.get(i).getData() +
                            "\n- Repete: " + lembretes.get(i).getRepete() + "\n");
                    achou = true;
                }
                if (!achou){
                    System.out.println("Lembrete não encontrado. Verifique se a data foi escrita corretamente.\n");
                }
            }
        }

        return null;
    }


    public static String listarTodos() {
        if(lembretes.isEmpty()){
            System.out.println("A lista de lembretes está vazia.");
        }
        else{
            System.out.println("\n----- LEMBRETES -----");
            for (Lembrete lembrete : lembretes) {
                System.out.println("\n- Titulo: " + lembrete.getTitulo() +
                        "\n- Data: " + lembrete.getData() +
                        "\n- Repete: " + lembrete.getRepete() + "\n");
            }
        }

        return null;
    }
}
