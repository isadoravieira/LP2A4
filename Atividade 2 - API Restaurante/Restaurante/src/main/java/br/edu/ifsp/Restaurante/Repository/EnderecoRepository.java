package br.edu.ifsp.Restaurante.Repository;

import br.edu.ifsp.Restaurante.Model.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}
