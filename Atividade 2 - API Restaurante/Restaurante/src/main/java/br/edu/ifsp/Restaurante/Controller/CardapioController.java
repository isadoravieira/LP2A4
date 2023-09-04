package br.edu.ifsp.Restaurante.Controller;

import br.edu.ifsp.Restaurante.Model.Prato;
import br.edu.ifsp.Restaurante.DTO.CardapioRequestDTO;
import br.edu.ifsp.Restaurante.DTO.CardapioResponseDTO;
import br.edu.ifsp.Restaurante.Repository.CardapioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("cardapio")
public class CardapioController {

    @Autowired
    CardapioRepository cardapioRepository;

//    List<Prato> pratos = new ArrayList<>(); não vai usar mais

    @GetMapping("/{id}")
    public Optional<Prato> findById(Prato prato, Long id){
        return cardapioRepository.findById(id);
    }

    @GetMapping
    public List<CardapioResponseDTO> findAll() {

//        pratos.add(new Prato(1, "Lasanha", "lasanha de macarrão", 56));
        return cardapioRepository.findAll().stream().map(CardapioResponseDTO::new).toList();
    }

    @PostMapping
    public void addPrato(@RequestBody CardapioRequestDTO data){
        cardapioRepository.save(new Prato(data));
//        pratos.add(new Prato(data));
    }

    @DeleteMapping("/{id}")
    public void removePrato(@PathVariable Long id){
        cardapioRepository.deleteById(id);
//        for(Prato prato : pratos){
//            if(prato.getId() == id){
//                pratos.remove(prato);
//            }
//        }
    }

    @PutMapping("/{id}")
    public void alterPrato(@PathVariable Long id, @RequestBody CardapioRequestDTO cardapioRequestDTO){

        Prato prato = new Prato();
        prato.setId(id);
        cardapioRepository.save(prato);
    }
//        Prato prato = findPratoById((long) cardapioResponseDTO.id());
//        if (prato == null) {
//            System.out.println("Prato não encontrado");
//        } else {
//            prato.setDescricao(cardapioResponseDTO.descricao());
//            prato.setNome(cardapioResponseDTO.titulo());
//            prato.setPreco(cardapioResponseDTO.preco());
//        }
//    }
}
