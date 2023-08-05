import java.util.ArrayList;
import java.util.Scanner;

public class Evento {

    private String titulo;
    private String data;
    private double horarioInicial;
    private double horarioFinal;
    private String participantes;
    private String local;
    private String notificacao;
    private String cor;
    private String descricao;
//    private boolean anexo;
    private String repete;

    public Evento(String titulo, String data, double horarioInicial, double horarioFinal, String participantes, String local, String notificacao, String cor, String descricao, String repete) {
        this.titulo = titulo;
        this.data = data;
        this.horarioInicial = horarioInicial;
        this.horarioFinal = horarioFinal;
        this.participantes = participantes;
        this.local = local;
        this.notificacao = notificacao;
        this.cor = cor;
        this.descricao = descricao;
//        this.anexo = anexo;
        this.repete = repete;
    }

    public double getHorarioInicial() {
        return horarioInicial;
    }

    public void setHorarioInicial(double horarioInicial) {
        this.horarioInicial = horarioInicial;
    }

    public double getHorarioFinal() {
        return horarioFinal;
    }

    public void setHorarioFinal(double horarioFinal) {
        this.horarioFinal = horarioFinal;
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

    public double getHorario() {
        return horarioInicial;
    }

    public void setHorario(double horario) {
        this.horarioInicial = horario;
    }

    public String getParticipantes() {
        return participantes;
    }

    public void setParticipantes(String participantes) {
        this.participantes = participantes;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getNotificacao() {
        return notificacao;
    }

    public void setNotificacao(String notificacao) {
        this.notificacao = notificacao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

//    public boolean isAnexo() {
//        return anexo;
//    }
//
//    public void setAnexo(boolean anexo) {
//        this.anexo = anexo;
//    }


    public static String adicionar() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("--- ADICIONAR EVENTO ---");

        System.out.println("Digite o título do evento:");
        String titulo = entrada.nextLine();
        System.out.println("Digite a data do evento:");
        String data = entrada.nextLine();
        System.out.println("Digite o horário inicial do evento:");
        double horarioInicial = entrada.nextDouble();
        System.out.println("Digite o horário final do evento:");
        double horarioFinal = entrada.nextDouble();
        entrada.nextLine(); // pra limpar o buffer do scanner
        System.out.println("Digite o email dos participantes do evento:");
        String participantes = entrada.nextLine();
        System.out.println("Digite o local do evento:");
        String local = entrada.nextLine();
        System.out.println("Digite a descrição do evento:");
        String descrição = entrada.nextLine();
        System.out.println("Adicionar notificação?");
        String notificacao = entrada.nextLine();
        System.out.println("Qual a cor do evento?");
        String cor = entrada.nextLine();
//        System.out.println("Adicionar anexo?");
//        boolean anexo = entrada.nextBoolean();
        System.out.println("O evento se repete?");
        String repete = entrada.nextLine();
//        if (repete == "sim"){
//            System.out.println("Quais dias da semana o evento se repete? ");
//            String diasSemana = entrada.nextLine();
//        }

        Evento novoEvento = new Evento(titulo,data,horarioInicial, horarioFinal,participantes,local,notificacao,cor,descrição, repete);
        eventos.add(novoEvento);
        System.out.println("Evento adicionado com sucesso!");

        return null;
    }


    public static String excluir() {

        Scanner entrada = new Scanner(System.in);
        System.out.println("--- EXCLUIR EVENTO ---");

        if(eventos.isEmpty()){
            System.out.println("A lista de eventos está vazia.");
        }
        else{
            System.out.println("Digite o título do evento que você deseja excluir: ");
            String procurarEvento = entrada.nextLine();
            boolean achou = false;

            for (int i = 0; i < eventos.size(); i ++){
                if (eventos.get(i).getTitulo().contains(procurarEvento)){
                    eventos.remove(i);

                    System.out.print("Evento excluído com sucesso!");
                    achou = true;

                }
                if (!achou){
                    System.out.println("Evento não encontrado. Verifique se o título foi escrito corretamente.\n");
                }
            }

        }

        return null;
    }


    public static String editar() {
        Scanner entrada =  new Scanner(System.in);
        System.out.println("--- EDITAR EVENTO ---");

        if(eventos.isEmpty()){
            System.out.println("A lista de eventos está vazia.");
        }
        else{
            System.out.println("Digite o título do evento que você deseja editar: ");
            String procurarEvento = entrada.nextLine();
            boolean achou = false;

            for (int i = 0; i < eventos.size(); i ++){
                if(eventos.get(i).getTitulo().contains(procurarEvento)){

                    eventos.remove(i);

                    System.out.println("Digite os novos dados do evento: \n");
                    System.out.println("Digite o título do evento:");
                    String titulo = entrada.nextLine();
                    System.out.println("Digite a data do evento:");
                    String data = entrada.nextLine();
                    System.out.println("Digite o horário inicial do evento:");
                    double horarioInicial = entrada.nextDouble();
                    System.out.println("Digite o horário final do evento:");
                    double horarioFinal = entrada.nextDouble();
                    entrada.nextLine(); // pra limpar o buffer do scanner
                    System.out.println("Digite o email dos participantes do evento:");
                    String participantes = entrada.nextLine();
                    System.out.println("Digite o local do evento:");
                    String local = entrada.nextLine();
                    System.out.println("Digite a descrição do evento:");
                    String descrição = entrada.nextLine();
                    System.out.println("Adicionar notificação?");
                    String notificacao = entrada.nextLine();
                    System.out.println("Qual a cor do evento?");
                    String cor = entrada.nextLine();
//        System.out.println("Adicionar anexo?");
//        boolean anexo = entrada.nextBoolean();
                    System.out.println("O evento se repete?");
                    String repete = entrada.nextLine();

                    Evento novoEvento = new Evento(titulo,data,horarioInicial, horarioFinal,participantes,local,notificacao,cor,descrição, repete);
                    eventos.add(novoEvento);
                    System.out.println("Evento atualizado com sucesso!");
                    achou = true;

                }
                if (!achou){
                    System.out.println("Evento não encontrado. Verifique se o título foi escrito corretamente.\n");
                }
            }
        }
        return null;
    }


    public static String procurarTitulo() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("--- PROCURAR EVENTO ---");

        if(eventos.isEmpty()){
            System.out.println("A lista de eventos está vazia.");
        }
        else{
            System.out.println("Digite o título do evento: ");

            String procurarEventos = entrada.nextLine();
            boolean achou = false;

            for(int i = 0; i < eventos.size(); i ++){
                if(eventos.get(i).getTitulo().contains(procurarEventos)){
//                    System.out.println("\n----- EVENTO -----");
                    System.out.println("\n- Titulo: " + eventos.get(i).getTitulo() +
                            "\n- Descrição: " + eventos.get(i).getDescricao() +
                            "\n- Data: " + eventos.get(i).getData() +
                            "\n- Horário Inicial: " + eventos.get(i).getHorarioInicial() + " hrs" +
                            "\n- Horário Final:  " + eventos.get(i).getHorarioFinal() + " hrs" +
                            "\n- Participantes: " + eventos.get(i).getParticipantes() +
                            "\n- Local: " + eventos.get(i).getLocal() +
                            "\n- Cor: " + eventos.get(i).getCor() +
                            "\n- Notificação: " + eventos.get(i).getNotificacao() +
//                        "\n- Anexo: " + evento.isAnexo() +
                            "\n- Repete: " + eventos.get(i).getRepete() + "\n");
                    achou = true;
                }
                if (!achou){
                    System.out.println("Evento não encontrado. Verifique se o título foi escrito corretamente.\n");
                }
            }
        }
        return null;
    }


    public static String procurarData() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("--- PROCURAR EVENTO ---");

        if(eventos.isEmpty()){
            System.out.println("A lista de eventos está vazia.");
        }
        else{
            System.out.println("Digite a data do evento: ");

            String procurarEventos = entrada.nextLine();
            boolean achou = false;

            for(int i = 0; i < eventos.size(); i ++){
                if(eventos.get(i).getData().contains(procurarEventos)){
//                    System.out.println("\n----- EVENTO -----");
                    System.out.println("\n- Titulo: " + eventos.get(i).getTitulo() +
                            "\n- Descrição: " + eventos.get(i).getDescricao() +
                            "\n- Data: " + eventos.get(i).getData() +
                            "\n- Horário Inicial: " + eventos.get(i).getHorarioInicial() + " hrs" +
                            "\n- Horário Final:  " + eventos.get(i).getHorarioFinal() + " hrs" +
                            "\n- Participantes: " + eventos.get(i).getParticipantes() +
                            "\n- Local: " + eventos.get(i).getLocal() +
                            "\n- Cor: " + eventos.get(i).getCor() +
                            "\n- Notificação: " + eventos.get(i).getNotificacao() +
//                        "\n- Anexo: " + evento.isAnexo() +
                            "\n- Repete: " + eventos.get(i).getRepete() + "\n");
                    achou = true;
                }
                if (!achou){
                    System.out.println("Evento não encontrado na data especificada. Verifique se a data foi escrita corretamente.\n");
                }
            }
        }
        return null;
    }

    static ArrayList<Evento> eventos = new ArrayList<>();

    public static String listarTodos() {
        if(eventos.isEmpty()){
            System.out.println("A lista de eventos está vazia.");
        }
        else{
            System.out.println("\n----- EVENTOS -----");
            for (Evento evento : eventos) {
                System.out.println("\n- Titulo: " + evento.getTitulo() +
                        "\n- Descrição: " + evento.getDescricao() +
                        "\n- Data: " + evento.getData() +
                        "\n- Horário Inicial: " + evento.getHorarioInicial() + "hrs" +
                        "\n- Horário Final:  " + evento.getHorarioFinal() + "hrs" +
                        "\n- Participantes: " + evento.getParticipantes() +
                        "\n- Local: " + evento.getLocal() +
                        "\n- Cor: " + evento.getCor() +
                        "\n- Notificação: " + evento.getNotificacao() +
//                        "\n- Anexo: " + evento.isAnexo() +
                        "\n- Repete: " + evento.getRepete() + "\n");
            }
        }
        return null;
    }
}
