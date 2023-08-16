package br.edu.ifsp.Restaurante.Controller;

import br.edu.ifsp.Restaurante.Model.Pedido;
import br.edu.ifsp.Restaurante.dto.PedidoRequestDTO;
import br.edu.ifsp.Restaurante.dto.PedidoResponseDTO;
import br.edu.ifsp.Restaurante.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("pedido")
public class PedidoController {

    @Autowired
    PedidoRepository pedidoRepository;

    @GetMapping("/{id}")
    public Optional<Pedido> findById(Long id){
        return pedidoRepository.findById(id);
    }

    @GetMapping
    public List<PedidoResponseDTO> findAll(){
        return pedidoRepository.findAll().stream().map(PedidoResponseDTO::new).toList();
    }

    @PostMapping
    public void addPedido(@RequestBody PedidoRequestDTO data){
        pedidoRepository.save(new Pedido(data));
    }

    @DeleteMapping("/{id}")
    public void removePedido(@PathVariable Long id){
        pedidoRepository.deleteById(id);
    }

    @PutMapping("/{id}")
    public void alterPedido(@PathVariable Long id, @RequestBody PedidoRequestDTO pedidoRequestDTO){
        Pedido pedido = new Pedido();
        pedido.setId(id);
        pedidoRepository.save(pedido);
    }
}
