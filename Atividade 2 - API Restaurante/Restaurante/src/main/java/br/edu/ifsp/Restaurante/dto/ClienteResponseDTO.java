package br.edu.ifsp.Restaurante.dto;

import br.edu.ifsp.Restaurante.Model.Cliente;
import br.edu.ifsp.Restaurante.Model.Endereco;

public record ClienteResponseDTO(long id, String nome, Endereco endereco) {

    public ClienteResponseDTO(Cliente cliente){
        this(cliente.getId(), cliente.getNome(), cliente.getEndereco());
    }
}
