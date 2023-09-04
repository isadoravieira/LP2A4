package br.edu.ifsp.Restaurante.Controller;

import br.edu.ifsp.Restaurante.Model.Funcionario;
import br.edu.ifsp.Restaurante.Model.Pedido;
import br.edu.ifsp.Restaurante.DTO.FuncionarioRequestDTO;
import br.edu.ifsp.Restaurante.DTO.FuncionarioResponseDTO;
import br.edu.ifsp.Restaurante.Repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("funcionario")
public class FuncionarioController {

    @Autowired
    FuncionarioRepository funcionarioRepository;

    @GetMapping("/{cpf}")
    public Optional<Funcionario> findById(Pedido pedido, Long cpf){
        return funcionarioRepository.findById(cpf);
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<FuncionarioResponseDTO> findAll(){
        return funcionarioRepository.findAll().stream().map(FuncionarioResponseDTO::new).toList();
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void addFuncionario(@RequestBody FuncionarioRequestDTO data){
        funcionarioRepository.save(new Funcionario(data));
    }

    @DeleteMapping("/{cpf}")
    public void removeFuncionario(@PathVariable Long cpf){
        funcionarioRepository.deleteById(cpf);
    }

    @PutMapping("/{cpf}")
    public  void alterFuncionario(@PathVariable Long cpf, @RequestBody FuncionarioRequestDTO funcionarioRequestDTO){
        Funcionario funcionario = new Funcionario();
        funcionario.setCpf(cpf);
        funcionarioRepository.save(funcionario);
    }

}
