package br.edu.ifsp.Restaurante.DTO;

import br.edu.ifsp.Restaurante.Model.Cliente;
import br.edu.ifsp.Restaurante.Model.Endereco;

import java.util.List;

public record ClienteResponseDTO(long id, String nome, Endereco endereco, List<PedidoResponseDTO> pedidos) {

    public ClienteResponseDTO(Cliente cliente){
        this(cliente.getId(), cliente.getNome(), cliente.getEndereco(), cliente.getPedidos().stream().map(PedidoResponseDTO::new).toList());
    }
}
