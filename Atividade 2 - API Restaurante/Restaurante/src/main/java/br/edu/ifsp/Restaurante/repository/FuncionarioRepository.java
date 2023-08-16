package br.edu.ifsp.Restaurante.repository;

import br.edu.ifsp.Restaurante.Model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
}
