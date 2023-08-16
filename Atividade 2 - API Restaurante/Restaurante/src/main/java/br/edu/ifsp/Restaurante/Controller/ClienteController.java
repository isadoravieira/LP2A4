package br.edu.ifsp.Restaurante.Controller;

import br.edu.ifsp.Restaurante.Model.Cliente;
import br.edu.ifsp.Restaurante.dto.ClienteRequestDTO;
import br.edu.ifsp.Restaurante.dto.ClienteResponseDTO;
import br.edu.ifsp.Restaurante.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("cliente")
public class ClienteController {

    @Autowired
    ClienteRepository clienteRepository;

    @GetMapping("/{id}")
    public Optional<Cliente> findById(Cliente cliente, Long id){
        return clienteRepository.findById(id);
    }

    @GetMapping
    public List<ClienteResponseDTO> findAll(){
        return clienteRepository.findAll().stream().map(ClienteResponseDTO::new).toList();
    }


    @PostMapping
    public void addCliente(@RequestBody ClienteRequestDTO data){
        clienteRepository.save(new Cliente(data));
    }

    @DeleteMapping("/{id}")
    public void removeCliente(@PathVariable Long id){
        clienteRepository.deleteById(id);
    }

    @PutMapping("/{id}")
    public void alterCliente(@PathVariable Long id, @RequestBody ClienteRequestDTO clienteRequestDTO){
        Cliente cliente = new Cliente();
        cliente.setId(id);
        clienteRepository.save(cliente);
    }

}
