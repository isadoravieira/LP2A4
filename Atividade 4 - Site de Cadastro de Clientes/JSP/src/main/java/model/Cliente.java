package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cliente {

    private  String  id;
    private String nome;
    private String dataNascimento;
    private String cpf;
    private String telefone;

    public Cliente(String id, String nome, String dataNascimento, String cpf, String telefone) {
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    static List<Cliente> clientes = new ArrayList<>();
    public static String buscarClientePorId(String clienteId) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("--- PROCURAR CLIENTE ---");

        if(clientes.isEmpty()){
            System.out.println("A lista de clientes está vazia.");
        }
        else{
            System.out.println("Digite o id do cliente: ");

            String procurarCliente = entrada.nextLine();
            boolean achou = false;

            for(int i = 0; i < clientes.size(); i ++){
                if(clientes.get(i).getId().contains(procurarCliente)){

                    System.out.println("\n- ID: " + clientes.get(i).getId() +
                            "\n- Nome: " + clientes.get(i).getNome() +
                            "\n- Data de nascimento: " + clientes.get(i).getDataNascimento() +
                            "\n- CPF: " + clientes.get(i).getCpf() +
                            "\n- Telefone:  " + clientes.get(i).getTelefone());
                    achou = true;
                }
                if (!achou){
                    System.out.println("Cliente não encontrado. Verifique se o id foi escrito corretamente.\n");
                }
            }
        }
        return null;
    }

    public static List<Cliente> listarClientes() {
        if(clientes.isEmpty()){
            System.out.println("A lista de clientes está vazia.");
        }
        else{
            return clientes;
        }
        return null;
    }
}