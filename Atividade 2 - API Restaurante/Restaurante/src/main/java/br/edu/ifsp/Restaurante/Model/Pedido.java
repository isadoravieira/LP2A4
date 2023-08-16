package br.edu.ifsp.Restaurante.Model;

import br.edu.ifsp.Restaurante.dto.PedidoRequestDTO;
import br.edu.ifsp.Restaurante.dto.PedidoResponseDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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

    public  Pedido(PedidoRequestDTO data){
        this.descricao = data.descricao();
    }

}
