package br.edu.ifsp.Restaurante.DTO;

import br.edu.ifsp.Restaurante.Model.Pedido;

import java.util.List;

public record PedidoResponseDTO(long id, String descricao, ClienteResponseDTO clienteResponseDTO, List<CardapioResponseDTO> pratos, FuncionarioResponseDTO funcionarioResponseDTO) {

    public PedidoResponseDTO(Pedido pedido){
        this(pedido.getId(), pedido.getDescricao(), new ClienteResponseDTO(pedido.getCliente()), pedido.getPratos().stream().map(CardapioResponseDTO::new).toList(), new FuncionarioResponseDTO(pedido.getFuncionario()));
    }
}
