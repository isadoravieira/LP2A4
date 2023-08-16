package br.edu.ifsp.Restaurante.dto;

import br.edu.ifsp.Restaurante.Model.Pedido;

public record PedidoResponseDTO(long id, String descricao) {

    public PedidoResponseDTO(Pedido pedido){
        this(pedido.getId(), pedido.getDescricao());
    }
}
