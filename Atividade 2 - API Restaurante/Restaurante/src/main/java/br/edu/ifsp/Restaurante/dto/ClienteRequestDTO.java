package br.edu.ifsp.Restaurante.dto;

import br.edu.ifsp.Restaurante.Model.Endereco;

public record ClienteRequestDTO(String nome, Endereco endereco) {

}
