package br.edu.ifsp.Restaurante.DTO;

import java.util.List;

// no request é onde os dados do cadastro vão ser passados
// como o id é gerado automaticamente então não é necessario passar aqui
public record PedidoRequestDTO(String descricao, Long cliente, List<Long> pratos, Long Funcionario) { // aqui ele ta recebendo só o id do cliente, por isso é long
                                                                                    // recebe uma lista de ids de pratos
}
