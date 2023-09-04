package br.edu.ifsp.Restaurante.Repository;

import br.edu.ifsp.Restaurante.Model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
}
