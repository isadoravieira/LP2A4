package br.edu.ifsp.Restaurante.dto;


import br.edu.ifsp.Restaurante.Model.Funcionario;

public record FuncionarioResponseDTO(long id, long cpf, String nome) {

    public FuncionarioResponseDTO(Funcionario funcionario){
        this(funcionario.getId(), funcionario.getCpf(), funcionario.getNome());
    }
}
