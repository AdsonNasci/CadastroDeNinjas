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
    public NinjaModel criarNinja (@RequestBody NinjaModel ninja ) {
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
        @PutMapping("/atualizar")
    public String atualizarNinjaId() {
        return ("Ninja atualizado com sucesso");
    }
    // path variable
    @DeleteMapping("/deletarId/")
    public String deletarId(@PathVariable Long id   ) {
        return ("Ninja deletado com sucesso");

    }

}
