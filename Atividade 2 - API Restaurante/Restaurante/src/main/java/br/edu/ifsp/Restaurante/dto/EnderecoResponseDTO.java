package br.edu.ifsp.Restaurante.dto;

import br.edu.ifsp.Restaurante.Model.Endereco;

public record EnderecoResponseDTO(long id, String rua, String cidade) {

    public EnderecoResponseDTO(Endereco endereco){
        this(endereco.getId(), endereco.getRua(), endereco.getCidade());
    }
}
