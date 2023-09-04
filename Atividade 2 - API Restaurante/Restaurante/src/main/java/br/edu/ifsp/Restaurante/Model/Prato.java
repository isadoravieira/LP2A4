package br.edu.ifsp.Restaurante.Model;

import br.edu.ifsp.Restaurante.DTO.CardapioRequestDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data // gera metodos padrões (getters e setters)
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "cardapio")
@Entity(name = "cardapio")
public class Prato {
//    private  static long idBase = 0;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "titulo")
    private String titulo;
    @Column(name = "descricao")
    private String descricao;
    @Column(name = "preco")
    private double preco;

    @ManyToMany(mappedBy = "pratos") //O mappedBy é para indicar qual é o lado inverso ou não dominante da relação
    private List<Pedido> pedidos; // esse é um pouco desnecessario na pratica, pois mostra todos os pedidos de um determinado prato

    public Prato(CardapioRequestDTO data){
        this.titulo = data.titulo();
        this.descricao = data.descricao();
        this.preco = data.preco();
//        this.idBase = id ++;
    }

    public void setNome(String titulo) {
    }
}

