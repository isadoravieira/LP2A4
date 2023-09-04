package br.edu.ifsp.Restaurante.Model;

import br.edu.ifsp.Restaurante.DTO.ClienteRequestDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "cliente")
@Entity(name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long  id;
//    private long idBase = 01;
    @Column(name = "nome")
    private String nome;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "endereco_id")
    private Endereco endereco;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<Pedido> pedidos;
    public Cliente(ClienteRequestDTO data){
        this.nome = data.nome();
        this.endereco = data.endereco();
//        this.idBase = id ++;
    }


}
