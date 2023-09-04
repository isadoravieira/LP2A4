package br.edu.ifsp.Restaurante.Repository;

import br.edu.ifsp.Restaurante.Model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
