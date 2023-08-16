package br.edu.ifsp.Restaurante.Model;

import br.edu.ifsp.Restaurante.dto.CardapioRequestDTO;
import br.edu.ifsp.Restaurante.dto.CardapioResponseDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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

    public Prato(CardapioRequestDTO data){
        this.titulo = data.titulo();
        this.descricao = data.descricao();
        this.preco = data.preco();
//        this.idBase = id ++;
    }

    public void setNome(String titulo) {
    }
}

