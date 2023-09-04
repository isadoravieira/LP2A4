package br.edu.ifsp.Restaurante.Model;

import br.edu.ifsp.Restaurante.DTO.EnderecoRequestDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "endereco")
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
//    private  long idBase = 01;
    @Column(name = "rua")
    private String rua;
    @Column(name = "cidade")
    private String cidade;

    public Endereco(EnderecoRequestDTO data){
        this.rua = data.rua();
        this.cidade = data.cidade();
    }


}
