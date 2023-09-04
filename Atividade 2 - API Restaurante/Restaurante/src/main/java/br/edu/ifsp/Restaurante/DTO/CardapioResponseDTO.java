package br.edu.ifsp.Restaurante.DTO;

import br.edu.ifsp.Restaurante.Model.Prato;

public record CardapioResponseDTO (long id, String titulo, String descricao, double preco ) {

    public  CardapioResponseDTO(Prato prato){ // construtor que recebe um objeto do prato. um objeto que recebe outro objeto
        this(prato.getId(), prato.getTitulo(), prato.getDescricao(), prato.getPreco());
    }

}
 // o rercod não usa o get