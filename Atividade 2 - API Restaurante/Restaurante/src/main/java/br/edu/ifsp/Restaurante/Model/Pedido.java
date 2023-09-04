package br.edu.ifsp.Restaurante.Model;

import br.edu.ifsp.Restaurante.DTO.PedidoRequestDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "pedido")
@Entity(name = "pedido")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
//    private long idBase = 01;
    @Column(name = "descricao")
    private String descricao;

    @ManyToOne(cascade = CascadeType.ALL)
    private Cliente cliente;

    @ManyToOne(cascade = CascadeType.ALL)
    private Funcionario funcionario;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "pedido_prato", joinColumns = @JoinColumn(name = "id_pedido"), inverseJoinColumns = @JoinColumn(name = "id_prato")) // criando uma "tabela associativa" entre prato e pedido
    private List<Prato> pratos; // mostra todos os pratos de um pedido


    public Pedido(String descricao, Cliente cliente, List<Prato> pratos) {
        this.descricao = descricao;
        this.cliente = cliente;
        this.pratos = pratos;
    }
}
