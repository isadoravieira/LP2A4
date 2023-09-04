package br.edu.ifsp.Restaurante.DTO;


import br.edu.ifsp.Restaurante.Model.Funcionario;

import java.util.List;

public record FuncionarioResponseDTO(long id, long cpf, String nome, List<PedidoResponseDTO> pedidos) {

    public FuncionarioResponseDTO(Funcionario funcionario){
        this(funcionario.getId(), funcionario.getCpf(), funcionario.getNome(), funcionario.getPedidos().stream().map(PedidoResponseDTO::new).toList());
    }
}
