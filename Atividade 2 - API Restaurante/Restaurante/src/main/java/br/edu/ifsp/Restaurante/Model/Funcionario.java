package br.edu.ifsp.Restaurante.Model;

import br.edu.ifsp.Restaurante.dto.FuncionarioRequestDTO;
import br.edu.ifsp.Restaurante.dto.FuncionarioResponseDTO;
import br.edu.ifsp.Restaurante.repository.FuncionarioRepository;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "funcionario")
@Entity(name = "funcionario")
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "cpf")
    private long cpf;
    @Column(name = "nome")
    private String nome;

    public Funcionario(FuncionarioRequestDTO data) {
        this.cpf = data.cpf();
        this.nome = data.nome();
    }

}
