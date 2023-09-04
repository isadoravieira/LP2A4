package br.edu.ifsp.Restaurante.Controller;

import br.edu.ifsp.Restaurante.Model.Pedido;
import br.edu.ifsp.Restaurante.DTO.PedidoRequestDTO;
import br.edu.ifsp.Restaurante.DTO.PedidoResponseDTO;
import br.edu.ifsp.Restaurante.Model.Prato;
import br.edu.ifsp.Restaurante.Repository.CardapioRepository;
import br.edu.ifsp.Restaurante.Repository.ClienteRepository;
import br.edu.ifsp.Restaurante.Repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("pedido")
public class PedidoController {

    @Autowired
    PedidoRepository pedidoRepository;

    @Autowired
    private ClienteRepository repositoryCliente;

    @Autowired
    private CardapioRepository repositoryPratos;

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
        List<Prato> pratos = new ArrayList<>();
        for (Long id: data.pratos()) {
            pratos.add(repositoryPratos.findById(id).get());
        }
        pedidoRepository.save(new Pedido(data.descricao(), repositoryCliente.findById(data.cliente()).get(), pratos));

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
