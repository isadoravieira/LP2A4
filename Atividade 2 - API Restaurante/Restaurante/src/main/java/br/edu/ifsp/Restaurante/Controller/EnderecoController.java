package br.edu.ifsp.Restaurante.Controller;

import br.edu.ifsp.Restaurante.Model.Endereco;
import br.edu.ifsp.Restaurante.dto.EnderecoRequestDTO;
import br.edu.ifsp.Restaurante.dto.EnderecoResponseDTO;
import br.edu.ifsp.Restaurante.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("endereco")
public class EnderecoController {

    @Autowired
    EnderecoRepository enderecoRepository;

    @GetMapping("/{id}")
    public Optional<Endereco> findById(Endereco endereco, Long id){
        return enderecoRepository.findById(id);
    }

    @GetMapping
    public List<EnderecoResponseDTO> findAll(){
        return enderecoRepository.findAll().stream().map(EnderecoResponseDTO::new).toList();
    }

    @PostMapping
    public void addEndereco(@RequestBody EnderecoRequestDTO data){
        enderecoRepository.save(new Endereco(data));
    }

    @DeleteMapping("/{id}")
    public void removeEndereco(@PathVariable Long id){
        enderecoRepository.deleteById(id);
    }

    @PutMapping("/{id}")
    public void alterEndereco(@PathVariable Long id, @RequestBody EnderecoRequestDTO enderecoRequestDTO){
        Endereco endereco = new Endereco();
        endereco.setId(id);
        enderecoRepository.save(endereco);
    }
}
