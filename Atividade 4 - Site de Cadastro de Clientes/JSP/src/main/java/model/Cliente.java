package model;

public class Cliente {

    private long id;
    private long idBase = 01;
    private String nome;
    private String data;
    private Long cpf;
    private Long telefone;

    public Cliente(long id, String nome, String data, Long cpf, Long telefone) {
        this.id = id;

        this.nome = nome;
        this.data = data;
        this.cpf = cpf;
        this.telefone = telefone;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public Long getTelefone() {
        return telefone;
    }

    public void setTelefone(Long telefone) {
        this.telefone = telefone;
    }
}
