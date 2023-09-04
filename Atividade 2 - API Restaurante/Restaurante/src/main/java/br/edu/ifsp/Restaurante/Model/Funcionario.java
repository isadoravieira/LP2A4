package br.edu.ifsp.Restaurante.Model;

import br.edu.ifsp.Restaurante.DTO.FuncionarioRequestDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

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

    @OneToMany(mappedBy = "funcionario", cascade = CascadeType.ALL)
    private List<Pedido> pedidos;

    public Funcionario(FuncionarioRequestDTO data) {
        this.cpf = data.cpf();
        this.nome = data.nome();
    }

}
