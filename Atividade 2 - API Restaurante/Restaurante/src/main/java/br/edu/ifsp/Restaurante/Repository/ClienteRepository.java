package br.edu.ifsp.Restaurante.Repository;

import br.edu.ifsp.Restaurante.Model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
