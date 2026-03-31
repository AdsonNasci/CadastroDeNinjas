package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninja")
public class NinjaController {
    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService){
        this.ninjaService = ninjaService;
    }
    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Boas vindas, essa é minha primeira mensagem";
    }

    // add ninja
    @PostMapping("/add")
    public NinjaDTO criarNinja (@RequestBody NinjaDTO ninja ) {
        return ninjaService.criarNinja(ninja);
    }
    //list ninjas
    @GetMapping("/all")
    public List<NinjaModel> mostrarTodosNinjas() {
        return ninjaService.listarNinjas();
    }
    // shows ninja by id
    @GetMapping("/id")
    public String showNinjaById() {
        return ("Mostrando ninja com id: " );
    }
    //atualizar
    @PutMapping("/atualizar/{id}")
    public NinjaModel atualizarNinjaId(Long id, @RequestBody NinjaModel ninjaAtualizado) {
        return ninjaService.alterarNinja(id, ninjaAtualizado);
    }
    // path variable
    @DeleteMapping("/deletarId/{id}")
    public void deletarId(@PathVariable Long id   ) {
        ninjaService.deletarNinja(id);
    }
}
